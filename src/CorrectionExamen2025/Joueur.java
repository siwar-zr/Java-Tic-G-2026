package CorrectionExamen2025;

public class Joueur extends Personnage implements IJoueur{
    String specialite;

    public Joueur(String nom, String specialite) {
        super(nom);
        this.specialite = specialite;
    }



    @Override
    public void jouerTour() {
        System.out.println("It's your turn to play");
    }

    public boolean aMemeSpecialit(Joueur autre){
        return this.specialite.equalsIgnoreCase(autre.specialite);
    }

    public void afficherResume(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Spécialité : " + this.specialite);
        System.out.println("Niveau : " + this.niveauActuel);
        System.out.println("Expérience : " + this.pointsExperience);


    }
}
