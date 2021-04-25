package pl.patryk.hexbattle;

import org.junit.Test;

import pl.patryk.hexbattle.Tokens.Hex;
import pl.patryk.hexbattle.Tokens.HexDirection;

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
    public void elo()
    {
        Hex hexTest = new Hex();
        Hex hexTest2 = new Hex();

        hexTest.addNeighbours(hexTest2, HexDirection.FORWARD);
        hexTest.pokazSasiadaNaHExie(hexTest,HexDirection.FORWARD);
        hexTest.pokazSasiadaNaHExie(hexTest,HexDirection.BACK);
        hexTest.getNeighbours(HexDirection.FORWARD);

    }
    @Test public void funkcje()
    {
        int imageID = R.drawable.token_1;
        System.out.println(imageID);
    }

}