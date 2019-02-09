import javax.swing.*;  

int numbers[] = new int[5];             

//populate the array with user input
for (int i = 0; i < 5 ; i ++)  {    
  numbers[i] = Integer.parseInt(
    JOptionPane.showInputDialog(
      "Please enter a number ", "3"));  
}      
// print each value in reverse order 
for (int i = 4; i >= 0 ; i --)   {   
      println("Number " + (i+1) + " is: " + numbers[i]);
} 