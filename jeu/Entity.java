package jeu;

public abstract class Entity {
    protected String name;
    protected int healthPoints;
    protected int defensePoints;
    protected int attackPoints;

    public Entity(String name, int healthPoints, int defensePoints, int attackPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.defensePoints = defensePoints;
        this.attackPoints = attackPoints;
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }

    public void takeDamage(int degats) {
        int realDamage = Math.max(0, degats - defensePoints);
        healthPoints -= realDamage;
        System.out.println(name + " subit " + realDamage + " dégâts. PV restants : " + healthPoints);
    }

    public abstract void attack(Entity cible);
}
