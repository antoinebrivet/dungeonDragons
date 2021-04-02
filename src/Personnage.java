package src;//Création d'une classe personnage

    public abstract class Personnage {
        String name;
        String weapon;
        int attack;
        int lifeLevel;

        @Override
        public String toString() {
            return "Personnage{" +
                    "name='" + name + '\'' +
                    ", weapon='" + weapon + '\'' +
                    ", attack=" + attack +
                    ", lifeLevel=" + lifeLevel +
                    '}';
        }


    public Personnage(String name, String weapon, int attack, int lifeLevel){
        this.name=name;
        this.weapon=weapon;
        this.attack=attack;
        this.lifeLevel=lifeLevel;
    }



}
