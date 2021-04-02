package com.company;

public class Stack implements CoolDataStructure {

    private Item item = null;

    @Override
    public void push(Integer value) {

        Item newItem = new Item();

        newItem.setValue(value);

        if (item != null) {
            newItem.setNeighbor(item);
        }
        item = newItem;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            return null;
        } else {
            Integer valueToReturn = item.getValue();
            item = item.getNeighbor();
            return valueToReturn;
        }
    }

    @Override
    public Integer top() {
        /*
        if (isEmpty()) {
            return null;
        } else {
            return item.getValue();
        }
         */
        return isEmpty() ? null : item.getValue();
    }

    @Override
    public boolean isEmpty() {
        return item == null;
    }
}
