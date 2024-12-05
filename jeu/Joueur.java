package jeu;

import java.util.ArrayList;
import java.util.List;

public class Joueur extends Entity {
    private List<Block> inventory;

    public Joueur(String name) {
        super(name, 100, 10, 15);
        this.inventory = new ArrayList<>();
    }

    public void ajouterAuInventaire(Block block) {
        inventory.add(block);
        System.out.println("Bloc ajouté à l'inventaire : " + block.getName());
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " attaque " + target.name + " avec " + attackPoints + " points d'attaque.");
        target.takeDamage(attackPoints);
    }
}
