package lecturefichier;

public class LecteurReverse extends LecteurFichierTxt {
    
    // Cette classe affiche le contenu d'un fichier à l'envers
    public void affiche() { 
        
        // On crée un variable string vide
        String chaine ="";
        
        // On boucle sur chaque caractère d'un fichier que l'on nous donne
        for(int i=this.getContenu().size(); i!=0;i--){
            // on ajoute chaque caractère dans une chaine de caractère, en partant de la fin
            chaine = chaine+""+(this.getContenu().get(i-1));
        }
        
        // On affiche la chaine
        System.out.println("voici le fichier à l'envers : "+chaine);
        
    }
}
