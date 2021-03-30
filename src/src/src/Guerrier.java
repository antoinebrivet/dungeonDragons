package src;

public class Guerrier extends Personnage { //définition d'une classe

// Même fonctionnement que pour les magiciens, pour les instantiations

   public Guerrier(){
      super("Pepito", 5, 5);
   }

   public String toString(){
       return "Vous voilà face à un terrible guerrier, son nom fait trembler tout le pays"
               + this.name
               + "Nous savons qu'il est puissant et coriace"
               + this.attack
               + this.lifeLevel;
       }

}
