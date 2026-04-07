public class Auteur {
    String nom;
    String prenom;
    int annee;

    public Auteur(String nom, String prenom, int annee){
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
    }

    public void afficherDescription(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Année de naissance : " + this.annee);
    }
}
