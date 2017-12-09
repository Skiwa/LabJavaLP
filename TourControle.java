//Interface
public interface TourControle{
	//Afficher l’aéroport ->liste des avions
	public String afficheCiel();
	
	//Faire atterrir un avion (supprimer du ciel)
	public void atterir(int numSerie, int numPiste);
	
	//Faire survoler les avions (passer un tour)
	public void tourCiel();
  
}