package training.afpa.cda24060.poobase.exercices.part1.ex4.geometry;

public class Cercle {
    private Point centre;
    private double rayon;
    final double PI = Math.PI;


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
        return 2 * getRayon() * PI;
    }

    public double surface(){
        return  Math.pow(getRayon(),2) * PI;

    }


    public void testAppartenance(Point p1, Point centreCercle, double rayon) {
        double dist = Math.sqrt(Math.pow(p1.getAbscisse() - centreCercle.getAbscisse(), 2) + Math.pow(p1.getOrdonnee() - centreCercle.getOrdonnee(), 2));
        boolean appartenance = dist <= rayon;
        String msg = appartenance?
                "Le point appartient":
                "Le point n'appartient pas";
        System.out.println(msg + " au cercle.");
    }

    public void afficher(){
        System.out.println("Le centre est : "+getCentre());
        System.out.println("Le rayon : "+getRayon());
        System.out.println("Le surface : "+surface());
        System.out.println("Le perimetre : "+perimetre());
    }
}
