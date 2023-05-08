package com.neighborhoodfresh;

public class App {
    public static void main( String[] args ){

        // Quality of standard item
        Item[] items = new Item[] { new Item("Water Bottle", 20, 20) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        System.out.println("Quality of water bottle at the start of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();
        app.updateQuality();
        System.out.println("Quality of water bottle at the end of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        // Quality of aged brie 
        items = new Item[] { new Item("Aged Brie", 0, 20) };
        app = new NeighborhoodFresh(items);
        System.out.println("Quality of aged brie at the start of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();
        app.updateQuality();
        System.out.println("Quality of aged brie at the end of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        // Quality of conjured item
        items = new Item[] { new Item("Conjured", 20, 20) };
        app = new NeighborhoodFresh(items);
        System.out.println("Quality of conjured item at the start of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();
        app.updateQuality();
        System.out.println("Quality of conjured item at the end of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        // Quality of backstage pass
        items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
        app = new NeighborhoodFresh(items);
        System.out.println("Quality of backstage pass at the start of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();
        app.updateQuality();
        System.out.println("Quality of backstage pass at the end of the day: " + NeighborhoodFresh.items[0].quality);
        System.out.println();
    }
}
