package training.afpa.cda24060.poobase.exercices.ex4.geometry;

public class Cercle {
    private Point centre;
    private double rayon;
    final double pi = 3.14;


    public void setCentre(Point centre) {
        this.centre = centre;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }
    public Point getCentre() {
        return centre;
    }

    public double perimetre() {
        return 2 * getRayon() * pi;
    }

    public double surface(){
        return  Math.pow(getRayon(),2) * pi;

    }

    public void testAppartenance(Point p1){
        boolean appartenance = getCentre() == p1;
        String msg = appartenance? "OK":"Non OK";
        System.out.println(msg);
    }

    public void afficher(){
        System.out.println("Le centre est : "+getCentre());
        System.out.println("Le rayon : "+getRayon());
    }
}
