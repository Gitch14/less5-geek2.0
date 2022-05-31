package less;

import less.Interface.SouvenirsInstruction;

import java.math.BigDecimal;

public class Souvenirs implements SouvenirsInstruction {

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


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getPrice() {
        return price;
    }
}
