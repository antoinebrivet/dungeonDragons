package src;

import java.util.Scanner;

public class Menu{

    public void lancerMenu(){
            String type;
            String nom;


            //int startGame = 1;
            //int doNotStartGame = 2;
            //int Guerrier = 3;
            //int Magicien = 4;


            Scanner clavier = new Scanner(System.in);

            System.out.print("Quel est votre classe? : ");
            
            type = clavier.nextLine();
            Personnage personnage;
            if(type.equals("g"))//Si le joueur saisit "g", il selectionne la classe "guerrier"
            {
                System.out.println("C'est un guerrier");
                personnage = new Guerrier();//Création d'un nouveau guerrier
            }

            else
            {
                    System.out.println("C'est un magicien");//Autrement c'est un "magicien"
                    personnage = new Magicien();//Création d'un nouveau magicien
            }


            System.out.print("Quel est votre nom? : ");
            nom = clavier.nextLine();
            personnage.name=nom;
            System.out.println(personnage.name);//Faire apparaitre le nom du nouveau personnage


            System.out.println("[type = " + type + ", nom = "+ nom);

            System.out.println("Voulez-vous démarrez une nouvelle partie?");
        if (clavier.hasNext(String.valueOf(1))){
            System.out.println("Bienvenue");

            Plateau plateau = new Plateau();//Créer un objet à partir de la classe.
            plateau.start(personnage);

        }}}


            /*
            //Option pour démarrer la partie


            System.out.println("Souhaitez-vous démarrez une partie?");
            if (1) {
                System.out.println("C'est parti!!!");
                System.out.println("Quel est votre nom? : ");
                nom = clavier.nextLine();
                System.out.println("Etes-vous un guerrier ou un magicien? ");
            if (3){System.out.println("Vous serez donc un guerrier...");
            } else if ({System.out.println("Vous êtes magicien...");
            } else (2) {
                System.out.println("Voulez-vous quitter le jeu? ");
            }


        // fermer les ressources
        {
            return;
        } else {
            clavier.close();
        }
    }
}
*/