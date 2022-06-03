package less.Functions;

public class Functions9 {
    static Menu m = new Menu();


    public int menu9(){
        int index = 0;
        for (int i = 3; i < m.listSouvenirs.size(); i+=4) {
                int position = i;
                System.out.println(m.listSouvenirs.get(position - 1));
                System.out.println(m.listSouvenirs.get(position - 3));
                int position2 = position / 2;
                System.out.println(m.listManufacturer.get(position2 - 1));
                System.out.println("______________________________________");
        }
        return 9;
    }

}
