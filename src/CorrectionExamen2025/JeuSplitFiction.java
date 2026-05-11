package CorrectionExamen2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class JeuSplitFiction {

    List<Joueur> joueurs = new ArrayList<>();
    List<Niveau> niveaux = new ArrayList<>();

    public void ajouterJoueur(Joueur j){
        this.joueurs.add(j);
    }
    public void ajouterNiveau(Niveau n){
        this.niveaux.add(n);
    }

    public void passerNiveau(String nomJoueur){
        List<Joueur> listJoueurs = joueurs.stream()
                .filter(j -> j.getNom().equalsIgnoreCase(nomJoueur))
                .toList();
        if (listJoueurs.isEmpty()) {
            System.out.println("Joueur introuvable");
            return;
        }

        Joueur j1 = listJoueurs.get(0);
        try{
            j1.passerNiveau();
            System.out.println(j1.getNom() + " est passe au niveau "
                            + j1.getNiveauActuel());
        }catch (JoueurException e){
            System.out.println(e);
        }

    }

    public void supprimer(int indice) {

        if (joueurs.isEmpty()) {
            System.out.println("Liste vide");
            return;
        }

        if (indice >= 0 && indice < joueurs.size()) {

            joueurs.remove(indice);
            System.out.println("Joueur supprime");
        } else {
            System.out.println("Indice invalide");
        }
    }

    public boolean trouverJoueurParNom(String nom) {

        /*for (Joueur j : joueurs) {

            if (j.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }

        return false;*/

        // ou

        List<Joueur> listJoueur = joueurs.stream()
                .filter(j -> j.getNom().equalsIgnoreCase(nom))
                .toList();
        return !listJoueur.isEmpty();
    }

    public void trierJoueurs() {

        Collections.sort(joueurs,
                Comparator.comparing(Joueur::getNom));

        System.out.println("Liste des joueurs triee :");

        for (Joueur j : joueurs) {
            j.afficherResume();
            System.out.println("----------------");
        }
    }

}
