package less;

public class Souvenirs {

    private String name;
    private String info;
    private String date;
    private double price;


    public Souvenirs(String name, String info, String date, double price) {
        this.name = name;
        this.info = info;
        this.date = date;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public String getInfo() {
        return info;
    }


    public String getDate() {
        return date;
    }


    public double getPrice() {
        return price;
    }

}
