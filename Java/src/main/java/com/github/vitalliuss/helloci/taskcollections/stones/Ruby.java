package com.github.vitalliuss.helloci.taskcollections.stones;

public class Ruby extends Stone {
    private int purity;

    public Ruby(String name, int price, int weight, int transparency, int purity) {
        super(name, price, weight, transparency);
        this.purity = purity;
    }

    @Override
    public String toString() {
        return "Ruby{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "weight='" + super.getWeight() + '\'' +
                "transparency='" + super.getTransparency() + '\'' +
                "purity=" + purity +
                '}';
    }
}
