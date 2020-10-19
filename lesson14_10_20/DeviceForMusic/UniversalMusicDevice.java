package lesson14_10_20.DeviceForMusic;

import lesson14_10_20.StorageForMusic.CdDisk;
import lesson14_10_20.StorageForMusic.FleshDrive;
import lesson14_10_20.StorageForMusic.VinylRecord;
import java.util.Arrays;

/**
 * Класс универсальных музыкальных центров. Наследник класса
 * */
public class UniversalMusicDevice extends MusicDevice {

    /**
     *Музыкальный носитель с которого можно прослушать музыку на Универсальном музыкальном центре.
     */
    private static VinylRecord vinylRecord = new VinylRecord();

    /**
     *Музыкальный носитель с которого можно прослушать музыку на Универсальном музыкальном центре.
     */
    private static CdDisk cdDisk = new CdDisk();

    /**
     *Музыкальный носитель с которого можно прослушать музыку на Универсальном музыкальном центре.
     */
    private static FleshDrive fleshDrive = new FleshDrive();


    /**
     * Констрктор класса. Внутри вызывается конструктор класса предка(в качестве параметров передаётся название объекта,
     * и список музыкальных носителей, которые можно слушать на Универсальном музыкальном центре).
     * @see MusicDevice
     * */
    public UniversalMusicDevice() {
        super("Универсальный музыкальный центр", Arrays.asList(vinylRecord, cdDisk, fleshDrive));
    }
}
