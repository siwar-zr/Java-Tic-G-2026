import java.util.Scanner;

class Livre{
    private String titre;
    private String auteur;
    private boolean dispo;

    public Livre(String titre, String auteur, boolean dispo) {
        this.titre = titre;
        this.auteur = auteur;
        this.dispo = dispo;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }
     public void emprunter(){
        if (dispo){
            this.dispo = false;
        }else{
            System.out.println("Livre déjà emprunté !");
        }
     }

     public void retourner(){
        this.dispo = true;
     }

     public void infos(){
         System.out.println(titre + " : " + auteur + " : " + dispo);
     }
}

public class Divers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le titre du livre : ");
        String titre = sc.nextLine();

        System.out.println("Entrer l'auteur du livre : ");
        String auteur = sc.nextLine();

        System.out.println("Entrer la disponibilité du livre : ");
        boolean dispo = sc.nextBoolean();

        Livre l1 = new Livre(titre,auteur,dispo);
        System.out.println("Premier Emprunt :");
        l1.emprunter();
        l1.infos();
        System.out.println("Tentative du deuxième Emprunt :");
        l1.emprunter();
        l1.infos();
        System.out.println("Retour du livre :");
        l1.retourner();
        l1.infos();

    }
}
