package pl.patryk.hexbattle.Tokens.Ability;

import pl.patryk.hexbattle.Tokens.HexDirection;

public class BaseAttack {

    private int strenght;
    private HexDirection hexDirection;
    private TypeOfAttack typeOfAttack;

    public BaseAttack(int strenght, HexDirection hexDirection, TypeOfAttack typeOfAttack) {
        this.strenght = strenght;
        this.hexDirection = hexDirection;
        this.typeOfAttack = typeOfAttack;
    }

    public enum TypeOfAttack{
        MELLE,FIRE,NONE
    }
}
