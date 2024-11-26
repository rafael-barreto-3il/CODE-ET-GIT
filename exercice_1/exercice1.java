public class FactureManager {
    private String typeProduit;
    private int quantite;
    private double prixUnitaire;

    /**
     * Fonction qui permet de calculer le total de la facture
     * 
     *@param typeProduit : permet d'avoir le type du produit
     *@param quantite : permet d'obtenir la quantite du produit
     *@param prixUnitaire : correspond au prix du produit à l'unité
     *@return retourne le total après application des réductions sur le produit
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        switch(typeProduit){
            case "Alimentaire": total -= total * 0.05; // Réduction de 5%
            break;
            case "Electronique": total -= total * 0.1; // Réduction de 10%
            break;
            case "Luxe": total -= total * 0.15; // Réduction de 15%
            break;
        }

        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
}
