import java.lang.Exception;

public class EcrasementAvionException extends Exception{
	//surcharger la m�thode getMessage()
	//System.out.println(e.getMessage());
	

	public EcrasementAvionException(String message) {
        super(message);
    }
	
//	public void getMessage(Avion avionCrash) throws EcrasementAvionException{
//		//retouner le message sous la forme ("L'avion"+nom de l'avion+" s'est �cras� !")
//		throw new EcrasementAvionException("L'avion n� "+avionCrash.getNumSerie()+" s'est �cras� !");
//	}
	
}
