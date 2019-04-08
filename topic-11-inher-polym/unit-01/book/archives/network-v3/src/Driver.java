import java.util.Scanner;

public class Driver
{
    private Scanner sc = new Scanner(System.in);
    private NewsFeed newsFeed = new NewsFeed();
    
    public static void main(String[] args) 
    {
        Driver app = new Driver();
        app.run();
    }
    
    private int mainMenu()
    {
      System.out.println("1) Add a Message Post");
      System.out.println("2) Add a Photo Post");       
      System.out.println("3) List all Posts");
      System.out.println("0) Exit");
      System.out.print("==>>");
      int option = sc.nextInt();
      return option;
    }
     
    private void run() {
        {
           System.out.println("Posts");
           int option = mainMenu();
           while (option != 0)
           {
            
             switch (option)
             {
               case 1:               
                 addMessagePost();
                 break;
               case 2:
                 addPhotoPost();
                 break;
               case 3:
                 showPosts();
                 break;
                }
            
             option = mainMenu();
           }
           System.out.println("Exiting... bye");
        }
    }
   
    private void addMessagePost()
    {
        //create a message object:
        System.out.println("Please enter the author's name: ");
        sc.nextLine();
        String author = sc.nextLine();
        System.out.println("Please enter the message: ");
        String message = sc.nextLine();
                
        newsFeed.addPost(new MessagePost(author, message));
    }

    private void addPhotoPost()
    {
        //create a photoPost object:
        System.out.println("Please enter the author's name: ");
        sc.nextLine();
        String author = sc.nextLine();   
        System.out.println("Please enter the filename of the photo: ");
        String fileName = sc.nextLine();
        System.out.println("Please enter a caption for the photo: ");
        String caption = sc.nextLine();

        newsFeed.addPost(new PhotoPost( author,  fileName,  caption));
    }

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    private void showPosts()
    {
        System.out.println(newsFeed.show());
    }
}
