package com.company;

import com.company.Models.File;
import com.company.Models.Music;
import com.company.Models.StreamProgressInfo;

public class Main1 {

    public static void main(String[] args) {
	// write your code here
        File file = new File("Test", 24, 12);
        Music music = new Music("Barakatak", "Musiknya Asik", 1000, 100);

        StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);

        System.out.println(streamFileInfo.calculateCurrentPercent());
        System.out.println(streamMusicInfo.calculateCurrentPercent());
    }
}
