package CorrectionExamen2025;

public abstract class Personnage {
    String nom;
    int niveauActuel;
    int pointsExperience = 0;

    public Personnage(String nom){
        this.nom = nom;
        this.niveauActuel = 1;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauActuel() {
        return niveauActuel;
    }

    public void gagnerExperience(int points){
        this.pointsExperience += points;
    }

    public void passerNiveau() throws JoueurException{
        if(this.pointsExperience < 100){
            throw new JoueurException("You don't have enough points");
        }
        this.niveauActuel += 1;
        this.pointsExperience = 0;
    }
}
