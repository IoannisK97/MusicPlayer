package com.example.jandroid.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {
    private Button goToHomeSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        goToHomeSearch=(Button) findViewById(R.id.goToHomeSearch);
        goToHomeSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });
    }
    public void goToHome(){
        Intent intentLinear=new Intent(this,MainActivity.class);
        startActivity(intentLinear);
    }
}