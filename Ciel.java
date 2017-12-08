import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Ciel extends Thread{
    private int lieuAtterrisage;
    private static Map<Integer,Avion> avionsCiel = new HashMap<Integer, Avion>();

    public Ciel(){
      super("Ciel");
    }

    @Override
    public void run(){
      try{
        while(true){
          //Génération aléatoire de l'essence, du num de série et du type
          int quantiteEssence=(int) Math.floor(Math.random() * 10)+1;
          int numeroSerie=(int) Math.floor(Math.random() * 10000)+1;
          int typeAvion=(int) Math.floor(Math.random() * 3) +1;

          //Crée un avion A, B ou C, l'ajoute à la liste et affiche ses propriétés
          if(typeAvion==1){
            AvionTypeA avion=new AvionTypeA(quantiteEssence,numeroSerie);
            avionsCiel.put(numeroSerie,avion);
            // System.out.println(avion.toString());
          }else if(typeAvion==2){
            AvionTypeB avion=new AvionTypeB(quantiteEssence,numeroSerie);
            avionsCiel.put(numeroSerie,avion);
            // System.out.println(avion.toString());
          }else{
            AvionTypeC avion=new AvionTypeC(quantiteEssence,numeroSerie);
            avionsCiel.put(numeroSerie,avion);
            // System.out.println(avion.toString());
          }
          //Pause entre chaque génération
          int sleep=(int) Math.floor(Math.random() * 5000);
          Thread.sleep(sleep);

        }
      }catch(InterruptedException e){}

    }

    //Supprime un avion du ciel avec son numero de série
    public void supprCiel(int numeroSerie){
        avionsCiel.remove(numeroSerie);
        for (Integer mapKey : avionsCiel.keySet()) {
        	avionsCiel.get(mapKey).consommeEssence();
        }
    }

    //Fait consommer a tous les avions dans le ciel une unité d'essence
    public static void tourCiel(){
        System.out.println("tourCiel");
    }

    //Renvoie la liste des avions dans le ciel
    public static String afficheCiel(){
      String string=new String();
      for (Integer mapKey : avionsCiel.keySet()) {
      	string+=avionsCiel.get(mapKey).toString();
        string+="\n";
      }
      return string;
    }

    //Nombre d'avions dans le ciel
    public static int nbCiel(){
      return avionsCiel.size();
    }

}
