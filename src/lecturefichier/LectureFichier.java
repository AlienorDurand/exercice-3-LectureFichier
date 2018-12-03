package lecturefichier;

public class LectureFichier {

    public static void main(String[] args) {
        
        LecteurNormal l1 = new LecteurNormal();
        LecteurReverse l2 = new LecteurReverse(); 
        
        if(l1.ouvre()){
            l1.litContenu();
            l1.affiche();
        }
        
        if(l2.ouvre()){
            l2.litContenu();
            l2.affiche();
        }
    }
    
}
