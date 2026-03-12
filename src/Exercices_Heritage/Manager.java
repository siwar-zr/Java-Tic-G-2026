package Exercices_Heritage;

public class Manager extends Employe{

    private double prime;

    public Manager(String nom, double salaire, double prime) {
        super(nom, salaire);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + prime;
    }
}
