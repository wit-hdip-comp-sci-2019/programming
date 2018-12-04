import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * This class implements a technical support system.
 * It is the top level class in this project.
 * The support system communicates via text input/output
 * in the text terminal.
 * 
 * This class uses an object of class Responder to generate responses.
 * It contains a loop that repeatedly reads input and generates
 * output until the users wants to leave.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    1.0
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }
    public static void main(String[] argvs)
    {
    	SupportSystem app = new SupportSystem();
    
    	app.startSupport();
     
    }
    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void startSupport()
    {

        printWelcome();
        HashSet<String> input = reader.getInput();
        while(!input.contains("bye")) {

                String response = responder.generateResponse(input);
                System.out.println(response);  
         
                input = reader.getInput();
        }
        printSupportGoodbye();
    }
  
 
    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem. We will assist you");
        System.out.println("with any problem you might have. Please type 'bye'");
        System.out.println("to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printSupportGoodbye()
    {
    	System.out.println("Nice talking to you. Bye...");
    }
  
  
}
