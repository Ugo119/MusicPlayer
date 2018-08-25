package com.example.ugo.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //Create an arraylist of albums
        final ArrayList<MusicTemp> albums = new ArrayList<MusicTemp>();
        albums.add(new MusicTemp("Ghetto University", "RunTown", R.drawable.runtown_album));
        albums.add(new MusicTemp("On a Spaceship", "Burna Boy", R.drawable.burna_album));
        albums.add(new MusicTemp("The play maker", "Phyno", R.drawable.phyno_album));
        albums.add(new MusicTemp("Stories that touch", "Falz", R.drawable.falz_album));
        albums.add(new MusicTemp("Gbagyi child", "Bez", R.drawable.bez_album));
        albums.add(new MusicTemp("Wanted", "Wande Coal", R.drawable.wande_album));
        albums.add(new MusicTemp("Aye", "Davido", R.drawable.davido_album));
        albums.add(new MusicTemp("El-hadj", "Reminisce", R.drawable.reminisce_album));
        albums.add(new MusicTemp("King kong", "Vector", R.drawable.vector_album));
        albums.add(new MusicTemp("This is me", "Niniola", R.drawable.niniola_album));
        albums.add(new MusicTemp("Black magic", "Yemi Alade", R.drawable.yemi_album));
        albums.add(new MusicTemp("Ayo", "Wizkid", R.drawable.wiz_album));

        // Create the adapter to convert the array to views
        MusicAdapter adapter = new MusicAdapter(this, albums);

        //Create an object of the ListView
        final ListView listView = (ListView) findViewById(R.id.list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        //Setup an event listener for the ListView items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MusicTemp word = albums.get(position);
                Intent i = new Intent(Albums.this, PlayAll.class);
                startActivity(i);
            }
        });
    }
}
