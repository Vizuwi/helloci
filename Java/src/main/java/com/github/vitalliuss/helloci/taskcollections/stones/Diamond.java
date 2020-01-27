package com.github.vitalliuss.helloci.taskcollections.stones;

public class Diamond extends Stone {
    private String form;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Diamond(String name, int price, int weight, int transparency, String form) {
        super(name, price, weight, transparency);
        this.form = form;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "weight='" + super.getWeight() + '\'' +
                "transparency='" + super.getTransparency() + '\'' +
                "form='" + form + '\'' +
                '}';
    }
}
