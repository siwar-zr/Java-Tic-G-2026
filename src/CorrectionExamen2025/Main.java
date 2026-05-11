package CorrectionExamen2025;

public class Main {

    public static void main(String[] args) {

        JeuSplitFiction jeu = new JeuSplitFiction();

        Joueur j1 = new Joueur("Mio", "Combat");
        Joueur j2 = new Joueur("Zoe", "Infiltration");

        jeu.ajouterJoueur(j1);
        jeu.ajouterJoueur(j2);

        Niveau n1 = new Niveau(1, "Foret magique");
        Niveau n2 = new Niveau(2, "Monde futuriste");

        jeu.ajouterNiveau(n1);
        jeu.ajouterNiveau(n2);

        j1.gagnerExperience(120);

        jeu.passerNiveau("Mio");

        System.out.println(
                jeu.trouverJoueurParNom("Zoe"));

        jeu.trierJoueurs();

        jeu.supprimer(1);
    }
}
