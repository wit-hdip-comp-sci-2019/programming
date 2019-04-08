
public class Test {

	public static void main(String args[])
	{
		// Create 2 MessagePost objects.
		MessagePost messagePost1 = new MessagePost("Mary", "Hi there.");
		MessagePost messagePost2 = new MessagePost("John", "I'm on my way.");
		   
	    // Create 2 PhotoPosts objects.
		PhotoPost photoPost1 = new PhotoPost("Larry", "img1.jpg", "First day in college");
		PhotoPost photoPost2 = new PhotoPost("Moe", "img2.jpg", "Graduation day");
		
	    // Create 1 NewsFeed object.
		NewsFeed newsFeed = new NewsFeed();
		
		// Add 1 PhotoPost object to the NewsFeed object.
		newsFeed.addPost(photoPost1);
		
	    // Add 1 MessagePost object to the NewsFeed object.
		newsFeed.addPost(messagePost1);
		
	    // Add another PhotoPost object to the NewsFeed object.
		newsFeed.addPost(photoPost2);
		
		// Add another MessagePost object to the NewsFeed object.
		newsFeed.addPost(messagePost2);
		
		// List all messagePost and photoPosts from the NewsFeed object.
		newsFeed.show();
	}
}
