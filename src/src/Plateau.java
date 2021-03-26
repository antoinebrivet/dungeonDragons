package src;

public class Plateau {
    //attributs
    private int nombreCases ;
    private int positionJoueur;

    //constructeurs : initialiser les attributs
    public Plateau(){
       this.nombreCases  = 64;
       this.positionJoueur = 1;
    }
    //Méthodes
    public void printPositionJoueur() {
        System.out.println("Le joueur est à la position :" + "" + positionJoueur + "/64");
    }

    //Getters/Setters

    public int getPositionJoueur() {
        return positionJoueur;
    }
    public void setPositionJoueur(int newPositionJoueur) {
        this.positionJoueur = newPositionJoueur;
    }

}


