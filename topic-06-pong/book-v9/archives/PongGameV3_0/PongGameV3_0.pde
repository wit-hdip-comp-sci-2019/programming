//-------------------------------------------------------------------------------------------//
// Idea is based on Reas and Fry (2014) example                                              //
//-------------------------------------------------------------------------------------------//
// EXISTING FUNCIONALITY:                                                                    //
// The Ball class for the Pong game is written. A ball object is created.  The draw() method //
// continually updates the ball's position and re-displays it.                               // 
// The Paddle class is written. A paddle object is created.  The draw() method continually   //
// updates the paddle's position based on the cursor location and re-displays it.            //
// ADDED FUNCIONALITY:                                                                       //
// The collision detection method can tell if the ball has hit the paddle.                   //
//-------------------------------------------------------------------------------------------//

//Objects required in the program
Ball ball;
Paddle paddle;  

//Current game data
int livesLost = 0;             //keeps track of the number of lives lost in the current game
int score = 0;                 //high score of the current game

void setup()
{
   size(600,600);
   noCursor();
   
   //setting up the paddle and the ball with hard-coded sizes.
   paddle = new Paddle(20,100);
   ball = new Ball(20.0);
}

void draw()
{
   background(0);       //Clear the background
  
   paddle.update();     //Update the paddle location in line with the cursor
   paddle.display();    //Draw the paddle in this new location 
  
   //Update the ball position. 
   ball.update();
   //Draw the ball at its new location and check for a collision with the paddle
   ball.display();       
   //Set variable to true if ball and paddle are overlapping, false if not 
   boolean collision = hitPaddle(paddle, ball);
   if (collision == true){
      ball.hit();        //the ball is hit i.e. reverses direction.
   }
}

//method returns true if the ball and paddle overlap (i.e. ball is hit), false otherwise.
boolean hitPaddle(Paddle paddle, Ball ball)
{
   //These variables measure the magnitude of the gap between the paddle and the ball.  
   float circleDistanceX = abs(ball.getXCoord() - paddle.getXCoord());
   float circleDistanceY = abs(ball.getYCoord() - paddle.getYCoord() - paddle.getPaddleHeight()/2);
   
   //The Ball is too far away from the Paddle on the X axis to have a collision, so abandon collision detection
   if (circleDistanceX > (ball.getDiameter()/2)) {
      return false;
   }
   
   //The Ball is too far away from the Paddle on the Y axis to have a collision, so abandon collision detection
   if (circleDistanceY > (paddle.getPaddleHeight()/2 + ball.getDiameter()/2)) {
       return false; 
   }
   
   return true;
   
}