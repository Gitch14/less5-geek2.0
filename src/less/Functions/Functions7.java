package less.Functions;

public class Functions7 {
    static Menu m = new Menu();


    public int menu7(){
        int index = 0;
        for (int i = 0; i < m.listManufacturer.size(); i++) {
            int position = (index);
            if (m.listManufacturer.size() > index) {
                index += 2;
                System.out.println(m.listManufacturer.get(position));
                System.out.println(m.listManufacturer.get(position + 1));
                int position2 = position / 2 * 4;
                System.out.println(m.listSouvenirs.get(position2));
                System.out.println(m.listSouvenirs.get(position2 + 1));
                System.out.println(m.listSouvenirs.get(position2 + 2));
                System.out.println(m.listSouvenirs.get(position2 + 3));
                System.out.println("______________________________________");
                }
            }
        return 7;
    }
}
