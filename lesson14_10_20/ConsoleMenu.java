package lesson14_10_20;

import lesson14_10_20.DeviceForMusic.CDplayer;
import lesson14_10_20.DeviceForMusic.Gramophone;
import lesson14_10_20.DeviceForMusic.MusicDevice;
import lesson14_10_20.DeviceForMusic.UniversalMusicDevice;
import lesson14_10_20.StorageForMusic.CdDisk;
import lesson14_10_20.StorageForMusic.FleshDrive;
import lesson14_10_20.StorageForMusic.MusicStorage;
import lesson14_10_20.StorageForMusic.VinylRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Класс, отвечающий за работу консольного меню.
 * */
public class ConsoleMenu {

    private static Song song;
    private static MusicStorage musicStorage;
    private static MusicDevice musicDevice;

    /**
     * Метод запуска консольного меню.
     * */
    public static void launchMenu() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command ="";
        do{
            markup();
            System.out.println("Выберите песню которую хотите прослушать: ");
            choiceSong();
            do {
                markup();
                System.out.println("Выберите аудионоситель с которого вы хотите прослушать песню: ");
                choiceStorage();
                if(musicStorage.searchSongOnStorage(song) == false){
                    markup();
                    System.out.println("На выбранном аудио-носителе нет песни которую вы хотите послушать! " +
                            "Выберите другой аудио-носитель");
                }
            }while(!musicStorage.searchSongOnStorage(song));
            do{
                markup();
                System.out.println("Выберите музыкальный проигрыватель на котором хотите послушать музыку");
                choiceDevice();

                /*Условие выхода из цикла - метод playMusic должен вернуть true, то есть музыкальный девайс у которого
                * вызывается метод должен уметь воспроизводить музыку с музыкального носителя, который передаётся в качестве
                * параметра в метод. */
            }while(!musicDevice.playMusic(musicStorage, song));
        }while(true);
    }

    /**
     * Выбор песни. Выбранной песней является объект, ссылка на который хранится в глобальной переменной song.
    */
     private static void choiceSong(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command ="";

        //команды, при вводе которых произойдёт выход из цикла
        String[]rightCommand = {"1", "2", "3"};
        do{
            System.out.println("1. Louis Armstrong - \"What a wonderful world\"");
            System.out.println("2. Вячеслав Бутусов - \"Зверь\"");
            System.out.println("3. Ed Sheeran - \"Shape of you\"");
            try{
                command = reader.readLine();
            }catch(IOException e){
                System.out.println("Неверный ввод команды!");
            }
            switch(command){
                case "1":
                    song = new Song("\"What a wonderful world\"", "Louis Armstrong");
                    break;
                case "2":
                    song = new Song("\"Зверь\"", "Вячеслав Бутусов");
                    break;
                case "3":
                    song = new Song ("\"Shape of you\"", "Ed Sheeran");
                    break;
                default:
                    System.out.println("Вы ввели неверный номер композиции! Повторите ввод!");
            }

            /*Цикл не остановиться, пока не будет введена одна из правильных команд(rightCommand)*/
        }while(!Arrays.asList(rightCommand).contains(command));
    }

    /**
     * Выбор музыкального носителя. Выбранным аудио-носителем является объект, на который ссылается глобальная переменная musicStorage.
    */
     private static void choiceStorage(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command ="";
        String[]rightCommand = {"1", "2", "3"};
        do{
            System.out.println("1. Виниловая пластинка ");
            System.out.println("2. CD - диск");
            System.out.println("3. Флешка");
            try{
                command = reader.readLine();
            }catch(IOException e){
                System.out.println("Неверный ввод команды!");
            }
            switch(command){
                case "1":
                    musicStorage  = new VinylRecord();
                    break;
                case "2":
                    musicStorage = new CdDisk();
                    break;
                case "3":
                    musicStorage = new FleshDrive();
                    break;
                default:
                    markup();
                    System.out.println("Вы ввели неверный номер музыкального носителя! Повторите ввод!");
            }
        }while(!Arrays.asList(rightCommand).contains(command));
    }

    /**
     * Выбор музыкального устройства для воспроизведения музыки. Выбранным устройством является объект,
     * на который ссылается глобальная переменная musicDevice.
    */
     private static void choiceDevice(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command ="";
        String[]rightCommand = {"1", "2", "3"};
        do{
            System.out.println("1. Граммофон ");
            System.out.println("2. CD - плеер");
            System.out.println("3. Универсальный музыкальный центр");
            try{
                command = reader.readLine();
            }catch(IOException e){
                System.out.println("Неверный ввод команды!");
            }
            switch(command){
                case "1":
                    musicDevice = new Gramophone();
                    break;
                case "2":
                    musicDevice = new CDplayer();
                    break;
                case "3":
                    musicDevice = new UniversalMusicDevice();
                    break;
                default:
                    System.out.println("Вы ввели неверный номер музыкального устройства! Повторите ввод!");
            }
        }while(!Arrays.asList(rightCommand).contains(command));
    }


    /**
     * Метод отрисовки горизонтальной линии.
     * */
    public static void markup(){
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
