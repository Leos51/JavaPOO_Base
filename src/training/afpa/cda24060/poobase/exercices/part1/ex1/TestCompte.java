package training.afpa.cda24060.poobase.exercices.part1.ex1;

import training.afpa.cda24060.poobase.exercices.utils.UserInput;

import static training.afpa.cda24060.poobase.exercices.utils.UserInput.inputDoubleValue;

public class TestCompte {
    public static void main(String[] args) {
        TestCompte t = new TestCompte();
        t.run();
    }

    public void run() {
        Compte compte01 = new Compte(UserInput.inputDoubleValue("Definir le solde de depart : "));
        compte01.afficher();
        compte01.deposer(inputDoubleValue("Montant à déposer : "));
        compte01.afficher();
        compte01.retirer(inputDoubleValue("Montant à retirer : "));
        compte01.afficher();

    }
}
