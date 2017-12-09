public class Piste{
  private Avion avion;
  private int nbTours;
  private int numPiste;

  public Piste(int numPiste){
    this.numPiste=numPiste;
  }

  public void ajouter(Avion avion){
    this.avion=avion;
    nbTours=0;
    System.out.println("Avion "+avion+" a attteri sur la piste "+numPiste+".");
  }

  public void tour(){
    nbTours++;
  }

  public boolean isOccupee(){
    return(this.avion==null) ? false : true;
  }

  public int getTours(){
    return nbTours;
  }

  public Avion getAvion(){
    return avion;
  }

  public String toString(){
    return ("Piste numéro "+numPiste+" contient l'avion "+avion+".Il a fait "+ nbTours+" tours.");
  }


}
