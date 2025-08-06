package training.afpa.cda24060.poobase.exercices.part2.ex1_4_livre;

import training.afpa.cda24060.poobase.exercices.utils.UserInput;

public class TestLivre {
    public static void main(String[] args) {
        TestLivre testLivre = new TestLivre();
        testLivre.run();
    }
    public void run() {
        Livre livre1 = new Livre("L'épée de Verité", "Terry Goodkind",1200);
        Livre livre2 = new Livre("Clean Code", "Robert C. Martin",320);

//        livre1.setNbPages(0);
        int nbTotalPages = calcTotalPages(livre1.getNbPages(), livre2.getNbPages());
        System.out.println("Auteur du livre 1: " + livre1.getAuteur());
        System.out.println("Auteur du livre 2: " + livre2.getAuteur());
        System.out.println("Nombre de pages du livre 1: " + livre1.getNbPages());
        System.out.println("Nombre de pages du livre 2: " + livre2.getNbPages());
        System.out.println("Nombre total de pages : " + nbTotalPages);

        livre1.afficheToi();


        Livre livreSansParam = new Livre();
        livreSansParam.setTitre("NoTitle");
        livreSansParam.setAuteur("Anonymus");
        livreSansParam.setNbPages(300);

        Livre livreAvec2Params = new Livre("Clean Architecture","robert c martin");
        livreSansParam.setNbPages(300);

        Livre livreAvec3Params = new Livre ("Livre 3 Param","Nobody",300);

        double value1 = UserInput.inputDoubleValue("Entrer le prix du livre");
        livreSansParam.setPrix(value1);
        System.out.println("Prix : " + livreSansParam.getPrix());
        double value2 = UserInput.inputDoubleValue("Entrer le prix du livre");
        livreSansParam.setPrix(value2);
        System.out.println("Prix : " + livreSansParam.getPrix());

    }




    int calcTotalPages(int a, int b){
        return a + b;
    }
}
