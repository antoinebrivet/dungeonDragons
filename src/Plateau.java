package src;

import java.util.Scanner;

public class Plateau {
    //attributs
    private int nombreCases ;

    private int positionJoueur;

    Scanner clavier = new Scanner(System.in);


    //constructeurs : initialiser les attributs
    public Plateau(){
       this.nombreCases  = 64;
       this.positionJoueur = 1;
    }

    //Méthodes
    public void start(Personnage joueur){
        System.out.println(joueur.name);
        System.out.println("Souhaitez-vous démarrez une partie? (oui/ non)");
        //Option pour démarrer la partie
        // A compléter
       String reponseJoueur = clavier.nextLine();

        if (reponseJoueur.equals("oui")){
            System.out.println("Equipe-toi sans tarder. Il est temps de partir à l'Aventure!!!");
            positionJoueur = 1;
            jouer();// Appeler méthode
            rejouer();

        }
        else {
            System.out.println("Il ne te reste plus qu'à rentrer chez toi. Lâche que tu es...");
        }
    }
    public void rejouer(){
        System.out.println("Félicitations Champion!!! Tu as déjoué tous les dangers que recelle ce sinistre donjon.");
        System.out.println("A présent un choix très simple s'offre à toi...");
        System.out.println("Préfère-tu rentrer chez toi, avec le sentiment du devoir accompli ou relancer une partie et continuer à explorer cet endroit?");
        System.out.println("(ok/ko)");

        String reponsePlayer = clavier.nextLine();
        if (reponsePlayer.equals("ok")){
            System.out.println("Ok! Une nouvelle aventure va commencer...");
            positionJoueur = 1;//réinitialiser la position initiale du joueur
            jouer();

        }else{
            System.out.println("Tu peux profiter d'une trève bien méritée.");
        }
    }
    public void jouer(){

        while(positionJoueur < 64)
        {
            movePiece();
        }

    }

    public void printPositionJoueur() {
        System.out.println("Le joueur est à la position :" + "" + positionJoueur + "/64");
    }

    private void movePiece() {

        Die de = new Die();
        positionJoueur = positionJoueur + de.getVisibleFace();
        System.out.print("Avancez de" +" "+ de.getVisibleFace()+" "+"cases...");
        System.out.println("Désormais, vous vous trouvez à la case " + "" + positionJoueur + "/64");
    }

    //Getters/Setters

    public int getPositionJoueur() {
        return positionJoueur;
    }

    public void setPositionJoueur(int newPositionJoueur) {
        this.positionJoueur = newPositionJoueur;
    }

}


