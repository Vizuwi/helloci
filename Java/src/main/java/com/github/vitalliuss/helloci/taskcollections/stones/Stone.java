package com.github.vitalliuss.helloci.taskcollections.stones;

public class Stone {
    private String name;
    private int price;
    private int weight;
    private int transparency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public Stone(String name, int price, int weight, int transparency) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.transparency = transparency;
    }
}
