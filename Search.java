package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //finding search online activity
        Button searchOnline_Activity = (Button) findViewById(R.id.search);
        //setting click  listener
        searchOnline_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SearchOnline = new Intent(Search.this, Search_Online.class);
                startActivity(SearchOnline);
            }
        });
        Button back = (Button) findViewById(R.id.backToLibrary);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToLibrary_intent = new Intent(Search.this, MainActivity.class);// intent to main activity
                startActivity(backToLibrary_intent);
            }
        });

    }
}
