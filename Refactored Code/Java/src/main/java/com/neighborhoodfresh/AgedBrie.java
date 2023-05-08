package com.neighborhoodfresh;

public class AgedBrie implements ItemType{

    public void updateQuality(Item item) {
        if (item.quality < MAXIMUM_QUALITY) {
            item.quality = item.quality + 1;

            if (item.sellIn <= SELL_IN_THRESHOLD) {
                item.quality = item.quality + 1;
            }
        }
        item.sellIn--;
    }
}
