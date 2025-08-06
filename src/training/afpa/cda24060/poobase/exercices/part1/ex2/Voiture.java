package training.afpa.cda24060.poobase.exercices.ex2;

public class Voiture {
    private String marque;
    private double prix;

    public Voiture() {
        System.out.println("Voiture Constructor");
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String getMarque() {
        return marque;
    }
    public double getPrix() {
        return prix;
    }
    public void afficher(){
        System.out.println("Marque : " + this.getMarque() + " - Prix : " + this.getPrix());
    }

}
