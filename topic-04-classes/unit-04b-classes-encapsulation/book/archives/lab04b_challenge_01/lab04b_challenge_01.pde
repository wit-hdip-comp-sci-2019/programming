Spot sp;

void setup()
{
  size (100, 100);
  noStroke();
  
  //rgb constructor
  sp = new Spot(40, 20, 30, 200, 0, 0); 
}

void draw()
{
  background(0);
  sp.display();
  //growing by 1 each time draw is called
  sp.grow(1);
  
  //printing out the value of the diameter - test!
  println("The diameter is now " + sp.getDiameter());
 
  sp.move(mouseX,  mouseY);
}