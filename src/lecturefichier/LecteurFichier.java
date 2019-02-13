package lecturefichier;

public interface LecteurFichier {
    
    // Verifie si un fichier peut s'ouvrir TRUE/FALSE
    public boolean ouvre();
    // Retourne le contenu du fichier
    public void litContenu();
    // Affiche le contenu du fichier
    public void affiche();
    
}
