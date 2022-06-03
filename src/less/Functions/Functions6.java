package less.Functions;

public class Functions6 {
    static Menu m = new Menu();

    public int menu6(){
        double d;

        System.out.println("Введите цену что бы получить информацию о продуктах ниже этой цены");
        int el = m.scanner.nextInt();

        for (int i = 3; i < m.listSouvenirs.size(); i+=4) {
            String str = m.listSouvenirs.get(i);
            d = Double.parseDouble(str);
            if(el >= d) {
                int position = i;
                System.out.println(m.listSouvenirs.get(position));
                int position2 = position / 2;
                System.out.println(m.listManufacturer.get(position2));
                System.out.println(m.listManufacturer.get(position2 - 1));
                System.out.println("______________________________________");

            }
        }
        return 6;
    }

}
