package src;

public class Main {

    public static void main(String[] args) {
        // Appel aux fonctions ici
        Plateau board = new Plateau();
        Menu menu = new Menu();
        menu.lancerMenu();

        Personnage magicien = new Magicien("name","Baton", 3, 3);
        System.out.println(magicien.toString());


        Personnage guerrier = new Guerrier("name", "Epee", 5, 5);
        System.out.println(guerrier.toString());
    }
}









