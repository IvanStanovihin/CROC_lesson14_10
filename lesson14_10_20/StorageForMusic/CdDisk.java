package lesson14_10_20.StorageForMusic;

import lesson14_10_20.Song;
import java.util.Arrays;

/**
 *Класс CD - дисков. Наследник класса Музыкальных носителей(MusicStorage).
 */
public class CdDisk extends MusicStorage {

    /**
     * Песня, записанная на CD - диск.
     */
    private static Song song1 = new Song("\"What a wonderful world\"", "Louis Armstrong");
    /**
     * Песня, записанная на CD - диск.
     */
    private static Song song2 = new Song("\"Зверь\"", "Вячеслав Бутусов");

    /**
     * Конструктор класса. Внутри вызывается конструктор класса предка(MusicStorage), в который в качестве параметров
     * передаётся название музыкального носителя и список песен записанных на него.
     * */
    public CdDisk() {
        super("CD - диск", Arrays.asList(song1, song2));
    }
}
