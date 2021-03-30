/*package src;

import java.util.ArrayList;

public class Jeu extends src.Case {
    //atributs
    private int [] plateauStandard;
    private ArrayList<src.Case>plateauCollection;

    public Jeu() {
        plateauStandard = new int[64];
        plateauCollection = new ArrayList<>(); //reprend <case>
    }

    public void display(){
        fillPlateau();
        plateauCollection.remove(index:1);
        plateauCollection.forEach(p -> {
            System.out.println.println(p);
        });
        for (src.Case casePlateau : plateauCollection) {
            System.out.println(casePlateau + " | ");
        }

        for (int i = 0; i < plateauCollection.size(); i++) {
        System.out.println(plateauCollection.size(i));
    }

    //    plateauCollection.
        System.out.println(plateauCollection.get(i));

    public void fillPlateau() {
        for(int i = 0; i<64; i++); {
            plateauCollection.add(new src.Case(name: "la case" + i));
        }


    }

}}
*/