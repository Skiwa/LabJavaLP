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
        string+="("+i+") Occupee : "+piste[i].getAvion().toString()+"\n";
      }else{
        string+="("+i+") Libre \n";
      }
    }
    return string;
  }
}
