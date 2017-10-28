package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Play_Online extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play__online);

        Button payment = (Button) findViewById(R.id.buy_songs);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payment_songs_intent = new Intent(Play_Online.this, Buy_Songs.class);
                startActivity(payment_songs_intent);
            }
        });
        Button back = (Button) findViewById(R.id.backToLibrary);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToLibrary_intent = new Intent(Play_Online.this, MainActivity.class);// intent to main activity
                startActivity(backToLibrary_intent);
            }
        });
    }
}
