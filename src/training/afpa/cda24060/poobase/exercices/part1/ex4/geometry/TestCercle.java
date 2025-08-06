package training.afpa.cda24060.poobase.exercices.part1.ex4.geometry;

public class TestCercle {
    public static void main(String[] args) {
        TestCercle c = new TestCercle();
        c.run();
    }
    public void run(){
        Cercle cercle1 = new Cercle();
        Point p1 = new Point(1,35);
        cercle1.setCentre(new Point(100,40));
        cercle1.setRayon(20);
        cercle1.afficher();

        cercle1.testAppartenance(p1, cercle1.getCentre(), cercle1.getRayon());
    }
}
