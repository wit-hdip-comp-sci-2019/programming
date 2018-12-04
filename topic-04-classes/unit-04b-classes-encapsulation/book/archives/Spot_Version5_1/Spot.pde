class Spot{
  float xCoord, yCoord;
  float diameter;
  int red, green, blue, gray;
  
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
  
  void colour(int redVal, int greenVal, int blueVal)
  {
    red = redVal;
    green = greenVal;
    blue = blueVal;
    fill (red, green, blue);
  }

  void colour(int grayVal)
  {
    gray = grayVal;
    fill (gray);
  }
}

