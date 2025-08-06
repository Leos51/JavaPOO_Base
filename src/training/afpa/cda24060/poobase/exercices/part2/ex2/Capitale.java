package training.afpa.cda24060.poobase.exercices.part2.ex2;

public class Capitale extends Ville {
    private String pays;



    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }
    public Capitale(String nom, String pays, int nbHab) {
        super(nom, nbHab);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    @Override
    public String afficheToi() {
        return super.afficheToi() + "Capitale de : " + getPays();
    }
}
