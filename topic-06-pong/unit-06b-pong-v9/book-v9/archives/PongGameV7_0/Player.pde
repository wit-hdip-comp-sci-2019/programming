public class Player
{
  private String playerName;
  private int[] scores;
  //no accessor and mutator is created for the count field as it is an internal field that 
  //has a dual purpose:
  //   1. represents the next available index in the array 
  //   2. represents the number of high scores added to the array
  private int count;
  
  //Constructor to create a player with a starting name and sets the size of the array
  //to the number of games in the tournament, as entered by the player.
  public Player(String playerName, int numberOfGames)
  {
     this.playerName = playerName.trim().substring(0,6);
     scores = new int[numberOfGames];
     count = 0;
  }
  
  //accessors
  public String getPlayerName()
  {
    return playerName;
  }

  public int[] getscores()
  {
    return scores;
  }
  
  //mutator for player name
  public void setPlayerName(String playerName)
  {
     this.playerName = playerName.substring(0,6);  
  }
  
  //mutator for high score array
  public void setscores(int[] scores)
  {
     this.scores = scores;
  }
   
  //method to add a score at the next available location in the scores array   
  public void addScore(int score)
  {
      if (score >= 0){
         scores[count] = score;
         count++;
      }
  } 
   
  //method returns the highest score stored in the scores array   
  //if there is only one element in the scores array, this value is returned as the highest
  public int highestScore()
  {
     int highestScore = scores[0];
     for(int i = 1; i < count; i++){
         if (scores[i] > highestScore){
            highestScore = scores[i];
         }        
     }   
     return highestScore;
  }

  //method returns the lowest score stored in the scores array   
  //if there is only one element in the scores array, this value is returned as the lowest
  public int lowestScore()
  {
     int lowestScore = scores[0] ;
     for(int i = 1; i < count; i++){
         if (scores[i] < lowestScore){
            lowestScore = scores[i];
         }        
     }   
     return lowestScore;
  }

  //method calculates and returns the average of all the high scores stored in the scores array   
  public int averageScore()
  {
     int total = 0;
     for(int i = 0; i < count; i++){
        total = total +  scores[i];        
     }   
     return total / count;
  }
  
  //method builds a nice String representation of the player name and their high scores.
  //This string is then returned
  public String toString()
  {
     String str = "Scores for " + playerName + "\n";
     
     for(int i = 0; i < count; i++){
        str = str + "     Score " + (i+1) + ": " + scores[i] + "\n"; 
     }   
     return str;  
  } 

}

