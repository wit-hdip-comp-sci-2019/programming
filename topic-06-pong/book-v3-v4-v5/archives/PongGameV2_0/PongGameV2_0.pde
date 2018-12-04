//----------------------------------------------//
// Idea is based on Reas and Fry (2014) example //
//----------------------------------------------//
// EXISTING FUNCIONALITY:                       //
// The Ball class for the Pong game is written. //
// A ball object is created.  The draw() method //
// continually updates the ball's position and  //
// re-displays it.                              //
//                                              //
// ADDED FUNCIONALITY:                          //
// The Paddle class is written.                 //
// A paddle object is created.  The draw()      //
// method continually updates the paddle's      //
// position based on the cursor location and    //
// re-displays it.                              //
//----------------------------------------------//

//Objects required in the program
Ball ball;
Paddle paddle;

void setup()
{
   size(600,600);
   noCursor();
   
   //setting up the paddle and the ball with hard-coded sizes.
   //This could be updated so that the values are read from the user at the start of the tournament.
   paddle = new Paddle(20,100);
   ball = new Ball(20.0);
}

void draw()
{
   background(0);       //Clear the background
  
   paddle.update();     //Update the paddle location in line with the cursor
   paddle.display();    //Draw the paddle in this new location 
  
   //Update the ball position and display.
   ball.update();
   ball.display();  
}
