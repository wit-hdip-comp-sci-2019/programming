import javax.swing.*;  

int numbers[];
int numData = Integer.parseInt(JOptionPane.showInputDialog("How many values do you wish to sum? ", "3"));

//now, use this value to make the array this size.
numbers = new int[numData];             

for (int i = 0; i < numData ; i ++)  {    
  numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(
  "Please enter a number ", "3"));  
}      

// print out every second value 
for (int i = 0; i < numData ; i=i+2)   {   
    println("Number " + (i+1) + " is: " + numbers[i]);
} 