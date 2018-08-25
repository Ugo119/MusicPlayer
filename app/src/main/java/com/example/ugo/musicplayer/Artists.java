package com.example.ugo.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //Create an arraylist of artists
        final ArrayList<MusicTemp> artists = new ArrayList<MusicTemp>();
        artists.add(new MusicTemp("RunTown", "5 songs", R.drawable.runtown_album));
        artists.add(new MusicTemp("Burna Boy", "8 songs", R.drawable.burna_album));
        artists.add(new MusicTemp("Phyno", "10 songs", R.drawable.phyno_album));
        artists.add(new MusicTemp("Falz", "9 songs", R.drawable.falz_album));
        artists.add(new MusicTemp("Bez", "2 songs", R.drawable.bez_album));
        artists.add(new MusicTemp("Wande Coal", "3 songs", R.drawable.wande_album));
        artists.add(new MusicTemp("Davido", "15 songs", R.drawable.davido_album));
        artists.add(new MusicTemp("Reminisce", "7 songs", R.drawable.reminisce_album));
        artists.add(new MusicTemp("Vector", "4 songs", R.drawable.vector_album));
        artists.add(new MusicTemp("Niniola", "8 songs", R.drawable.niniola_album));
        artists.add(new MusicTemp("Yemi Alade", "6 songs", R.drawable.yemi_album));
        artists.add(new MusicTemp("Wizkid", "3 songs", R.drawable.wiz_album));

        // Create the adapter to convert the array to views
        MusicAdapter adapter = new MusicAdapter(this, artists);

        //Create an object of the ListView
        final ListView listView = (ListView) findViewById(R.id.list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        //Setup an event listener for the ListView items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //listView.getItemAtPosition(0);
                MusicTemp word = artists.get(position);
                Intent i = new Intent(Artists.this, PlayAll.class);
                startActivity(i);
            }
        });
    }
}
