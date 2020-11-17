public class Restaurant {
    private boolean etat;
    private Point position;
    private Plat Commande;

    public Restaurant(){
        etat=True;
        position=new Point( (int)Math.random()*nbLignes , (int)Math.random()*nbColonnes) );
        Commande=plat();
    }
}
