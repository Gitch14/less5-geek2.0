package less;

public class Souvenirs {

    private String name;
    private String info;
    private String date;
    private String price;


    public Souvenirs(String name, String info, String date, String price) {
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


    public String getPrice() {
        return price;
    }

}
