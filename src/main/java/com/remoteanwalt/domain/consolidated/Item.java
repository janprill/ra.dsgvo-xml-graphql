package com.remoteanwalt.domain.consolidated;

import java.util.Map;

/**
 * Represents a data item. Might be a paragraph, a lit or something different, identified by its type.
 */
public class Item {
    private String type;
    private Map<String, String> data;
}
