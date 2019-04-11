import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words, and a set of words 
 * is provided.
 * 
 * @author     Michael Kolling and David J. Barnes 
 * @version    2.0 (adapted for Eclipse and Scanner by MM, SD)
 */
public class InputReader
{
    Scanner input;
    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
     input = new Scanner(System.in); 
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()    
    {
    	System.out.print("> ");                // print prompt
        String inputLine = input.nextLine().trim().toLowerCase(); 
        return inputLine;
    }
}
