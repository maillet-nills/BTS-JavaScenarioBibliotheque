import java.util.ArrayList;

public class Bibliotheque {
    ArrayList<Livre> livres;

    public Bibliotheque(ArrayList<Livre> livres){
        this.livres = livres;
    }

    public void ajouterLivre(Livre livre){
        this.livres.add(livre);
    }

    public void afficherLivres(){
        System.out.println("Liste des livres de la bibliothèque :");
        for(int i = 0; i < this.livres.size(); i++){
            System.out.println("===============");
            System.out.print(i + 1 + ". ");
            this.livres.get(i).afficherDescription();
        }
    }
}
