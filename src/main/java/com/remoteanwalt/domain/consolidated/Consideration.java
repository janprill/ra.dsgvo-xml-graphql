package com.remoteanwalt.domain.consolidated;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Represents a consideration item of the DSGVO
 */
public class Consideration {

    private List<Item> items = new ArrayList<>();
    private String no;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "\n" + Consideration.class.getSimpleName() + "[", "]")
                .add("no='" + no + "'")
                .add("items=" + items)
                .add("========================== \n\n")
                .toString();
    }
}
