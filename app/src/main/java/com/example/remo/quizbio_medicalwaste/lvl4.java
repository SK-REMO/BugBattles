package com.example.remo.quizbio_medicalwaste;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class lvl4 extends AppCompatActivity{

    TextView tv2;
    public int points=0;
    TextView text4_1, text4_2, text4_3, text4_4, text4_5, text4_6, text4_7, text4_8, text4_9, text4_10, point;

    Button btn1;

    RadioGroup radgrp1, radgrp2, radgrp3, radgrp4, radgrp5, radgrp6, radgrp7, radgrp8, radgrp9, radgrp10;
    int flag1=0, flag2=0, flag3=0, flag4=0, flag5=0, flag6=0, flag7=0, flag8=0, flag9=0, flag10=0;
    private boolean isChecking = true;
    private int mCheckedId = R.id.q1a;
    int i=0;
    Integer[] str = new Integer[40];

    TextView viewbtn;
    private SoundPool soundpool;
    private int sound1, sound2, sound3, sound4, sound5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl4);


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

        tv2 = findViewById(R.id.pointlvl4);

        btn1 = findViewById(R.id.nextbtn4);
        btn1.setEnabled(false);

        viewbtn = findViewById(R.id.answer4);
        int pt= getIntent().getIntExtra("points", 0);

        points=pt;

        tv2.setText("Your Score: "+pt);


        text4_1 = (TextView) findViewById(R.id.text4_1);
        text4_2 = (TextView) findViewById(R.id.text4_2);
        text4_3 = (TextView) findViewById(R.id.text4_3);
        text4_4 = (TextView) findViewById(R.id.text4_4);
        text4_5 = (TextView) findViewById(R.id.text4_5);
        text4_6 = (TextView) findViewById(R.id.text4_6);
        text4_7 = (TextView) findViewById(R.id.text4_7);
        text4_8 = (TextView) findViewById(R.id.text4_8);
        text4_9 = (TextView) findViewById(R.id.text4_9);
        text4_10 = (TextView) findViewById(R.id.text4_10);


        radgrp1 = (RadioGroup)findViewById(R.id.radgrp1);
        radgrp2 = (RadioGroup)findViewById(R.id.radgrp2);
        radgrp3 = (RadioGroup)findViewById(R.id.radgrp3);
        radgrp4 = (RadioGroup)findViewById(R.id.radgrp4);
        radgrp5 = (RadioGroup)findViewById(R.id.radgrp5);
        radgrp6 = (RadioGroup)findViewById(R.id.radgrp6);
        radgrp7 = (RadioGroup)findViewById(R.id.radgrp7);
        radgrp8 = (RadioGroup)findViewById(R.id.radgrp8);
        radgrp9 = (RadioGroup)findViewById(R.id.radgrp9);
        radgrp10 = (RadioGroup)findViewById(R.id.radgrp10);


        for(i=0; i<40; i++){
            str[i]=0;
        }


        radgrp1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;
                }
                isChecking = true;
                if (mCheckedId == R.id.q1a) {
                    str[0]=1;
                }
                else if (mCheckedId == R.id.q1b) {
                    str[1]=1;
                }
                else if (mCheckedId == R.id.q1c) {
                    str[2]=1;
                }
                else if (mCheckedId == R.id.q1d) {
                    str[3]=1;
                }
            }
        });

        radgrp2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q2a) {
                    str[4]=1;
                }
                else if (mCheckedId == R.id.q2b) {
                    str[5]=1;
                }
                else if (mCheckedId == R.id.q2c) {
                    str[6]=1;
                }
                else if (mCheckedId == R.id.q2d) {
                    str[7]=1;
                }
            }
        });

        radgrp3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q3a) {
                    str[8]=1;
                }
                else if (mCheckedId == R.id.q3b) {
                    str[9]=1;
                }
                else if (mCheckedId == R.id.q3c) {
                    str[10]=1;
                }
                else if (mCheckedId == R.id.q3d) {
                    str[11]=1;
                }
            }
        });

        radgrp4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q4a) {
                    str[12]=1;
                }
                else if (mCheckedId == R.id.q4b) {
                    str[13]=1;
                }
                else if (mCheckedId == R.id.q4c) {
                    str[14]=1;
                }
                else if (mCheckedId == R.id.q4d) {
                    str[15]=1;
                }
            }
        });

        radgrp5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q5a) {
                    str[16]=1;
                }
                else if (mCheckedId == R.id.q5b) {
                    str[17]=1;
                }
                else if (mCheckedId == R.id.q5c) {
                    str[18]=1;
                }
                else if (mCheckedId == R.id.q5d) {
                    str[19]=1;
                }
            }
        });

        radgrp6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q6a) {
                    str[20]=1;
                }
                else if (mCheckedId == R.id.q6b) {
                    str[21]=1;
                }
                else if (mCheckedId == R.id.q6c) {
                    str[22]=1;
                }
                else if (mCheckedId == R.id.q6d) {
                    str[23]=1;
                }
            }
        });

        radgrp7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q7a) {
                    str[24]=1;
                }
                else if (mCheckedId == R.id.q7b) {
                    str[25]=1;
                }
                else if (mCheckedId == R.id.q7c) {
                    str[26]=1;
                }
                else if (mCheckedId == R.id.q7d) {
                    str[27]=1;
                }
            }
        });

        radgrp8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q8a) {
                    str[28]=1;
                }
                else if (mCheckedId == R.id.q8b) {
                    str[29]=1;
                }
                else if (mCheckedId == R.id.q8c) {
                    str[30]=1;
                }
                else if (mCheckedId == R.id.q8d) {
                    str[31]=1;
                }
            }
        });

        radgrp9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q9a) {
                    str[32]=1;
                }
                else if (mCheckedId == R.id.q9b) {
                    str[33]=1;
                }
                else if (mCheckedId == R.id.q9c) {
                    str[34]=1;
                }
                else if (mCheckedId == R.id.q9d) {
                    str[35]=1;
                }
            }
        });

        radgrp10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mCheckedId = checkedId;

                }
                isChecking = true;
                if (mCheckedId == R.id.q10a) {
                    str[36]=1;
                }
                else if (mCheckedId == R.id.q10b) {
                    str[37]=1;
                }
                else if (mCheckedId == R.id.q10c) {
                    str[38]=1;
                }
                else if (mCheckedId == R.id.q10d) {
                    str[39]=1;
                }
            }
        });

    }



    public void showType(View view) {

        for(int i=0;i<11;i++){
               if(points<=5){
                    point.setText("Points: 0");
                    points=0;
                    Intent playActivity = new Intent(this, Lost.class);
                    playActivity.putExtra("pt", points);
                    this.startActivity(playActivity);
                    finish();
                    break;
               }
            else {
                   if (str[3] == 1) {
                       text4_1.setText("Correct Answer");
                       str[3] = 0;
                       points = points + 5;

                   } else if (str[1] == 1 || str[2] == 1 || str[0] == 1) {
                       text4_1.setText("Wrong Answer, Correct Answer is D.");
                       points = points - 5;
                       str[1] = 0;
                       str[2] = 0;
                       str[0] = 0;

                   }

                   if (str[4] == 1) {
                       text4_2.setText("Correct Answer");
                       str[4] = 0;
                       points = points + 5;
                   } else if (str[5] == 1 || str[6] == 1 || str[7] == 1) {
                       text4_2.setText("Wrong Answer, Correct Answer is A.");
                       points = points - 5;
                       str[5] = 0;
                       str[6] = 0;
                       str[7] = 0;
                   }

                   if (str[10] == 1) {
                       text4_3.setText("Correct Answer");
                       str[10] = 0;
                       points = points + 5;
                   } else if (str[8] == 1 || str[9] == 1 || str[11] == 1) {
                       text4_3.setText("Wrong Answer, Correct Answer is C.");
                       points = points - 5;
                       str[8] = 0;
                       str[9] = 0;
                       str[11] = 0;
                   }
                   if (str[15] == 1) {
                       text4_4.setText("Correct Answer");
                       str[15] = 0;
                       points = points + 5;
                   } else if (str[12] == 1 || str[13] == 1 || str[14] == 1) {
                       text4_4.setText("Wrong Answer, Correct Answer is D.");
                       points = points - 5;
                       str[12] = 0;
                       str[13] = 0;
                       str[14] = 0;
                   }

                   if (str[16] == 1) {
                       text4_5.setText("Correct Answer");
                       str[16] = 0;
                       points = points + 5;
                   } else if (str[17] == 1 || str[18] == 1 || str[19] == 1) {
                       text4_5.setText("Wrong Answer, Correct Answer is A.");
                       points = points - 5;
                       str[17] = 0;
                       str[18] = 0;
                       str[19] = 0;
                   }

                   if (str[22] == 1) {
                       text4_6.setText("Correct Answer");
                       str[22] = 0;
                       points = points + 5;
                   } else if (str[20] == 1 || str[21] == 1 || str[23] == 1) {
                       text4_6.setText("Wrong Answer, Correct Answer is C.");
                       points = points - 5;
                       str[20] = 0;
                       str[21] = 0;
                       str[23] = 0;
                   }

                   if (str[25] == 1) {
                       text4_7.setText("Correct Answer");
                       str[25] = 0;
                       points = points + 5;
                   } else if (str[24] == 1 || str[26] == 1 || str[27] == 1) {
                       text4_7.setText("Wrong Answer, Correct Answer is B.");
                       points = points - 5;
                       str[24] = 0;
                       str[26] = 0;
                       str[27] = 0;
                   }
                   if (str[28] == 1) {
                       text4_8.setText("Correct Answer");
                       str[28] = 0;
                       points = points + 5;
                   } else if (str[29] == 1 || str[30] == 1 || str[31] == 1) {
                       text4_8.setText("Wrong Answer, Correct Answer is A.");
                       points = points - 5;
                       str[29] = 0;
                       str[30] = 0;
                       str[31] = 0;
                   }

                   if (str[32] == 1) {
                       text4_9.setText("Correct Answer");
                       str[32] = 0;
                       points = points + 5;
                   } else if (str[33] == 1 || str[34] == 1 || str[35] == 1) {
                       text4_9.setText("Wrong Answer, Correct Answer is A.");
                       str[33] = 0;
                       str[34] = 0;
                       str[35] = 0;
                       points = points - 5;
                   }

                   if (str[39] == 1) {
                       text4_10.setText("Correct Answer");
                       str[39] = 0;
                       points = points + 5;
                   } else if (str[36] == 1 || str[37] == 1 || str[38] == 1) {
                       text4_10.setText("Wrong Answer, Correct Answer is D.");
                       points = points - 5;
                       str[36] = 0;
                       str[37] = 0;
                       str[38] = 0;
                   }
                   tv2.setText("Your Score: " + points);
                   soundpool.play(sound5, 1, 1, 0, 2, 1);
                   btn1.setEnabled(true);
                   viewbtn.setEnabled(false);

               }
        }



    }
    public void btnfunc(View view) {

        btn1 = findViewById(R.id.nextbtn4);
        if (view.getId() == R.id.nextbtn4) {
            Intent lvl4Activity = new Intent(lvl4.this, lvl5.class);
            lvl4Activity.putExtra("points", points);
            this.startActivity(lvl4Activity);
            finish();
        }

    }


}
