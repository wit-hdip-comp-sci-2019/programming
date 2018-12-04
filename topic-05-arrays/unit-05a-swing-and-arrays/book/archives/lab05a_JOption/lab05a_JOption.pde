import javax.swing.JOptionPane;

JOptionPane.showMessageDialog(null, 
  "Welcome to the 12 days of Christmas");

JOptionPane.showMessageDialog(null, 
  "Welcome to the 12 days of Christmas",
      "Christmas Title",
      JOptionPane.PLAIN_MESSAGE);

String day = JOptionPane.showInputDialog(
        "Welcome to Christmas week\n\n " + "Please enter the day: ",
        "Monday");
println("Day is : " + day);

int num = Integer.parseInt(
      JOptionPane.showInputDialog("Enter a number between 0 and 10", "3" )
      );
//perform a mathematical calculation on the num and display the result
num++;
println("Your number incremented by 1 is : " + num);


int reply = JOptionPane.showConfirmDialog(null,           
   "Did you watch the Late Late Toy Show on Saturday night?",              
     "Christmas Question",   
     JOptionPane.YES_NO_OPTION); 
println("You chose: " + reply);