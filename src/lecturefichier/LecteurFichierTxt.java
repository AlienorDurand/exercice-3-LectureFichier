package lecturefichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class LecteurFichierTxt implements LecteurFichier {
    
    private ArrayList contenu = new ArrayList<>() ;
    
    /**
     * True si le fichier s'ouvre, sinon false
     * return bool
     */
    public boolean ouvre(){

        File f = new File ( "test.txt" ) ;
        return (f.exists() && f.canRead() && f.isFile());

    }
    
    /**
     * Ajoute dans mon tableau les caractères de mon fichier
     */
    public void litContenu(){
        
        FileInputStream in = null;
        // Ajouter entre les () le chemin du fichier texte que l'on veut ouvrir
        File f = new File ( "test.txt" ) ;
        
        try{
            // Ouverture du fichier
            in = new FileInputStream(f); 
            
            // Operation de lecture
            int content;
            while ((content = in.read()) != -1) {
                // convert to char and display it
                this.contenu.add((char)content);
            }
        
        // Mon IDE Netbeans ma suggéré ces différents try catch pour que mon programme fonctionne   
        }catch(FileNotFoundException exception){
             System.out.println ("Le fichier n'a pas été trouvé");
        } catch (IOException ex) {
            Logger.getLogger(LecteurFichierTxt.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(in != null){
                try {            
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(LecteurFichierTxt.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * Accesseur get de mon tableau contenu
     * @return contenu
     */
    public ArrayList getContenu() {
        return contenu;
    }

    /**
     * Accesseur set de mon tableau contenu
     * @param contenu 
     */
    public void setContenu(ArrayList contenu) {
        this.contenu = contenu;
    }
    
    
}
