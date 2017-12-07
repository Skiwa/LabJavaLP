//Contient 0 à 1 avion
//Contient les méthodes atterir() et ajouter()

public class Piste{
  private int avion=0;  //contient la ref de l'avion ou 0
  private int nbToursRestants;
  private int numPiste;

  public Piste(int numPiste){
    this.numPiste=numPiste;
  }

  public void ajouter(int avion){
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
    return(this.avion==0) ? false : true;
  }

  public int getToursRestants(){
    return nbToursRestants;
  }
  public String toString(){
    return ("Piste numéro "+numPiste+" contient l'avion "+avion+".Il doit faire "+ nbToursRestants+" tours.");
  }


}
