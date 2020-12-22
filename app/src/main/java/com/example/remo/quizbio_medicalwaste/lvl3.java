package com.example.remo.quizbio_medicalwaste;

import android.content.ClipData;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.time.Year;

public class lvl3 extends AppCompatActivity {

    TextView tv2;
    public int points = 40;
    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20, text21;
    ImageView redbox1lvl3, redbox2lvl3, redbox5lvl3, redbox6lvl3, redbox9lvl3, redbox10lvl3, redbox11lvl3, redbox12lvl3, redbox13lvl3, redbox14lvl3, redbox15lvl3, redbox16lvl3, redbox17lvl3, redbox19lvl3, redbox20lvl3, redbox21lvl3;
    ImageView yellowbox1lvl3, yellowbox2lvl3, yellowbox3lvl3, yellowbox5lvl3, yellowbox9lvl3, yellowbox10lvl3, yellowbox12lvl3, yellowbox15lvl3, yellowbox21lvl3;
    ImageView armygreenbox1lvl3, armygreenbox2lvl3, armygreenbox3lvl3, armygreenbox5lvl3, armygreenbox7lvl3, armygreenbox10lvl3, armygreenbox12lvl3, armygreenbox13lvl3, armygreenbox14lvl3, armygreenbox15lvl3, armygreenbox18lvl3;
    ImageView darkbluebox1lvl3, darkbluebox2lvl3, darkbluebox4lvl3, darkbluebox6lvl3, darkbluebox7lvl3, darkbluebox11lvl3, darkbluebox12lvl3, darkbluebox13lvl3, darkbluebox17lvl3;
    ImageView lightbluebox3lvl3, lightbluebox4lvl3, lightbluebox8lvl3, lightbluebox18lvl3, lightbluebox21lvl3;
    ImageView lightgreenbox4lvl3, lightgreenbox8lvl3, lightgreenbox13lvl3, lightgreenbox16lvl3, lightgreenbox19lvl3, lightgreenbox20lvl3;
    ImageView blackbox3lvl3, blackbox4lvl3, blackbox5lvl3, blackbox6lvl3, blackbox7lvl3, blackbox8lvl3, blackbox9lvl3, blackbox10lvl3, blackbox11lvl3, blackbox14lvl3, blackbox16lvl3, blackbox17lvl3, blackbox18lvl3, blackbox19lvl3, blackbox20lvl3;
    ImageView sharpbox6lvl3, sharpbox7lvl3, sharpbox8lvl3, sharpbox9lvl3, sharpbox11lvl3, sharpbox14lvl3, sharpbox15lvl3, sharpbox16lvl3, sharpbox17lvl3, sharpbox18lvl3, sharpbox19lvl3, sharpbox20lvl3, sharpbox21lvl3;
    RelativeLayout q1lvl3, q2lvl3, q3lvl3, q4lvl3, q5lvl3, q6lvl3, q7lvl3, q8lvl3, q9lvl3, q10lvl3, q11lvl3, q12lvl3, q13lvl3, q14lvl3, q15lvl3, q16lvl3, q17lvl3, q18lvl3, q19lvl3, q20lvl3, q21lvl3;
    Button btn1;

    public int flag1=0, flag2=0, flag3=0, flag4=0, flag5=0, flag6=0, flag7=0, flag8=0, flag9=0, flag10=0, flag11=0, flag12=0, flag13=0, flag14=0, flag15=0, flag16=0, flag17=0, flag18=0, flag19=0, flag20=0, flag21=0;


