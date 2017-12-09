import java.lang.Exception;

public class EcrasementAvionException extends Exception{
	//surcharger la méthode getMessage()
	//System.out.println(e.getMessage());
	

	public EcrasementAvionException(String message) {
        super(message);
    }
	
//	public void getMessage(Avion avionCrash) throws EcrasementAvionException{
//		//retouner le message sous la forme ("L'avion"+nom de l'avion+" s'est écrasé !")
//		throw new EcrasementAvionException("L'avion n° "+avionCrash.getNumSerie()+" s'est écrasé !");
//	}
	
}
