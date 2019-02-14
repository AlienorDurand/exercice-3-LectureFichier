package lecturefichier;

public class LectureFichier {

    public static void main(String[] args) {
        
        // --------------------------------------- A LIRE AVANT DE LANCER LE PROGRAMME ---------------------------/
        //
        // N'oubliez pas d'indiquer où se trouve le fichier que vous voulez ouvrir dans la classe abstraire LecteurFichierTxt.java
        // Je ne fournis pas le fichier .txt car nous avions eu pour consigne de ne pas le mettre à la racine du projet
        // Merci
        //
        
        
        // On instancie nos objets
        LecteurNormal l1 = new LecteurNormal(); // = Normal
        LecteurReverse l2 = new LecteurReverse(); // = Palindrome
        LectureReverseRow l3 = new LectureReverseRow(); // = Ligne inversé
        
        // ------------------------------------- TEST 1 ------------------------- // 
        // Si notre fichier s'ouvre
        if(l1.ouvre()){
            // On donne à notre objet le contenu du fichier
            l1.litContenu();
            // On affiche une chaine de caractère (elle contient le contenu du fichier)
            l1.affiche();
        }else{
            // Debug, le fichier ne s'ouvre pas
            System.out.print("Ca marche pas");
        }
        System.out.println("");
        
        // ---------------------------------- TEST 2 ----------------------------- //
        // Si notre fichier s'ouvre
        if(l2.ouvre()){
            // On donne à notre objet le contenu du fichier
            l2.litContenu();
            // On affiche une chaine de caractère (elle contient le contenu du fichier à l'envers = Palindrome)
            l2.affiche();
        }else{
            // Debug, le fichier ne s'ouvre pas
            System.out.print("Ca marche pas");
        }
        
        System.out.println("");
        // ---------------------------------- TEST 3 ----------------------------- //
        // Si notre fichier s'ouvre
        if(l3.ouvre()){
            // On donne à notre objet le contenu du fichier
            l3.litContenu();
            // On affiche une chaine de caractère (elle contient le contenu du fichier à l'envers = Palindrome)
            l3.affiche();
        }else{
            // Debug, le fichier ne s'ouvre pas
            System.out.print("Ca marche pas");
        }
        
    }
    
}
