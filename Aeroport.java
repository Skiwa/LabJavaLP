//Classe principale
//L'aéroport contient 3 pistes et tous les avions qui survolent
public class Aeroport{
  static private Piste[] pistes=new Piste[3];

  public static void main(String args[]){

    System.out.println("** -- -- INITIALISATION -- -- **");
    for (int i=0;i<3;i++){
      pistes[i]=new Piste(i);
    }

  }
}
