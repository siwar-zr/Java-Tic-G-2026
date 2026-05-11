package CorrectionExamen2025;

public class Niveau {
    int numero;
    String theme;
    boolean accessible = true;

    public Niveau(int numero, String theme) {
        this.numero = numero;
        this.theme = theme;
    }

    public void bloquerNiveau(){
        this.accessible = false;
    }

    public void afficherDetails(){
        System.out.println("Theme : " + this.theme);
        System.out.println("Numero : " + this.numero);
        System.out.println("Accessibilité : " + this.accessible);
    }
}
