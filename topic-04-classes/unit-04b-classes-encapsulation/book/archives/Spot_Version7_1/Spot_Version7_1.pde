Spot sp;

void setup()
{
  size (100, 100);
  noStroke();
  
  //constructor (float, float, float) test
  //sp = new Spot(33, 50, 30000);
  //println("The value of diameter is : "+ sp.getDiameter());

  //grayscale constructor test
  sp = new Spot(33, 50, 30000, 200);
  println("After grayscale constructor, the value of the diameter is " + sp.getDiameter());
  sp.setDiameter(40000);    // changing the value of the diameter
  println("After setter, the value of the diameter is " + sp.getDiameter());

  //rgb constructor test
  sp = new Spot(33, 50, 30000, 200, 0, 0);
  println("After rgb constructor, the value of the diameter is " + sp.getDiameter());
  sp.setDiameter(40000);    // changing the value of the diameter
  println("After setter, the value of the diameter is " + sp.getDiameter());

}

void draw()
{
  background(0);
  sp.display();
  sp.move(mouseX,  mouseY);
}