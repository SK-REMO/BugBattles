package com.example.remo.quizbio_medicalwaste;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.io.BufferedReader;
import java.util.Scanner;

public class lvl1 extends AppCompatActivity {
    TextView tv2;

    MaterialEditText q11, q12, q13, q14, q15, q16, q17, q18, q19, q110;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, nextbtn1;
    TextView a11, a12, a13, a14, a15, a16, a17, a18, a19, a110, point1;
    public int flag1=0, flag2=0, flag3=0, flag4=0, flag5=0, flag6=0, flag7=0, flag8=0, flag9=0, flag10=0;
    public int points=40;

    private SoundPool soundpool;
    private int sound1, sound2, sound3, sound4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);

        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundpool = new SoundPool.Builder()
                    .setMaxStreams(4).setAudioAttributes(audioAttributes)
                    .build();
        }else{
            soundpool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundpool.load(this, R.raw.plus_point, 1);
        sound2 = soundpool.load(this, R.raw.minus_point, 1);
        sound3 = soundpool.load(this, R.raw.game_over, 1);
        sound4 = soundpool.load(this, R.raw.victory_2, 1);

        q11 = findViewById(R.id.q11);
        q12 = findViewById(R.id.q12);
        q13 = findViewById(R.id.q13);
        q14 = findViewById(R.id.q14);
        q15 = findViewById(R.id.q15);
        q16 = findViewById(R.id.q16);
        q17 = findViewById(R.id.q17);
        q18 = findViewById(R.id.q18);
        q19 = findViewById(R.id.q19);
        q110 = findViewById(R.id.q110);

        btn1 = findViewById(R.id.sb1);
        btn2 = findViewById(R.id.sb2);
        btn3 = findViewById(R.id.sb3);
        btn4 = findViewById(R.id.sb4);
        btn5 = findViewById(R.id.sb5);
        btn6 = findViewById(R.id.sb6);
        btn7 = findViewById(R.id.sb7);
        btn8 = findViewById(R.id.sb8);
        btn9 = findViewById(R.id.sb9);
        btn10 = findViewById(R.id.sb10);

        point1 = findViewById(R.id.point1);

        nextbtn1 = findViewById(R.id.nextbtn1);

        a11 = findViewById(R.id.a11);
        a12 = findViewById(R.id.a12);
        a13 = findViewById(R.id.a13);
        a14 = findViewById(R.id.a14);
        a15 = findViewById(R.id.a15);
        a16 = findViewById(R.id.a16);
        a17 = findViewById(R.id.a17);
        a18 = findViewById(R.id.a18);
        a19 = findViewById(R.id.a19);
        a110 = findViewById(R.id.a110);

        //Gloves
        final String oa1 = "GLOVES";
        final String oa1b = "GLOVE";
        final String oa1c = "gloves";
        final String oa1d = "Gloves";
        final String oa1e = "Glove";
        final String oa1f = "glove";

        //Eyeshield
        final String oa2 = "EYESHIELD";
        final String oa2b = "EYE SHIELD";
        final String oa2c = "eyeshield";
        final String oa2d = "eye shield";
        final String oa2e = "Eye Shield";
        final String oa2f = "Eye shield";
        final String oa2g = "EyeShield";
        final String oa2h = "Eyeshield";

        //bandage
        final String oa3 = "BANDAGE";
        final String oa3b = "bandage";
        final String oa3c = "BANDAGES";
        final String oa3d = "bandages";
        final String oa3e = "Bandage";
        final String oa3f = "Bandages";

        //Needle
        final String oa4 = "NEEDLE";
        final String oa4b = "Needle";
        final String oa4c = "Needles";
        final String oa4d = "NEEDLES";
        final String oa4e = "needles";
        final String oa4f = "needle";

        //Ampoules
        final String oa5 = "AMPOULES";
        final String oa5b = "AMPOULE";
        final String oa5c = "Ampoules";
        final String oa5d = "Ampoule";
        final String oa5e = "ampoules";
        final String oa5f = "ampoule";

        //Heart
        final String oa6 = "HEART";
        final String oa6b = "heart";
        final String oa6c = "Heart";


        //Rylestube
        final String oa7 = "RYLESTUBE";
        final String oa7b = "rylestube";
        final String oa7c = "Rylestube";
        final String oa7d = "RYLES TUBE";
        final String oa7e = "ryles tube";
        final String oa7f = "Ryles tube";
        final String oa7g = "Nasogastric Tube";
        final String oa7h = "NasogastricTube";
        final String oa7i = "nasogastric tube";
        final String oa7j = "nasogastrictube";
        final String oa7k = "NASOGASTRICTUBE";
        final String oa7l = "NASOGASTRIC TUBE";
        final String oa7m = "RylesTube";
        final String oa7n = "naso gastric tube";
        final String oa7o = "Naso gastric Tube";
        final String oa7p = "Naso Gastric Tube";
        final String oa7q = "naso Gastric Tube";
        final String oa7r = "naso Gastric tube";
        final String oa7s = "Naso Gastric tube";
        final String oa7t = "Nasogastric tube";



        //Ivcannula
        final String oa8 = "IVCANNULA";
        final String oa8b = "IV CANNULA";
        final String oa8c = "ivcannula";
        final String oa8d = "iv cannula";
        final String oa8e = "Ivcannula";
        final String oa8f = "Iv cannula";
        final String oa8g = "IV";
        final String oa8h = "iv";
        final String oa8i = "Iv";
        final String oa8j = "IV CANNULATION";
        final String oa8k = "IVCANNULATION";
        final String oa8l = "ivcannulation";
        final String oa8m = "iv cannulation";
        final String oa8n = "IvCannulation";
        final String oa8o = "Iv Cannulation";
        final String oa8p = "IV Cannula";
        final String oa8q = "IVCannula";
        final String oa8r = "IvCannula";
        final String oa8s = "Iv Cannula";
        final String oa8t = "IV cannula";
        final String oa8u = "IVcannula";

        //Blade
        final String oa9 = "BLADE";
        final String oa9b = "blade";
        final String oa9c = "Blade";
        final String oa9d = "BLADES";
        final String oa9e = "blades";
        final String oa9f = "Blades";


        //N95Mask
        final String oa10 = "N95MASK";
        final String oa10b = "N95 MASK";
        final String oa10c = "n95mask";
        final String oa10d = "n95 mask";
        final String oa10e = "N95mask";
        final String oa10f = "N95 mask";
        final String oa10g = "N95 Mask";
        final String oa10h = "n95 Mask";
        final String oa10i = "N 95 Mask";
        final String oa10j = "N 95 mask";
        final String oa10k = "n 95 mask";

        nextbtn1.setEnabled(false);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (q11.getText().toString().equals(oa1)|| q11.getText().toString().equals(oa1b) || q11.getText().toString().equals(oa1c) || q11.getText().toString().equals(oa1d) || q11.getText().toString().equals(oa1e) || q11.getText().toString().equals(oa1f)) {
                    btn1.setEnabled(true);
                    a11.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);

                    soundpool.play(sound1, 1, 1, 0, 0, 1);

                } else {
                    btn1.setEnabled(false);
                    a11.setText("Wrong Answer, Correct Answer is GLOVES");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }

                }
                flag1 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q12.getText().toString().equals(oa2) || q12.getText().toString().equals(oa2b) || q12.getText().toString().equals(oa2c) || q12.getText().toString().equals(oa2d) || q12.getText().toString().equals(oa2e) || q12.getText().toString().equals(oa2f) || q12.getText().toString().equals(oa2g) || q12.getText().toString().equals(oa2h)) {
                    btn2.setEnabled(false);
                    a12.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn2.setEnabled(false);
                    a12.setText("Wrong Answer, Correct Answer is EYESHIELD");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag2 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q13.getText().toString().equals(oa3) || q13.getText().toString().equals(oa3b) || q13.getText().toString().equals(oa3c) || q13.getText().toString().equals(oa3d) || q13.getText().toString().equals(oa3e) || q13.getText().toString().equals(oa3f)) {
                    btn3.setEnabled(false);
                    a13.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn3.setEnabled(false);
                    a13.setText("Wrong Answer, Correct Answer is BANDAGE");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag3 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (q14.getText().toString().equals(oa4) || q14.getText().toString().equals(oa4b) || q14.getText().toString().equals(oa4c) || q14.getText().toString().equals(oa4d) || q14.getText().toString().equals(oa4e) || q14.getText().toString().equals(oa4f)) {
                    btn4.setEnabled(false);
                    a14.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn4.setEnabled(false);
                    a14.setText("Wrong Answer, Correct Answer is NEEDLE");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag4 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q15.getText().toString().equals(oa5) || q15.getText().toString().equals(oa5b) || q15.getText().toString().equals(oa5c) || q15.getText().toString().equals(oa5d) || q15.getText().toString().equals(oa5e) || q15.getText().toString().equals(oa5f)) {
                    btn5.setEnabled(false);
                    a15.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn5.setEnabled(false);
                    a15.setText("Wrong Answer, Correct Answer is AMPOULES");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag5 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q16.getText().toString().equals(oa6) || q16.getText().toString().equals(oa6b) || q16.getText().toString().equals(oa6c)) {
                    btn6.setEnabled(false);
                    a16.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn6.setEnabled(false);
                    a16.setText("Wrong Answer, Correct Answer is HEART");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag6 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q17.getText().toString().equals(oa7) || q17.getText().toString().equals(oa7b) || q17.getText().toString().equals(oa7c) || q17.getText().toString().equals(oa7d) || q17.getText().toString().equals(oa7e) || q17.getText().toString().equals(oa7f) || q17.getText().toString().equals(oa7g) || q17.getText().toString().equals(oa7h) || q17.getText().toString().equals(oa7i) || q17.getText().toString().equals(oa7j) || q17.getText().toString().equals(oa7k) || q17.getText().toString().equals(oa7l) || q17.getText().toString().equals(oa7m) || q17.getText().toString().equals(oa7n) || q17.getText().toString().equals(oa7o) || q17.getText().toString().equals(oa7p) || q17.getText().toString().equals(oa7q) || q17.getText().toString().equals(oa7r) || q17.getText().toString().equals(oa7s) || q17.getText().toString().equals(oa7t)) {
                    btn7.setEnabled(false);
                    a17.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn7.setEnabled(false);
                    a17.setText("Wrong Answer, Correct Answer is RYLESTUBE");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag7 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q18.getText().toString().equals(oa8) || q18.getText().toString().equals(oa8b) || q18.getText().toString().equals(oa8c) || q18.getText().toString().equals(oa8d) || q18.getText().toString().equals(oa8e) || q18.getText().toString().equals(oa8f) || q18.getText().toString().equals(oa8g) || q18.getText().toString().equals(oa8h) || q18.getText().toString().equals(oa8i) || q18.getText().toString().equals(oa8j) || q18.getText().toString().equals(oa8k) || q18.getText().toString().equals(oa8l) || q18.getText().toString().equals(oa8m) || q18.getText().toString().equals(oa8n) || q18.getText().toString().equals(oa8o) || q18.getText().toString().equals(oa8p) || q18.getText().toString().equals(oa8q) || q18.getText().toString().equals(oa8r)  || q18.getText().toString().equals(oa8s)  || q18.getText().toString().equals(oa8t)  || q18.getText().toString().equals(oa8u)) {
                    btn8.setEnabled(false);
                    a18.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn8.setEnabled(false);
                    a18.setText("Wrong Answer, Correct Answer is IV Cannula");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag8 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q19.getText().toString().equals(oa9) || q19.getText().toString().equals(oa9b) || q19.getText().toString().equals(oa9c) || q19.getText().toString().equals(oa9d) || q19.getText().toString().equals(oa9e) || q19.getText().toString().equals(oa9f)) {
                    btn9.setEnabled(false);
                    a19.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                } else {
                    btn9.setEnabled(false);
                    a19.setText("Wrong Answer, Correct Answer is BLADE");
                    if (points <= 5) {
                        Intent playActivity = new Intent();


                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {


                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag9 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });

        /*final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);


                mp.start();*/


        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (q110.getText().toString().equals(oa10) || q110.getText().toString().equals(oa10b) || q110.getText().toString().equals(oa10c) || q110.getText().toString().equals(oa10d) || q110.getText().toString().equals(oa10e) || q110.getText().toString().equals(oa10f) || q110.getText().toString().equals(oa10g) || q110.getText().toString().equals(oa10h) || q110.getText().toString().equals(oa10i) || q110.getText().toString().equals(oa10j) || q110.getText().toString().equals(oa10k)) {
                    btn10.setEnabled(false);
                    a110.setText("Correct Answer");
                    points = points + 5;
                    point1.setText("Points: " + points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);

                } else {
                    btn10.setEnabled(false);
                    a110.setText("Wrong Answer, Correct Answer is N95MASK");
                    if (points <= 5) {
                        point1.setText("Points: 0");
                        points = 0;
                        Intent playActivity = new Intent();

                        playActivity.setClass(lvl1.this, Lost.class);

                        playActivity.putExtra("pt", points);
                        startActivity(playActivity);
                        finish();
                    } else {
                        points = points - 5;
                        point1.setText("Points: " + points);
                        soundpool.play(sound2, 1, 1, 0, 0, 1);
                    }
                }

                flag10 = 1;
                if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1) {
                    nextbtn1.setEnabled(true);
                }
            }
        });
        nextbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playActivity = new Intent();

                playActivity.setClass(lvl1.this, Play.class);

                playActivity.putExtra("points", points);
                startActivity(playActivity);
                finish();

            }
        });
    }

}
