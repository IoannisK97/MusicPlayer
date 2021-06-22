package com.example.jandroid.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button nowPlaying;
    private Button listOfArtists;
    private Button buy;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nowPlaying = (Button) findViewById(R.id.buttonNowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNowPlaying();
            }
        });
        listOfArtists = (Button) findViewById(R.id.buttonListOfArtists);
        listOfArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListOfArtists();
            }
        });
        search = (Button) findViewById(R.id.buttonSearch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
        buy = (Button) findViewById(R.id.buttonBuy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuy();
            }
        });

    }
        public void openNowPlaying(){
            Intent intentLinear=new Intent(this,NowPlaying.class);
            startActivity(intentLinear);
        }
        public void openSearch(){
            Intent intentLinear=new Intent(this,Search.class);
            startActivity(intentLinear);
        }
        public void openListOfArtists(){
            Intent intentLinear=new Intent(this,ListOfArtists.class);
            startActivity(intentLinear);
        }
        public void openBuy(){
            Intent intentLinear=new Intent(this,BuyNewActivity.class);
            startActivity(intentLinear);
        }





}