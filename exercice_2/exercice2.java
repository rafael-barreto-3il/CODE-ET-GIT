public class GestionnaireNotes {
    private String nomEtudiant;
    private int notes[];

    /**
     * Fonction qui permet d'afficher la note et la moyenne
     * 
     * @param nomEtudiant donne le nom de l'étudiant
     * @param notes est un tableau de notes de l'élève
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        affichageNotes(notes);

        somme(notes);

        affichageMoyenne(somme, notes);
    }

    /**
     * Fonction qui permet d'afficher les notes
     * 
     *@param notes récupère les notes du tableau
     */
    public void affichageNotes(int[] notes){
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }


    /**
     * Fonction qui permet de calculer la somme des notes
     * 
     * @param somme variable qui additionne toutes les notes
     * @param notes récupère le tableau de notes
     * @return somme, represente la somme des notes
     */
    public int somme(int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        return somme;
    }


    /**
     * Fonction qui permet de calculer la moyenne des notes
     * 
     * @param somme variable qui récupère l'addition de toutes les notes
     * @param notes récupère la tableau de notes
     */
    public void affichageMoyenne(int somme, int[] notes){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
