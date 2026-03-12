package Exercices_Heritage;

import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez vous créer une voiture (1) ou une moto (2) ? ");
        int choix = sc.nextInt();
        sc.nextLine(); //Consommer le next line du next int (\n)

        if (choix == 1){
            System.out.println("Entrer la marque de la voiture : ");
            String marque = sc.nextLine();
            System.out.println("Entrer la vitesse max de la voiture : ");
            double vitesseM = sc.nextDouble();
            System.out.println("Entrer le nombre des portes de la voiture : ");
            int nbrP = sc.nextInt();

            Voiture v1 = new Voiture(marque,vitesseM,nbrP);
            v1.afficherInfo();
        } else if (choix == 2) {
            System.out.println("Entrer la marque de la moto : ");
            String marque = sc.nextLine();
            System.out.println("Entrer la vitesse max de la moto : ");
            double vitesseM = sc.nextDouble();
            System.out.println("Entrer la cylindrée de la moto : ");
            int cyl = sc.nextInt();

            Moto m1 = new Moto(marque,vitesseM,cyl);
            m1.afficherInfo();
        }else {
            System.out.println("Votre choix est invalide ! ");
        }
    }
}
