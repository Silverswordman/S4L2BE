package giuliasilvestrini.S4L2BE.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping extends MenuItem {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
