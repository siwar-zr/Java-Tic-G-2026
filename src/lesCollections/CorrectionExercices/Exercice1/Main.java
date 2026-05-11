package lesCollections.CorrectionExercices.Exercice1;


public class Main {
    public static void main(String[] args) {

        ListeCourses liste = new ListeCourses();

        liste.ajouterArticle("Pain");
        liste.ajouterArticle("Lait");
        liste.ajouterArticle("Pain");

        liste.afficherListe();

        liste.supprimerArticle("Eau");
        liste.supprimerArticle("Lait");

        liste.afficherListe();

        System.out.println("Nombre articles : "
                + liste.nombreArticles());
    }
}