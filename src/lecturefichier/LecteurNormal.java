package lecturefichier;

public class LecteurNormal extends LecteurFichierTxt{

    // Cette classe affiche le contenu d'un fichier à l'endroit
    public void affiche() {
        
        // On crée un variable string vide
        String chaine ="";
        
        // On boucle sur chaque caractère d'un fichier que l'on nous donne
        for(int i=0; i<this.getContenu().size(); i++){
            // on ajoute chaque caractère dans une chaine de caractère, en partant du début
            chaine = chaine+""+(this.getContenu().get(i));
        }
        
        // On affiche la chaine
        System.out.println("voici le fichier à l'endroit : "+chaine);
    }
    
}
