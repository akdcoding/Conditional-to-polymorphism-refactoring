package com.neighborhoodfresh;

public class StandardItem implements ItemType{
    public void updateQuality(Item item) {
        if (item.quality > MINIMUM_QUALITY) {
            item.quality = item.quality - 1;

            if (item.sellIn <= SELL_IN_THRESHOLD) {
                item.quality = item.quality - 1;
            }
        }

        item.sellIn--;
    }
}
