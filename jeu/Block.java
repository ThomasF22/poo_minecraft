package jeu;

public class Block {
    private String name;
    private boolean breakable;
    private boolean consummable; // Peut-être mettre ça dans la possible classe Item ?

    public Block(String name, boolean breakable, boolean consummable) {
        this.name = name;
        this.breakable = breakable;
        this.consummable = consummable;
    }

    public String getName() {
        return name;
    }

    public boolean isBreakable() {
        return breakable;
    }

    public boolean isConsummable() {
        return consummable;
    }

  

    @Override
    public String toString() {
        return "Bloc{" +
                "nom='" + name + '\'' +
                ", cassable=" + breakable +
                ", consommable=" + consummable +
                '}';
    }
}