    private SoundPool soundpool;
    private int sound1, sound2, sound3, sound4;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl3);


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
        
        
        tv2 = findViewById(R.id.pointlvl3);

        btn1 = (Button)findViewById(R.id.nextbtnlvl3);
        btn1.setEnabled(false);

        int pt= getIntent().getIntExtra("points", 0);
        points=pt;
        tv2.setText("Your Score: "+pt);

        //REDBOX
        redbox1lvl3 = (ImageView) findViewById(R.id.redbox1lvl3);
        redbox2lvl3 = (ImageView) findViewById(R.id.redbox2lvl3);
        redbox5lvl3 = (ImageView) findViewById(R.id.redbox5lvl3);
        redbox6lvl3 = (ImageView) findViewById(R.id.redbox6lvl3);
        redbox9lvl3 = (ImageView) findViewById(R.id.redbox9lvl3);
        redbox10lvl3 = (ImageView) findViewById(R.id.redbox10lvl3);
        redbox11lvl3 = (ImageView) findViewById(R.id.redbox11lvl3);
        redbox12lvl3= (ImageView) findViewById(R.id.redbox12lvl3);
        redbox13lvl3 = (ImageView) findViewById(R.id.redbox13lvl3);
        redbox14lvl3 = (ImageView) findViewById(R.id.redbox14lvl3);
        redbox15lvl3 = (ImageView) findViewById(R.id.redbox15lvl3);
        redbox16lvl3 = (ImageView) findViewById(R.id.redbox16lvl3);
        redbox17lvl3 = (ImageView) findViewById(R.id.redbox17lvl3);
        redbox19lvl3 = (ImageView) findViewById(R.id.redbox19lvl3);
        redbox20lvl3 = (ImageView) findViewById(R.id.redbox20lvl3);
        redbox21lvl3 = (ImageView) findViewById(R.id.redbox21lvl3);

        //YELLOW BOX
        yellowbox1lvl3 = (ImageView) findViewById(R.id.yellowbox1lvl3);
        yellowbox2lvl3 = (ImageView) findViewById(R.id.yellowbox2lvl3);
        yellowbox3lvl3 = (ImageView) findViewById(R.id.yellowbox3lvl3);
        yellowbox5lvl3 = (ImageView) findViewById(R.id.yellowbox5lvl3);
        yellowbox9lvl3 = (ImageView) findViewById(R.id.yellowbox9lvl3);
        yellowbox10lvl3 = (ImageView) findViewById(R.id.yellowbox10lvl3);
        yellowbox12lvl3 = (ImageView) findViewById(R.id.yellowbox12lvl3);
        yellowbox15lvl3 = (ImageView) findViewById(R.id.yellowbox15lvl3);
        yellowbox21lvl3 = (ImageView) findViewById(R.id.yellowbox21lvl3);

        //ARMYGREEN BOX
        armygreenbox1lvl3 = (ImageView) findViewById(R.id.armygreenbox1lvl3);
        armygreenbox2lvl3 = (ImageView) findViewById(R.id.armygreenbox2lvl3);
        armygreenbox3lvl3 = (ImageView) findViewById(R.id.armygreenbox3lvl3);
        armygreenbox5lvl3 = (ImageView) findViewById(R.id.armygreenbox5lvl3);
        armygreenbox7lvl3 = (ImageView) findViewById(R.id.armygreenbox7lvl3);
        armygreenbox10lvl3 = (ImageView) findViewById(R.id.armygreenbox10lvl3);
        armygreenbox12lvl3 = (ImageView) findViewById(R.id.armygreenbox12lvl3);
        armygreenbox13lvl3 = (ImageView) findViewById(R.id.armygreenbox13lvl3);
        armygreenbox14lvl3 = (ImageView) findViewById(R.id.armygreenbox14lvl3);
        armygreenbox15lvl3 = (ImageView) findViewById(R.id.armygreenbox15lvl3);
        armygreenbox18lvl3 = (ImageView) findViewById(R.id.armygreenbox18lvl3);


        //DARKBLUE BOX
        darkbluebox1lvl3 = (ImageView) findViewById(R.id.darkbluebox1lvl3);
        darkbluebox2lvl3 = (ImageView) findViewById(R.id.darkbluebox2lvl3);
        darkbluebox4lvl3 = (ImageView) findViewById(R.id.darkbluebox4lvl3);
        darkbluebox6lvl3 = (ImageView) findViewById(R.id.darkbluebox6lvl3);
        darkbluebox7lvl3 = (ImageView) findViewById(R.id.darkbluebox7lvl3);
        darkbluebox11lvl3 = (ImageView) findViewById(R.id.darkbluebox11lvl3);
        darkbluebox12lvl3 = (ImageView) findViewById(R.id.darkbluebox12lvl3);
        darkbluebox13lvl3 = (ImageView) findViewById(R.id.darkbluebox13lvl3);
        darkbluebox17lvl3 = (ImageView) findViewById(R.id.darkbluebox17lvl3);

        //LIGHTBLUE BOX
        lightbluebox3lvl3 = (ImageView) findViewById(R.id.lightbluebox3lvl3);
        lightbluebox4lvl3 = (ImageView) findViewById(R.id.lightbluebox4lvl3);
        lightbluebox8lvl3 = (ImageView) findViewById(R.id.lightbluebox8lvl3);
        lightbluebox18lvl3 = (ImageView) findViewById(R.id.lightbluebox18lvl3);
        lightbluebox21lvl3 = (ImageView) findViewById(R.id.lightbluebox21lvl3);

        //Light Green Box
        lightgreenbox4lvl3 = (ImageView) findViewById(R.id.lightgreenbox4lvl3);
        lightgreenbox8lvl3 = (ImageView) findViewById(R.id.lightgreenbox8lvl3);
        lightgreenbox13lvl3 = (ImageView) findViewById(R.id.lightgreenbox13lvl3);
        lightgreenbox16lvl3 = (ImageView) findViewById(R.id.lightgreenbox16lvl3);
        lightgreenbox19lvl3 = (ImageView) findViewById(R.id.lightgreenbox19lvl3);
        lightgreenbox20lvl3 = (ImageView) findViewById(R.id.lightgreenbox20lvl3);

        //BLACK BOX
        blackbox3lvl3 = (ImageView) findViewById(R.id.blackbox3lvl3);
        blackbox4lvl3 = (ImageView) findViewById(R.id.blackbox4lvl3);
        blackbox5lvl3 = (ImageView) findViewById(R.id.blackbox5lvl3);
        blackbox6lvl3 = (ImageView) findViewById(R.id.blackbox6lvl3);
        blackbox7lvl3 = (ImageView) findViewById(R.id.blackbox7lvl3);
        blackbox8lvl3 = (ImageView) findViewById(R.id.blackbox8lvl3);
        blackbox9lvl3 = (ImageView) findViewById(R.id.blackbox9lvl3);
        blackbox10lvl3 = (ImageView) findViewById(R.id.blackbox10lvl3);
        blackbox11lvl3 = (ImageView) findViewById(R.id.blackbox11lvl3);
        blackbox14lvl3 = (ImageView) findViewById(R.id.blackbox14lvl3);
        blackbox16lvl3 = (ImageView) findViewById(R.id.blackbox16lvl3);
        blackbox17lvl3 = (ImageView) findViewById(R.id.blackbox17lvl3);
        blackbox18lvl3 = (ImageView) findViewById(R.id.blackbox18lvl3);
        blackbox19lvl3 = (ImageView) findViewById(R.id.blackbox19lvl3);
        blackbox20lvl3 = (ImageView) findViewById(R.id.blackbox20lvl3);

        //SHARP BOX
        sharpbox6lvl3 = (ImageView) findViewById(R.id.sharpbox6lvl3);
        sharpbox7lvl3 = (ImageView) findViewById(R.id.sharpbox7lvl3);
        sharpbox8lvl3 = (ImageView) findViewById(R.id.sharpbox8lvl3);
        sharpbox9lvl3 = (ImageView) findViewById(R.id.sharpbox9lvl3);
        sharpbox11lvl3 = (ImageView) findViewById(R.id.sharpbox11lvl3);
        sharpbox14lvl3 = (ImageView) findViewById(R.id.sharpbox14lvl3);
        sharpbox15lvl3 = (ImageView) findViewById(R.id.sharpbox15lvl3);
        sharpbox16lvl3 = (ImageView) findViewById(R.id.sharpbox16lvl3);
        sharpbox17lvl3 = (ImageView) findViewById(R.id.sharpbox17lvl3);
        sharpbox18lvl3 = (ImageView) findViewById(R.id.sharpbox18lvl3);
        sharpbox19lvl3 = (ImageView) findViewById(R.id.sharpbox19lvl3);
        sharpbox20lvl3 = (ImageView) findViewById(R.id.sharpbox20lvl3);
        sharpbox21lvl3 = (ImageView) findViewById(R.id.sharpbox21lvl3);


        q1lvl3 = (RelativeLayout) findViewById(R.id.q1lvl3);
        q2lvl3 = (RelativeLayout) findViewById(R.id.q2lvl3);
        q3lvl3 = (RelativeLayout) findViewById(R.id.q3lvl3);
        q4lvl3 = (RelativeLayout) findViewById(R.id.q4lvl3);
        q5lvl3 = (RelativeLayout) findViewById(R.id.q5lvl3);
        q6lvl3 = (RelativeLayout) findViewById(R.id.q6lvl3);
        q7lvl3 = (RelativeLayout) findViewById(R.id.q7lvl3);
        q8lvl3 = (RelativeLayout) findViewById(R.id.q8lvl3);
        q9lvl3 = (RelativeLayout) findViewById(R.id.q9lvl3);
        q10lvl3 = (RelativeLayout) findViewById(R.id.q10lvl3);
        q11lvl3 = (RelativeLayout) findViewById(R.id.q11lvl3);
        q12lvl3 = (RelativeLayout) findViewById(R.id.q12lvl3);
        q13lvl3 = (RelativeLayout) findViewById(R.id.q13lvl3);
        q14lvl3 = (RelativeLayout) findViewById(R.id.q14lvl3);
        q15lvl3 = (RelativeLayout) findViewById(R.id.q15lvl3);
        q16lvl3 = (RelativeLayout) findViewById(R.id.q16lvl3);
        q17lvl3 = (RelativeLayout) findViewById(R.id.q17lvl3);
        q18lvl3 = (RelativeLayout) findViewById(R.id.q18lvl3);
        q19lvl3 = (RelativeLayout) findViewById(R.id.q19lvl3);
        q20lvl3 = (RelativeLayout) findViewById(R.id.q20lvl3);
        q21lvl3 = (RelativeLayout) findViewById(R.id.q21lvl3);


        text1 = (TextView) findViewById(R.id.text1lvl3);
        text2 = (TextView) findViewById(R.id.text2lvl3);
        text3 = (TextView) findViewById(R.id.text3lvl3);
        text4 = (TextView) findViewById(R.id.text4lvl3);
        text5 = (TextView) findViewById(R.id.text5lvl3);
        text6 = (TextView) findViewById(R.id.text6lvl3);
        text7 = (TextView) findViewById(R.id.text7lvl3);
        text8 = (TextView) findViewById(R.id.text8lvl3);
        text9 = (TextView) findViewById(R.id.text9lvl3);
        text10 = (TextView) findViewById(R.id.text10lvl3);
        text11 = (TextView) findViewById(R.id.text11lvl3);
        text12 = (TextView) findViewById(R.id.text12lvl3);
        text13 = (TextView) findViewById(R.id.text13lvl3);
        text14 = (TextView) findViewById(R.id.text14lvl3);
        text15 = (TextView) findViewById(R.id.text15lvl3);
        text16 = (TextView) findViewById(R.id.text16lvl3);
        text17 = (TextView) findViewById(R.id.text17lvl3);
        text18 = (TextView) findViewById(R.id.text18lvl3);
        text19 = (TextView) findViewById(R.id.text19lvl3);
        text20 = (TextView) findViewById(R.id.text20lvl3);
        text21 = (TextView) findViewById(R.id.text21lvl3);





        View.OnLongClickListener lvl3l1 = new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View view) {
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, myShadowBuilder, view, 0);
                return true;
            }
        };





        View.OnDragListener dragListener = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent) {
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if (view1.getId() == R.id.q1lvl3) {
                            text1.setText("Correct Answer");
                            
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);
                            
                            q1lvl3.setEnabled(false);


                            flag1 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);

                            }

                            break;

                        }
                }
                return true;
            }
        };

        View.OnDragListener dragListener2 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q1lvl3){
                            text1.setText("Wrong Answer, Correct Answer is Yellow");
                            if (points <= 5) {
                                q1lvl3.setEnabled(false);
                                Intent playActivity = new Intent();

                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {



                            points = points - 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound2, 1, 1, 0, 0, 1);
                            q1lvl3.setEnabled(false);
                            }

                            flag1 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }

                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener3 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q2lvl3 ){
                            text2.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);
                            q2lvl3.setEnabled(false);
                            flag2 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }


                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener4 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q2lvl3){
                            text2.setText("Wrong Answer, Correct Answer is Red");
                            if (points <= 5) {
                                q2lvl3.setEnabled(false);
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q2lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag2 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener5 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q3lvl3 ){
                            text3.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);
                            flag3 = 1;
                            q3lvl3.setEnabled(false);
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }

                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener6 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q3lvl3){
                            text3.setText("Wrong Answer, Correct Answer is Light Blue");
                            if (points <= 5) {
                                q3lvl3.setEnabled(false);
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q3lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag3 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener7 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q4lvl3 ){
                            text4.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);
                            flag4 = 1;
                            q4lvl3.setEnabled(false);
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }

                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener8 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q4lvl3){
                            text4.setText("Wrong Answer, Correct Answer is Light Blue");
                            if (points <= 5) {
                                q4lvl3.setEnabled(false);
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q4lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag4 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener9 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q5lvl3 ){
                            text5.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);
                            q5lvl3.setEnabled(false);

                            flag5 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }

                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener10 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q5lvl3){
                            text5.setText("Wrong Answer, Correct Answer is Yellow");
                            if (points <= 5) {
                                q5lvl3.setEnabled(false);
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q5lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }

                            flag5 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener11 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q6lvl3 ){
                            q6lvl3.setEnabled(false);
                            text6.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag6 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener12 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q6lvl3){
                            q6lvl3.setEnabled(false);
                            text6.setText("Wrong Answer, Correct Answer is Black");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q6lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag6 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener13 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q7lvl3 ){
                            q7lvl3.setEnabled(false);
                            text7.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag7 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener14 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q7lvl3){
                            q7lvl3.setEnabled(false);
                            text7.setText("Wrong Answer, Correct Answer is Sharp");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q7lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag7 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener15 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q8lvl3 ){
                            q8lvl3.setEnabled(false);
                            text8.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag8 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener16 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q8lvl3){
                            q8lvl3.setEnabled(false);
                            text8.setText("Wrong Answer, Correct Answer is Light Green");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {

                                q8lvl3.setEnabled(false);
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag8 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener17 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q9lvl3 ){
                            q9lvl3.setEnabled(false);
                            text9.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag9 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener18 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q9lvl3){
                            q9lvl3.setEnabled(false);
                            text9.setText("Wrong Answer, Correct Answer is Yellow");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag9 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener19 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q10lvl3 ){
                            q10lvl3.setEnabled(false);
                            text10.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);
                            flag10 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener20 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q10lvl3){
                            q10lvl3.setEnabled(false);
                            text10.setText("Wrong Answer, Correct Answer is Yellow");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {
                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag10 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener21 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q11lvl3 ){
                            q11lvl3.setEnabled(false);
                            text11.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag11 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener22 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q11lvl3){
                            q11lvl3.setEnabled(false);
                            text11.setText("Wrong Answer, Correct Answer is Black");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag11 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener23 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q12lvl3 ){
                            q12lvl3.setEnabled(false);
                            text12.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag12 = 1;

                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener24 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q12lvl3){
                            q12lvl3.setEnabled(false);
                            text12.setText("Wrong Answer, Correct Answer is Red");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }

                            flag12 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener25 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q13lvl3 ){
                            q13lvl3.setEnabled(false);
                            text13.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag13 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener26 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q13lvl3){
                            q13lvl3.setEnabled(false);
                            text13.setText("Wrong Answer, Correct Answer is Light Green");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag13 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener27 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q14lvl3 ){
                            q14lvl3.setEnabled(false);
                            text14.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag14 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener28 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q14lvl3){
                            q14lvl3.setEnabled(false);
                            text14.setText("Wrong Answer, Correct Answer is Red");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag14 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener29 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q15lvl3 ){
                            q15lvl3.setEnabled(false);
                            text15.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag15 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener30 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q15lvl3){
                            q15lvl3.setEnabled(false);
                            text15.setText("Wrong Answer, Correct Answer is Red");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag15 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener31 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q16lvl3 ){
                            q16lvl3.setEnabled(false);
                            text16.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag16 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };


        View.OnDragListener dragListener32 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q16lvl3){
                            q16lvl3.setEnabled(false);
                            text16.setText("Wrong Answer, Correct Answer is Light Green");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag16 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener33 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q17lvl3 ){
                            q17lvl3.setEnabled(false);
                            text17.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag17 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener34 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q17lvl3){
                            q17lvl3.setEnabled(false);
                            text17.setText("Wrong Answer, Correct Answer is Black");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);

                            }
                            flag17 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener35 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q18lvl3 ){
                            q18lvl3.setEnabled(false);
                            text18.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag18 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener36 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q18lvl3){
                            q18lvl3.setEnabled(false);
                            text18.setText("Wrong Answer, Correct Answer is Sharps");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }

                            flag18 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener37 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q19lvl3 ){
                            q19lvl3.setEnabled(false);
                            text19.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag19 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener38 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q19lvl3){
                            q19lvl3.setEnabled(false);
                            text19.setText("Wrong Answer, Correct Answer is Sharps");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }
                            flag19 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener39 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q20lvl3 ){
                            q20lvl3.setEnabled(false);
                            text20.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag20 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener40 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q20lvl3){
                            q20lvl3.setEnabled(false);
                            text20.setText("Wrong Answer, Correct Answer is Black");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                            }

                            flag20 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener41 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q21lvl3 ){
                            q21lvl3.setEnabled(false);
                            text21.setText("Correct Answer");
                            points = points + 5;
                            tv2.setText("Points: " + points);
                            soundpool.play(sound1, 1, 1, 0, 0, 1);

                            flag21 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }
                        }
                        break;

                }

                return true;
            }
        };

        View.OnDragListener dragListener42 = new View.OnDragListener(){

            @Override
            public boolean onDrag(View view, DragEvent event) {

                int dragEvent = event.getAction();

                switch(dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:

                        break;

                    case DragEvent.ACTION_DRAG_EXITED:

                        break;
                    case DragEvent.ACTION_DROP:
                        final View view1 = (View) event.getLocalState();

                        if(view1.getId()==R.id.q21lvl3){
                            q21lvl3.setEnabled(false);
                            text21.setText("Wrong Answer, Correct Answer is Sharps");
                            if (points <= 5) {
                                Intent playActivity = new Intent();


                                playActivity.setClass(lvl3.this, Lost.class);

                                playActivity.putExtra("pt", points);
                                startActivity(playActivity);
                                finish();
                            } else {


                                points = points - 5;
                                tv2.setText("Points: " + points);
                                soundpool.play(sound2, 1, 1, 0, 0, 1);
                                
                            }
                            flag21 = 1;
                            if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1 && flag7 == 1 && flag8 == 1 && flag9 == 1 && flag10 == 1 && flag11 == 1 && flag12 == 1 && flag13 == 1 && flag14 == 1 && flag15 == 1 && flag16 == 1 && flag17 == 1 && flag18 == 1 && flag19 == 1 && flag20 == 1 && flag21 == 1) {
                                btn1.setEnabled(true);
                            }

                        }
                        break;

                }

                return true;
            }
        };

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playActivity = new Intent();

                playActivity.setClass(lvl3.this, lvl4.class);

                playActivity.putExtra("points", points);
                startActivity(playActivity);
                finish();

            }
        });



        //1
        redbox1lvl3.setOnDragListener(dragListener2);
        yellowbox1lvl3.setOnDragListener(dragListener); //Correct
        armygreenbox1lvl3.setOnDragListener(dragListener2);
        darkbluebox1lvl3.setOnDragListener(dragListener2);

        //2
        redbox2lvl3.setOnDragListener(dragListener3); //correct
        yellowbox2lvl3.setOnDragListener(dragListener4);
        armygreenbox2lvl3.setOnDragListener(dragListener4);
        darkbluebox2lvl3.setOnDragListener(dragListener4);

        //3
        lightbluebox3lvl3.setOnDragListener(dragListener5); //correct
        yellowbox3lvl3.setOnDragListener(dragListener6);
        armygreenbox3lvl3.setOnDragListener(dragListener6);
        blackbox3lvl3.setOnDragListener(dragListener6);


        //4
        blackbox4lvl3.setOnDragListener(dragListener8);
        lightgreenbox4lvl3.setOnDragListener(dragListener8);
        lightbluebox4lvl3.setOnDragListener(dragListener7); //correct
        darkbluebox4lvl3.setOnDragListener(dragListener8);

        //5
        redbox5lvl3.setOnDragListener(dragListener10);
        yellowbox5lvl3.setOnDragListener(dragListener9); //correct
        armygreenbox5lvl3.setOnDragListener(dragListener10);
        blackbox5lvl3.setOnDragListener(dragListener10);

        //6
        redbox6lvl3.setOnDragListener(dragListener12);
        blackbox6lvl3.setOnDragListener(dragListener11); //c
        sharpbox6lvl3.setOnDragListener(dragListener12);
        darkbluebox6lvl3.setOnDragListener(dragListener12);

        //7
        blackbox7lvl3.setOnDragListener(dragListener14);
        armygreenbox7lvl3.setOnDragListener(dragListener14);
        sharpbox7lvl3.setOnDragListener(dragListener13); //c
        darkbluebox7lvl3.setOnDragListener(dragListener14);

        //8
        sharpbox8lvl3.setOnDragListener(dragListener16);
        lightbluebox8lvl3.setOnDragListener(dragListener16);
        lightgreenbox8lvl3.setOnDragListener(dragListener15); //c
        blackbox8lvl3.setOnDragListener(dragListener16);

        //9
        redbox9lvl3.setOnDragListener(dragListener18);
        yellowbox9lvl3.setOnDragListener(dragListener17); //c
        blackbox9lvl3.setOnDragListener(dragListener18);
        sharpbox9lvl3.setOnDragListener(dragListener18);

        //10
        blackbox10lvl3.setOnDragListener(dragListener20);
        armygreenbox10lvl3.setOnDragListener(dragListener20);
        yellowbox10lvl3.setOnDragListener(dragListener19); //c
        redbox10lvl3.setOnDragListener(dragListener20);

        //11
        redbox11lvl3.setOnDragListener(dragListener22);
        blackbox11lvl3.setOnDragListener(dragListener21); //c
        sharpbox11lvl3.setOnDragListener(dragListener22);
        darkbluebox11lvl3.setOnDragListener(dragListener22);

        //12
        redbox12lvl3.setOnDragListener(dragListener23);//c
        yellowbox12lvl3.setOnDragListener(dragListener24);
        armygreenbox12lvl3.setOnDragListener(dragListener24);
        darkbluebox12lvl3.setOnDragListener(dragListener24);

        //13
        redbox13lvl3.setOnDragListener(dragListener26);
        lightgreenbox13lvl3.setOnDragListener(dragListener25); //c
        armygreenbox13lvl3.setOnDragListener(dragListener26);
        darkbluebox13lvl3.setOnDragListener(dragListener26);

        //14
        blackbox14lvl3.setOnDragListener(dragListener28);
        sharpbox14lvl3.setOnDragListener(dragListener28);
        redbox14lvl3.setOnDragListener(dragListener27); //c
        armygreenbox14lvl3.setOnDragListener(dragListener28);

        //15
        sharpbox15lvl3.setOnDragListener(dragListener30);
        armygreenbox15lvl3.setOnDragListener(dragListener30);
        redbox15lvl3.setOnDragListener(dragListener29); //c
        yellowbox15lvl3.setOnDragListener(dragListener30);

        //16
        redbox16lvl3.setOnDragListener(dragListener32);
        blackbox16lvl3.setOnDragListener(dragListener32);
        sharpbox16lvl3.setOnDragListener(dragListener32);
        lightgreenbox16lvl3.setOnDragListener(dragListener31); //c

        //17
        sharpbox17lvl3.setOnDragListener(dragListener34);
        redbox17lvl3.setOnDragListener(dragListener34);
        blackbox17lvl3.setOnDragListener(dragListener33); //c
        darkbluebox17lvl3.setOnDragListener(dragListener34);

        //18
        armygreenbox18lvl3.setOnDragListener(dragListener36);
        blackbox18lvl3.setOnDragListener(dragListener36);
        lightbluebox18lvl3.setOnDragListener(dragListener36);
        sharpbox18lvl3.setOnDragListener(dragListener35); //c

        //19
        lightgreenbox19lvl3.setOnDragListener(dragListener38);
        blackbox19lvl3.setOnDragListener(dragListener38);
        redbox19lvl3.setOnDragListener(dragListener38);
        sharpbox19lvl3.setOnDragListener(dragListener37); //c

        //20
        redbox20lvl3.setOnDragListener(dragListener40);
        lightgreenbox20lvl3.setOnDragListener(dragListener40);
        blackbox20lvl3.setOnDragListener(dragListener39);//c
        sharpbox20lvl3.setOnDragListener(dragListener40);

        //21
        sharpbox21lvl3.setOnDragListener(dragListener41);
        lightbluebox21lvl3.setOnDragListener(dragListener42);
        yellowbox21lvl3.setOnDragListener(dragListener42);//c
        redbox21lvl3.setOnDragListener(dragListener42);

        q1lvl3.setOnLongClickListener(lvl3l1);
        q2lvl3.setOnLongClickListener(lvl3l1);
        q3lvl3.setOnLongClickListener(lvl3l1);
        q4lvl3.setOnLongClickListener(lvl3l1);
        q5lvl3.setOnLongClickListener(lvl3l1);
        q6lvl3.setOnLongClickListener(lvl3l1);
        q7lvl3.setOnLongClickListener(lvl3l1);
        q8lvl3.setOnLongClickListener(lvl3l1);
        q9lvl3.setOnLongClickListener(lvl3l1);
        q10lvl3.setOnLongClickListener(lvl3l1);
        q11lvl3.setOnLongClickListener(lvl3l1);
        q12lvl3.setOnLongClickListener(lvl3l1);
        q13lvl3.setOnLongClickListener(lvl3l1);
        q14lvl3.setOnLongClickListener(lvl3l1);
        q15lvl3.setOnLongClickListener(lvl3l1);
        q16lvl3.setOnLongClickListener(lvl3l1);
        q17lvl3.setOnLongClickListener(lvl3l1);
        q18lvl3.setOnLongClickListener(lvl3l1);
        q19lvl3.setOnLongClickListener(lvl3l1);
        q20lvl3.setOnLongClickListener(lvl3l1);
        q21lvl3.setOnLongClickListener(lvl3l1);


    }

}
