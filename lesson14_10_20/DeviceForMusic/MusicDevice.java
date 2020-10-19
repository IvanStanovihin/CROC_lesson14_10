package lesson14_10_20.DeviceForMusic;

import lesson14_10_20.StorageForMusic.MusicStorage;
import lesson14_10_20.Song;
import java.util.List;
import static lesson14_10_20.ConsoleMenu.markup;

/**
 * Абстрактный класс музыкальных устройств. Является предком для всех классов музыкальных устройств.
 */
public abstract class  MusicDevice {

    /**
     * Название музыкального устрйства
     * */
    private String nameDevice;

    /**
     * Список музыкальных носителей, с которых можно слушать музыку на музыкальном устройстве.
     * */
    private List<MusicStorage> availableMusicStorage;

    /**
     * Конструктор класса, в качестве параметров принимает название музыкального устройства, и список музыкальных носителей,
     * с которых можно послушать музыку.
     * */
    public MusicDevice(String nameDevice, List<MusicStorage> listAvailableMusicStorage){
        this.nameDevice = nameDevice;
        this.availableMusicStorage = listAvailableMusicStorage;
    }

    /**
     * Возвращает название музыкального устройства.
     * */
    public String getNameDevice(){
        return nameDevice;
    }

    /**
     * Метод воспроизведения музыки. В качестве параметров в него передаются музыкальный носители и песня. Если
     * воспроизведение музыки с такими параметрами недоступно на музыкальном устрйстве, то в консоль выводится соответсвующее
     * сообщение и метод возвращает значение false. Если песня успешно включается, то в консол выводится соответсвующее
     * сообщение и метод возвращает значение true.
     */
    public boolean playMusic(MusicStorage musicStorage, Song song){
        boolean result = false;
        for(MusicStorage oneMusicStorage: availableMusicStorage){
            if (identicalMusicStorage(oneMusicStorage, musicStorage)){
                result = true;
                break;
            }
        }
        if (result){
            markup();
            System.out.println("Устройство: " + nameDevice +", воспроизводит песню с носителя: "+ musicStorage.getName() +
                    "; Название песни: "+ song.getNameSong() + ", исполнитель:" + song.getNameSinger());
        }else{
            markup();
            System.out.println("Устройство: " + nameDevice + " не может проигрывать песни с носителя: " + musicStorage.getName());
        }
        return result;
    }

    /**
     * Метод сравнивает два объекта класса Song, если они идентичны, возвращает значение true, иначе false.
     * */
    private static boolean identicalMusicStorage(MusicStorage musStorage1, MusicStorage musicStorage2){
        boolean result = false;
        if(musStorage1.getName() == musicStorage2.getName()){
            result = true;
        }
        return result;
    }
}
