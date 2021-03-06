package pl.patryk.hexbattle.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import pl.patryk.hexbattle.Tokens.Hex;


public class CanvasTest extends View {

    float a = (float) (2 * Math.PI / 6);
    float r = (float) getScreenHeight() / 10;

    float sW = (float) getScreenWidth() / 2;
    float sH = (float) getScreenHeight() / 10;

    float[] rzad = {
            (float) getScreenHeight() / 10,
            sH + r * (float) Math.sin(a),
            sH + 2 * r * (float) Math.sin(a),
            sH + 3 * r * (float) Math.sin(a),
            sH + 4 * r * (float) Math.sin(a),
            sH + 5 * r * (float) Math.sin(a),
            sH + 6 * r * (float) Math.sin(a),
            sH + 7 * r * (float) Math.sin(a),
            sH + 8 * r * (float) Math.sin(a),
            sH + 9 * r * (float) Math.sin(a)
    };
    float[] kolumna = {
            sW - 6 * r * (float) Math.cos(a),
            sW - r - r * (float) Math.cos(a),
            (float) getScreenWidth() / 2,
            sW + r + r * (float) Math.cos(a),
            sW + 6 * r * (float) Math.cos(a)};


    Hex hex1 = new Hex(kolumna[2], rzad[0]);
    Hex hex2 = new Hex(kolumna[1], rzad[1]);
    Hex hex3 = new Hex(kolumna[2], rzad[2]);
    Hex hex4 = new Hex(kolumna[3], rzad[1]);
    Hex hex5 = new Hex(kolumna[0], rzad[2]);
    Hex hex6 = new Hex(kolumna[1], rzad[3]);
    Hex hex7 = new Hex(kolumna[2], rzad[4]);
    Hex hex8 = new Hex(kolumna[3], rzad[3]);
    Hex hex9 = new Hex(kolumna[4], rzad[2]);
    Hex hex10 = new Hex(kolumna[0], rzad[4]);
    Hex hex11 = new Hex(kolumna[1], rzad[5]);
    Hex hex12 = new Hex(kolumna[2], rzad[6]);
    Hex hex13 = new Hex(kolumna[3], rzad[5]);
    Hex hex14 = new Hex(kolumna[4], rzad[4]);
    Hex hex15 = new Hex(kolumna[0], rzad[6]);
    Hex hex16 = new Hex(kolumna[1], rzad[7]);
    Hex hex17 = new Hex(kolumna[2], rzad[8]);
    Hex hex18 = new Hex(kolumna[3], rzad[7]);
    Hex hex19 = new Hex(kolumna[4], rzad[6]);
    ArrayList<Hex> lista = new ArrayList<>(19);

    public CanvasTest(Context context) {
        super(context);
    }

    public CanvasTest(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public CanvasTest(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawHexagon(kolumna[2], rzad[0], canvas);
        drawHexagon(kolumna[1], rzad[1], canvas);
        drawHexagon(kolumna[3], rzad[1], canvas);
        drawHexagon(kolumna[0], rzad[2], canvas);
        drawHexagon(kolumna[2], rzad[2], canvas);
        drawHexagon(kolumna[4], rzad[2], canvas);
        drawHexagon(kolumna[1], rzad[3], canvas);
        drawHexagon(kolumna[3], rzad[3], canvas);
        drawHexagon(kolumna[0], rzad[4], canvas);
        drawHexagon(kolumna[2], rzad[4], canvas);
        drawHexagon(kolumna[4], rzad[4], canvas);
        drawHexagon(kolumna[1], rzad[5], canvas);
        drawHexagon(kolumna[3], rzad[5], canvas);
        drawHexagon(kolumna[0], rzad[6], canvas);
        drawHexagon(kolumna[2], rzad[6], canvas);
        drawHexagon(kolumna[4], rzad[6], canvas);
        drawHexagon(kolumna[1], rzad[7], canvas);
        drawHexagon(kolumna[3], rzad[7], canvas);
        drawHexagon(kolumna[2], rzad[8], canvas);

    }


    public void drawHexagon(float sW, float y, Canvas canvas) {
        Path path = new Path();
        path.moveTo(sW, y);
        for (int i = 0; i <= 6; i++) {
            path.lineTo(sW + r * (float) Math.cos(a * i), y + r * (float) Math.sin(a * i));
        }
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawPath(path, paint);
        drawsmallHexagon(sW, y, canvas);

    }

    public void drawsmallHexagon(float sW, float y, Canvas canvas) {
        Path path = new Path();
        path.moveTo(sW, y);
        for (int i = 0; i <= 6; i++) {
            path.lineTo(sW + r * 0.9f * (float) Math.cos(a * i), y + r * 0.8f * (float) Math.sin(a * i));
        }
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawPath(path, paint);

    }

    public int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public ArrayList<Hex> pobierzKordy() {

        lista.add(hex1);
        lista.add(hex2);
        lista.add(hex3);
        lista.add(hex4);
        lista.add(hex5);
        lista.add(hex6);
        lista.add(hex7);
        lista.add(hex8);
        lista.add(hex9);
        lista.add(hex10);
        lista.add(hex11);
        lista.add(hex12);
        lista.add(hex13);
        lista.add(hex14);
        lista.add(hex15);
        lista.add(hex16);
        lista.add(hex17);
        lista.add(hex18);
        lista.add(hex19);

        return lista;
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(width, height);

    }
}
