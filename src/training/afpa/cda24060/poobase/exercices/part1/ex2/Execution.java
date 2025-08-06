package training.afpa.cda24060.poobase.exercices.ex2;

import static training.afpa.cda24060.poobase.exercices.utils.UserInput.inputDoubleValue;
import static training.afpa.cda24060.poobase.exercices.utils.UserInput.inputStringValue;

public class Execution {
    public static void main(String[] args) {
        Execution execution = new Execution();
        execution.run();
    }
    public void run(){
        Voiture voiture01 = new Voiture();
        String marque = inputStringValue("Marque : ");
        double prix = inputDoubleValue("Prix : ");
        voiture01.setMarque(marque);
        voiture01.setPrix(prix);
        voiture01.afficher();
    }
}
