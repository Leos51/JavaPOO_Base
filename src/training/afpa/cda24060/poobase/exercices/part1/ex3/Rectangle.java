package training.afpa.cda24060.poobase.exercices.part1.ex3;

public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        }
    public double surface() {
        return largeur * longueur;
    }
    public double perimetre() {
        return (largeur + longueur) * 2;
    }
    public void afficher(){
        System.out.println("Surface : " + this.surface() + ", Perimetre : " + this.perimetre());
    }
}
