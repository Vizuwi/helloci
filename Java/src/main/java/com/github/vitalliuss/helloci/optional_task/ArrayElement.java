package com.github.vitalliuss.helloci.optional_task;

public class ArrayElement {
    private int value;
    private int index;
    private int length;

    public ArrayElement(int value, int index, int length) {
        this.value = value;
        this.index = index;
        this.length = length;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    public int getLength() {
        return length;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
