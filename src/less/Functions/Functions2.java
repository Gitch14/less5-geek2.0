package less.Functions;


public class Functions2 {
    static Menu m = new Menu();


    public int menu2(){
        System.out.println("Введите список котрый хотите изменить s = Souvenirs, m = Manufacturer");
        String ch = m.scanner.nextLine().toLowerCase();

        System.out.println("Введите елмент который хотите изменить");
        String el = m.scanner.nextLine();

        if (ch.equals("s")) {

            for(String str : m.listSouvenirs) {
                if(str.equals(el)) {
                    int index = m.listSouvenirs.indexOf(el);
                    el = m.scanner.nextLine();
                    m.listSouvenirs.set(index, el);
                    System.out.println("Елемент изминен на : " + el);
                }
            }
        }else {

            for(String str : m.listManufacturer) {
                if(str.equals(el)) {
                    int index = m.listManufacturer.indexOf(el);
                    el = m.scanner.nextLine();
                    m.listManufacturer.set(index, el);
                    System.out.println("Елемент изминен на : " + el);
                }
            }
        }
        return 2;
    }
}
