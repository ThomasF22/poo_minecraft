package poo_minecraft.jeu;

public abstract class Entite {
    protected String nom;
    protected int pointsDeVie;
    protected int pointsDeDefense;
    protected int pointsDattaque;

    public Entite(String nom, int pointsDeVie, int pointsDeDefense, int pointsDattaque) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.pointsDeDefense = pointsDeDefense;
        this.pointsDattaque = pointsDattaque;
    }

    public boolean estEnVie() {
        return pointsDeVie > 0;
    }

    public void subirDegats(int degats) {
        int degatsReels = Math.max(0, degats - pointsDeDefense);
        pointsDeVie -= degatsReels;
        System.out.println(nom + " subit " + degatsReels + " dégâts. PV restants : " + pointsDeVie);
    }

    public abstract void attaquer(Entite cible);
}
