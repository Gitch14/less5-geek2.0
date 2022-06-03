package less.Functions;

public class Functions10 {
    static Menu m = new Menu();


    public int menu10(){
        System.out.println("Введите елмент который хотите удалить");
        String el = m.scanner.nextLine();

        for (int i = 0; i < m.listManufacturer.size(); i++) {
            String str = m.listManufacturer.get(i);
            if(str.equals(el)) {
                int position = i;
                m.listManufacturer.remove(position + 1);
                m.listManufacturer.remove(position);
                int position2 = position / 2 * 4;
                m.listSouvenirs.remove(position2 + 3);
                m.listSouvenirs.remove(position2 + 2);
                m.listSouvenirs.remove(position2 + 1);
                m.listSouvenirs.remove(position2);
            }
        }
        return 10;
    }
}
