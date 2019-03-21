import java.util.ArrayList;

/**
 * This is a Library class maintains a collection of DVD objects.
 *
 * @version (16th Feb 2018)
 */
public class Library {

    private ArrayList<DVD> dvds;

    public Library()
    {
        dvds = new ArrayList<DVD>();
    }

    /**
     * Add a DVD object to the collection of DVDs
     *
     * @param dvd  DVD to be added to the collection
     */
    public void add(DVD dvd)
    {
        dvds.add(dvd);
    }

    /**
     * listDVDs() - This method prints the index number and the title of each
     * element in the dvds ArrayList to the console.
     *
     * @return the list of dvds (along with the index number).  If the collection is empty, returns "No DVDs."
     */
    public String listDVDs()
    {
        if (dvds.size() == 0)
        {
            return "No DVDs.";
        }
        else
        {
            String listDVDs = "";
            for (int i = 0; i < dvds.size(); i++)
            {
                listDVDs = listDVDs + (i + ":" + dvds.get(i)) + "\n";
            }
            return listDVDs;
        }

    }



}
