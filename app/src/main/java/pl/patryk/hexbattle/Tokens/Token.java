package pl.patryk.hexbattle.Tokens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import pl.patryk.hexbattle.R;
import pl.patryk.hexbattle.Tokens.Ability.BaseAttack;

public class Token  {


 String nazwa;
 Drawable obrazek;
 Hex hex;
 int initiative;
 ArrayList<BaseAttack> attack;
 HexagonMaskView hexagonMaskView;

 boolean obrazeniaOtrzymane;

    public Token() {
    }

    public Token(String nazwa, Drawable obrazek) {
    this.nazwa = nazwa;
    this.obrazek = obrazek;
  }

    public Token(String nazwa, Hex hex, int initiative, ArrayList<BaseAttack> attack) {
        this.nazwa = nazwa;
        this.hex = hex;
        this.initiative = initiative;
        this.attack = attack;
    }

    public boolean isObrazeniaOtrzymane() {
        return obrazeniaOtrzymane;
    }

    public void setObrazeniaOtrzymane(boolean obrazeniaOtrzymane) {
        this.obrazeniaOtrzymane = obrazeniaOtrzymane;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Drawable getObrazek() {
        return obrazek;
    }

    public void setObrazek(Drawable obrazek) {
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

    public HexagonMaskView getHexagonMaskView() {
        return hexagonMaskView;
    }

    public void setHexagonMaskView(HexagonMaskView hexagonMaskView) {
        this.hexagonMaskView = hexagonMaskView;
    }
}
