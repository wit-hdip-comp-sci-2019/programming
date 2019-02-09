import javax.swing.*;  

int n0, n1, n2, n3, n4;
int sum = 0;

n0 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number ", "3"));
sum += n0;

n1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number ", "3"));
sum += n1;

n2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number ", "3"));
sum += n2;

n3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number ", "3"));
sum += n3;

n4 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number ", "3"));
sum += n4;

println("The sum of the values you typed in is : " + sum);
println("Number 1 is: " + n0);
println("Number 2 is: " + n1);
println("Number 3 is: " + n2);
println("Number 4 is: " + n3);
println("Number 5 is: " + n4);