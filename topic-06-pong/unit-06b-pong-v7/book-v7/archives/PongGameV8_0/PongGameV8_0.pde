//-------------------------------------------------------------------------------------------//
// Idea is based on Reas and Fry (2014) example                                              //
//-------------------------------------------------------------------------------------------//
// EXISTING FUNCIONALITY:                                                                    //
// The Ball class for the Pong game is written. A ball object is created.  The draw() method //
// continually updates the ball's position and re-displays it.                               // 
// The Paddle class is written. A paddle object is created.  The draw() method continually   //
// updates the paddle's position based on the cursor location and re-displays it.            //
// The collision detection method can tell if the ball has hit the paddle.                   //
// The number of lives lost, maximum lives per game and the score of the game is stored in   //
// The game ends when the user loses the number of lives specified.                          //
// Tournament data is stored in a variable i.e. the number of games in a tournament.         //
// If the number of games in the tournament is over, end the program.                        //
// The Player class is written.  This allows us to store the player name and the score for   //
// each game in the tournament.                                                              //
// Statistics are diplayed on the scores stored in the player class i.e. highest score,      //
// lowest score, average score.                                                              //
// ADDED FUNCIONALITY:                                                                       //
// Using JOptionPane for user input and output.                                              //
//-------------------------------------------------------------------------------------------//

import javax.swing.*;

//Objects required in the program
Ball ball;
Paddle paddle;
Player player;

//Current game data
int livesLost = 0;             //keeps track of the number of lives lost in the current game
int score = 0;                 //high score of the current game
int maxLivesPerGame = 3;       //maximum number of lives that can be lost before the game ends

//Tournament data
int maxNumberOfGames;          //maximum number of games in a tournament
int numberOfGamesPlayed = 0;   //number of games played, so far, in the tournament

void setup()
{
   size(600,600);
   noCursor();
   
   //setting up the paddle and the ball with hard-coded sizes.
   //This could be updated so that the values are read from the user at the start of the tournament.
   paddle = new Paddle(20,100);
   ball = new Ball(20.0);
   
   //create a player object with the data entered by the user 
   maxNumberOfGames = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the Pong Tournament\n\n Please enter the number of games you would like to play: ","3"));
   player = new Player(JOptionPane.showInputDialog("Enter the player name (max 6 chars: "), maxNumberOfGames);
}

void draw()
{
   background(0);       //Clear the background
  
   paddle.update();     //Update the paddle location in line with the cursor
   paddle.display();    //Draw the paddle in this new location 
  
   //Update the ball position.  If true is returned, the ball has left the display window i.e. a life is lost
   if (ball.update() == true){
       livesLost++;
   }       

   //If the player still has a life left in the current game, 
   //draw the ball at its new location and check for a collision with the paddle
   if (livesLost < maxLivesPerGame){ 
      ball.display();       
      //Set variable to true if ball and paddle are overlapping, false if not 
      boolean collision = hitPaddle(paddle, ball);
      if (collision == true){
         ball.hit();        //the ball is hit i.e. reverses direction.
         score++;           //increase the score in the current game by 1, if the player hit the ball.
      }
   } 
   //If the player has no lives left in the current game
   else{
      player.addScore(score);
      numberOfGamesPlayed++;        
      //If the player has more games left in the tournament, 
      //display their score and ask them if they want to continue with the tournament.
      if (numberOfGamesPlayed < maxNumberOfGames){
         int reply = JOptionPane.showConfirmDialog(null,
            "Game Over! You scored " + score + ".\nWould you like to play the next game in your tournament?",
            "Play next game?",
            JOptionPane.YES_NO_OPTION);
         if (reply == JOptionPane.YES_OPTION){
            //player chooses to play the next game in their tournament.
            resetGame();
         }
         else{
            //player chooses to leave the tournament early.
            tournamentOver();
         }
      }
      else{
         //the player has no more games left in the tournament 
         tournamentOver();
      }
   }
}

//method prepares for the next game by reseting the variables that store the current game information.
void resetGame()
{
     livesLost = 0;          //resets the lives lost in the current game to zero
     score = 0;              //resets the score of the current game to zero
}

//method displays the player information, high scores and statistics, before exiting the program.
void tournamentOver()
{
   JOptionPane.showMessageDialog(null, player.getPlayerName() + ", your tournament is over! \n\n"  
                                 + "Number of games played: " + numberOfGamesPlayed
                                 + "\n\n"                     + player.toString()
                                 + "\n\nHighest Score: "      + player.highestScore()
                                 +   "\nLowest Score:  "      + player.lowestScore()
                                 +   "\nAverage Score: "      + player.averageScore());
   exit();            
}


//method returns true if the ball and paddle overlap (i.e. ball is hit), false otherwise.
boolean hitPaddle(Paddle paddle, Ball ball)
{
   //These variables measure the magnitude of the gap between the paddle and the ball.  
   float circleDistanceX = abs(ball.getXCoord() - paddle.getXCoord() - paddle.getPaddleWidth()/2);
   float circleDistanceY = abs(ball.getYCoord() - paddle.getYCoord() - paddle.getPaddleHeight()/2);
   
   if (circleDistanceX > (paddle.getPaddleWidth()/2  + ball.getDiameter()/2)) { return false; }
   if (circleDistanceY > (paddle.getPaddleHeight()/2 + ball.getDiameter()/2)) { return false; }

   if (circleDistanceX <= (paddle.getPaddleWidth()/2))  { 
      return true;
   }
   if (circleDistanceY <= (paddle.getPaddleHeight()/2)) { 
      return true;
   } 
   
   float cornerDistance = pow(circleDistanceX - paddle.getPaddleWidth()/2,  2) +
                          pow(circleDistanceY - paddle.getPaddleHeight()/2, 2);
                    
   if (cornerDistance <= pow(ball.getDiameter()/2, 2)){
      return true;
   } 
   else{
      return false;
   }
}
