package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Artist_Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist__albums);
        Button back = (Button) findViewById(R.id.backToLibrary);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToLibrary_intent = new Intent(Artist_Albums.this, MainActivity.class); // intent to main activity
                startActivity(backToLibrary_intent);
            }
        });
    }
}
