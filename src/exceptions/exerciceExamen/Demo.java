package exceptions.exerciceExamen;

class SoldeInsuffisantException extends Exception{
    public SoldeInsuffisantException(String msg){
        super(msg);
    }
}

class CompteBancaire{
    private String numeroCompte;
    private double solde;

    CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }
    public void setSolde(double montant) {
        this.solde = montant;
    }
    public double getSolde() {
        return solde ;
    }
    /*public void retrait(double montant) {
        try{
            if (montant > solde) {
                //System.out.println("Fonds insuffisants.");
                throw new SoldeInsuffisantException("Solde insuffisant");
            }
            else {
                solde -= montant;
                System.out.println(montant + " retiré avec succès.");
            }
        }catch(SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }

    }*/
    public void retrait(double montant) throws SoldeInsuffisantException {

        if (montant > solde) {
            //System.out.println("Fonds insuffisants.");
            throw new SoldeInsuffisantException("Solde insuffisant");
        } else {
            solde -= montant;
            System.out.println(montant + " retiré avec succès.");
        }
    }
    public void depot (double montant) {
        solde += montant;
        System.out.println(montant + " déposé avec succès.");
    }
}
public class Demo {
    public static void main(String[] args) {
        CompteBancaire cb = new CompteBancaire("12334566",1000);
        try{
            cb.retrait(500);
        } catch (SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }
    }
}
