package lesson14_10_20.StorageForMusic;

import lesson14_10_20.Song;

import java.util.Arrays;

public class VinylRecord extends MusicStorage{

    /**
     * Песня, записанная на Виниловую пластинку.
     */
    private static Song song1 = new Song("\"What a wonderful world\"", "Louis Armstrong");

    /**
     * Конструктор класса. Внутри вызывается конструктор класса предка(MusicStorage), в который в качестве параметров
     * передаётся название музыкального носителя и список песен записанных на него.
     * */
    public VinylRecord() {
        super("Виниловая пластинка", Arrays.asList(song1));
    }
}
