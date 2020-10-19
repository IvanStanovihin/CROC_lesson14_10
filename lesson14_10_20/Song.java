package lesson14_10_20;

/**
 * Класс песен.
 * */
public class Song {

    /**
     * Название музыкальной композиции.
     * */
    private String nameSong;
    /**
     * Имя исполнителя.
     * */
    private String nameSinger;


    /**
     * Конструктор класса. В качестве параметров передаётся название песни и имя исполнителя.
     * */
    public Song(String nameSing, String nameSinger){
        this.nameSong = nameSing;
        this.nameSinger = nameSinger;
    }

    /**
     * Возвращает название песни.
     * */
    public String getNameSong(){
        return nameSong;
    }

    /**
     * Возвращает имя исполнителя.
     * */
    public String getNameSinger(){
        return nameSinger;
    }


}
