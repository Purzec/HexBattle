package pl.patryk.hexbattle;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.core.view.MotionEventCompat;

import pl.patryk.hexbattle.Tokens.Ability.BaseAttack;
import pl.patryk.hexbattle.Tokens.Hex;
import pl.patryk.hexbattle.Tokens.HexDirection;
import pl.patryk.hexbattle.Tokens.HexagonMaskView;
import pl.patryk.hexbattle.Tokens.TestToken;
import pl.patryk.hexbattle.Tokens.Token;
import pl.patryk.hexbattle.model.CanvasTest;

public class GameBoard extends Activity {


    private ViewGroup mainLayout;
    ArrayList<Hex> listatest;
   private Hex hex1,hex2,hex3,hex4,hex5,hex6,hex7,hex8,hex9,hex10,hex11,hex12,hex13,hex14,hex15,hex16,hex17,hex18,hex19;
   private ArrayList<Hex> hexOnBoard;
ImageView imageView;
ImageView imageView2;
    ArrayList<Token> lista;
    HexagonMaskView grarfikaTokenuPrzeciwnika,grafikaTokenuGracza;

    private int xDelta;
    private int yDelta;


CanvasTest canvasTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);



        mainLayout = (RelativeLayout) findViewById(R.id.main);
        canvasTest = findViewById(R.id.canvasTest);
        mainLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @SuppressLint({"ClickableViewAccessibility", "UseCompatLoadingForDrawables"})
            @Override
            public void onGlobalLayout() {
     /*           hexOnBoard = new ArrayList<>(19);

                hex3 = new Hex();
                hex4 = new Hex();
                hex5 = new Hex();
                hex6 = new Hex();
                hex7 = new Hex();
                hex8 = new Hex();
                hex9 = new Hex();
                hex10 = new Hex();
                hex11 = new Hex();
                hex12 = new Hex();
                hex13 = new Hex();
                hex14 = new Hex();
                hex15 = new Hex();
                hex16 = new Hex();
                hex17 = new Hex();
                hex18 = new Hex();
                hex19 = new Hex();*/
               /* hex1 = new Hex();
                hex2 = new Hex();
               hex1.addNeighbours(hex2, HexDirection.BACK_LEFT);
                hex1.addNeighbours(hex3, HexDirection.BACK);
                hex1.addNeighbours(hex4, HexDirection.BACK_RIGHT);
                hex2.addNeighbours(hex3, HexDirection.BACK_RIGHT);
                hex2.addNeighbours(hex1, HexDirection.FORWARD_RIGHT);
                hex3.addNeighbours(hex2, HexDirection.FORWARD_LEFT);
                hex3.addNeighbours(hex1, HexDirection.FORWARD);
                hex3.addNeighbours(hex3, HexDirection.FORWARD_RIGHT);
                hex4.addNeighbours(hex1, HexDirection.FORWARD_LEFT);
                hex4.addNeighbours(hex3, HexDirection.BACK_LEFT);*/

                System.out.println(canvasTest.getScreenWidth());
                listatest = canvasTest.pobierzKordy();
                System.out.println(listatest.get(0).getHexpositionX());
                System.out.println(listatest.get(0).getHexpositionY());


/*
przyklad usuniecia elementu z widoku
imageView2= findViewById(R.id.imageView);
mainLayout.removeView(imageView2);*/



                grarfikaTokenuPrzeciwnika = new HexagonMaskView(getApplicationContext());
                grarfikaTokenuPrzeciwnika.setImageDrawable(getDrawable(R.drawable.tokenprzeciwnika1plansza));
                ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(mainLayout.getWidth() / 10, mainLayout.getHeight()/5 );
                grarfikaTokenuPrzeciwnika.setLayoutParams(lp);
                mainLayout.addView(grarfikaTokenuPrzeciwnika);
                Token testToken = new Token();
                testToken.setHexagonMaskView(grarfikaTokenuPrzeciwnika);


                grarfikaTokenuPrzeciwnika.setX(listatest.get(2).getHexpositionX()- grarfikaTokenuPrzeciwnika.getLayoutParams().width/2);
                grarfikaTokenuPrzeciwnika.setY(listatest.get(2).getHexpositionY()-grarfikaTokenuPrzeciwnika.getLayoutParams().height/2);



                grafikaTokenuGracza = new HexagonMaskView(getApplicationContext());
                grafikaTokenuGracza.setImageDrawable(getDrawable(R.drawable.tokengracza1plansza));
                ViewGroup.LayoutParams parametryGracza = new ViewGroup.LayoutParams(mainLayout.getWidth() / 10, mainLayout.getHeight()/5 );
                grafikaTokenuGracza.setLayoutParams(parametryGracza);
                mainLayout.addView(grafikaTokenuGracza);
                Token tokenGracza = new Token();
                tokenGracza.setHexagonMaskView(grafikaTokenuGracza);

                grafikaTokenuGracza.setOnTouchListener(onTouchListener(grafikaTokenuGracza));
/*

                imageView = new ImageView(getApplicationContext());
                imageView.setImageDrawable(getDrawable(R.drawable.token_2));
                ViewGroup.LayoutParams lp =new ViewGroup.LayoutParams(mainLayout.getWidth()/10, mainLayout.getHeight()/2);
                imageView.setOnTouchListener(onTouchListener());
                imageView.setLayoutParams(lp);


                Token token = new Token();
                token.setInitiative(3);
                BaseAttack baseAttack = new BaseAttack(2,HexDirection.FORWARD, BaseAttack.TypeOfAttack.MELLE);
                ArrayList<BaseAttack> listaatakow1=new ArrayList<>(9);
                listaatakow1.add(baseAttack);
                token.setAttack(listaatakow1);
                token.setObrazek(getDrawable(R.drawable.token_1));
                mainLayout.addView(imageView);
                mainLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);




                Token token2 = new Token();
                token.setInitiative(2);
                BaseAttack baseAttack2 = new BaseAttack(2,HexDirection.FORWARD, BaseAttack.TypeOfAttack.MELLE);
                ArrayList<BaseAttack> listaatakow12=new ArrayList<>(9);
                listaatakow12.add(baseAttack2);
                token.setAttack(listaatakow12);


                lista  = new ArrayList<>(19);
                lista.add(token);
                lista.add(token2);
*/
                mainLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);





            }
        });
    }



    private OnTouchListener onTouchListener(HexagonMaskView tokenG) {
        return new OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int x = (int) event.getRawX();
                final int y = (int) event.getRawY();
                switch (event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams)
                                view.getLayoutParams();
                        xDelta = x - lParams.leftMargin;
                        yDelta = y - lParams.topMargin;

                        break;
                    case MotionEvent.ACTION_UP:
                        takeOnNerbyEmptyPlace(tokenG);
                        if (tokenG.getX()+tokenG.getWidth()/2==listatest.get(0).getHexpositionX()&& tokenG.getY()+tokenG.getHeight()/2==listatest.get(0).getHexpositionY())
                        {
                            Toast.makeText(GameBoard.this,
                                    "Gratulacje, zrobiłeś to prawidłowo", Toast.LENGTH_SHORT)
                                    .show();
                            startActivity(new Intent(GameBoard.this,DrugaPlansza.class));


                        }
                        break;
                    case MotionEvent.ACTION_MOVE:
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                                .getLayoutParams();
                        layoutParams.leftMargin = x - xDelta;
                        layoutParams.topMargin = y - yDelta;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        view.setLayoutParams(layoutParams);

                        break;
                }
                mainLayout.invalidate();
                return true;
            }
        };
    }


    private void takeOnNerbyEmptyPlace(HexagonMaskView image) {
        float pozycjaKoncowaObrazkaX = image.getX()+(float) image.getWidth()/2;
        float pozycjaKoncowaObrazkaY = image.getY() + (float) image.getHeight()/2;
        float pierwszaPozycja;
        float drugaPozycja = 6480000;

        Hex najbliższyHex = null;
        for (Hex hexy : listatest) {
            if (!hexy.isBusy())
            {
                pierwszaPozycja = zmierzOdleglosc(pozycjaKoncowaObrazkaX, pozycjaKoncowaObrazkaY, hexy.getHexpositionX(), hexy.getHexpositionY());
                if (pierwszaPozycja < drugaPozycja) {
                    najbliższyHex = hexy;
                    drugaPozycja = pierwszaPozycja;
                }
                System.out.println(zmierzOdleglosc(pozycjaKoncowaObrazkaX, pozycjaKoncowaObrazkaY, hexy.getHexpositionX(), hexy.getHexpositionY()));
                //zmierzOdleglosc(pozycjaKoncowaObrazkaX,pozycjaKoncowaObrazkaY,hexy.getHexpositionX(),hexy.getHexpositionY());
            }
        }

        image.setX(najbliższyHex.getHexpositionX()-image.getWidth()/2);
        image.setY(najbliższyHex.getHexpositionY()-image.getHeight()/2);
        najbliższyHex.setBusy(true);



    }


    private float zmierzOdleglosc(float a, float b, float palecX, float palecY) {
        float odlegloscX = Math.abs(palecX - a);
        float odlegloscY = Math.abs(palecY - b);
        return odlegloscX * odlegloscX + odlegloscY * odlegloscY;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);
        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                System.out.println("Action was DOWN");

                System.out.println(canvasTest.getScreenWidth());

                return true;
            case (MotionEvent.ACTION_MOVE):
                System.out.println("Action was MOVE");

                return true;
            case (MotionEvent.ACTION_UP):
                System.out.println("Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL):
                System.out.println("Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE):
                System.out.println("Movement occurred outside bounds \" +\n" +
                        "                        \"of current screen element");
                return true;
            default:
                return super.onTouchEvent(event);
        }
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

}