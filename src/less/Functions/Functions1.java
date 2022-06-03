package less.Functions;

import less.Manufacturer;
import less.Souvenirs;

public class Functions1 {
    static Menu m = new Menu();


    public int menu1(){

        boolean b;
        do {
            System.out.println("Введите имя продукта, информацию от производителя, дату изготовления и цену");
            String prodStr1 = m.scanner.nextLine();
            String[] souvenirs = prodStr1.split("  ");
            Functions1.m.listAddSouvenirs(new Souvenirs(souvenirs[0], souvenirs[1], souvenirs[2], souvenirs[3]));
            System.out.println("Введите имя производителя, город производителя");
            String prodStr2 = m.scanner.nextLine();
            String[] manufacturer = prodStr2.split("  ");
            Functions1.m.listAddManufacturer(new Manufacturer(manufacturer[0], manufacturer[1]));
            System.out.println("Введите Y или y для продолжения");
            String check = m.scanner.nextLine().toLowerCase();
            b = check.contains("Y".toLowerCase());
        } while (b);
        return 1;
    }
}
