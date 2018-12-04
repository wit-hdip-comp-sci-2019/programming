import javax.swing.*;

void setup()
{
  String str = JOptionPane.showInputDialog("Enter a String of your choice:");
  JOptionPane.showMessageDialog(null, "The String you entered is: \n\n" + str 
                                    + "\n\nLength:  " + str.length() + " characters"
                                    +   "\nUppercase:  " + str.toUpperCase()
                                    +   "\nLowercase:  " + str.toLowerCase());
  exit();  //supresses the display window.
}