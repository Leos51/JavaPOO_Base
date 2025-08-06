package training.afpa.cda24060.poobase.exercices.ex4.geometry;

public class TestCercle {
    public static void main(String[] args) {
        TestCercle c = new TestCercle();
        c.run();
    }
    public void run(){
        Cercle c = new Cercle();
        c.setCentre(new Point(100,40));
        c.setRayon(20);

        c.afficher();
    }
}
