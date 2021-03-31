package src;


public class Die {
    //attributs
    private int nbFaces;//nombre de faces du dé
    private int visibleFace;//nombre sur la face visible

    //Constructeurs : initialiser les attributs
    public Die(){
        nbFaces = 6;
        visibleFace = (int)(Math.random()*nbFaces)+1;
    }

    /*Méthodes
    public void printFace(){
        System.out.print("Avancez de" +" "+ visibleFace+" "+"cases...");
    }*/

    //Getters/Setters

    public int getVisibleFace() {
        return visibleFace;
    }

    public void setVisibleFace(int visibleFace) {
        this.visibleFace = visibleFace;
    }


}



