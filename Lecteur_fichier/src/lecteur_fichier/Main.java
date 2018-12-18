package lecteur_fichier;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        
        File f = new File("C:\\Users\\licence\\Documents\\Marc-Antoine GERARDIN\\JAVA\\Lecteur_fichier\\src\\lecteur_fichier\\text.txt");
        Lecteur_simple ls = new Lecteur_simple(f);
//        ls.lancement();
        System.out.println();
        
        Lecteur_inverse li = new Lecteur_inverse(f);
        li.lancement();
        System.out.println();
              
        Lecteur_palindrome lp = new Lecteur_palindrome(f);
//        lp.lancement();
    }
}
