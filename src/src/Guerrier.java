package src;

public class Guerrier extends Personnage { //définition d'une classe

// Même fonctionnement que pour les magiciens, pour les instantiations

    public Guerrier() { // création d'un constructeur
        super("Pepito", 10,12);
    }

    public Guerrier(String name) { //création d'un 2nd constructeur
        super(name, 9, 9);
    }

    public Guerrier(String name, int attack, int lifeLevel) {
        super(name, attack, lifeLevel);
    }
}
