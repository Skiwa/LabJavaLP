import java.lang.Exception;

public class EcrasementAvionException extends Exception{
	//surcharger la m�thode getMessage()
	//System.out.println(e.getMessage());
	
	public EcrasementAvionException(String message) {
        super(message);
    }
	
	public String getMessage(String message){
		//retouner le message sous la forme ("L'avion"+nom de l'avion+" s'est �cras� !")
		return message;
	}
	
}
