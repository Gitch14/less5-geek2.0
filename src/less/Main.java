package less;

import less.Functions.Menu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);



        int n = 0;
        do {

            System.out.println("Введите номер для навигации в меню");
            int m = scanner.nextInt();
            switch (m) {
                case 1 -> menu.menu1();
                case 2 -> menu.menu2();
                case 3 -> menu.menu3();
            }
            System.out.println("Введите 1 для перехода в меню");
            n = scanner.nextInt();
        } while (n == 1);





System.out.println(menu.getList());


    }
}
