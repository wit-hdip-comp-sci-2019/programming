//----------------------------------------------//
// Idea is based on Reas and Fry (2014) example //
//----------------------------------------------//
public class Paddle
{
   private int xCoord;              // X coordinate of the paddle
   private int yCoord;              // Y coordinate of the paddle
   private int paddleWidth;         // width of the paddle 
   private int paddleHeight;        // height of the paddle
  
   public Paddle(int paddleWidth, int paddleHeight)
   {
     setPaddleWidth(paddleWidth);
     setPaddleHeight(paddleHeight);
     //the xCoordinate variable is set here and it stays this value for duration of the program.
     xCoord = width - this.paddleWidth;
     //the yCoordinate variable is set here and changes later in the program as the mouse moves on the vertical plane.
     yCoord = height/2;
  }
   
  // Change the vertical position of the paddle in line with the cursor
  public void update()
  {
    yCoord = mouseY - paddleHeight/2;
    //Reset the yCoord if it is outside the display window coordinates. 
    
    //yCoord = constrain(yCoord, 0, height - paddleHeight);
    if (yCoord < 0){
        yCoord = 0; 
    }
    if (yCoord > (height - paddleHeight)){
        yCoord = height - paddleHeight;
    }
  } 
   
  // Draw paddle to the display window
  public void display()
   {
     fill(102);
     noStroke();
     rect(xCoord, yCoord, paddleWidth, paddleHeight);
   }

   //getter methods
   public int getXCoord()
   {
      return xCoord;
   }

   public int getYCoord()
   {
      return yCoord;
   }

   public int getPaddleWidth()
   {
      return paddleWidth;
   }

   public int getPaddleHeight()
   {
      return paddleHeight;
   }
 
   //setter methods
   public void setPaddleWidth(int paddleWidth)
   {
     //The paddle width must be between 10 and width/2 (inclusive)
     if ((paddleWidth >= 20) && (paddleWidth <= width/2)){
        this.paddleWidth = paddleWidth;
     }
     else{
        // If an invalid width is passed as a parameter, a default width of 20 is imposed.
        // With this animation, if we do not supply a default value for the width, a paddle may not be 
        // drawn on the display window.  Important note: it is not always appropriate to provide a default 
        // value at mutator level; this will depend on your design.
        this.paddleWidth = 20;
     }
   }  

   public void setPaddleHeight(int paddleHeight)
   {
     //The paddle height must be between 50 and height/2 (inclusive)
     if ((paddleHeight >= 50) && (paddleHeight <= height/2)){
        this.paddleHeight = paddleHeight;
     }
     else{
        // If an invalid height is passed as a parameter, a default height of 50 is imposed.
        // With this animation, if we do not supply a default value for the height, a paddle may not be 
        // drawn on the display window.  Important note: it is not always appropriate to provide a default 
        // value at mutator level; this will depend on your design.
        this.paddleHeight = 50;
     }
   }  

}
