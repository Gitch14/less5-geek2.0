package less.Functions;

import less.Manufacturer;
import less.Souvenirs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function1 {

    static List<Object> list = new ArrayList<>();



    public static void listAddSouvenirs(Souvenirs s){
        list.add(s.getName());
        list.add(s.getInfo());
        list.add(s.getDate());
        list.add(s.getPrice());
    }

    public static void listAddManufacturer(Manufacturer m) {
        list.add(m.getName());
        list.add(m.getCountry());
    }

    public int menu1() {
        Scanner scanner = new Scanner(System.in);
        boolean b;
        do {
            System.out.println("Введите имя продукта, информацию от производителя, дату изготовления и цену");
            String prodStr1 = scanner.nextLine();
            String[] souvenirs = prodStr1.split("  ");
            Function1.listAddSouvenirs(new Souvenirs(souvenirs[0], souvenirs[1], souvenirs[2], Double.parseDouble(souvenirs[3])));
            System.out.println("Введите имя производителя, город производителя");
            String prodStr2 = scanner.nextLine();
            String[] manufacturer = prodStr2.split("  ");
            Function1.listAddManufacturer(new Manufacturer(manufacturer[0], manufacturer[1]));
            System.out.println("Введите Y или y для продолжения");
            String check = scanner.nextLine().toLowerCase();
            b = check.contains("Y".toLowerCase());
        } while (b);
        return 1;
    }

    public void menu2(){
        // edit
    }

    public int menu3(){

        for (Object o : list) {
            System.out.println(o);

        }

        return 3;
    }

    public List<Object> getList() {
        return list;
    }
}
