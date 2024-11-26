public class StockManager {
    private String typeOperation;
    private String produit;
    private int quantite;
    private int stock;

    /**
     * Fonction qui permet de gérer le stock
     * 
     * @param typeOperation variable pour connaitre si c'est un ajoutbou retrait
     * @param produit variable qui précise le produit en question
     * @param quantite donne la quantite de produit
     * @param stock donne le stock de produit disponible
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {

        switch(typeOperation){
            case "ajout": ajoutStock(produit, stock);
            break;

            case "retrait": retraitStock(produit, quantite, stock);
            break;

            default: System.out.println("Opération inconnue.");
            return stock;
        }
    }

    /**
     * Fonction qui permet d'ajouter au stock
     * 
     *@param produit variable qui précise le produit en question
     *@param stock donne le stock de produit disponible
     */
    public void ajoutStock(String produit, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * Fonction qui permet de faire un retrait du stock
     * 
     *@param produit variable qui précise le produit en question
     *@param quantite donne la quantite de produit
     *@param stock donne le stock de produit disponible
     */
    public void retraitStock(String produit, int quantite, int stock){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
}
