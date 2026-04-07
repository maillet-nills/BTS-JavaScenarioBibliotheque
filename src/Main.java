//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Livre> livres = new ArrayList<>();

    Bibliotheque bibliotheque1 = new Bibliotheque(livres);

    Auteur auteur1 = new Auteur("Saint-Expuéry", "Antoine", 1902);
    Auteur auteur2 = new Auteur("Camus", "Albert", 1913);

    Livre livre1 = new Livre("Le Petit Prince", auteur1, 96);
    Livre livre2 = new Livre("Vol de nuit", auteur1, 248);
    Livre livre3 = new Livre("L'Étranger", auteur2, 184);

    bibliotheque1.ajouterLivre(livre1);
    bibliotheque1.ajouterLivre(livre2);
    bibliotheque1.ajouterLivre(livre3);

    auteur1.afficherDescription();
    System.out.println("------------------------");
    livre1.afficherDescription();
    System.out.println("------------------------");
    bibliotheque1.afficherLivres();

}
