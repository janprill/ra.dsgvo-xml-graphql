package com.remoteanwalt.domain.consolidated;

import java.util.List;
import java.util.StringJoiner;

/**
 * Represents an article of the DSGVO.
 */
public class Article {
    private String title;
    private String subtitle;
    private List<Item> items;

    @Override
    public String toString() {
        return new StringJoiner(", ", Article.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("subtitle='" + subtitle + "'")
                .add("items=" + items)
                .toString();
    }
}
