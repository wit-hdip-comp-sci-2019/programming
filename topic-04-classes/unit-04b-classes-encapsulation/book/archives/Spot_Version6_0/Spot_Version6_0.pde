Spot sp;

void setup()
{
  size (100,100);
  noStroke();
  sp = new Spot(33, 50, 30, 125);
}

void draw()
{
  background(0);
  sp.display();
  sp.move(mouseX, mouseY);
}