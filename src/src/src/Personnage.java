package src;//Création d'une classe personnage

public class Personnage {
    String name;
    int attack;
    int lifeLevel;

    public Personnage(String name, int attack, int lifeLevel){
        this.name=name;
        this.attack=attack;
        this.lifeLevel=lifeLevel;
    }

    /*public String toString(){
        return "Vous voilà face à un terrible guerrier, son nom fait trembler tout le pays"
                + this.name
                + "Nous savons qu'il est puissant et coriace"
                + this.attack
                + this.lifeLevel;*/
}
