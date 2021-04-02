package src;

public class Magicien extends Personnage{

    public Magicien( String name, String weapon, int attack, int lifeLevel){
        super(name, weapon, attack, lifeLevel);
    }

    public Magicien () {

        super("Inconnue", "Arme Inconnue", 3, 3);

    }

    public String toString(){

        return super.toString() + "magicien";

    }
    }












