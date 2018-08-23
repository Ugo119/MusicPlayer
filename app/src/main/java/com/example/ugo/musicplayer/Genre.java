package com.example.ugo.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Genre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);
        ArrayList<MusicTemp> genre = new ArrayList<MusicTemp>();
        genre.add(new MusicTemp("60's Hits", "Classic", R.drawable.album_one));
        genre.add(new MusicTemp("70's Hits", "Classic", R.drawable.album_one));
        genre.add(new MusicTemp("80's Hits", "Classic", R.drawable.album_one));
        genre.add(new MusicTemp("90's Hits", "Classic", R.drawable.album_one));
        genre.add(new MusicTemp("Afro Pop", "African", R.drawable.album_two));
        genre.add(new MusicTemp("Blues", "Sentimental", R.drawable.alum_three));
        genre.add(new MusicTemp("Country", "Relax", R.drawable.album_six));
        genre.add(new MusicTemp("Soul", "Sentimental", R.drawable.alum_three));
        genre.add(new MusicTemp("HipHop", "Hardcore", R.drawable.album_seven));
        genre.add(new MusicTemp("Rock", "Hardcore", R.drawable.album_seven));

// Create the adapter to convert the array to views
        MusicAdapter adapter = new MusicAdapter(this, genre);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
