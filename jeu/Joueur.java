package jeu;

import java.util.ArrayList;
import java.util.List;

public class Joueur extends Entite {
    private List<Bloc> inventaire;

    public Joueur(String nom) {
        super(nom, 100, 10, 15);
        this.inventaire = new ArrayList<>();
    }

    public void ajouterAuInventaire(Bloc bloc) {
        inventaire.add(bloc);
        System.out.println("Bloc ajouté à l'inventaire : " + bloc.getNom());
    }

    @Override
    public void attaquer(Entite cible) {
        System.out.println(nom + " attaque " + cible.nom + " avec " + pointsDattaque + " points d'attaque.");
        cible.subirDegats(pointsDattaque);
    }
}
