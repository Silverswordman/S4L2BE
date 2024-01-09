package giuliasilvestrini.S4L2BE.entities;

import lombok.Getter;

@Getter
public abstract class MenuItem {

    protected int calories;
    protected double price;

    public MenuItem(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}