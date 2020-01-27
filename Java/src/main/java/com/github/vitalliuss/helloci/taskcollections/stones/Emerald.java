package com.github.vitalliuss.helloci.taskcollections.stones;

public class Emerald extends Stone {
    private String tintOfGreen;

    public Emerald(String name, int price, int weight, int transparency, String tintOfGreen) {
        super(name, price, weight, transparency);
        this.tintOfGreen = tintOfGreen;
    }

    @Override
    public String toString() {
        return "Emerald{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "weight='" + super.getWeight() + '\'' +
                "transparency='" + super.getTransparency() + '\'' +
                "tintOfGreen='" + tintOfGreen + '\'' +
                '}';
    }
}
