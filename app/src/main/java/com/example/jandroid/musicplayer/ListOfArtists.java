package com.example.jandroid.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListOfArtists extends AppCompatActivity {
    private ImageButton jColeIB;
    private ImageButton dGuettaIB;
    private Button goToHomeListOfArtists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_artists);
        jColeIB=(ImageButton) findViewById(R.id.imageButtonJC);
        jColeIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJCole();
            }
        });
        dGuettaIB=(ImageButton) findViewById(R.id.imageButtonDG);
        dGuettaIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDGuetta();
            }
        });
        goToHomeListOfArtists=(Button) findViewById(R.id.backToHomeListOfArtsits);
        goToHomeListOfArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });

    }
    public void openJCole(){
        Intent intentLinear=new Intent(this,JCole.class);
        startActivity(intentLinear);
    }
    public void openDGuetta(){
        Intent intentLinear=new Intent(this,DGuetta.class);
        startActivity(intentLinear);
    }
    public void goToHome(){
        Intent intentLinear=new Intent(this,MainActivity.class);
        startActivity(intentLinear);
    }
}