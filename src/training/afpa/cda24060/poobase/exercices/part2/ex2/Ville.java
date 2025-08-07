package training.afpa.cda24060.poobase.exercices.part2.ex2;

public class Ville {
    private String nom;
    private int nbHab;

    public Ville(String nom) {
        this.nom = nom;
        setNbHab(-1);
    }

    public Ville(String nom, int nbHab) {
        this.nom = nom;
        setNbHab(nbHab);
    }

    public String getNom() {
        return nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        if (!(nbHab > 0 )) {
            System.err.println("Un nombre d'habitant doit etre positif, la modification n'a pas été prise en compte.");
            if(!(this.nbHab > 0)){
                this.nbHab = -1;
            }
        }else{
            this.nbHab = nbHab;
        }
    }

    public String afficheToi(){
        String msg = "Ville " + this.nom + " - ";
        if (this.nbHab == -1) {
            msg += "Nombre d'Habitants : inconnu ";
        } else {
            msg +="Nombre d'Habitants : " + this.nbHab +" ";;
        }
        return msg;
    }




}
