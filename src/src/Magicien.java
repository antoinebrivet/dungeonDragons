package src;

public class Magicien extends Personnage{ //définition d'une classe héritant de la classe personage

// Les constructeurs n'ont pas besoin de variables prédéfinies dans ce fichier.
// Elles ont déjà été établis dans la classe personnage.
    public Magicien(){
        super("Harry", 6,6);//Tout est saisi en brut car il n'y a pas de paramètre.
    }

    public Magicien(String name){
        super(name, 13, 5);//Name est là en tant que paramètre.
    }//Dans ma méthode super, saisir uniquement name suffit pour avoir le nom.
    // Cependant, nous n'avons que 'name' en paramètre, nous devons donc saisir le reste en brut.

    public Magicien(String name, int attack, int lifeLevel){
       super(name, attack, lifeLevel);//Nous avons toutes les infos requises en paramètre.
        // Nous n'allons saisir que le nom des variables.
    }
}

