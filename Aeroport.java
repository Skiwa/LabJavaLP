//Classe principale
//L'aéroport contient 3 pistes et tous les avions qui survolent
public class Aeroport{
  static private Piste[] piste=new Piste[3];

  public Aeroport(){
    //Creation des pistes
    for (int i=0;i<3;i++){
      piste[i]=new Piste(i);
    }
  }

  public String toString(){
    String string=new String();
    for (int i=0;i<3;i++){
      if (piste[i].isOccupee()){
        string+="("+i+") Occupee : "+piste[i].getAvion().toString()+" ("+piste[i].getTours()+"/5 tours)\n";
      }else{
        string+="("+i+") Libre \n";
      }
    }
    return string;
  }

  public Piste getPiste(int numPiste){
    return piste[numPiste];
  }

  public void tourPistes(){
    for (int i=0;i<3;i++){
      if(piste[i].isOccupee())
        piste[i].tour();
    }
  }
}
