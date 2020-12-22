package com.example.remo.quizbio_medicalwaste;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Play extends AppCompatActivity implements View.OnClickListener {

    TextView tv2;
    public int points = 40;
    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20;
    ImageView redbox1, redbox2, redbox3, redbox4, redbox5, redbox6, redbox7, redbox8, redbox9, redbox10, redbox11, redbox12, redbox13, redbox14, redbox15, redbox16, redbox17, redbox18, redbox19, redbox20;
    ImageView yellowbox1, yellowbox2, yellowbox3, yellowbox4, yellowbox5, yellowbox6, yellowbox7, yellowbox8, yellowbox9, yellowbox10, yellowbox11, yellowbox12, yellowbox13, yellowbox14, yellowbox15, yellowbox16, yellowbox17, yellowbox18, yellowbox19, yellowbox20;
    ImageView armygreenbox1, armygreenbox2, armygreenbox3, armygreenbox4, armygreenbox5, armygreenbox6, armygreenbox7, armygreenbox8, armygreenbox9, armygreenbox10, armygreenbox11, armygreenbox12, armygreenbox13, armygreenbox14, armygreenbox15, armygreenbox16, armygreenbox17, armygreenbox18, armygreenbox19, armygreenbox20;
    ImageView darkbluebox1, darkbluebox2, darkbluebox3, darkbluebox4, darkbluebox5, darkbluebox6, darkbluebox7, darkbluebox8, darkbluebox9, darkbluebox10, darkbluebox11, darkbluebox12, darkbluebox13, darkbluebox14, darkbluebox15, darkbluebox16, darkbluebox17, darkbluebox18, darkbluebox19, darkbluebox20;
    ImageView lightbluebox1, lightbluebox2, lightbluebox3, lightbluebox4, lightbluebox5, lightbluebox6, lightbluebox7, lightbluebox8, lightbluebox9, lightbluebox10, lightbluebox11, lightbluebox12, lightbluebox13, lightbluebox14, lightbluebox15, lightbluebox16, lightbluebox17, lightbluebox18, lightbluebox19, lightbluebox20;
    ImageView lightgreenbox1, lightgreenbox2, lightgreenbox3, lightgreenbox4, lightgreenbox5, lightgreenbox6, lightgreenbox7, lightgreenbox8, lightgreenbox9, lightgreenbox10, lightgreenbox11, lightgreenbox12, lightgreenbox13, lightgreenbox14, lightgreenbox15, lightgreenbox16, lightgreenbox17, lightgreenbox18, lightgreenbox19, lightgreenbox20;
    ImageView blackbox1, blackbox2, blackbox3, blackbox4, blackbox5, blackbox6, blackbox7, blackbox8, blackbox9, blackbox10, blackbox11, blackbox12, blackbox13, blackbox14, blackbox15, blackbox16, blackbox17, blackbox18, blackbox19, blackbox20;
    ImageView sharpbox1, sharpbox2, sharpbox3, sharpbox4, sharpbox5, sharpbox6, sharpbox7, sharpbox8, sharpbox9, sharpbox10, sharpbox11, sharpbox12, sharpbox13, sharpbox14, sharpbox15, sharpbox16, sharpbox17, sharpbox18, sharpbox19, sharpbox20;
    Button btn1;

    private SoundPool soundpool;
    private int sound1, sound2, sound3, sound4;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        tv2 = findViewById(R.id.point);

        int pt = getIntent().getIntExtra("points", 0);
        points = pt;
        tv2.setText("Your Score: " + points);


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

        btn1 = (Button) findViewById(R.id.nextbtn);
        btn1.setEnabled(false);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text7 = (TextView) findViewById(R.id.text7);
        text8 = (TextView) findViewById(R.id.text8);
        text9 = (TextView) findViewById(R.id.text9);
        text10 = (TextView) findViewById(R.id.text10);
        text11 = (TextView) findViewById(R.id.text11);
        text12 = (TextView) findViewById(R.id.text12);
        text13 = (TextView) findViewById(R.id.text13);
        text14 = (TextView) findViewById(R.id.text14);
        text15 = (TextView) findViewById(R.id.text15);
        text16 = (TextView) findViewById(R.id.text16);
        text17 = (TextView) findViewById(R.id.text17);
        text18 = (TextView) findViewById(R.id.text18);
        text19 = (TextView) findViewById(R.id.text19);
        text20 = (TextView) findViewById(R.id.text20);

        //REDBOX
        redbox1 = (ImageView) findViewById(R.id.redbox1);
        redbox2 = (ImageView) findViewById(R.id.redbox2);
        redbox3 = (ImageView) findViewById(R.id.redbox3);
        redbox4 = (ImageView) findViewById(R.id.redbox4);
        redbox5 = (ImageView) findViewById(R.id.redbox5);
        redbox6 = (ImageView) findViewById(R.id.redbox6);
        redbox7 = (ImageView) findViewById(R.id.redbox7);
        redbox8 = (ImageView) findViewById(R.id.redbox8);
        redbox9 = (ImageView) findViewById(R.id.redbox9);
        redbox10 = (ImageView) findViewById(R.id.redbox10);
        redbox11 = (ImageView) findViewById(R.id.redbox11);
        redbox12 = (ImageView) findViewById(R.id.redbox12);
        redbox13 = (ImageView) findViewById(R.id.redbox13);
        redbox14 = (ImageView) findViewById(R.id.redbox14);
        redbox15 = (ImageView) findViewById(R.id.redbox15);
        redbox16 = (ImageView) findViewById(R.id.redbox16);
        redbox17 = (ImageView) findViewById(R.id.redbox17);
        redbox18 = (ImageView) findViewById(R.id.redbox18);
        redbox19 = (ImageView) findViewById(R.id.redbox19);
        redbox20 = (ImageView) findViewById(R.id.redbox20);

        //YELLOW BOX
        yellowbox1 = (ImageView) findViewById(R.id.yellowbox1);
        yellowbox2 = (ImageView) findViewById(R.id.yellowbox2);
        yellowbox3 = (ImageView) findViewById(R.id.yellowbox3);
        yellowbox4 = (ImageView) findViewById(R.id.yellowbox4);
        yellowbox5 = (ImageView) findViewById(R.id.yellowbox5);
        yellowbox6 = (ImageView) findViewById(R.id.yellowbox6);
        yellowbox7 = (ImageView) findViewById(R.id.yellowbox7);
        yellowbox8 = (ImageView) findViewById(R.id.yellowbox8);
        yellowbox9 = (ImageView) findViewById(R.id.yellowbox9);
        yellowbox10 = (ImageView) findViewById(R.id.yellowbox10);
        yellowbox11 = (ImageView) findViewById(R.id.yellowbox11);
        yellowbox12 = (ImageView) findViewById(R.id.yellowbox12);
        yellowbox13 = (ImageView) findViewById(R.id.yellowbox13);
        yellowbox14 = (ImageView) findViewById(R.id.yellowbox14);
        yellowbox15 = (ImageView) findViewById(R.id.yellowbox15);
        yellowbox16 = (ImageView) findViewById(R.id.yellowbox16);
        yellowbox17 = (ImageView) findViewById(R.id.yellowbox17);
        yellowbox18 = (ImageView) findViewById(R.id.yellowbox18);
        yellowbox19 = (ImageView) findViewById(R.id.yellowbox19);
        yellowbox20 = (ImageView) findViewById(R.id.yellowbox20);

        //ARMYGREEN BOX
        armygreenbox1 = (ImageView) findViewById(R.id.armygreenbox1);
        armygreenbox2 = (ImageView) findViewById(R.id.armygreenbox2);
        armygreenbox3 = (ImageView) findViewById(R.id.armygreenbox3);
        armygreenbox4 = (ImageView) findViewById(R.id.armygreenbox4);
        armygreenbox5 = (ImageView) findViewById(R.id.armygreenbox5);
        armygreenbox6 = (ImageView) findViewById(R.id.armygreenbox6);
        armygreenbox7 = (ImageView) findViewById(R.id.armygreenbox7);
        armygreenbox8 = (ImageView) findViewById(R.id.armygreenbox8);
        armygreenbox9 = (ImageView) findViewById(R.id.armygreenbox9);
        armygreenbox10 = (ImageView) findViewById(R.id.armygreenbox10);
        armygreenbox11 = (ImageView) findViewById(R.id.armygreenbox11);
        armygreenbox12 = (ImageView) findViewById(R.id.armygreenbox12);
        armygreenbox13 = (ImageView) findViewById(R.id.armygreenbox13);
        armygreenbox14 = (ImageView) findViewById(R.id.armygreenbox14);
        armygreenbox15 = (ImageView) findViewById(R.id.armygreenbox15);
        armygreenbox16 = (ImageView) findViewById(R.id.armygreenbox16);
        armygreenbox17 = (ImageView) findViewById(R.id.armygreenbox17);
        armygreenbox18 = (ImageView) findViewById(R.id.armygreenbox18);
        armygreenbox19 = (ImageView) findViewById(R.id.armygreenbox19);
        armygreenbox20 = (ImageView) findViewById(R.id.armygreenbox20);

        //DARKBLUE BOX
        darkbluebox1 = (ImageView) findViewById(R.id.darkbluebox1);
        darkbluebox2 = (ImageView) findViewById(R.id.darkbluebox2);
        darkbluebox3 = (ImageView) findViewById(R.id.darkbluebox3);
        darkbluebox4 = (ImageView) findViewById(R.id.darkbluebox4);
        darkbluebox5 = (ImageView) findViewById(R.id.darkbluebox5);
        darkbluebox6 = (ImageView) findViewById(R.id.darkbluebox6);
        darkbluebox7 = (ImageView) findViewById(R.id.darkbluebox7);
        darkbluebox8 = (ImageView) findViewById(R.id.darkbluebox8);
        darkbluebox9 = (ImageView) findViewById(R.id.darkbluebox9);
        darkbluebox10 = (ImageView) findViewById(R.id.darkbluebox10);
        darkbluebox11 = (ImageView) findViewById(R.id.darkbluebox11);
        darkbluebox12 = (ImageView) findViewById(R.id.darkbluebox12);
        darkbluebox13 = (ImageView) findViewById(R.id.darkbluebox13);
        darkbluebox14 = (ImageView) findViewById(R.id.darkbluebox14);
        darkbluebox15 = (ImageView) findViewById(R.id.darkbluebox15);
        darkbluebox16 = (ImageView) findViewById(R.id.darkbluebox16);
        darkbluebox17 = (ImageView) findViewById(R.id.darkbluebox17);
        darkbluebox18 = (ImageView) findViewById(R.id.darkbluebox18);
        darkbluebox19 = (ImageView) findViewById(R.id.darkbluebox19);
        darkbluebox20 = (ImageView) findViewById(R.id.darkbluebox20);

        //LIGHTBLUE BOX
        lightbluebox1 = (ImageView) findViewById(R.id.lightbluebox1);
        lightbluebox2 = (ImageView) findViewById(R.id.lightbluebox2);
        lightbluebox3 = (ImageView) findViewById(R.id.lightbluebox3);
        lightbluebox4 = (ImageView) findViewById(R.id.lightbluebox4);
        lightbluebox5 = (ImageView) findViewById(R.id.lightbluebox5);
        lightbluebox6 = (ImageView) findViewById(R.id.lightbluebox6);
        lightbluebox7 = (ImageView) findViewById(R.id.lightbluebox7);
        lightbluebox8 = (ImageView) findViewById(R.id.lightbluebox8);
        lightbluebox9 = (ImageView) findViewById(R.id.lightbluebox9);
        lightbluebox10 = (ImageView) findViewById(R.id.lightbluebox10);
        lightbluebox11 = (ImageView) findViewById(R.id.lightbluebox11);
        lightbluebox12 = (ImageView) findViewById(R.id.lightbluebox12);
        lightbluebox13 = (ImageView) findViewById(R.id.lightbluebox13);
        lightbluebox14 = (ImageView) findViewById(R.id.lightbluebox14);
        lightbluebox15 = (ImageView) findViewById(R.id.lightbluebox15);
        lightbluebox16 = (ImageView) findViewById(R.id.lightbluebox16);
        lightbluebox17 = (ImageView) findViewById(R.id.lightbluebox17);
        lightbluebox18 = (ImageView) findViewById(R.id.lightbluebox18);
        lightbluebox19 = (ImageView) findViewById(R.id.lightbluebox19);
        lightbluebox20 = (ImageView) findViewById(R.id.lightbluebox20);

        //Light Green Box
        lightgreenbox1 = (ImageView) findViewById(R.id.lightgreenbox1);
        lightgreenbox2 = (ImageView) findViewById(R.id.lightgreenbox2);
        lightgreenbox3 = (ImageView) findViewById(R.id.lightgreenbox3);
        lightgreenbox4 = (ImageView) findViewById(R.id.lightgreenbox4);
        lightgreenbox5 = (ImageView) findViewById(R.id.lightgreenbox5);
        lightgreenbox6 = (ImageView) findViewById(R.id.lightgreenbox6);
        lightgreenbox7 = (ImageView) findViewById(R.id.lightgreenbox7);
        lightgreenbox8 = (ImageView) findViewById(R.id.lightgreenbox8);
        lightgreenbox9 = (ImageView) findViewById(R.id.lightgreenbox9);
        lightgreenbox10 = (ImageView) findViewById(R.id.lightgreenbox10);
        lightgreenbox11 = (ImageView) findViewById(R.id.lightgreenbox11);
        lightgreenbox12 = (ImageView) findViewById(R.id.lightgreenbox12);
        lightgreenbox13 = (ImageView) findViewById(R.id.lightgreenbox13);
        lightgreenbox14 = (ImageView) findViewById(R.id.lightgreenbox14);
        lightgreenbox15 = (ImageView) findViewById(R.id.lightgreenbox15);
        lightgreenbox16 = (ImageView) findViewById(R.id.lightgreenbox16);
        lightgreenbox17 = (ImageView) findViewById(R.id.lightgreenbox17);
        lightgreenbox18 = (ImageView) findViewById(R.id.lightgreenbox18);
        lightgreenbox19 = (ImageView) findViewById(R.id.lightgreenbox19);
        lightgreenbox20 = (ImageView) findViewById(R.id.lightgreenbox20);

        //BLACK BOX
        blackbox1 = (ImageView) findViewById(R.id.blackbox1);
        blackbox2 = (ImageView) findViewById(R.id.blackbox2);
        blackbox3 = (ImageView) findViewById(R.id.blackbox3);
        blackbox4 = (ImageView) findViewById(R.id.blackbox4);
        blackbox5 = (ImageView) findViewById(R.id.blackbox5);
        blackbox6 = (ImageView) findViewById(R.id.blackbox6);
        blackbox7 = (ImageView) findViewById(R.id.blackbox7);
        blackbox8 = (ImageView) findViewById(R.id.blackbox8);
        blackbox9 = (ImageView) findViewById(R.id.blackbox9);
        blackbox10 = (ImageView) findViewById(R.id.blackbox10);
        blackbox11 = (ImageView) findViewById(R.id.blackbox11);
        blackbox12 = (ImageView) findViewById(R.id.blackbox12);
        blackbox13 = (ImageView) findViewById(R.id.blackbox13);
        blackbox14 = (ImageView) findViewById(R.id.blackbox14);
        blackbox15 = (ImageView) findViewById(R.id.blackbox15);
        blackbox16 = (ImageView) findViewById(R.id.blackbox16);
        blackbox17 = (ImageView) findViewById(R.id.blackbox17);
        blackbox18 = (ImageView) findViewById(R.id.blackbox18);
        blackbox19 = (ImageView) findViewById(R.id.blackbox19);
        blackbox20 = (ImageView) findViewById(R.id.blackbox20);

        //SHARP BOX
        sharpbox1 = (ImageView) findViewById(R.id.sharpbox1);
        sharpbox2 = (ImageView) findViewById(R.id.sharpbox2);
        sharpbox3 = (ImageView) findViewById(R.id.sharpbox3);
        sharpbox4 = (ImageView) findViewById(R.id.sharpbox4);
        sharpbox5 = (ImageView) findViewById(R.id.sharpbox5);
        sharpbox6 = (ImageView) findViewById(R.id.sharpbox6);
        sharpbox7 = (ImageView) findViewById(R.id.sharpbox7);
        sharpbox8 = (ImageView) findViewById(R.id.sharpbox8);
        sharpbox9 = (ImageView) findViewById(R.id.sharpbox9);
        sharpbox10 = (ImageView) findViewById(R.id.sharpbox10);
        sharpbox11 = (ImageView) findViewById(R.id.sharpbox11);
        sharpbox12 = (ImageView) findViewById(R.id.sharpbox12);
        sharpbox13 = (ImageView) findViewById(R.id.sharpbox13);
        sharpbox14 = (ImageView) findViewById(R.id.sharpbox14);
        sharpbox15 = (ImageView) findViewById(R.id.sharpbox15);
        sharpbox16 = (ImageView) findViewById(R.id.sharpbox16);
        sharpbox17 = (ImageView) findViewById(R.id.sharpbox17);
        sharpbox18 = (ImageView) findViewById(R.id.sharpbox18);
        sharpbox19 = (ImageView) findViewById(R.id.sharpbox19);
        sharpbox20 = (ImageView) findViewById(R.id.sharpbox20);


        //RED BOX
        redbox1.setOnClickListener(this);
        redbox2.setOnClickListener(this);
        redbox3.setOnClickListener(this);
        redbox4.setOnClickListener(this);
        redbox5.setOnClickListener(this);
        redbox6.setOnClickListener(this);
        redbox7.setOnClickListener(this);
        redbox8.setOnClickListener(this);
        redbox9.setOnClickListener(this);
        redbox10.setOnClickListener(this);
        redbox11.setOnClickListener(this);
        redbox12.setOnClickListener(this);
        redbox13.setOnClickListener(this);
        redbox14.setOnClickListener(this);
        redbox15.setOnClickListener(this);
        redbox16.setOnClickListener(this);
        redbox17.setOnClickListener(this);
        redbox18.setOnClickListener(this);
        redbox19.setOnClickListener(this);
        redbox20.setOnClickListener(this);

        //YELLOW BOX
        yellowbox1.setOnClickListener(this);
        yellowbox2.setOnClickListener(this);
        yellowbox3.setOnClickListener(this);
        yellowbox4.setOnClickListener(this);
        yellowbox5.setOnClickListener(this);
        yellowbox6.setOnClickListener(this);
        yellowbox7.setOnClickListener(this);
        yellowbox8.setOnClickListener(this);
        yellowbox9.setOnClickListener(this);
        yellowbox10.setOnClickListener(this);
        yellowbox11.setOnClickListener(this);
        yellowbox12.setOnClickListener(this);
        yellowbox13.setOnClickListener(this);
        yellowbox14.setOnClickListener(this);
        yellowbox15.setOnClickListener(this);
        yellowbox16.setOnClickListener(this);
        yellowbox17.setOnClickListener(this);
        yellowbox18.setOnClickListener(this);
        yellowbox19.setOnClickListener(this);
        yellowbox20.setOnClickListener(this);

        //ARMYGREEN BOX
        armygreenbox1.setOnClickListener(this);
        armygreenbox2.setOnClickListener(this);
        armygreenbox3.setOnClickListener(this);
        armygreenbox4.setOnClickListener(this);
        armygreenbox5.setOnClickListener(this);
        armygreenbox6.setOnClickListener(this);
        armygreenbox7.setOnClickListener(this);
        armygreenbox8.setOnClickListener(this);
        armygreenbox9.setOnClickListener(this);
        armygreenbox10.setOnClickListener(this);
        armygreenbox11.setOnClickListener(this);
        armygreenbox12.setOnClickListener(this);
        armygreenbox13.setOnClickListener(this);
        armygreenbox14.setOnClickListener(this);
        armygreenbox15.setOnClickListener(this);
        armygreenbox16.setOnClickListener(this);
        armygreenbox17.setOnClickListener(this);
        armygreenbox18.setOnClickListener(this);
        armygreenbox19.setOnClickListener(this);
        armygreenbox20.setOnClickListener(this);

        //DARKBLUE BOX
        darkbluebox1.setOnClickListener(this);
        darkbluebox2.setOnClickListener(this);
        darkbluebox3.setOnClickListener(this);
        darkbluebox4.setOnClickListener(this);
        darkbluebox5.setOnClickListener(this);
        darkbluebox6.setOnClickListener(this);
        darkbluebox7.setOnClickListener(this);
        darkbluebox8.setOnClickListener(this);
        darkbluebox9.setOnClickListener(this);
        darkbluebox10.setOnClickListener(this);
        darkbluebox11.setOnClickListener(this);
        darkbluebox12.setOnClickListener(this);
        darkbluebox13.setOnClickListener(this);
        darkbluebox14.setOnClickListener(this);
        darkbluebox15.setOnClickListener(this);
        darkbluebox16.setOnClickListener(this);
        darkbluebox17.setOnClickListener(this);
        darkbluebox18.setOnClickListener(this);
        darkbluebox19.setOnClickListener(this);
        darkbluebox20.setOnClickListener(this);

        //LIGHTBLUE BOX
        lightbluebox1.setOnClickListener(this);
        lightbluebox2.setOnClickListener(this);
        lightbluebox3.setOnClickListener(this);
        lightbluebox4.setOnClickListener(this);
        lightbluebox5.setOnClickListener(this);
        lightbluebox6.setOnClickListener(this);
        lightbluebox7.setOnClickListener(this);
        lightbluebox8.setOnClickListener(this);
        lightbluebox9.setOnClickListener(this);
        lightbluebox10.setOnClickListener(this);
        lightbluebox11.setOnClickListener(this);
        lightbluebox12.setOnClickListener(this);
        lightbluebox13.setOnClickListener(this);
        lightbluebox14.setOnClickListener(this);
        lightbluebox15.setOnClickListener(this);
        lightbluebox16.setOnClickListener(this);
        lightbluebox17.setOnClickListener(this);
        lightbluebox18.setOnClickListener(this);
        lightbluebox19.setOnClickListener(this);
        lightbluebox20.setOnClickListener(this);

        //LIGHTBLUE BOX
        lightgreenbox1.setOnClickListener(this);
        lightgreenbox2.setOnClickListener(this);
        lightgreenbox3.setOnClickListener(this);
        lightgreenbox4.setOnClickListener(this);
        lightgreenbox5.setOnClickListener(this);
        lightgreenbox6.setOnClickListener(this);
        lightgreenbox7.setOnClickListener(this);
        lightgreenbox8.setOnClickListener(this);
        lightgreenbox9.setOnClickListener(this);
        lightgreenbox10.setOnClickListener(this);
        lightgreenbox11.setOnClickListener(this);
        lightgreenbox12.setOnClickListener(this);
        lightgreenbox13.setOnClickListener(this);
        lightgreenbox14.setOnClickListener(this);
        lightgreenbox15.setOnClickListener(this);
        lightgreenbox16.setOnClickListener(this);
        lightgreenbox17.setOnClickListener(this);
        lightgreenbox18.setOnClickListener(this);
        lightgreenbox19.setOnClickListener(this);
        lightgreenbox20.setOnClickListener(this);

        //BLACK BOX
        blackbox1.setOnClickListener(this);
        blackbox2.setOnClickListener(this);
        blackbox3.setOnClickListener(this);
        blackbox4.setOnClickListener(this);
        blackbox5.setOnClickListener(this);
        blackbox6.setOnClickListener(this);
        blackbox7.setOnClickListener(this);
        blackbox8.setOnClickListener(this);
        blackbox9.setOnClickListener(this);
        blackbox10.setOnClickListener(this);
        blackbox11.setOnClickListener(this);
        blackbox12.setOnClickListener(this);
        blackbox13.setOnClickListener(this);
        blackbox14.setOnClickListener(this);
        blackbox15.setOnClickListener(this);
        blackbox16.setOnClickListener(this);
        blackbox17.setOnClickListener(this);
        blackbox18.setOnClickListener(this);
        blackbox19.setOnClickListener(this);
        blackbox20.setOnClickListener(this);

        //SHARP BOX
        sharpbox1.setOnClickListener(this);
        sharpbox2.setOnClickListener(this);
        sharpbox3.setOnClickListener(this);
        sharpbox4.setOnClickListener(this);
        sharpbox5.setOnClickListener(this);
        sharpbox6.setOnClickListener(this);
        sharpbox7.setOnClickListener(this);
        sharpbox8.setOnClickListener(this);
        sharpbox9.setOnClickListener(this);
        sharpbox10.setOnClickListener(this);
        sharpbox11.setOnClickListener(this);
        sharpbox12.setOnClickListener(this);
        sharpbox13.setOnClickListener(this);
        sharpbox14.setOnClickListener(this);
        sharpbox15.setOnClickListener(this);
        sharpbox16.setOnClickListener(this);
        sharpbox17.setOnClickListener(this);
        sharpbox18.setOnClickListener(this);
        sharpbox19.setOnClickListener(this);
        sharpbox20.setOnClickListener(this);


    }

    int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0, flag6 = 0, flag7 = 0, flag8 = 0, flag9 = 0, flag10 = 0, flag11 = 0, flag12 = 0, flag13 = 0, flag14 = 0, flag15 = 0, flag16 = 0, flag17 = 0, flag18 = 0, flag19 = 0, flag20 = 0;


    @Override
    public void onClick(View view) {
        for (int i = 0; i <= 22; i++) {
            if (points <= 5) {
                tv2.setText("Points: 0");
                points = 0;
                Intent playActivity = new Intent(this, Lost.class);
                playActivity.putExtra("pt", points);
                this.startActivity(playActivity);
                finish();
                break;
            } else {
                if(flag1==1 && flag2==1 && flag3==1 && flag4==1 && flag5==1 && flag6==1 && flag7==1 && flag8==1 && flag9==1 && flag10==1 && flag11==1 && flag12==1 && flag13==1 && flag14==1 && flag15==1 && flag16==1 && flag17==1 && flag18==1 && flag19==1){
                    btn1 = findViewById(R.id.nextbtn);
                    btn1.setEnabled(true);
                    btn1.setOnClickListener(this);
                    if(view.getId()==R.id.nextbtn){
                        Intent lvl3Activity = new Intent(Play.this,lvl3.class);
                        lvl3Activity.putExtra("points", points);
                        this.startActivity(lvl3Activity);
                        finish();
                    }
                }

                //Q.1
                if(view.getId()==R.id.redbox1){
                    text1.setText("Correct Answer, Good");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: %d"+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag1=1;

                    break;
                }
                else if(view.getId()==R.id.yellowbox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag1=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag1=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag1=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    flag1=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    flag1=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;

                }
                else if(view.getId()==R.id.blackbox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    flag1=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;

                }
                else if(view.getId()==R.id.sharpbox1) {
                    text1.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox1.setEnabled(false);
                    yellowbox1.setEnabled(false);
                    armygreenbox1.setEnabled(false);
                    darkbluebox1.setEnabled(false);
                    lightbluebox1.setEnabled(false);
                    lightgreenbox1.setEnabled(false);
                    blackbox1.setEnabled(false);
                    sharpbox1.setEnabled(false);
                    flag1=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;

                }
                //Q. 2
                else if(view.getId()==R.id.redbox2) {
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    flag2=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.yellowbox2) {
                    text2.setText("Correct Answer, Good");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag2=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox2) {
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    flag2=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.darkbluebox2) {
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    flag2=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.lightbluebox2) {
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    flag2=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox2){
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    flag2=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.blackbox2) {
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    flag2=1;
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    break;
                }
                else if(view.getId()==R.id.sharpbox2) {
                    text2.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox2.setEnabled(false);
                    yellowbox2.setEnabled(false);
                    armygreenbox2.setEnabled(false);
                    darkbluebox2.setEnabled(false);
                    lightbluebox2.setEnabled(false);
                    lightgreenbox2.setEnabled(false);
                    blackbox2.setEnabled(false);
                    sharpbox2.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag2=1;
                    break;
                }
                //Q. 3
                else if(view.getId()==R.id.redbox3) {
                    text3.setText("Correct Answer, Good");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox3){
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox3) {
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox3) {
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox3) {
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox3) {
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox3) {
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox3) {
                    text3.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox3.setEnabled(false);
                    yellowbox3.setEnabled(false);
                    armygreenbox3.setEnabled(false);
                    darkbluebox3.setEnabled(false);
                    lightbluebox3.setEnabled(false);
                    lightgreenbox3.setEnabled(false);
                    blackbox3.setEnabled(false);
                    sharpbox3.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag3=1;
                    break;
                }
                else if(view.getId()==R.id.redbox4){
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox4) {
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox4) {
                    text4.setText("Correct Answer, Good");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox4) {
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox4) {
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox4) {
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox4) {
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox4) {
                    text4.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox4.setEnabled(false);
                    yellowbox4.setEnabled(false);
                    armygreenbox4.setEnabled(false);
                    darkbluebox4.setEnabled(false);
                    lightbluebox4.setEnabled(false);
                    lightgreenbox4.setEnabled(false);
                    blackbox4.setEnabled(false);
                    sharpbox4.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag4=1;
                    break;
                }
                else if(view.getId()==R.id.redbox5) {
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox5) {
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox5){
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox5) {
                    text5.setText("Correct Answer, Good");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox5) {
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox5) {
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox5) {
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox5) {
                    text5.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox5.setEnabled(false);
                    yellowbox5.setEnabled(false);
                    armygreenbox5.setEnabled(false);
                    darkbluebox5.setEnabled(false);
                    lightbluebox5.setEnabled(false);
                    lightgreenbox5.setEnabled(false);
                    blackbox5.setEnabled(false);
                    sharpbox5.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag5=1;
                    break;
                }
                else if(view.getId()==R.id.redbox6) {
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox6) {
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox6) {
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox6) {
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox6) {
                    text6.setText("Correct Answer, Good");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox6){
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox6){
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox6){
                    text6.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox6.setEnabled(false);
                    yellowbox6.setEnabled(false);
                    armygreenbox6.setEnabled(false);
                    darkbluebox6.setEnabled(false);
                    lightbluebox6.setEnabled(false);
                    lightgreenbox6.setEnabled(false);
                    blackbox6.setEnabled(false);
                    sharpbox6.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag6=1;
                    break;
                }
                else if(view.getId()==R.id.redbox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox7){
                    text7.setText("Correct Answer, Good");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox7){
                    text7.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox7.setEnabled(false);
                    yellowbox7.setEnabled(false);
                    armygreenbox7.setEnabled(false);
                    darkbluebox7.setEnabled(false);
                    lightbluebox7.setEnabled(false);
                    lightgreenbox7.setEnabled(false);
                    blackbox7.setEnabled(false);
                    sharpbox7.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag7=1;
                    break;
                }
                else if(view.getId()==R.id.redbox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox8){
                    text8.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharp");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox8){
                    text8.setText("Correct Answer, Good");
                    redbox8.setEnabled(false);
                    yellowbox8.setEnabled(false);
                    armygreenbox8.setEnabled(false);
                    darkbluebox8.setEnabled(false);
                    lightbluebox8.setEnabled(false);
                    lightgreenbox8.setEnabled(false);
                    blackbox8.setEnabled(false);
                    sharpbox8.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag8=1;
                    break;
                }
                else if(view.getId()==R.id.redbox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox9){
                    text9.setText("Correct Answer, Good");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox9){
                    text9.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox9.setEnabled(false);
                    yellowbox9.setEnabled(false);
                    armygreenbox9.setEnabled(false);
                    darkbluebox9.setEnabled(false);
                    lightbluebox9.setEnabled(false);
                    lightgreenbox9.setEnabled(false);
                    blackbox9.setEnabled(false);
                    sharpbox9.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag9=1;
                    break;
                }
                else if(view.getId()==R.id.redbox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox10){
                    text10.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox10){
                    text10.setText("Correct Answer, Good");
                    redbox10.setEnabled(false);
                    yellowbox10.setEnabled(false);
                    armygreenbox10.setEnabled(false);
                    darkbluebox10.setEnabled(false);
                    lightbluebox10.setEnabled(false);
                    lightgreenbox10.setEnabled(false);
                    blackbox10.setEnabled(false);
                    sharpbox10.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag10=1;
                    break;
                }
                else if(view.getId()==R.id.redbox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox11){
                    text11.setText("Correct Answer, Good");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.sharpbox11){
                    text11.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox11.setEnabled(false);
                    yellowbox11.setEnabled(false);
                    armygreenbox11.setEnabled(false);
                    darkbluebox11.setEnabled(false);
                    lightbluebox11.setEnabled(false);
                    lightgreenbox11.setEnabled(false);
                    blackbox11.setEnabled(false);
                    sharpbox11.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag11=1;
                    break;
                }
                else if(view.getId()==R.id.redbox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }
                else if(view.getId()==R.id.yellowbox12){
                    text12.setText("Correct Answer, Good");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }
                else if(view.getId()==R.id.darkbluebox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }
                else if(view.getId()==R.id.lightbluebox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }
                else if(view.getId()==R.id.lightgreenbox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }


                else if(view.getId()==R.id.blackbox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox12){
                    text12.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox12.setEnabled(false);
                    yellowbox12.setEnabled(false);
                    armygreenbox12.setEnabled(false);
                    darkbluebox12.setEnabled(false);
                    lightbluebox12.setEnabled(false);
                    lightgreenbox12.setEnabled(false);
                    blackbox12.setEnabled(false);
                    sharpbox12.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag12=1;
                    break;
                }

                else if(view.getId()==R.id.redbox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox13){
                    text13.setText("Correct Answer, Good");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox13){
                    text13.setText("        Wrong Answer\n" +
                            "            Correct Answer is Black");
                    redbox13.setEnabled(false);
                    yellowbox13.setEnabled(false);
                    armygreenbox13.setEnabled(false);
                    darkbluebox13.setEnabled(false);
                    lightbluebox13.setEnabled(false);
                    lightgreenbox13.setEnabled(false);
                    blackbox13.setEnabled(false);
                    sharpbox13.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag13=1;
                    break;
                }

                else if(view.getId()==R.id.redbox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox14){
                    text14.setText("Correct Answer, Good");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }
                else if(view.getId()==R.id.blackbox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox14){
                    text14.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Blue");
                    redbox14.setEnabled(false);
                    yellowbox14.setEnabled(false);
                    armygreenbox14.setEnabled(false);
                    darkbluebox14.setEnabled(false);
                    lightbluebox14.setEnabled(false);
                    lightgreenbox14.setEnabled(false);
                    blackbox14.setEnabled(false);
                    sharpbox14.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag14=1;
                    break;
                }

                else if(view.getId()==R.id.redbox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }
                else if(view.getId()==R.id.armygreenbox15){
                    text15.setText("Correct Answer, Good");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox15){
                    text15.setText("        Wrong Answer\n" +
                            "            Correct Answer is Army Green");
                    redbox15.setEnabled(false);
                    yellowbox15.setEnabled(false);
                    armygreenbox15.setEnabled(false);
                    darkbluebox15.setEnabled(false);
                    lightbluebox15.setEnabled(false);
                    lightgreenbox15.setEnabled(false);
                    blackbox15.setEnabled(false);
                    sharpbox15.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag15=1;
                    break;
                }

                else if(view.getId()==R.id.redbox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox16){
                    text16.setText("Correct Answer, Good");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox16){
                    text16.setText("        Wrong Answer\n" +
                            "            Correct Answer is Dark Blue");
                    redbox16.setEnabled(false);
                    yellowbox16.setEnabled(false);
                    armygreenbox16.setEnabled(false);
                    darkbluebox16.setEnabled(false);
                    lightbluebox16.setEnabled(false);
                    lightgreenbox16.setEnabled(false);
                    blackbox16.setEnabled(false);
                    sharpbox16.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag16=1;
                    break;
                }

                else if(view.getId()==R.id.redbox17){
                    text17.setText("Correct Answer, Good");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox17){
                    text17.setText("        Wrong Answer\n" +
                            "            Correct Answer is Red");
                    redbox17.setEnabled(false);
                    yellowbox17.setEnabled(false);
                    armygreenbox17.setEnabled(false);
                    darkbluebox17.setEnabled(false);
                    lightbluebox17.setEnabled(false);
                    lightgreenbox17.setEnabled(false);
                    blackbox17.setEnabled(false);
                    sharpbox17.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag17=1;
                    break;
                }

                else if(view.getId()==R.id.redbox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox18){
                    text18.setText("Correct Answer, Good");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox18){
                    text18.setText("        Wrong Answer\n" +
                            "            Correct Answer is Yellow");
                    redbox18.setEnabled(false);
                    yellowbox18.setEnabled(false);
                    armygreenbox18.setEnabled(false);
                    darkbluebox18.setEnabled(false);
                    lightbluebox18.setEnabled(false);
                    lightgreenbox18.setEnabled(false);
                    blackbox18.setEnabled(false);
                    sharpbox18.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag18=1;
                    break;
                }

                else if(view.getId()==R.id.redbox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox19){
                    text19.setText("        Wrong Answer\n" +
                            "            Correct Answer is Sharps");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.sharpbox19){
                    text19.setText("Correct Answer, Good");
                    redbox19.setEnabled(false);
                    yellowbox19.setEnabled(false);
                    armygreenbox19.setEnabled(false);
                    darkbluebox19.setEnabled(false);
                    lightbluebox19.setEnabled(false);
                    lightgreenbox19.setEnabled(false);
                    blackbox19.setEnabled(false);
                    sharpbox19.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag19=1;
                    break;
                }

                else if(view.getId()==R.id.redbox20){
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else if(view.getId()==R.id.yellowbox20){
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else if(view.getId()==R.id.armygreenbox20){
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else if(view.getId()==R.id.darkbluebox20){
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else if(view.getId()==R.id.lightbluebox20){
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else if(view.getId()==R.id.lightgreenbox20){
                    text20.setText("Correct Answer, Good");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points+5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound1, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else if(view.getId()==R.id.blackbox20){
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }

                else{
                    text20.setText("        Wrong Answer\n" +
                            "            Correct Answer is Light Green");
                    redbox20.setEnabled(false);
                    yellowbox20.setEnabled(false);
                    armygreenbox20.setEnabled(false);
                    darkbluebox20.setEnabled(false);
                    lightbluebox20.setEnabled(false);
                    lightgreenbox20.setEnabled(false);
                    blackbox20.setEnabled(false);
                    sharpbox20.setEnabled(false);
                    points=points-5;
                    tv2.setText("Points: "+points);
                    soundpool.play(sound2, 1, 1, 0, 0, 1);
                    flag20=1;
                    break;
                }



            }
        }
    }
}

