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
      System.out.println();
      System.out.println("-- Charles Anne-Laure et Haegman Julien --");
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
        	System.out.println("J'ai fini ma journee! Au revoir");
        	System.exit(0);
        break;
      }
    }
  }

  public static void survoler(Aeroport aeroport) throws EcrasementAvionException{

    //Fait consommer de l'essence à tous les avions et lance une exception si essence=0
    Ciel.tourCiel();
    //Fait avancer tous les avions sur les pistes
    aeroport.tourPistes();

  }

  public static void atterir(int numSerie, int numPiste, Aeroport aeroport) throws EcrasementAvionException{

	  if (aeroport.getPiste(numPiste).isOccupee())
		  throw new EcrasementAvionException("L'avion n "+Ciel.getAvion(numSerie).getNumSerie()+" s'est ecrase sur l'avion n "+aeroport.getPiste(numPiste).getAvion().getNumSerie()+" sur la piste "+numPiste);

	    //ajoute à une piste un avion récupéré du ciel
      aeroport.getPiste(numPiste).ajouter(Ciel.getAvion(numSerie));
      //supprime l'avion du ciel
      Ciel.supprAvion(numSerie);

  }

}
