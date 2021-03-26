package src;

import java.util.ArrayList;

public class Jeu {
    //atributs
    private int [] plateauStandard;
    private ArrayList<Case>plateauCollection;

    public Jeu() {
        plateauStandard = new int[64];
        plateauCollection = new ArrayList<>(); //reprend <case>
    }

    public void display(){
        fillPlateau();
        for (Case casePlateau : plateauCollection) {
            System.out.println(casePlateau + " | ");
        }
    }

    public void fillPlateau() {
        for(int i = 0; i<64; i++); {
            plateauCollection.add(new Case());
        }
    }

}
