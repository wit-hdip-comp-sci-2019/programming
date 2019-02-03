Spot sp;

void setup()
{
  size (100, 100);
  noStroke();

  sp = new Spot(33, 50, 30);
  println("After constructor, the value of the diameter is " + sp.getDiameter());

  // Now change the value of the diameter
  sp.setDiameter(40);
  println("After setter, the value of the diameter is " + sp.getDiameter());
}

void draw()
{
  background(0);
  sp.colour(255, 0, 0);
  sp.display();
}