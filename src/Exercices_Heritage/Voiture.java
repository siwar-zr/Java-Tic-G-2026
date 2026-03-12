package Exercices_Heritage;

public class Voiture extends Vehicule{
    private int nombrePortes;

    public Voiture(String marque, double vitesseMax, int nombrePortes){
        super(marque,vitesseMax);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public void afficherInfo(){
        super.afficherInfo();
        System.out.println("Le nombre des portes : " + nombrePortes);
    }
}
