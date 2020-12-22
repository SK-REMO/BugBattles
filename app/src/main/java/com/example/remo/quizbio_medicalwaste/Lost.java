package com.example.remo.quizbio_medicalwaste;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Lost extends AppCompatActivity {

    TextView tv1;

    private SoundPool soundpool;
    private int sound1, sound2, sound3, sound4, sound5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);


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


        tv1 = (TextView)findViewById(R.id.pttxt);

        int pt= getIntent().getIntExtra("points", 0);
        tv1.setText("Your Score: "+String.valueOf(pt));
        int i=10;
        if(i==10){
            soundpool.play(sound3, 1, 1, 0, 2, 1);
        }


    }
}
