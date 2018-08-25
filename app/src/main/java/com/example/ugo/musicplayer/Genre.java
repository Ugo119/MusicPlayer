package com.example.ugo.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Genre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        //Create an arraylist of genre
        final ArrayList<MusicTemp> genre = new ArrayList<MusicTemp>();
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

        //Create an object of ListView
        final ListView listView = (ListView) findViewById(R.id.list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        //Setup an event listener for the ListView items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MusicTemp word = genre.get(position);
                Intent i = new Intent(Genre.this, PlayAll.class);
                startActivity(i);
            }
        });
    }
}
