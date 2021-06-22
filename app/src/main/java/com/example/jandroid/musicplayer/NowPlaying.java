package com.example.jandroid.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying  extends AppCompatActivity{
       private Button backToHomeNowPlaying;


@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        backToHomeNowPlaying=(Button) findViewById(R.id.buttonBackNowPlaying);
        backToHomeNowPlaying.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        methodBackToHome();
                }
        });

        }
        public void methodBackToHome(){
                Intent intentLinear=new Intent(this,MainActivity.class);
                startActivity(intentLinear);
        }

        }