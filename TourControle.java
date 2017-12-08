//Interface
public interface TourControle{
	//Afficher l’aéroport ou Ciel ?->liste des avions
	public String afficheCiel();
	
	//Faire atterrir un avion (supprimer du ciel)
	public void supprAvion(int numeroSerie);
	
	//Faire survoler les avions (passer un tour)
	public void tourCiel();
  
}