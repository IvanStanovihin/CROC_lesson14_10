package lesson14_10_20.StorageForMusic;

import lesson14_10_20.Song;

import java.util.Arrays;

/**
 * Класс флешек. Наследник абстрактного класса MusicalStorage(музыкальные носители).
 * */
public class FleshDrive extends MusicStorage{

    /**
     * Песня, записанная на Флешку.
     */
    private static Song song1 = new Song("\"What a wonderful world\"", "Louis Armstrong");
    /**
     * Песня, записанная на Флешку.
     */
    private static Song song2 = new Song("\"Зверь\"", "Вячеслав Бутусов");
    /**
     * Песня, записанная на Флешку.
     */
    private static Song song3 = new Song("\"Shape of you\"", "Ed Sheeran");

    /**
     * Конструктор класса. Внутри вызывается конструктор класса предка(MusicStorage), в который в качестве параметров
     * передаётся название музыкального носителя и список песен записанных на него.
     * */
    public FleshDrive() {
        super("Флешка", Arrays.asList(song1, song2, song3));
    }
}
