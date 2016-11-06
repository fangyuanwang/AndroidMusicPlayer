package com.wangf.musicon;

/**
 * Created by wangf on 11/5/2016.
 */

public class Song {
    private long id;
    private String title;
    private String artist;
    private String album;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
//        album = songAlbum;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
//    public String getAlbum(){return album;}
}
