package com.remoteanwalt.domain.consolidated;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Represents a data item. Might be a paragraph, a lit or something different, identified by its type.
 */
public class Item {
    private Key type;
    private Map<String, String> data = new HashMap<>();
    private List<Item> items;

    public void setType(Key type) {
        this.type = type;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public enum Key {
        STRING, DATE, NOTE, QUOTEND, QUOTSTART;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("type=" + type)
                .add("data=" + data)
                .add("items=" + items)
                .toString();
    }
}
