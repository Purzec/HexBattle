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

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public HexDirection getHexDirection() {
        return hexDirection;
    }

    public void setHexDirection(HexDirection hexDirection) {
        this.hexDirection = hexDirection;
    }

    public TypeOfAttack getTypeOfAttack() {
        return typeOfAttack;
    }

    public void setTypeOfAttack(TypeOfAttack typeOfAttack) {
        this.typeOfAttack = typeOfAttack;
    }
}
