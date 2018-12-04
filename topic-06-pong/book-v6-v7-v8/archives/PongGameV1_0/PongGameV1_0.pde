//----------------------------------------------//
// Idea is based on Reas and Fry (2014) example //
//----------------------------------------------//
// The Ball class for the Pong game is written. //
// A ball object is created.  The draw() method //
// continually updates the ball's position and  //
// re-displays it.                              //
//----------------------------------------------//

Ball ball;

void setup()
{
   size(600,600);
   noCursor();
   
   //setting up the ball with hard-coded sizes.
   ball = new Ball(20.0);
}

void draw()
{
   background(0);       //Clear the background
  
   //Update the ball position and display.
   ball.update();
   ball.display();       
}
