Spot sp;

void setup()
{
  size (100,100);
  noStroke();
  sp = new Spot(33, 50, 30, 255,150,50);
}

void draw()
{
  background(0);
  sp.display();
}