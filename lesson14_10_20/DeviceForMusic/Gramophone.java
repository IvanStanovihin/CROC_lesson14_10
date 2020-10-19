package lesson14_10_20.DeviceForMusic;

import lesson14_10_20.StorageForMusic.VinylRecord;
import java.util.Arrays;

/**
 * Класс граммофонов. Наследник класса - MusicDevice(устройства для воспроизведения музыки).
 * */
public class Gramophone extends MusicDevice {

    /**
     * Объект класса виниловые пластинки. Музыкальный носитель, с которого можно слушать музыку на граммафонах.
     * */
    private static VinylRecord vinylRecord = new VinylRecord();

    /**
     * Констрктор класса. Внутри вызывается конструктор класса предка(к качестве параметров передаётся название объекта,
     * и список музыкальных носителей, которые можно проигрывать на Граммофоне).
     * @see MusicDevice
     * */
    public Gramophone() {
        super("Граммофон", Arrays.asList(vinylRecord));
    }

}
