package com.example.remo.quizbio_medicalwaste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    GridLayout introGrid;
    GridLayout play;
    LinearLayout intro, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        intro = findViewById(R.id.intro);
        info = findViewById(R.id.info);
        introGrid = (GridLayout)findViewById(R.id.introGrid);
        play = (GridLayout)findViewById(R.id.play);

        setSingleEvent(introGrid);
        setSingleEvent(play);
    }

    public void intro(View view){
        if (view.getId() == R.id.intro) {
            Intent lvl4Activity = new Intent(Home.this, intro.class);
            this.startActivity(lvl4Activity);
            finish();
        }
    }

    /*public void info(View view){
        if (view.getId() == R.id.info) {
            Intent lvl4Activity = new Intent(Home.this, Info.class);
            this.startActivity(lvl4Activity);
            finish();
        }
    }*/

    private void setSingleEvent(GridLayout introGrid) {

       for(int i=0;i<introGrid.getChildCount();i++){
            CardView cardView = (CardView)introGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent lvl4Activity = new Intent(Home.this, Info.class);
                    startActivity(lvl4Activity);
                    finish();

                }
            });
        }

        for(int j=0;j<play.getChildCount();j++){
            CardView cardv = (CardView)play.getChildAt(j);
            cardv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View vie) {
                  //startActivity(new Intent(Home.this, Play.class))
                    Intent playActivity = new Intent(Home.this,lvl1.class);
                    startActivity(playActivity);
                    finish();

                }
            });
        }
    }


}
