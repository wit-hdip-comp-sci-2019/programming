//Spot Version 6.1

class Spot{
  
  float xCoord, yCoord;
  float diameter;
  int red, green, blue, gray;
  
  Spot()
  {
  }
  
 Spot(float xCoord, float yCoord, float diameter)
 {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    this.diameter = diameter;
  }
  
   Spot(float xCoord, float yCoord, float diameter, int gray)
   {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    this.diameter = diameter;
    colour(gray);
   }

   Spot(float xCoord, float yCoord, float diameter, int red, int green, int blue)
   {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    this.diameter = diameter;
     colour(red, green, blue);  
   }
   
   void display()
   {
     ellipse(xCoord, yCoord, diameter, diameter);
   } 
  
  void colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
    fill (this.red, this.green, this.blue);
  }

  void colour(int gray){
    this.gray = gray;
    fill (this.gray);
  }
   
   void move(float xCoord, float yCoord)
   {
     this.xCoord = xCoord;
     this.yCoord = yCoord;
   }
}