package lecturefichier;

import java.util.ArrayList;

abstract class LecteurFichierTxt implements LecteurFichier{
    
    private ArrayList contenu = new ArrayList<>() ;
    
    public boolean ouvre(){
        return true;
    }
    public void litContenu(){
        
    }
}
