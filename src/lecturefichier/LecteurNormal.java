package lecturefichier;

public class LecteurNormal extends LecteurFichierTxt{

    public void affiche() {
        for(int i=0; i<this.getContenu().size(); i++){
            System.out.print(this.getContenu().get(i));
        }
    }
    
}
