package less;

import less.Functions.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        /**
         * Patterns
         *
         * Facade
         * State
         */

        int n = 0;
        do {

            System.out.println("Введите номер для навигации в меню : ");
            int m = scanner.nextInt();
            switch (m) {
                case 1 -> menu.menu1();
                case 2 -> menu.menu2();
                case 3 -> menu.menu3();
                case 4 -> menu.menu4();
                case 5 -> menu.menu5();
                case 6 -> menu.menu6();
                case 7 -> menu.menu7();
                case 8 -> menu.menu8();
                case 9 -> menu.menu9();
                case 10 -> menu.menu10();
            }
            System.out.println("Введите 1 для перехода в меню");
            n = scanner.nextInt();
        } while (n == 1);




menu.addWriterSouvenirs();
menu.addWriterManufacturer();


    }
}
