package com.example.remo.quizbio_medicalwaste;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Locale;

/*
public void onClick(View view){

        if(view.getId()==R.id.nextbtn4){
        Intent lvl3Activity = new Intent(lvl4.this,lvl5.class);
        lvl3Activity.putExtra("points", points);
        this.startActivity(lvl3Activity);
        finish();
        }
        }*/
public class lvl5 extends AppCompatActivity{

    public static final long COUNTDOWN_IN_MILLIS = 60000;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    TextView tv2, timer, viewbtn;
    public int points=0;
    TextView text5_1, text5_2, text5_3, text5_4, text5_5, text5_6, text5_7;
    public int flag=0;
    Button btn1;

    RadioGroup radgrp51, radgrp52, radgrp53, radgrp54, radgrp55, radgrp56, radgrp57;
    private boolean isChecking = true;
    private int mCheckedId = R.id.q1a;
    int i=0;
    public Integer[] str = new Integer[40];

    private SoundPool soundpool;
    private int sound1, sound2, sound3, sound4, sound5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl5);



        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundpool = new SoundPool.Builder()
                    .setMaxStreams(5).setAudioAttributes(audioAttributes)
                    .build();
        }else{
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundpool.load(this, R.raw.plus_point, 1);
        sound2 = soundpool.load(this, R.raw.minus_point, 1);
        sound3 = soundpool.load(this, R.raw.game_over, 1);
        sound4 = soundpool.load(this, R.raw.victory_2, 1);
        sound5 = soundpool.load(this, R.raw.victory_1, 1);


        timer= findViewById(R.id.timer);
        tv2 = findViewById(R.id.pointlvl5);

        btn1 = findViewById(R.id.nextbtn5);
        btn1.setEnabled(false);

        viewbtn = findViewById(R.id.answer5);
        viewbtn.setEnabled(true);

        int pt= getIntent().getIntExtra("points", 0);

        points=pt;

        tv2.setText("Your Score: "+pt);


        text5_1 = (TextView) findViewById(R.id.text5_1);
        text5_2 = (TextView) findViewById(R.id.text5_2);
        text5_3 = (TextView) findViewById(R.id.text5_3);
        text5_4 = (TextView) findViewById(R.id.text5_4);
        text5_5 = (TextView) findViewById(R.id.text5_5);
        text5_6 = (TextView) findViewById(R.id.text5_6);
        text5_7 = (TextView) findViewById(R.id.text5_7);



        radgrp51 = (RadioGroup)findViewById(R.id.radgrp51);
        radgrp52 = (RadioGroup)findViewById(R.id.radgrp52);
        radgrp53 = (RadioGroup)findViewById(R.id.radgrp53);
        radgrp54 = (RadioGroup)findViewById(R.id.radgrp54);
        radgrp55 = (RadioGroup)findViewById(R.id.radgrp55);
        radgrp56 = (RadioGroup)findViewById(R.id.radgrp56);
        radgrp57 = (RadioGroup)findViewById(R.id.radgrp57);



        for(i=0; i<40; i++){
            str[i]=0;
        }


        radgrp51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;
                }
                isChecking = true;
                if (mCheckedId == R.id.q51a) {
                    str[0]=1;
                }
                else if (mCheckedId == R.id.q51b) {
                    str[1]=1;
                }
                else if (mCheckedId == R.id.q51c) {
                    str[2]=1;
                }
                else if (mCheckedId == R.id.q51d) {
                    str[3]=1;
                }
            }
        });

        radgrp52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q52a) {
                    str[4]=1;
                }
                else if (mCheckedId == R.id.q52b) {
                    str[5]=1;
                }
                else if (mCheckedId == R.id.q52c) {
                    str[6]=1;
                }
                else if (mCheckedId == R.id.q52d) {
                    str[7]=1;
                }
            }
        });

        radgrp53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q53a) {
                    str[8]=1;
                }
                else if (mCheckedId == R.id.q53b) {
                    str[9]=1;
                }
                else if (mCheckedId == R.id.q53c) {
                    str[10]=1;
                }
                else if (mCheckedId == R.id.q53d) {
                    str[11]=1;
                }
            }
        });

        radgrp54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q54a) {
                    str[12]=1;
                }
                else if (mCheckedId == R.id.q54b) {
                    str[13]=1;
                }
                else if (mCheckedId == R.id.q54c) {
                    str[14]=1;
                }
                else if (mCheckedId == R.id.q54d) {
                    str[15]=1;
                }
            }
        });

        radgrp55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q55a) {
                    str[16]=1;
                }
                else if (mCheckedId == R.id.q55b) {
                    str[17]=1;
                }
                else if (mCheckedId == R.id.q55c) {
                    str[18]=1;
                }
                else if (mCheckedId == R.id.q55d) {
                    str[19]=1;
                }
            }
        });

        radgrp56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q56a) {
                    str[20]=1;
                }
                else if (mCheckedId == R.id.q56b) {
                    str[21]=1;
                }
                else if (mCheckedId == R.id.q56c) {
                    str[22]=1;
                }
                else if (mCheckedId == R.id.q56d) {
                    str[23]=1;
                }
            }
        });

        radgrp57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q57a) {
                    str[24]=1;
                }
                else if (mCheckedId == R.id.q57b) {
                    str[25]=1;
                }
                else if (mCheckedId == R.id.q57c) {
                    str[26]=1;
                }
                else if (mCheckedId == R.id.q57d) {
                    str[27]=1;
                }
            }
        });
       
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playActivity = new Intent();

                playActivity.setClass(lvl5.this, finish.class);

                playActivity.putExtra("points", points);
                startActivity(playActivity);
                finish();

            }
        });

        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();


    }

    private void startCountDown(){
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();
                if(str[2]==0){
                    text5_1.setText("Wrong Answer, Correct Answer is C.");
                    points = points - 5;
                    str[1] = 0;
                    str[3] = 0;
                    str[0] = 0;
                }
                else if(str[2]==1){
                    text5_1.setText("Correct Answer");
                    str[2] = 0;
                    points = points + 5;
                }
                if(str[4]==0){
                    text5_2.setText("Wrong Answer, Correct Answer is A.");
                    points = points - 5;
                    str[5] = 0;
                    str[6] = 0;
                    str[7] = 0;
                }
                else if(str[4]==1){
                    text5_2.setText("Correct Answer");
                    str[4] = 0;
                    points = points + 5;
                }
                if(str[9]==0){
                    text5_3.setText("Wrong Answer, Correct Answer is B.");
                    points = points - 5;
                    str[8] = 0;
                    str[10] = 0;
                    str[11] = 0;
                }
                else if(str[9]==1){
                    text5_3.setText("Correct Answer");
                    str[9] = 0;
                    points = points + 5;
                }
                if(str[13]==0){
                    text5_4.setText("Wrong Answer, Correct Answer is B.");
                    points = points - 5;
                    str[12] = 0;
                    str[15] = 0;
                    str[14] = 0;
                }
                else if(str[13]==1){
                    text5_4.setText("Correct Answer");
                    str[13] = 0;
                    points = points + 5;
                }
                if(str[17]==0){
                    text5_5.setText("Wrong Answer, Correct Answer is B.");
                    points = points - 5;
                    str[16] = 0;
                    str[18] = 0;
                    str[19] = 0;
                }
                else if(str[17]==1){
                    text5_5.setText("Correct Answer");
                    str[17] = 0;
                    points = points + 5;
                }
                if(str[20]==0){
                    text5_6.setText("Wrong Answer, Correct Answer is A.");
                    points = points - 5;
                    str[22] = 0;
                    str[21] = 0;
                    str[23] = 0;
                }
                else if(str[20]==1){
                    text5_6.setText("Correct Answer");
                    str[20] = 0;
                    points = points + 5;
                }
                if(str[27]==0){
                    text5_7.setText("Wrong Answer, Correct Answer is D.");
                    points = points - 5;

                }
                else if(str[27]==1){
                    text5_7.setText("Correct Answer");
                    str[27] = 0;
                    points = points + 5;
                }


                tv2.setText("Your Score: " + points);
                soundpool.play(sound5, 1, 1, 0, 2, 1);
                btn1.setEnabled(true);
                viewbtn.setEnabled(false);

            }
        }.start();
    }

    private void updateCountDownText(){
        int minutes = (int)(timeLeftInMillis / 1000) / 60;
        int seconds = (int)(timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timer.setText(timeFormatted);
    }

    public void showType(View view) {

            for(int i=0;i<11;i++){
                if(points<=5){
                    tv2.setText("Points: 0");
                    points=0;
                    Intent playActivity = new Intent(this, Lost.class);
                    playActivity.putExtra("pt", points);
                    this.startActivity(playActivity);
                    finish();
                    break;
                }
                else {
                    if (str[2] == 1) {
                        text5_1.setText("Correct Answer");
                        str[2] = 0;
                        points = points + 5;

                    } else if (str[1] == 1 || str[3] == 1 || str[0] == 1) {
                        text5_1.setText("Wrong Answer, Correct Answer is C.");
                        points = points - 5;
                        str[1] = 0;
                        str[3] = 0;
                        str[0] = 0;
                    }

                    if (str[4] == 1) {
                        text5_2.setText("Correct Answer");
                        str[4] = 0;
                        points = points + 5;
                    } else if (str[5] == 1 || str[6] == 1 || str[7] == 1) {
                        text5_2.setText("Wrong Answer, Correct Answer is A.");
                        points = points - 5;
                        str[5] = 0;
                        str[6] = 0;
                        str[7] = 0;
                    }

                    if (str[9] == 1) {
                        text5_3.setText("Correct Answer");
                        str[9] = 0;
                        points = points + 5;
                    } else if (str[8] == 1 || str[10] == 1 || str[11] == 1) {
                        text5_3.setText("Wrong Answer, Correct Answer is B.");
                        points = points - 5;
                        str[8] = 0;
                        str[10] = 0;
                        str[11] = 0;
                    }
                    if (str[13] == 1) {
                        text5_4.setText("Correct Answer");
                        str[13] = 0;
                        points = points + 5;
                    } else if (str[12] == 1 || str[15] == 1 || str[14] == 1) {
                        text5_4.setText("Wrong Answer, Correct Answer is B.");
                        points = points - 5;
                        str[12] = 0;
                        str[15] = 0;
                        str[14] = 0;
                    }

                    if (str[17] == 1) {
                        text5_5.setText("Correct Answer");
                        str[17] = 0;
                        points = points + 5;
                    } else if (str[16] == 1 || str[18] == 1 || str[19] == 1) {
                        text5_5.setText("Wrong Answer, Correct Answer is B.");
                        points = points - 5;
                        str[16] = 0;
                        str[18] = 0;
                        str[19] = 0;
                    }

                    if (str[20] == 1) {
                        text5_6.setText("Correct Answer");
                        str[20] = 0;
                        points = points + 5;
                    } else if (str[22] == 1 || str[21] == 1 || str[23] == 1) {
                        text5_6.setText("Wrong Answer, Correct Answer is A.");
                        points = points - 5;
                        str[22] = 0;
                        str[21] = 0;
                        str[23] = 0;
                    }

                    if (str[27] == 1) {
                        text5_7.setText("Correct Answer");
                        str[27] = 0;
                        points = points + 5;
                    } else if (str[24] == 1 || str[26] == 1 || str[25] == 1) {
                        text5_7.setText("Wrong Answer, Correct Answer is D.");
                        points = points - 5;
                        str[24] = 0;
                        str[26] = 0;
                        str[25] = 0;
                    }
                    tv2.setText("Your Score: " + points);
                    soundpool.play(sound5, 1, 1, 0, 2, 1);
                    btn1.setEnabled(true);
                    viewbtn.setEnabled(false);
                    timeLeftInMillis = 0;
                    updateCountDownText();


                }
            }






    }
}

    
