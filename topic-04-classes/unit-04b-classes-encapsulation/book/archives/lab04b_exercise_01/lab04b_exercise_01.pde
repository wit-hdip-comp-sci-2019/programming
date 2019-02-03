Spot sp;

void setup()
{
  size (100, 100);
  noStroke();
  
  //constructor (float, float, float) test
  sp = new Spot(-1, -1, 30);
  println("The value of xCoord is : "+ sp.getXCoord());
  println("The value of yCoord is : "+ sp.getYCoord());

  //grayscale constructor test
  sp = new Spot(101, 101, 30, 200);
  println("After grayscale constructor, the value of xCoord is " + sp.getXCoord());
  println("After grayscale constructor, the value of YCoord is " + sp.getYCoord());
  sp.setXCoord(-1);    // changing the value of the diameter
  println("After setter, the value of the xCoord is " + sp.getXCoord());

  //rgb constructor test
  sp = new Spot(40, 20, 30, 200, 0, 0);
  println("After rgb constructor, the value of xCoord is " + sp.getXCoord());
  println("After rgb constructor, the value of YCoord is " + sp.getYCoord());
  sp.setYCoord(101);    // changing the value of the diameter
  println("After setter, the value of the yCoord is " + sp.getYCoord());

}

void draw()
{
  background(0);
  sp.display();
  sp.move(mouseX,  mouseY);
}