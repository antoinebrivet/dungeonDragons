package src;

public class Magicien extends Personnage{

    public Magicien(){
        String name="Harry";
        String weapon;
        int attack;
        int lifeLevel;

    }

    public String toString(){
        return super.toString() + "magicien";
    }
    }

 // Attention, j'instencie déjà mes magiciens dans la classe Menu.



/*public class Magicien extends Personnage { //définition d'une classe héritant de la classe personage

    // Les constructeurs n'ont pas besoin de variables prédéfinies dans ce fichier.
// Elles ont déjà été établis dans la classe personnage.
    public Magicien() {
        super("Harry", "baguette", 6, 6);
        //Tout est saisi en brut car il n'y a pas de paramètre.
    }
}*/








