public class Livre {
    String titre;
    Auteur auteur;
    int pages;

    public Livre(String titre, Auteur auteur, int pages){
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
    }

    public void afficherDescription(){
        System.out.println("Titre : " + this.titre);
        System.out.println("Auteur : " + this.auteur.nom + " " + this.auteur.nom);
        System.out.println("Pages : " + this.pages);
    }
}
