import javax.swing.*;

void setup()
{
  String str = JOptionPane.showInputDialog("Enter a String of your choice:");
  JOptionPane.showMessageDialog(null, "The String you entered is: " + str 
                                    + " and the length is " + str.length() + " characters."
                                    + " Uppercase: " + str.toUpperCase()
                                    + " Lowercase: " + str.toLowerCase());
  exit();  //supresses the display window.
}