package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.musicapp.R.id.now_Playing;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //here finding the view that shows now playing activity
        Button now_playing_activity = (Button) findViewById(now_Playing);
//setting  click listener
        now_playing_activity.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playing_Intent = new Intent(MainActivity.this, Now_Playing.class);
                startActivity(playing_Intent);
            }
        });
        //here finding playlist activity
        Button playlist_activity = (Button) findViewById(R.id.Playlist);
        //setting click listener for playlist button
        playlist_activity.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the now playing button is clicked on.
            @Override
            public void onClick(View view){
                Intent playlist_activity = new Intent(MainActivity.this, Playlist.class);
                        startActivity(playlist_activity);
            }
        });
        //here finding artist album activity
        Button artist_album_activity = (Button) findViewById(R.id.ArtistsAndAlbums);
        //setting click listener
        artist_album_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artAndAlbum_Intent = new Intent(MainActivity.this, Artist_Albums.class);
                startActivity(artAndAlbum_Intent);
            }
        });
        //finding search activity
        Button search_activity = (Button) findViewById(R.id.search);
        //setting click listener
        search_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search_Intent = new Intent(MainActivity.this, Search.class);
                startActivity(search_Intent);
            }
        });
        //finding play online activity
        Button playOnline_Activity = (Button) findViewById(R.id.PLAY_ONLINE);
        //setting click listener
        playOnline_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Play_Online_Intent = new Intent(MainActivity.this, Play_Online.class);
                startActivity(Play_Online_Intent);
            }
        });
    }
}
