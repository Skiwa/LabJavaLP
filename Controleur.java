//Seulement 3 actions possible
public class Controleur{

//Liste de tous les avions existants

  public static void main(String args[]){

    //Fait atterir des avions sur chaque piste (test)
    atterir(1,0);
    atterir(2,1);
    atterir(3,2);

    new Ciel().start();

  }

  public static void survoler(){
    //Fait survoler tous les avions
    //Si un avion a plus d'essence, il s'ecrase (lancement exception)
    //Chaque avion atteri sur une piste avance d'un tour
    //Si l'avion est là depuis 5 tours, la piste se libère et avion éliminé

    //TODO:
    //-Récupérer la liste de tous les avions dans le ciel
    //-Leur enlever 1 d'essence avec .consommeEssence()
    //-Ecrasement de l'avion si plus d'essence, verification avec .getEssence()
    //-Pour chaque piste, faire avancer l'avion d'un tour avec piste[i].tour()
  }

  public static void atterir(int numSerie, int numPiste){

    //TODO:
    //-Vérifier avec numPiste.isOccupee() si la piste est occupée
    //-Si oui, écrasement de l'avion
    //-Si non, retirer l'avion du ciel avec .supprCiel(numSerie)
            // ajouter l'avion avec numPiste.ajouter(numSerie)
            // lancement de survoler()
  }

}
