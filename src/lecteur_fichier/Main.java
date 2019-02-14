package lecteur_fichier;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        
        // Chemin à modifier /!\
        File f = new File("C:\\Users\\b\\Desktop\\Cours\\Java\\Lecteur_fichier\\src\\lecteur_fichier\\text.txt");
        Lecteur_simple ls = new Lecteur_simple(f);
        System.out.println("-- Lecture simple -- \n");
        ls.lancement();

        // PB
        Lecteur_inverse li = new Lecteur_inverse(f);
        System.out.println("-- Lecture inverse -- \n");
        li.lancement();
        
        Lecteur_palindrome lp = new Lecteur_palindrome(f);
        System.out.println("-- Lecture palindrome -- \n");
        lp.lancement();
    }
}
