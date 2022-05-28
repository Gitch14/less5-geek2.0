package less;

import less.Functions.Function1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();


        Function1 function1 = new Function1();


        switch (m) {
            case 1 -> function1.menu1();
            case 2 -> function1.menu3();
        }









System.out.println(function1.getList());




    }
}
