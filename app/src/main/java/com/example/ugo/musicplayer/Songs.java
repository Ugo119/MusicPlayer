package com.example.ugo.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        ArrayList<MusicTemp> songs = new ArrayList<MusicTemp>();
        songs.add(new MusicTemp("Father Father", "Phyno", R.drawable.phyno_album));
        songs.add(new MusicTemp("Wanted", "Wande Coal", R.drawable.wande_album));
        songs.add(new MusicTemp("Ye", "Burna Boy", R.drawable.burna_album));
        songs.add(new MusicTemp("This is me", "Niniola", R.drawable.niniola_album));
        songs.add(new MusicTemp("Something light", "Falz", R.drawable.falz_album));
        songs.add(new MusicTemp("Gbagyi child", "Bez", R.drawable.bez_album));
        songs.add(new MusicTemp("Don't mind", "Davido", R.drawable.davido_album));
        songs.add(new MusicTemp("Fia", "Davido", R.drawable.davido_album));
        songs.add(new MusicTemp("Energy", "RunTown", R.drawable.runtown_album));
        songs.add(new MusicTemp("Assurance", "Davido", R.drawable.davido_album));
        songs.add(new MusicTemp("King kong", "Vector", R.drawable.vector_album));
        songs.add(new MusicTemp("Soldier", "Simi", R.drawable.album_eight));

// Create the adapter to convert the array to views
        MusicAdapter adapter = new MusicAdapter(this, songs);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
