package ro.mta.tema_0;

import java.util.ArrayList;

public class Campioni {
    private ArrayList<Campion> champs=new ArrayList<Campion>();

    public Campioni(Campion champs) {
        this.champs.add(champs);
    }

    public void addChamp(Campion hero){champs.add(hero);}
    public void printChamp()
    {
        for(int i=0;i<champs.size();i++)
        {
            System.out.println(champs.get(i).getName() + " is "+champs.get(i).getRole());
        }
    }
}
