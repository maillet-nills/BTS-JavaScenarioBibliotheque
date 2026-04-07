import java.util.ArrayList;

public class Livre {
    String titre;
    Auteur auteur;
    ArrayList<String> genres;
    String description;
    int pages;

    public Livre(String titre, Auteur auteur, int pages, ArrayList<String> genres,String description){
        this.titre = titre;
        this.auteur = auteur;
        this.genres = genres;
        this.pages = pages;
        this.description = description;
    }

    public void ajouterGenre(String genre){
        this.genres.add(genre);
    }

    public void afficherDescription(){
        System.out.println("Titre : " + this.titre);
        System.out.println("Auteur : " + this.auteur.nom + " " + this.auteur.nom);
        System.out.println("Genres : " + this.genres);
        System.out.println("Description : " + this.description);
        System.out.println("Pages : " + this.pages);
    }
}
