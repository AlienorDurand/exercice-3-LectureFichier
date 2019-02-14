package lecturefichier;
import java.util.ArrayList;

public class LectureReverseRow extends LecteurFichierTxt {
    

    // On crée un tableau contenant nos lignes
    private ArrayList row = new ArrayList<>() ;
    
    // Cette classe affiche le contenu d'un fichier avec les lignes à l'envers
    public void affiche() {
           
       // On crée un variable string vide
        String chaine = "";
        String newChaine = "";
        
        // On boucle sur chaque caractère d'un fichier que l'on nous donne
        for(int i=0; i<this.getContenu().size(); i++){

            // on ajoute chaque caractère dans une chaine de caractère, en partant du début
            chaine = chaine+""+(this.getContenu().get(i));
            //System.out.print(this.getContenu().get(i));
            if(this.getContenu().get(i).equals('\n')){
                this.row.add(chaine);
                chaine = "";
            }
        }
        this.row.add(chaine);
        System.out.print("voici le fichier avec les lignes à l'envers : ");
        // On boucle sur le tableau pour affiche
        for(int j=this.row.size()-1; j>=0;j--){
            newChaine = newChaine+""+(this.row.get(j));
            System.out.print(this.row.get(j)+" ");
        }  
    }   
}
