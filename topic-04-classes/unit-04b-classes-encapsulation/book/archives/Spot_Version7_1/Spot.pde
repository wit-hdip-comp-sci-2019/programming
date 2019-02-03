class Spot {

  private float xCoord, yCoord;
  private float diameter;
  private int red, green, blue, gray;

  //------------------//
  //   constructors   //
  //------------------//

  Spot()
  {
  }

  Spot(float xCoord, float yCoord, float diameter)
  {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    if ((diameter >= 20) && (diameter <= 50)) {
      this.diameter = diameter;
    } else {
      this.diameter = 20;
    }
  }

  Spot(float xCoord, float yCoord, float diameter, int gray)
  {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    if ((diameter >= 20) && (diameter <= 50)) {
      this.diameter = diameter;
    } else {
      this.diameter = 20;
    }
    colour(gray);
  }

  Spot(float xCoord, float yCoord, float diameter, int red, int green, int blue)
  {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    if ((diameter >= 20) && (diameter <= 50)) {
      this.diameter = diameter;
    } else {
      this.diameter = 20;
    }
    colour(red, green, blue);
  }

  //------------------//
  //     methods      //
  //------------------//

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

  void colour(int gray) {
    this.gray = gray;
    fill (this.gray);
  }

  void move(float xCoord, float yCoord)
  {
    this.xCoord = xCoord;
    this.yCoord = yCoord;
  }

  //------------------//
  //     getters      //
  //------------------//
  public float getDiameter() {
    return diameter;
  }

  public float xCoord() {
    return xCoord;
  }

  public float yCoord() {
    return yCoord;
  }

  public int getRed() {
    return red;
  }

  public int getGreen() {
    return green;
  }

  public int getBlue() {
    return blue;
  }

  public int getGray() {
    return gray;
  }

  //------------------//
  //     setters      //
  //------------------//
  public void setDiameter(float diameter) {
   if ((diameter >= 20) && (diameter <= 50)) {
      this.diameter = diameter;
    }
  } 

  public void setXCoord(float xCoord) {
    this.xCoord = xCoord;
  } 

  public void setYCoord(float yCoord) {
    this.yCoord = yCoord;
  } 

  public void setRed(int red) {
    this.red = red;
  } 

  public void setGreen(int green) {
    this.green = green;
  } 

  public void setBlue(int blue) {
    this.blue = blue;
  }

  public void setGray(int gray) {
    this.gray = gray;
  }
}