package training.afpa.cda24060.poobase.exercices.part1.ex1;

public class Compte {

    private double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public void deposer(double value){
        this.solde += value;
    }
    public void retirer(double value){
        this.solde -= value;
    }

    public void afficher(){
        String msg = "Solde : " + solde + " €";
       System.out.println(
               msg
       );
    }
}
