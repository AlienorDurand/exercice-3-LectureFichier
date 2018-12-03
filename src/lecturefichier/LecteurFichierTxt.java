package lecturefichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;

abstract class LecteurFichierTxt implements LecteurFichier {
    
    private ArrayList contenu = new ArrayList<>() ;
    
    // True si le fichier s'ouvre, sinon false
    public boolean ouvre(){
        
        FileInputStream in = null;
        boolean res;
        
        File f = new File ( "test.txt" ) ;
        
        try{
            in = new FileInputStream(f);
            res = true;
        }
        catch(FileNotFoundException exception){
           res = false;
        }
        finally{
            if(in != null){
                in.close();            
            }
        }
        return res;
    }
    
    
    public void litContenu(){
        
        FileInputStream in = null;
        File f = new File ( "test.txt" ) ;
        
        try{
            //ouverture d'un fichier
            in = new FileInputStream(f); 
            
            //Operation de lecture
            int content;
            while ((content = in.read()) != -1) {
                // convert to char and display it
                this.contenu.add((char)content);
            }
            
        }catch(FileNotFoundException exception){
             System.out.println ("Le fichier n'a pas été trouvé");
        }finally{
            if(in != null){
                in.close();            
            }
        }
    }

    public ArrayList getContenu() {
        return contenu;
    }

    public void setContenu(ArrayList contenu) {
        this.contenu = contenu;
    }
    
    
}
