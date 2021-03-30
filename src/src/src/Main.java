package src;

public class Main {

    public static void main(String[] args) {
        // Appel aux fonctions ici
        Plateau board = new Plateau();
        Menu menu = new Menu();
        menu.lancerMenu();





//        Jeu partie = new Jeu();
//        Jeu.display();









	// write your code here
        Guerrier warrior = new Guerrier(); // invocation constructeur
     //   Guerrier fantassin = new Guerrier("Arthur");
     //   Guerrier archer = new Guerrier("Gontran");

        Magicien wizard = new Magicien();
     //   Magicien sorcier = new Magicien("Ron");
     //   Magicien sorciere = new Magicien("Hermione");

        Menu home = new Menu();

        System.out.println(warrior.name);
     //   System.out.println(fantassin.name);
     //   System.out.println(archer.name);

        System.out.println(wizard.name);
     //   System.out.println(sorcier.name);
     //   System.out.println(sorciere.name);

     //   System.out.println(home);

    }

}
