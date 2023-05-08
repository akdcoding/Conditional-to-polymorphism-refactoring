package com.neighborhoodfresh;

public interface ItemType {
    public static final int MAXIMUM_QUALITY = 50;
    public static final int MINIMUM_QUALITY = 0;
    public static final int SELL_IN_THRESHOLD = 0;
    public static final int BACKSTAGE_PASS_MATURITY_DURATION1 = 10;
    public static final int BACKSTAGE_PASS_MATURITY_DURATION2 = 5;
    void updateQuality(Item item);
}
