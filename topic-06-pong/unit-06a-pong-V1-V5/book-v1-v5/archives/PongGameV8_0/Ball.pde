//----------------------------------------------//
// Idea is based on Reas and Fry (2014) example //
//----------------------------------------------//
public class Ball
{
   private float xCoord;     //x coordinate of the ball
   private float yCoord;     //y coordinate of the ball
   private float diameter;   //diameter of the ball
   private float speedX;     //speed along the x-axis
   private float speedY;     //speed along the y-axis
   
   //Constructor to set up the ball and its diameter
   public Ball(float diameter)
   {
      setDiameter(diameter);
      resetBall();
   }
   
   //Change ball position.  Returns true if the ball goes off the screen (i.e. life lost)
   public boolean update()
   {
      boolean lifeLost = false;
      //update ball coordinates
      xCoord = xCoord + speedX;
      yCoord = yCoord + speedY;
       
      //reset position if the ball leaves the screen
      if (xCoord > width + diameter/2){
         resetBall();
         lifeLost = true;
      }
       
      //If ball hits the left edge of the display window, change direction of xCoord
      if (xCoord < diameter/2){
         xCoord = diameter/2;
         speedX = speedX * -1;
      }
       
      //If ball hits the top or bottom of the display window, change direction of yCoord
      if (yCoord > height - diameter/2){
         yCoord = height - diameter/2;
         speedY = speedY * -1;
      } 
      else if (yCoord < diameter/2){
         yCoord = diameter/2;
         speedY = speedY * -1;
      }
      return lifeLost;
   }       
   
   //Draw the ball on the display window
   public void display()
   {
      fill(255);
      noStroke();
      ellipse(xCoord, yCoord, diameter, diameter);
   }

   // Change the ball direction when it hits the paddle
   // and bump it back to the edge of the paddle       
   public void hit()
   {
      speedX = speedX * -1;
      xCoord = xCoord + speedX;
   }
 
   //getter methods
   public float getXCoord()
   {
      return xCoord;
   }  

   public float getYCoord()
   {
      return yCoord;
   }  

   public float getDiameter()
   {
      return diameter;
   }  

   //setter methods
   public void setDiameter(float diameter)
   {
     //The ball diameter must be between 20 and height/6 (inclusive)
     if ((diameter >= 20) && (diameter <= height/6)){
        this.diameter = diameter;
     }
     else {
        // If an invalid diameter is passed as a parameter, a default of 20 is imposed.
        // With this animation, if we do not supply a default value for the diameter, a ball may not be 
        // drawn on the display window.  Important note: it is not always appropriate to provide a default 
        // value at mutator level; this will depend on your design.
        this.diameter = 20;
     }
   }
   
   //private helper method
   private void resetBall()
   {
      xCoord = 0;
      yCoord = random(height);
      speedX = random(3, 5);   
      speedY = random(-2, 2);
   }
   
}