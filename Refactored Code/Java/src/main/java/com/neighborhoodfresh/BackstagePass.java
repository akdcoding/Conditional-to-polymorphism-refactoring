package com.neighborhoodfresh;

public class BackstagePass implements ItemType {
    public BackstagePass() {
        super();
    }

    public void updateQuality(Item item) {
        item.sellIn--;
        if (item.sellIn <= SELL_IN_THRESHOLD) {
            item.quality = MINIMUM_QUALITY;
            return;
        }

        if (item.quality < MAXIMUM_QUALITY) {
            item.quality++;

            if (item.sellIn <= BACKSTAGE_PASS_MATURITY_DURATION1) {
                item.quality++;
            }

            if (item.sellIn <= BACKSTAGE_PASS_MATURITY_DURATION2) {
                item.quality++;
            }
        }
    }
}
