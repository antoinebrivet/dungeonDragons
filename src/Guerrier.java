package src;

public class Guerrier extends Personnage{

    private int strenghtMin ;
    private int strenghtMax ;
    private int randomStrenght;

    private int lifeMin ;
    private int lifeMax ;
    private int randomLife;

    public Guerrier(){
        super(
        strenghtMin = 5;
        strenghtMax = 10;
        int randomStrenght = strenghtMin + (int)(Math.random() * ((strenghtMax - strenghtMin) + 1)
        );


        lifeMin=5;
        lifeMax=10;
        int randomLife = lifeMin + (int)(Math.random()* ((lifeMax - lifeMin)+1));
    }

    public Guerrier(String name, String weapon, int attack, int lifeLevel){
        super (name, weapon, attack, lifeLevel);

    }

    public Guerrier () {

        super("Inconnu", "Arme Inconnue", 5,5);
    }



    public String toString(){

        return super.toString() + "guerrier";

    }
}







