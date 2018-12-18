package lecteur_fichier;
import java.io.File;

public class Lecteur_inverse extends Lecteur_fichier_texte {
       
    private String [] ligne;
    
    public Lecteur_inverse(File file){
        super(file);
        ligne = new String[1024];
    }
    
    
    @Override
    public void printFile(){
        int j=0;

        for (int i=0; i<buff.length; i++){
            if (buff[i]!='\n'){
                ligne[j]+=buff[i]+"";
            }
            else
            {}
        }
        for (int i=0; i<ligne.length; i++){
                if (ligne[i]!=null)
                System.out.println(ligne[i]);
        }
    }
    
    public void lancement(){
        this.openFile();
        this.readFile();
        this.printFile();
        this.closeFile();
    }
}
