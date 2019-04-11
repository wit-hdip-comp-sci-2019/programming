/**
 * This class implements a technical support system. It is the top 
 * level class in this  project. The support system communicates via
 * text input/output in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from
 * the user, and an object of class Responder to generate responses. 
 * It contains a loop that repeatedly reads input and generates output
 * until the user wants to leave.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.2
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
    	app.start();
    }
    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void start()
    {
        printWelcome();
        String input = reader.getInput();
        while(!input.startsWith("bye")) {
            String response = responder.generateResponse();
            System.out.println(response);
            
            input = reader.getInput();
        }
        printGoodbye();
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
    private void printGoodbye()
    {
    	System.out.println("Nice talking to you. Bye...");
    }
}
