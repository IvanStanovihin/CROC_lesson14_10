package lesson14_10_20.DeviceForMusic;

import lesson14_10_20.StorageForMusic.CdDisk;

import java.util.Arrays;

/**
 * Класс CD - плееров. Наследник класса - MusicDevice(устройства для воспроизведения музыки).
 * */
public class CDplayer extends MusicDevice {

    /**
     * Объект класса CD - диски. Музыкальный носитель с которого можно послушать музыку на CD - плеере.
     * */
    private static CdDisk cdDisk = new CdDisk();

    /**
     * Констрктор класса. Внутри вызывается конструктор класса предка(в качестве параметров передаётся название объекта,
     * и список музыкальных носителей, которые можно проигрывать на CD - плеере).
     * @see MusicDevice
     * */
    public CDplayer() {
        super("CD - плеер", Arrays.asList(cdDisk));
    }
}
