class Spot{
  float xCoord, yCoord;
  float diameter;
  
  Spot()
  {
  }
  
 Spot(float xPos, float yPos, float diamtr)
 {
    xCoord = xPos;
    yCoord = yPos;
    diameter = diamtr;
  }
  
  void display()
  {
    ellipse(xCoord, yCoord, diameter, diameter);
  }
  
}

