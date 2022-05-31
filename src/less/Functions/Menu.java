package less.Functions;

import less.Manufacturer;
import less.Souvenirs;

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

        boolean b;
        do {
            System.out.println("Введите имя продукта, информацию от производителя, дату изготовления и цену");
            String prodStr1 = scanner.nextLine();
            String[] souvenirs = prodStr1.split("  ");
            Menu.listAddSouvenirs(new Souvenirs(souvenirs[0], souvenirs[1], souvenirs[2], souvenirs[3]));
            System.out.println("Введите имя производителя, город производителя");
            String prodStr2 = scanner.nextLine();
            String[] manufacturer = prodStr2.split("  ");
            Menu.listAddManufacturer(new Manufacturer(manufacturer[0], manufacturer[1]));
            System.out.println("Введите Y или y для продолжения");
            String check = scanner.nextLine().toLowerCase();
            b = check.contains("Y".toLowerCase());
        } while (b);
        return 1;
    }

    public int menu2(){
        System.out.println("Введите список котрый хотите изменить s = Souvenirs, m = Manufacturer");
        String ch = scanner.nextLine().toLowerCase();

        System.out.println("Введите елмент который хотите изменить");
        String el = scanner.nextLine();

        if (ch.equals("s")) {

            for(String str : listSouvenirs) {
                if(str.equals(el)) {
                    int index = listSouvenirs.indexOf(el);
                    el = scanner.nextLine();
                    listSouvenirs.set(index, el);
                    System.out.println("Елемент изминен на : " + el);
                }
            }
        }else {

            for(String str : listManufacturer) {
                if(str.equals(el)) {
                    int index = listManufacturer.indexOf(el);
                    el = scanner.nextLine();
                    listManufacturer.set(index, el);
                    System.out.println("Елемент изминен на : " + el);
                }
            }
        }
        return 2;
    }

    public int menu3(){

        System.out.println("Список производителей \n" + listManufacturer);
        System.out.println("Список информации о сувенироах \n" + listSouvenirs);
        return 3;
    }

    public int menu4(){

        System.out.println("Введите производителя что бы получить информацию");
        String el = scanner.nextLine();

        for(int i = 0; i < listManufacturer.size(); i++) {
            String str = listManufacturer.get(i);
            if(str.equals(el)) {
                int position = i;
                System.out.println(listManufacturer.get(position + 1));
                System.out.println(listManufacturer.get(position));
                int position2 = position / 2 * 4;
                System.out.println(listSouvenirs.get(position2 + 3));
                System.out.println(listSouvenirs.get(position2 + 2));
                System.out.println(listSouvenirs.get(position2 + 1));
                System.out.println(listSouvenirs.get(position2));
                System.out.println("______________________________________");
            }
        }
        return 4;
    }

    public int menu5(){
        System.out.println("Введите город что бы получить информацию");
        String el = scanner.nextLine();


        for(int i = 0; i < listManufacturer.size(); i++) {
            String str = listManufacturer.get(i);
            if(str.equals(el)) {
                int position = i;
                System.out.println(listManufacturer.get(position));
                System.out.println(listManufacturer.get(position - 1));
                int position2 = position / 2 * 4;
                System.out.println(listSouvenirs.get(position2 + 3));
                System.out.println(listSouvenirs.get(position2 + 2));
                System.out.println(listSouvenirs.get(position2 + 1));
                System.out.println(listSouvenirs.get(position2));
                System.out.println("______________________________________");
            }
        }

        return 5;
        }

        
    

    public int menu6(){
        double d;

        System.out.println("Введите цену что бы получить информацию о продуктах ниже этой цены");
        int el = scanner.nextInt();

        for (int i = 3; i < listSouvenirs.size(); i+=4) {
            String str = listSouvenirs.get(i);
            d = Double.parseDouble(str);
            if(el >= d) {
                int position = i;
                System.out.println(listSouvenirs.get(position));
                int position2 = position / 2;
                System.out.println(listManufacturer.get(position2));
                System.out.println(listManufacturer.get(position2 - 1));
                System.out.println("______________________________________");

            }
        }


        return 6;
    }

    public int menu7(){
        int index = 0;
        for (int i = 0; i < listManufacturer.size(); i++) {
            int position = (index);
            if (listManufacturer.size() > index) {
                index += 2;
                System.out.println(listManufacturer.get(position));
                System.out.println(listManufacturer.get(position + 1));
                int position2 = position / 2 * 4;
                System.out.println(listSouvenirs.get(position2));
                System.out.println(listSouvenirs.get(position2 + 1));
                System.out.println(listSouvenirs.get(position2 + 2));
                System.out.println(listSouvenirs.get(position2 + 3));
                System.out.println("______________________________________");
                }
            }
        return 7;
    }

    public int menu8(){
        System.out.println("Введите год что бы получить информацию");
        String el = scanner.nextLine();

        for (int i = 0; i < listSouvenirs.size(); i++) {
            String str = listSouvenirs.get(i);
            if(str.equals(el)) {
                int position = i;
                System.out.println(listSouvenirs.get(position));
                System.out.println(listSouvenirs.get(position - 2));
                int position2 = position / 2;
                System.out.println(listManufacturer.get(position2));
                System.out.println("______________________________________");

            }
        }
        return 8;
    }

    public int menu9(){
        int index = 0;
        for (int i = 3; i < listSouvenirs.size(); i+=4) {
                int position = i;
                System.out.println(listSouvenirs.get(position - 1));
                System.out.println(listSouvenirs.get(position - 3));
                int position2 = position / 2;
                System.out.println(listManufacturer.get(position2 - 1));
                System.out.println("______________________________________");
        }

        return 9;
    }

    public int menu10(){
        System.out.println("Введите елмент который хотите удалить");
        String el = scanner.nextLine();

        for (int i = 0; i < listManufacturer.size(); i++) {
            String str = listManufacturer.get(i);
            if(str.equals(el)) {
                int position = i;
                listManufacturer.remove(position + 1);
                listManufacturer.remove(position);
                int position2 = position / 2 * 4;
                listSouvenirs.remove(position2 + 3);
                listSouvenirs.remove(position2 + 2);
                listSouvenirs.remove(position2 + 1);
                listSouvenirs.remove(position2);
            }
        }

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
