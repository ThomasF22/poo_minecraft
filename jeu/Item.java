package jeu;

public class Item {
    private String id;
    private String name;
    private int damageValue;

    public Item(String id, String name, int damageValue) {
        this.id = id;
        this.name = name;
        this.damageValue = damageValue;
    }


    public String getId(){ return id; }
    public String getName(){ return name; }
    public int getDamageValue(){ return damageValue; }

    @Override
    public String toString(){ return this.name; }

}

class ConsumableItem extends Item {
    private int healValue;  

    public ConsumableItem(String id, String name, int damageValue, int healValue){
        super(id,name,damageValue);
        this.healValue = healValue;
    }

    public int getHealValue(){ return healValue; }

}

class EquippableItem extends Item {
    private int armorValue;
    private String slot; // Slots : head, chest, legs, feet

    public EquippableItem(String id, String name, int damageValue, int armorValue, String slot){
        super(id,name, damageValue);
        this.armorValue = armorValue;
        this.slot = slot;
    }

    public int getArmorValue(){ return armorValue; }
    public String getSlot(){ return slot; }
}


