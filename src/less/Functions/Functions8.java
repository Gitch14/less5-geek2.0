package less.Functions;


public class Functions8 {
    static Menu m = new Menu();

    public int menu8(){
        System.out.println("Введите год что бы получить информацию");
        String el = m.scanner.nextLine();

        for (int i = 0; i < m.listSouvenirs.size(); i++) {
            String str = m.listSouvenirs.get(i);
            if(str.equals(el)) {
                int position = i;
                System.out.println(m.listSouvenirs.get(position));
                System.out.println(m.listSouvenirs.get(position - 2));
                int position2 = position / 2;
                System.out.println(m.listManufacturer.get(position2));
                System.out.println("______________________________________");

            }
        }
        return 8;
    }
}
