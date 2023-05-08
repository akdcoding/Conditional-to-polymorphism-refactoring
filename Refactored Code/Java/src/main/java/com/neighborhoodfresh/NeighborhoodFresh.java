package com.neighborhoodfresh;

import java.util.HashMap;

public class NeighborhoodFresh {
    public static Item[] items;

    public NeighborhoodFresh(Item[] items) {
        NeighborhoodFresh.items = items;
    }

    private final String STANDARD = "Standard";
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final String BRIE = "Aged Brie";
    private final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private final String CONJURED = "Conjured";

    private final HashMap<String, ItemType> itemTypes = new HashMap<String, ItemType>() {
        {
            put(BRIE, new AgedBrie());
            put(BACKSTAGE, new BackstagePass());
            put(CONJURED, new Conjured());
            put(STANDARD, new StandardItem());
        }
    };

    public void updateQuality() {
        for (Item item : items) {
            if (!(item.name == SULFURAS)) {
                if (itemTypes.containsKey(item.name)) {
                    itemTypes.get(item.name).updateQuality(item);
                } else
                    itemTypes.get(STANDARD).updateQuality(item);
            }
        }
    }
}
