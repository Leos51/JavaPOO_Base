package training.afpa.cda24060.poobase.exercices.part1_5.ex1_4_livre;

import training.afpa.cda24060.poobase.exercices.utils.UserInput;

import java.util.ArrayList;

public class TestLivre {
    public static void main(String[] args) {
        TestLivre testLivre = new TestLivre();
        testLivre.run();
    }
    public void run() {
        Livre livre1 = new Livre("L'épée de Verité", "Terry Goodkind",1200);
        Livre livre2 = new Livre("Clean Code", "Robert C. Martin",320);

//        livre1.setNbPages(0);


        System.out.println("Auteur du livre 1: " + livre1.getAuteur());
        System.out.println("Auteur du livre 2: " + livre2.getAuteur());
        System.out.println("Nombre de pages du livre 1: " + livre1.getNbPages());
        System.out.println("Nombre de pages du livre 2: " + livre2.getNbPages());


        livre1.afficheToi();


        Livre livreSansParam = new Livre();
        livreSansParam.setTitre("NoTitle");
        livreSansParam.setAuteur("Anonymus");
        livreSansParam.setNbPages(300);
int[][] tableau1 = {{1,2}, {1,5}};
        Livre livreAvec2Params = new Livre("Clean Architecture","robert c martin");
        livreSansParam.setNbPages(300);

        Livre livreAvec3Params = new Livre ("Livre 3 Param","Nobody",300);

        double value1 = UserInput.inputDoubleValue("Entrer le prix du livre");
        livreSansParam.setPrix(value1);
        System.out.println("Prix : " + livreSansParam.getPrix());
        double value2 = UserInput.inputDoubleValue("Entrer le prix du livre");
        livreSansParam.setPrix(value2);
        System.out.println("Prix : " + livreSansParam.getPrix());

        ArrayList<Livre> books = new ArrayList<Livre>();
        books.add(livre1);
        books.add(livre2);
        books.add(livreAvec2Params);
        books.add(livreAvec3Params);
        books.add(livreSansParam);

       for (Livre livre : books) {
           System.out.println(livre.getTitre() + " - " +  livre.getAuteur() + " - " + livre.getNbPages() + " - " + livre.getPrix());

       }
        int nbTotalPages = calcTotalPages(books);
        System.out.println("Nombre total de pages : " + nbTotalPages);

    }


    public int calcTotalPages(ArrayList<Livre> livres){
        int sum = 0;
        for (Livre livre : livres) {
            sum += livre.getNbPages();
        }
        return sum;
    }


}
