package com.example.jandroid.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JCole extends AppCompatActivity {
    private Button goToArtistsJC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jcole);
        goToArtistsJC=(Button) findViewById(R.id.goToArtistsJC);
        goToArtistsJC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToArtists();
            }
        });
    }
    public void goToArtists(){
        Intent intentLinear=new Intent(this,ListOfArtists.class);
        startActivity(intentLinear);
    }
}