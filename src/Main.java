//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Livre> livres = new ArrayList<>();
    ArrayList<String> livre1Genres = new ArrayList<>();
    ArrayList<String> livre2Genres = new ArrayList<>();
    ArrayList<String> livre3Genres = new ArrayList<>();

    Bibliotheque bibliotheque1 = new Bibliotheque(livres);

    Auteur auteur1 = new Auteur("Saint-Expuéry", "Antoine", 1902);
    Auteur auteur2 = new Auteur("Camus", "Albert", 1913);

    Livre livre1 = new Livre("Le Petit Prince", auteur1, 96, livre1Genres,"Le Petit Prince est un roman français d'Antoine de Saint-Exupéry. Livre à succès, il est l'œuvre la plus connue de son auteur.");
    Livre livre2 = new Livre("Vol de nuit", auteur1, 248, livre2Genres,"Vol de nuit est un roman d'Antoine de Saint-Exupéry, paru le 19 septembre 1931 aux éditions Gallimard, avec une préface d'André Gide.");
    Livre livre3 = new Livre("L'Étranger", auteur2, 184, livre3Genres,"Le roman L'Étranger raconte l'histoire de Meursault, un homme qui semble indifférent à tout, même à la mort de sa mère, et qui tue un homme sur une plage.");

    livre1.ajouterGenre("roman");
    livre1.ajouterGenre("fable");
    livre2.ajouterGenre("roman");
    livre2.ajouterGenre("fable");
    livre3.ajouterGenre("roman");
    livre3.ajouterGenre("policier");

    bibliotheque1.ajouterLivre(livre1);
    bibliotheque1.ajouterLivre(livre2);
    bibliotheque1.ajouterLivre(livre3);

    auteur1.updateAnnee(1900);

    auteur1.afficherDescription();
    System.out.println("------------------------");
    bibliotheque1.afficherLivres();

}
