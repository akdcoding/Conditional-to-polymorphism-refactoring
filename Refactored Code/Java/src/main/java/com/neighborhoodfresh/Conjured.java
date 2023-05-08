package com.neighborhoodfresh;

public class Conjured implements ItemType{
    public void updateQuality(Item item) {
        if (item.quality > MINIMUM_QUALITY) {
            item.quality -= 2;

            if (item.sellIn <= SELL_IN_THRESHOLD) {
                item.quality -= 2;
            }
        }

        item.sellIn--;
    }    
}
