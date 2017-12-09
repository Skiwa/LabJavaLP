import java.util.Scanner;

public class Controleur{

  public static void main(String args[]) throws EcrasementAvionException{
    Scanner sc=new Scanner(System.in);
    String input=new String();
    String inputSerie=new String();
    String inputPiste=new String();

    //création de l'aéroport et des pistes
    Aeroport aeroport=new Aeroport();

    //création du thread Ciel
    new Ciel().start();
    //besoin d'une légère pause après le lancement du thread
    try{Thread.sleep(10);}catch(InterruptedException e){}


    while(true){
      System.out.println("***************************************************");
      System.out.println("Avions en survol :");
      System.out.println(Ciel.afficheCiel());
      System.out.println("Etat des pistes");
      System.out.println(aeroport.toString());
      System.out.println("***************************************************");
      System.out.println();
      System.out.println("***************************************************");
      System.out.println("1) Faire survoler les avions");
      System.out.println("2) Faire atterir un avion");
      System.out.println("0) Fin de la journee de travail!");
      System.out.println("***************************************************");
      System.out.println("Votre choix?");

      //Saisie utilisateur
      input=sc.next();
      switch(input){
        case "1":
        	survoler(aeroport);
        break;
        case "2":
          System.out.println("Entrer le noSerie de l'avion :");
          inputSerie=sc.next();
          System.out.println("Entrer le no de la piste :");
          inputPiste=sc.next();
          
          atterir(Integer.parseInt(inputSerie),Integer.parseInt(inputPiste),aeroport);

        break;
        case "0":
        	System.out.println("J'ai fini ma journ�e! Au revoir");
        	System.exit(0);
        break;
      }
    }
    //
  }

  public static void survoler(Aeroport aeroport) throws EcrasementAvionException{

  //Fait consommer de l'essence à tous les avions et lance une exception si essence=0
    Ciel.tourCiel();
    //Fait avancer tous les avions sur les pistes
    aeroport.tourPistes();

    //Fait survoler tous les avions
    //Si un avion a plus d'essence, il s'ecrase (lancement exception)
    //Chaque avion atteri sur une piste avance d'un tour
    //Si l'avion est là depuis 5 tours, la piste se libère et avion éliminé
    //exception avion �limin�
    //throw new EcrasementAvionException("L'avion n� "+aeroport.getPiste(numPiste).getAvion().getNumSerie()+" sur la piste "+numPiste+" est �limin�");
	  

    //TODO:
    //-Leur enlever 1 d'essence avec .consommeEssence()
    //-Ecrasement de l'avion si plus d'essence, verification avec .getEssence()
    //-Pour chaque piste, faire avancer l'avion d'un tour avec piste[i].tour()
  }

  public static void atterir(int numSerie, int numPiste, Aeroport aeroport) throws EcrasementAvionException{
	  
	  if (aeroport.getPiste(numPiste).isOccupee())
		  throw new EcrasementAvionException("L'avion n� "+Ciel.getAvion(numSerie).getNumSerie()+" s'est �cras� sur l'avion n�"+aeroport.getPiste(numPiste).getAvion().getNumSerie()+" sur la piste "+numPiste);
	  
	  //ajoute à une piste un avion récupéré du ciel
      aeroport.getPiste(numPiste).ajouter(Ciel.getAvion(numSerie));
      //supprime l'avion du ciel
      Ciel.supprAvion(numSerie);
      
    //TODO:
    //-Vérifier avec numPiste.isOccupee() si la piste est occupée
    //-Si oui, écrasement de l'avion
    //-Si non, retirer l'avion du ciel avec .supprCiel(numSerie)
            // ajouter l'avion avec numPiste.ajouter(numSerie)
            // lancement de survoler()
  }

}
