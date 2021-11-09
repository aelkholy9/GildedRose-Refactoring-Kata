package com.gildedrose;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };
        
        viewTable preview = new viewTable();
        preview.setVisible(true);
        
        GildedRose app = new GildedRose(items);

        int days = 4;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
            
        }

        for (int i = 0; i < days; i++) {
        	JTable table = new JTable();
    		preview.Menu.addTab("Day " + (i+1), null, table, null);
    		
    		DefaultTableModel model = (DefaultTableModel) table.getModel();
    		table.setFont(new Font("Segoe UI", Font.BOLD, 12));

    		model.addColumn("Name");
    		model.addColumn("Sell in value");
    		model.addColumn("Quality value");
    		
    		model.addRow(new Object[] {"Name", "Sell-in Value", "Quality Value"});
    		table.getColumnModel().getColumn(0).setPreferredWidth(200);
    		
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
            	if(item.quality >= 0 && item.sellIn >= 0)
            		model.addRow(new Object[]{item.name, item.sellIn, item.quality});
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality(items);
        }
    }

}
