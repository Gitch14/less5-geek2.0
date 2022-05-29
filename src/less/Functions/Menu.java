package less.Functions;

import less.Manufacturer;
import less.Souvenirs;

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

            if (listSouvenirs.contains(el)) {
                int index = listSouvenirs.indexOf(el);
                el = scanner.nextLine();
                listSouvenirs.set(index, el);
                System.out.println("Елемент изминен на : " + el);
            }
        }else {

            if (listManufacturer.contains(el)) {
                int index = listManufacturer.indexOf(el);
                el = scanner.nextLine();
                listManufacturer.set(index, el);
                System.out.println("Елемент изминен на : " + el);
            }
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

        System.out.println("Введите производителя что бы получить информацию");
        String el = scanner.nextLine();

        if (listManufacturer.contains(el)) {
            int position = listManufacturer.indexOf(el);
            System.out.println(listManufacturer.get(position+1));
            System.out.println(listManufacturer.get(position));
            int position2 = position / 2 * 4;
            System.out.println(listSouvenirs.get(position2 + 3));
            System.out.println(listSouvenirs.get(position2 + 2));
            System.out.println(listSouvenirs.get(position2 + 1));
            System.out.println(listSouvenirs.get(position2));
        }
        return 4;
    }

    public int menu5(){
        System.out.println("Введите город что бы получить информацию");
        String el = scanner.nextLine();


            if (listManufacturer.contains(el)) {
                int position = listManufacturer.indexOf(el);
                System.out.println(listManufacturer.get(position));
                System.out.println(listManufacturer.get(position - 1));
                int position2 = position / 2 * 4;
                System.out.println(listSouvenirs.get(position2 + 3));
                System.out.println(listSouvenirs.get(position2 + 2));
                System.out.println(listSouvenirs.get(position2 + 1));
                System.out.println(listSouvenirs.get(position2));
            }


        return 5;
        }

        
    

    public int menu6(){


        return 6;
    }

    public int menu7(){


        return 7;
    }

    public int menu8(){


        return 8;
    }

    public int menu9(){


        return 9;
    }

    public int menu10(){
        System.out.println("Введите елмент который хотите удалить");
        String el = scanner.nextLine();

        if (listManufacturer.contains(el)) {
            int position = listManufacturer.indexOf(el);
            listManufacturer.remove(position + 1);
            listManufacturer.remove(position);
            int position2 = position / 2 * 4;
            listSouvenirs.remove(position2 + 3);
            listSouvenirs.remove(position2 + 2);
            listSouvenirs.remove(position2 + 1);
            listSouvenirs.remove(position2);
        }


        return 10;
    }

    public List<String> getList() {
        list.add(String.valueOf(listSouvenirs));
        list.add(String.valueOf(listManufacturer));
        return list;
    }
}
