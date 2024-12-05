package jeu;

public class Bloc {
    private String nom;
    private boolean cassable;
    private boolean consommable;

    public Bloc(String nom, boolean cassable, boolean consommable) {
        this.nom = nom;
        this.cassable = cassable;
        this.consommable = consommable;
    }

    public String getNom() {
        return nom;
    }

    public boolean isCassable() {
        return cassable;
    }

    public boolean isConsommable() {
        return consommable;
    }

  

    @Override
    public String toString() {
        return "Bloc{" +
                "nom='" + nom + '\'' +
                ", cassable=" + cassable +
                ", consommable=" + consommable +
                '}';
    }
}
