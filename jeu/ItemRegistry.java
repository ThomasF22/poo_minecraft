package jeu;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private static final Map<String, Item> items = new HashMap<>();

    static {

        // items
        items.put("item_sword", new Item("item_sword ", "Epée", 5));

        // equippables
        items.put("item_helmet", new EquippableItem("item_helmet","Casque", 0, 3, "head"));

        // consummables
        items.put("item_apple", new ConsumableItem("item_apple", "Pomme", 0, 2));
    }

    public static Item getItem(String name) {
        return items.get(name);
    }
}
