import javax.swing.*;

void setup()
{
  String str = JOptionPane.showInputDialog("Enter a String of your choice:");
  JOptionPane.showMessageDialog(null, "The String you entered is: " + str 
                                    + " and the length is " + str.length() + " characters.");
  exit();  //supresses the display window.
}