package less.Functions;

import less.Manufacturer;
import less.Souvenirs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    static List<Object> listSouvenirs = new ArrayList<>();
    static List<Object> listManufacturer = new ArrayList<>();
    static List<Object> list = new ArrayList<>();




    public static void listAddSouvenirs(Souvenirs s){
        listSouvenirs.add(s.getName());
        listSouvenirs.add(s.getInfo());
        listSouvenirs.add(s.getDate());
        listSouvenirs.add(s.getPrice());
    }

    public static void listAddManufacturer(Manufacturer m) {
        listManufacturer.add(m.getName());
        listManufacturer.add(m.getCountry());
    }

    public int menu1() {

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
        System.out.println("Введите елмент который хотите изменить");
        String el = scanner.nextLine();

        if(listSouvenirs.contains(el)){
            int index = listSouvenirs.indexOf(el);
            el = scanner.nextLine();
            listSouvenirs.set(index,el);
            System.out.println("Елемент изминен на : " + el);
        }
        return 2;
    }

    public int menu3(){

        for (Object m : listManufacturer) {
            System.out.println(m + " - Manufacturer");

        }
        for (Object s : listSouvenirs) {
            System.out.println(s + " - Souvenirs");

        }
        return 3;
    }

    public int menu4(){



        return 4;
    }

    public List<Object> getList() {
        list.add(listSouvenirs);
        list.add(listManufacturer);
        return list;
    }
}
