package pl.patryk.hexbattle;

import android.widget.ImageView;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import pl.patryk.hexbattle.Battle.Battle;
import pl.patryk.hexbattle.Tokens.Ability.BaseAttack;
import pl.patryk.hexbattle.Tokens.Hex;
import pl.patryk.hexbattle.Tokens.HexDirection;
import pl.patryk.hexbattle.Tokens.Token;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void elo() {
        Hex hexTest = new Hex();
        Hex hexTest2 = new Hex();

        hexTest.addNeighbours(hexTest2, HexDirection.FORWARD);
        hexTest.pokazSasiadaNaHExie(hexTest, HexDirection.FORWARD);
        hexTest.pokazSasiadaNaHExie(hexTest, HexDirection.BACK);
        hexTest.getNeighbours(HexDirection.FORWARD);

    }

    @Test
    public void funkcje() {
        int imageID = R.drawable.token_1;
        System.out.println(imageID);
    }
    public int najwyzszaWartosc(Token[] tab)
    {
        int dlugosc = tab.length;
        int max = tab[0].getInitiative();
        for (int i = 0; i < dlugosc; i++) {
            if (tab[i]!=null)
            {
                if (tab[i].getInitiative() > max)
                    max = tab[i].getInitiative();
            }
        }
        return max;
    }

    @Test
    public void bitwa() {



        Hex hex1 = new Hex();
        Hex hex2 = new Hex();
        hex1.addNeighbours(hex2, HexDirection.BACK_LEFT);
        hex2.addNeighbours(hex1, HexDirection.FORWARD_RIGHT);

        ArrayList<Hex> listahexowArrayList = new ArrayList<>(19);
        listahexowArrayList.add(hex1);
        listahexowArrayList.add(hex2);
        hex1.setBusy(true);
        hex2.setBusy(true);
        Token token2 = new Token();
        token2.setInitiative(1);
        BaseAttack baseAttack2 = new BaseAttack(2, HexDirection.FORWARD_RIGHT, BaseAttack.TypeOfAttack.MELLE);
        ArrayList<BaseAttack> listaatakow12 = new ArrayList<>(9);
        listaatakow12.add(baseAttack2);
        token2.setAttack(listaatakow12);

        Token token1 = new Token();
        token1.setInitiative(5);
        BaseAttack baseAttack = new BaseAttack(2, HexDirection.BACK, BaseAttack.TypeOfAttack.MELLE);
        BaseAttack baseAttack3 = new BaseAttack(2, HexDirection.BACK_LEFT, BaseAttack.TypeOfAttack.MELLE);
        ArrayList<BaseAttack> listaatakow1 = new ArrayList<>(9);
        listaatakow1.add(baseAttack);
        listaatakow1.add(baseAttack3);
        token1.setAttack(listaatakow1);

        token1.setNazwa("pierwszy token");
        token2.setNazwa("drugi token");


        ArrayList<Token> list = new ArrayList<>(2);
        list.add(token1);
        list.add(token2);

        Token[] tablicaTymczasowaZTokenami = new Token[19];
        tablicaTymczasowaZTokenami[0] = token1;
        tablicaTymczasowaZTokenami[1] = token2;


     /*   Battle battle = new Battle(list);
        battle.bitwa(list);*/



        for (int inicjatywaMax = najwyzszaWartosc(tablicaTymczasowaZTokenami); inicjatywaMax >= 0; inicjatywaMax--)//wyznaczenie maxinicjatywy
        {
            //kolejnosc atakow tokenow
            for (Token value : tablicaTymczasowaZTokenami) {
                if (value != null) {
                    if (inicjatywaMax == value.getInitiative()) {

                        for (int ataki = 0; ataki < value.getAttack().size(); ataki++) {
                            Hex hexWZasieguAtaku = listahexowArrayList.get(list.indexOf(value)).getNeighbours(list.get(list.indexOf(value)).getAttack().get(ataki).getHexDirection());
                            if (hexWZasieguAtaku != null && hexWZasieguAtaku.isBusy()) {

                                tablicaTymczasowaZTokenami[listahexowArrayList.indexOf(hexWZasieguAtaku)].setObrazeniaOtrzymane(true);
                            }
                        }
                    }
                }

            }

            for (int i=0;i<tablicaTymczasowaZTokenami.length;i++)//niszczenie kafelkow z obrazeniami
            {
                if (tablicaTymczasowaZTokenami[i]!=null)
                {
                    if (tablicaTymczasowaZTokenami[i].isObrazeniaOtrzymane())
                    {
                        tablicaTymczasowaZTokenami[i]=null;
                    }
                }

            }
            //kolejnosc atakow tokenow
        }
        for (Token token : tablicaTymczasowaZTokenami) {
            if (token != null) {
                System.out.println("przetrwały tokeny  " + token);
            }
        }
    }
}







