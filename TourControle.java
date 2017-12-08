//Interface
public interface TourControle{
	//Afficher l’aéroport ou Ciel ?->liste des avions
	
	//Faire atterrir un avion (supprimer du ciel)
	public void atterir(int numSerie, int numPiste);
	
	//Faire survoler les avions (passer un tour)
	public void survoler();
  
}