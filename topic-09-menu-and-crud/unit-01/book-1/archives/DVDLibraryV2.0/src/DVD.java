/**
 * This is a DVD class that stores and maintains the title of a DVD
 *
 * @version (16th Feb 2018)
 */

public class DVD {

    private String title;

    //Default, empty constructor
    public DVD()
    {
    }

    //Constructor with one parameter, title
    public DVD(String title){
        this.title = title;
    }

    /**
     * getTitle() - This mutator method returns the title of the DVD.
     *
     * @return     the title of the DVD entered by the user
     */
    public String getTitle(){
        return title;
    }

    /**
     * setTitle() - This mutator method sets the title of the DVD to
     * the value passed.
     *
     * @param  title   the new title of the DVD
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * toString() - This method prints the title of the DVD.
     *
     * @return     the title of the DVD entered by the user
     */
    public String toString()
    {
        return "DVD Title: " + title;
    }

}
