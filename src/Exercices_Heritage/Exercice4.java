package Exercices_Heritage;

import java.util.Scanner;

public class Exercice4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous créer un employé (1) ou un manager (2) ?");
        int choix = sc.nextInt();
        sc.nextLine();

        System.out.println("Entrez le nom : ");
        String name = sc.nextLine();
        System.out.println("Entrez le salaire : ");
        double salaire = sc.nextDouble();

        switch (choix){
            case 1:
                Employe emp = new Employe(name, salaire);
                System.out.println("Le salaire est " + emp.calculerSalaire());
                break;
            case 2:
                System.out.println("Entrez le prime : ");
                double prime = sc.nextDouble();
                Manager man = new Manager(name,salaire,prime);
                System.out.println("Le salaire est " + man.calculerSalaire());
                break;

        }
    }
}
