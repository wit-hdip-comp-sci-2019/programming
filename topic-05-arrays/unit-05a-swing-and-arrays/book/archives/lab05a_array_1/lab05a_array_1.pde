import javax.swing.*;  

int number = 0;
int sum = 0;

for (int i = 0; i<5; i++)  {    
   number = Integer.parseInt(JOptionPane.showInputDialog(
             "Please enter a number ", "3")
             );    
   sum += number;  
}

println("The sum of the values you typed in is : " +   sum);