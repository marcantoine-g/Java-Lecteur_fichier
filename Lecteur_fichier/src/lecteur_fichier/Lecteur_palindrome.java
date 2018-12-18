package lecteur_fichier;
import java.io.File;

public class Lecteur_palindrome extends Lecteur_fichier_texte {
    private char [] buff2;
    
    public Lecteur_palindrome(File file){
        super(file);
        buff2 = new char[1024];
    }
    
    @Override
    public void printFile(){
        for (int i=0; i<buff.length; i++){
            buff2[i]= buff[buff.length-1-i];
        }
        System.out.println(buff);
        System.out.println(buff2);
    }
    public void lancement(){
        this.openFile();
        this.readFile();
        this.printFile();
        this.closeFile();
    }
}
