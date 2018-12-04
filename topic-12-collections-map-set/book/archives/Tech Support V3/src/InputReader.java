import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words, and a set of words 
 * is provided.
 * 
 * @author     Michael Kolling and David J. Barnes, 
 * @version    2.0 (adapted for Eclipse and StdLib)
 */
public class InputReader
{
    Scanner input;

    /**
     * Create a new InputReader 
     */
    public InputReader()
    {
      input = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a set of words.
     *
     * @return  A set of Strings, where each String is one of the 
     *          words typed by the user
     */
    public HashSet<String> getInput() 
    {
        System.out.print("> ");                // print prompt
        String inputLine = input.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split(" ");  // split at spaces

        // add words from array into hashset 
        HashSet<String> words = new HashSet<String>();
        for(String word : wordArray) {
            words.add(word);
        }
        return words;
    }
}
