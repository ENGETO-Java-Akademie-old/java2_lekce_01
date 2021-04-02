package com.company;

public class Item {

    private Integer value;

    private Item neighbor;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Item getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(Item neighbor) {
        this.neighbor = neighbor;
    }
}
