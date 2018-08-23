package com.example.ugo.musicplayer;

public class MusicTemp {
    public String heading;
    public String description;
    public int imageResource;

    public MusicTemp(String heading, String description, int imageResource) {
        this.heading = heading;
        this.description = description;
        this.imageResource = imageResource;
    }
    public String getHeadText(){return heading;}
    public String getDescText(){return description;}
    public int getImage(){return imageResource;}

}
