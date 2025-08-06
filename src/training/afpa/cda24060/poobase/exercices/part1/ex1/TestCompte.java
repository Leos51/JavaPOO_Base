package training.afpa.cda24060.poobase.exercices.ex1;

import static training.afpa.cda24060.poobase.exercices.utils.UserInput.inputDoubleValue;

public class TestCompte {
    public static void main(String[] args) {
        TestCompte t = new TestCompte();
        t.run();
    }

    public void run() {
        Compte compte01 = new Compte(inputDoubleValue("Definir le solde de depart : "));
        System.out.println("Solde : " + compte01.afficher() + " €");
        compte01.deposer(inputDoubleValue("Montant à déposer : "));
        System.out.println("Solde : " + compte01.afficher() + " €");
        compte01.retirer(inputDoubleValue("Montant à retirer : "));
        System.out.println("Solde : " + compte01.afficher() + " €");

    }
}
