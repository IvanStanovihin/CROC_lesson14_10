package lesson14_10_20.StorageForMusic;

import lesson14_10_20.Song;
import java.util.List;

/**
 * Абстрактный класс музыкальных носителей. Является предком для всех классов музыкальных нсителей.
 * */
public abstract class MusicStorage {

    /**
     * Название музыкального носителя
     * */
    private String nameStorage;
    /**
     * Список песен, которые записаны на музыкальный носитель.
     * */
    private List<Song> availableSongs ;

    /**
     * Возвращает название музыкального носителя.
     * */
    public String getName(){
        return nameStorage;
    }

    /**
     * Конструктор класса. В качестве параметров передаётся название музыкального носителя и список песен, записанных на него.
     * */
    public MusicStorage(String nameStorage, List<Song> availableSongs){
        this.nameStorage = nameStorage;
        this.availableSongs = availableSongs;
    }

    /**
     * Метод проверяет содержится ли песня, которая передаётся в качестве параметра в метод, на музыкальном носителе,
     * у которого вызывается метод. Если песня записана на носитель метод возвращает true, иначе false.
     * */
    public boolean searchSongOnStorage(Song song){
        boolean result = false;
        for (Song oneSong: availableSongs){
            if (identicalSong(oneSong, song)){
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     * Метод сравнивает две песни, передаваемые в него в качестве параметров. Если песни идентичны, метод возвращает
     * true, иначе false.
     * */
    private static boolean identicalSong(Song song1, Song song2){
        boolean result = false;
        if (song1.getNameSinger() == song2.getNameSinger() && song1.getNameSong() == song2.getNameSong()){
            result = true;
        }
        return result;
    }
}
