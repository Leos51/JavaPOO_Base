package training.afpa.cda24060.poobase.exercices.part1_5.ex1_4_livre;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;

    public Livre() {
        System.out.println("Livre constructor sans param");
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;

    }

    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        setNbPages(nbPages);
    }

    public Livre(String titre, String auteur, int nbPages,  double prix) {
        this.titre = titre;
        this.auteur = auteur;
        setNbPages(nbPages);
        setPrix(prix);
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }
    public int getNbPages() {
        return nbPages;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(int nbPages) {
        if (nbPages < 1) {
            throw new Error("Nombre de pages insuffisant");
        }else {
            this.nbPages = nbPages;
        }
    }

    public void setPrix(double prix) {
        if(isPriceSet()){
            System.err.println("Prix deja fixé");
        }else {
            this.prix = prix;
        }
    }
    public double getPrix() {
        return prix;
    }



    public void afficheToi(){
        System.out.println("Auteur : " + getAuteur() + " - Titre : " + getTitre() + " - NbPages : " + getNbPages());
    }

    private boolean isPriceSet(){
//        return this.prix != null
//        return !(!(this.prix));
        return this.prix > 0;
    }


}
