package ro.mta.tema_0;

public class main {

    public static void main(String[] args) {
        Campion champ=new Campion("Annie", "mid", 200, 50);
        Campion champ2=new Campion("Brand", "support",300,40);
        Campion champ3=new Campion("Rengar", "jungle", 150, 80);

        Campioni champs=new Campioni(champ);
        champs.addChamp(champ2);
        champs.addChamp(champ3);

        champs.printChamp();

    }
}
