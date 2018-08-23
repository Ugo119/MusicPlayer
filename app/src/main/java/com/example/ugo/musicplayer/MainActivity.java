package com.example.ugo.musicplayer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView songz, albumz, artistz, genrez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songz = (TextView) findViewById(R.id.song);
        albumz = (TextView) findViewById(R.id.album);
        artistz = (TextView) findViewById(R.id.artist);
        genrez = (TextView) findViewById(R.id.genre);
        songz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Songs.class);
                startActivity(i);
            }
        });
        albumz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Albums.class);
                startActivity(i);
            }
        });
        artistz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Artists.class);
                startActivity(i);
            }
        });
        genrez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Genre.class);
                startActivity(i);
            }
        });
    }
}
