package training.afpa.cda24060.poobase.exercices.part1.ex3;

import training.afpa.cda24060.poobase.exercices.utils.UserInput;

import static training.afpa.cda24060.poobase.exercices.utils.UserInput.closeScanner;
import static training.afpa.cda24060.poobase.exercices.utils.UserInput.inputDoubleValue;

public class TestRectangle {
    public static void main(String[] args) {
        TestRectangle rectangle = new TestRectangle();
        rectangle.run();
    }
    public void run(){
        double width = UserInput.inputDoubleValue("Entrer la longueur du rectangle : ");
        double height = UserInput.inputDoubleValue("Entrer la largeur du rectangle : ");
        Rectangle rect = new Rectangle(width ,height);
        closeScanner();
        rect.afficher();
    }
}
