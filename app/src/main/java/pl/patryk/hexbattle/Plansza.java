package pl.patryk.hexbattle;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import java.util.ArrayList;

import pl.patryk.hexbattle.Tokens.Hex;
import pl.patryk.hexbattle.model.CanvasTest;

public class Plansza extends AppCompatActivity {

    CanvasTest canvasTest;
    float elo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasTest = new CanvasTest(this);
        canvasTest.setBackgroundColor(Color.WHITE);

        setContentView(canvasTest);




        canvasTest.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                System.out.println("2 miejsceeeeeeeee");
               // System.out.println(canvasTest.stworz());
                canvasTest.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });

}



    private void loadInformation( ) {
        try {
            wait(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  elo=canvasTest.stworz();
        System.out.println("wykonuje się");

    }


}
