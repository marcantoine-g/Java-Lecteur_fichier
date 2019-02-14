package lecteur_fichier;
import java.io.File;

public class Lecteur_inverse extends Lecteur_fichier_texte {
       
    private String buff2 ="";
    
    public Lecteur_inverse(File file){
        super(file);
    }
    
    
    @Override
    public void printFile(){

        for (int i=0; i<buff.length; i++){
                buff2+=buff[i];
        }
        
        String [] ligne = buff2.split("\n");
        
        for (int i= ligne.length -1 ; i > -1 ; i--){
                System.out.println(ligne[i]);
        } 
        System.out.println("\n");
    }
    
    public void lancement(){
        this.openFile();
        this.readFile();
        this.printFile();
        this.closeFile();
    }
}
