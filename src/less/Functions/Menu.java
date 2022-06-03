package less.Functions;

import less.Objects.Manufacturer;
import less.Objects.Souvenirs;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    static List<String> listSouvenirs = new ArrayList<>();
    static List<String> listManufacturer = new ArrayList<>();
    static List<String> list = new ArrayList<>();





    public static void listAddSouvenirs(Souvenirs s){
        listSouvenirs.add(s.getName());
        listSouvenirs.add(s.getInfo());
        listSouvenirs.add(s.getDate());
        listSouvenirs.add(s.getPrice());

    }

    public static void listAddManufacturer(Manufacturer m){
        listManufacturer.add(m.getName());
        listManufacturer.add(m.getCountry());

    }


    public int menu1(){

        Functions1 functions1 = new Functions1();
        functions1.menu1();
        return 1;
    }

    public int menu2(){
        Functions2 functions2 = new Functions2();
        functions2.menu2();

        return 2;
    }

    public int menu3(){
        Functions3 functions3 = new Functions3();
        functions3.menu3();

        return 3;
    }

    public int menu4(){
        Functions4 functions4 = new Functions4();
        functions4.menu4();

        return 4;
    }

    public int menu5(){
        Functions5 functions5 = new Functions5();
        functions5.menu5();

        return 5;
    }

    public int menu6(){
        Functions6 functions6 = new Functions6();
        functions6.menu6();

        return 6;
    }

    public int menu7(){
        Functions7 functions7 = new Functions7();
        functions7.menu7();

        return 7;
    }

    public int menu8(){
        Functions8 functions8 = new Functions8();
        functions8.menu8();

        return 8;
    }

    public int menu9(){
        Functions9 functions9 = new Functions9();
        functions9.menu9();

        return 9;
    }

    public int menu10(){
        Functions10 functions10 = new Functions10();
        functions10.menu10();

        return 10;
    }

    public List<String> getList() {
        list.add(String.valueOf(listSouvenirs));
        list.add(String.valueOf(listManufacturer));
        return list;
    }

    private BufferedReader readerSouvenirs;
    private BufferedReader readerManufacturer;
    private FileWriter fileWriterSouvenirs;
    private FileWriter fileWriterManufacturer;

    public void addWriterSouvenirs() throws IOException {
        fileWriterSouvenirs = new FileWriter("Souvenirs.txt");
        fileWriterSouvenirs.write(String.valueOf(listSouvenirs));
        fileWriterSouvenirs.close();
    }

    public void addWriterManufacturer() throws IOException {
        fileWriterManufacturer = new FileWriter("Manufacturer.txt");
        fileWriterManufacturer.write(String.valueOf(listManufacturer));
        fileWriterManufacturer.close();
    }

    public void setUpBufferedReaderSouvenirs() throws IOException {
        readerSouvenirs = Files.newBufferedReader(
                Paths.get("Souvenirs.txt"), StandardCharsets.UTF_8);
    }

    public void setUpBufferedReaderManufacturer() throws IOException {
        readerManufacturer = Files.newBufferedReader(
                Paths.get("Manufacturer.txt"), StandardCharsets.UTF_8);
    }

    public void closeBufferedReaderSouvenirs() throws IOException {
        readerSouvenirs.close();
    }

    public void closeBufferedReaderManufacturer() throws IOException {
        readerManufacturer.close();
    }
}
