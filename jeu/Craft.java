package jeu;

import java.util.HashMap;
import java.util.Map;

public class Craft {
    private Map<String, String[]> recettes;

    public Craft() {
        recettes = new HashMap<>();
        recettes.put("Epée", new String[]{"Bois", "Fer"});
        recettes.put("Armure", new String[]{"Cuivre", "Cuivre", "Cuivre"});
    }

    public String crafter(String objet) {
        if (recettes.containsKey(objet)) {
            return "Vous avez crafté : " + objet;
        }
        return "Recette inconnue pour : " + objet;
    }
}
