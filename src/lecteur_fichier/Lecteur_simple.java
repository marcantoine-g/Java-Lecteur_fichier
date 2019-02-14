package lecteur_fichier;
import java.io.File;


public class Lecteur_simple extends Lecteur_fichier_texte {
     
    public Lecteur_simple(File file){
        super(file);
    }
    
    public void lancement(){
            this.openFile();
            this.readFile();
            this.printFile();
            this.closeFile();
    }

}

