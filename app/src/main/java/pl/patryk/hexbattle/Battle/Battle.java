package pl.patryk.hexbattle.Battle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

import pl.patryk.hexbattle.Tokens.Hex;
import pl.patryk.hexbattle.Tokens.Token;

public class Battle {

    ArrayList<Token> tokenOnBoard;
    ArrayList<Hex> hexonBoard;

    public Battle(ArrayList<Token> tokenOnBoard) {
        tokenOnBoard = tokenOnBoard;
    }

    public ArrayList<Token> getTokenOnBoard() {
        return tokenOnBoard;
    }

    public void setTokenOnBoard(ArrayList<Token> tokenOnBoard) {
        tokenOnBoard = tokenOnBoard;
    }


    public void bitwa(ArrayList<Token> tokenArrayList)
    {
        //sprawdzenie inicjatywy

       Token max=  tokenArrayList
                .stream()
                .max(Comparator.comparing(Token::getInitiative))
                .orElseThrow(NoSuchElementException::new);

        for (Token elo:tokenArrayList)
        {
            System.out.println(elo.getInitiative());
        }

    }
    Token max=  tokenOnBoard
            .stream()
            .max(Comparator.comparing(Token::getInitiative))
            .orElseThrow(NoSuchElementException::new);

    public void bitwa2(ArrayList<Hex> hexonBoard) {

        for (Hex listaHexow:hexonBoard)
        {
            if (!listaHexow.isBusy())
            {

            }


        }
    }
}
