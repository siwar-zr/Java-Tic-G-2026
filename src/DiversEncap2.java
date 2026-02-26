import java.util.Scanner;

class CompteBancaire{
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        this.solde += montant;
    }

    public void retirer(double montant){
        if (solde >= montant){
            solde -= montant;
        }else {
            System.out.println("Solde Insuffisant !");
        }
    }
}

public class DiversEncap2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer votre numéro de compte : ");
        String numC = sc.nextLine();

        System.out.println("Entrer votre solde initial : ");
        double solde = sc.nextDouble();

        CompteBancaire cb = new CompteBancaire(numC,solde);

        System.out.println("Depot ");
        cb.deposer(500);
        System.out.println("Solde Actuel est : "+ cb.getSolde());
        System.out.println("1er retrait");
        cb.retirer(1000);
        System.out.println("Solde Actuel est : "+ cb.getSolde());
        System.out.println("2eme retrait");
        cb.retirer(500);
        System.out.println("Solde Actuel est : "+ cb.getSolde());
        System.out.println("3eme retrait");
        cb.retirer(100);
        System.out.println("Solde Actuel est : "+ cb.getSolde());



    }
}
