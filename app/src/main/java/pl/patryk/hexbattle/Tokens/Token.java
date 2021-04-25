package pl.patryk.hexbattle.Tokens;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import pl.patryk.hexbattle.Tokens.Ability.BaseAttack;

public class Token   {

 String nazwa;
 ImageView obrazek;
 Hex hex;
 int initiative;
 ArrayList<BaseAttack> attack;



    public Token(String nazwa, ImageView obrazek) {
    this.nazwa = nazwa;
    this.obrazek = obrazek;
  }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ImageView getObrazek() {
        return obrazek;
    }

    public void setObrazek(ImageView obrazek) {
        this.obrazek = obrazek;
    }

    public Hex getHex() {
        return hex;
    }

    public void setHex(Hex hex) {
        this.hex = hex;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public ArrayList<BaseAttack> getAttack() {
        return attack;
    }

    public void setAttack(ArrayList<BaseAttack> attack) {
        this.attack = attack;
    }
}
