package src;

public class Guerrier extends Personnage{

    public Guerrier(){
        String name;
        String weapon;
        int attack;
        int lifeLevel;

    }

    public String toString(){
        return super.toString() + "guerrier";

    }
}



// Attention, j'instancie déjà mes nouveaux guerriers dans la classe Menu



/*public class Guerrier extends Personnage { //définition d'une classe

// Même fonctionnement que pour les magiciens, pour les instantiations

   public Guerrier(){
      super("Pepito", "Epee", 5, 5);
   }

   public String toString(){
       return " Bienvenue, jeune guerrier. Quel est ton nom? "
               + this.name
               + "Ce lieu est rempli de danger. Prends cette Arme!!! "
               + this.weapon
               + "Avec une arme aussi puissante, tes ennemis pourraient bien finir en kit. "
               + this.attack
               + this.lifeLevel;
}}*/
