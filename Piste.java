//Contient 0 à 1 avion
//Contient les méthodes atterir() et ajouter()

public class Piste{
  private int avion;  //contient la ref de l'avion ou NULL
  private int nbTour;
  private int numPiste;

  public Piste(int numPiste){
    this.numPiste=numPiste;
    System.out.println("Piste "+numPiste+" initialisee");
  }

  public void ajouter(int avion){
    this.avion=avion;
  }

  public void atterir(int avion){

  }

  public void tour(){
    nbTour++;
    if(nbTour==5){
      //TODO:envoyer un avion au hangar
      nbTour=0;
    }
  }


}
