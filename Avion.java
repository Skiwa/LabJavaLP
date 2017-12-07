public abstract class Avion{
  private int quantiteEssence;
  private int typeAvion;
  private int numeroSerie;


  public Avion(int quantiteEssence,int typeAvion,int numeroSerie){
    this.quantiteEssence=quantiteEssence;
    this.typeAvion=typeAvion;
    this.numeroSerie=numeroSerie;
  }

  public void consommeEssence(){
    quantiteEssence--;
  }

  public int getEssence(){
    return quantiteEssence;
  }

  public int getNumSerie(){
    return numeroSerie;
  }

  public String toString(){
    return ("Avion de type "+typeAvion+ ", numero de serie: "+numeroSerie+", essence : "+quantiteEssence);
  }
}
