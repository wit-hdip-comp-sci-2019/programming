import javax.swing.*;  

int numbers[];
int numData = Integer.parseInt(JOptionPane.showInputDialog("How many values do you wish to sum? ", "3"));
//now, use this value to make the array this size.
numbers = new int[numData];             

int sum = 0;

for (int i = 0; i < numData ; i ++)  {    
  numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(
  "Please enter a number ", "3"));  
}      

for (int i = 0; i < numData ; i ++)   {   // now we sum the values and print each value 
     sum += numbers[i];  
      println("Number " + (i+1) + " is: " + numbers[i]);
} 

println("The sum of the values you typed in is : " + sum);