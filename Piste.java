//Contient 0 à 1 avion
//Contient les méthodes atterir() et ajouter()

public class Piste{
  private Avion avion;
  private int nbToursRestants;
  private int numPiste;

  public Piste(int numPiste){
    this.numPiste=numPiste;
  }

  public void ajouter(Avion avion){
    this.avion=avion;
    nbToursRestants=5;
    System.out.println("Avion "+avion+" a attteri sur la piste "+numPiste+".");
  }

  public void tour(){
    nbToursRestants--;
    if(nbToursRestants==0){
      System.out.println("Avion "+avion+" a fait tous les tours necessaires.");
    }else{
      System.out.println("Il reste "+nbToursRestants+" tours pour l'avion "+avion);
    }
  }

  //retourne vrai si un avion est sur la piste
  public boolean isOccupee(){
    return(this.avion==null) ? false : true;
  }

  public int getToursRestants(){
    return nbToursRestants;
  }

  public Avion getAvion(){
    return avion;
  }

  public String toString(){
    return ("Piste numéro "+numPiste+" contient l'avion "+avion+".Il doit faire "+ nbToursRestants+" tours.");
  }


}
