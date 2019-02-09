import javax.swing.*;  

int numbers[] = new int[5];             
int sum = 0;

for (int i = 0; i < 5 ; i ++)  {    
  numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(
  "Please enter a number ", "3"));  
}      

for (int i = 0; i < 5 ; i ++)   {   // now we sum the values and print each value 
     sum += numbers[i];  
      println("Number " + (i+1) + " is: " + numbers[i]);
} 

 println("The sum of the values you typed in is : " + sum);