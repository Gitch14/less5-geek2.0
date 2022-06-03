package less.Functions;

public class Functions4 {
    static Menu m = new Menu();


    public int menu4(){

        System.out.println("Введите производителя что бы получить информацию");
        String el = m.scanner.nextLine();

        for(int i = 0; i < m.listManufacturer.size(); i++) {
            String str = m.listManufacturer.get(i);
            if(str.equals(el)) {
                int position = i;
                System.out.println(m.listManufacturer.get(position + 1));
                System.out.println(m.listManufacturer.get(position));
                int position2 = position / 2 * 4;
                System.out.println(m.listSouvenirs.get(position2 + 3));
                System.out.println(m.listSouvenirs.get(position2 + 2));
                System.out.println(m.listSouvenirs.get(position2 + 1));
                System.out.println(m.listSouvenirs.get(position2));
                System.out.println("______________________________________");
            }
        }
        return 4;
    }

}
