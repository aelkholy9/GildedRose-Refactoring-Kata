package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public Item updateNormalItem (Item item) {
    	if(item.quality > 0)
    		item.quality -= 1;
    	if(item.sellIn == 0 && item.quality > 0)
    		item.quality -= 2;
    	else
    		item.sellIn -= 1;
    	return item;
    }

    public void updateQuality(Item[] items) {
        for(int i=0;i< items.length; i++)
        {
        	String[] splittedString = items[i].name.split(" ");
        	System.out.println(splittedString[0]);
        	if(splittedString[0].equals("Aged"))
        	{
        	 	
        	} 
        	else if (splittedString[0].equals("Sulfuras,"))
        	{
        		
        	}
        	else if (splittedString[0].equals("Backstage"))
        	{
        		
        	}
        	else if (splittedString[0].equals("Conjured"))
        	{
        		
        	}
        	else 
        	{
        		items[i] = updateNormalItem(items[i]);
        	}
        }
        	
    }
}


//
//for (int i = 0; i < items.length; i++) {
//    if (!items[i].name.equals("Aged Brie")
//            && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//        if (items[i].quality > 0) {
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].quality = items[i].quality - 1;
//            }
//        }
//    } else {
//        if (items[i].quality < 50) {
//            items[i].quality = items[i].quality + 1;
//
//            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].sellIn < 11) {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//
//                if (items[i].sellIn < 6) {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }
//
//    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//        items[i].sellIn = items[i].sellIn - 1;
//    }
//
//    if (items[i].sellIn < 0) {
//        if (!items[i].name.equals("Aged Brie")) {
//            if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                items[i].quality = items[i].quality - items[i].quality;
//            }
//        } else {
//            if (items[i].quality < 50) {
//                items[i].quality = items[i].quality + 1;
//            }
//        }
//    }
//}