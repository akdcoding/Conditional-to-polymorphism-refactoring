package com.neighborhoodfresh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeighborhoodFreshTest {

    @Test
    void Should_reduce_the_quality_of_standard_items_by_one() {
        Item[] items = new Item[] { new Item("Item1", 5, 5) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(4, NeighborhoodFresh.items[0].quality);
        assertEquals(4, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_reduce_the_quality_of_standard_items_by_two_after_sellIn_date() {
        Item[] items = new Item[] { new Item("Item1", 0, 5) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(3, NeighborhoodFresh.items[0].quality);
        assertEquals(-1, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_not_reduce_the_quality_of_standard_items_if_it_is_zero() {
        Item[] items = new Item[] { new Item("Item1", 0, 0) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(0, NeighborhoodFresh.items[0].quality);
        assertEquals(-1, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_increase_the_quality_Of_aged_brie_by_two_as_it_gets_older() {
        Item[] items = new Item[] { new Item("Aged Brie", -5, 10) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(12, NeighborhoodFresh.items[0].quality);
        assertEquals(-6, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_not_increase_the_quality_Of_an_item_above_fifty() {
        Item[] items = new Item[] { new Item("Aged Brie", -5, 50) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(50, NeighborhoodFresh.items[0].quality);
        assertEquals(-6, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_not_change_the_quality_Of_Sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -5, 80) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(80, NeighborhoodFresh.items[0].quality);
        assertEquals(-5, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_increase_the_quality_Of_backstage_passes_by_two_when_sellIn_is_ten_or_less_or_more_than_five() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(12, NeighborhoodFresh.items[0].quality);
        assertEquals(9, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_increase_the_quality_Of_backstage_passes_by_two_when_sellIn_is_five_or_less_or_more_than_zero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(13, NeighborhoodFresh.items[0].quality);
        assertEquals(4, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_decrease_the_quality_Of_backstage_passes_to_zero_when_sellIn_date_passes() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(0, NeighborhoodFresh.items[0].quality);
        assertEquals(-1, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_keep_the_quality_Of_backstage_passes_to_zero_when_sellIn_date_passes() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(0, NeighborhoodFresh.items[0].quality);
        assertEquals(-1, NeighborhoodFresh.items[0].sellIn);
    }
    
    @Test
    void Should_increase_the_quality_Of_backstage_passes_by_one_when_sellIn_date_is_more_than_ten() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(11, NeighborhoodFresh.items[0].quality);
        assertEquals(14, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_keep_the_quality_Of_Aged_Brie_to_zero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(0, NeighborhoodFresh.items[0].quality);
        assertEquals(-1, NeighborhoodFresh.items[0].sellIn);
    }

    @Test
    void Should_keep_the_quality_Of_normal_item_to_zero() {
        Item[] items = new Item[] { new Item("Item1", 0, 0) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(0, NeighborhoodFresh.items[0].quality);
        assertEquals(-1, NeighborhoodFresh.items[0].sellIn);
    }
    
    @Test
    void Should_reduce_the_quality_of_conjurede_items_by_two_as_it_gets_older() {
        Item[] items = new Item[] { new Item("Conjured", 5, 5) };
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        app.updateQuality();
        assertEquals(3, NeighborhoodFresh.items[0].quality);
        assertEquals(4, NeighborhoodFresh.items[0].sellIn);
    }

}
