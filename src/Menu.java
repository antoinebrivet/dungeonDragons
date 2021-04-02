package src;

import java.util.Scanner;

public class Menu{

    public void lancerMenu(){
            String type;
            String nom;


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

