package lecteur_fichier;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Lecteur_fichier_texte implements Lecteur_fichier{

    private File f;
    private FileInputStream input;
    protected char [] buff;
    
    public Lecteur_fichier_texte(File file){
        f = file;
        buff = new char [1024];
    }
    
    @Override
    public void openFile(){
        input =null;
        try{
            input = new FileInputStream(f);
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("Le fichier n'a pas été trouvé");
        }
    }
    
    @Override
    public void readFile(){
        int i=0;
        try{
            int c = input.read();
 
            while (c != -1){
                buff[i]=(char)c;
                c = input.read();
                i++;
            }
        }catch (IOException exception){
            System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
        }
    }
    
    @Override
    public void printFile(){
        System.out.println(buff);
    }
    
    @Override
    public void closeFile(){
        try {
            input.close();
        } catch (IOException ex) {
            System.out.println("Le fichier n'a pas pu etre fermé");;
        }
    }
    
}
