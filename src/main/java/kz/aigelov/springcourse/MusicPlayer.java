package kz.aigelov.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bauyrzhan Aigelov on 17.06.2019.
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public MusicPlayer(){}

    public void setMusic(List<Music> musicList){
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println("Playing " + musicList.getSong());
    }
}
