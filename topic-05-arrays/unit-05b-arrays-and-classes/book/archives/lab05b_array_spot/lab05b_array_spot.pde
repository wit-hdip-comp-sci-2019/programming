Spot[] spots;

void setup(){
  size(500,500);
  
  spots = new Spot[4];
  
  for(int i = 1; i <= spots.length; i++){
     spots[i-1] = new Spot(i*50, i*100, i*30);
  }
  
}

void draw(){
  
  for (int i=0; i < spots.length; i++){
     spots[i].display();
     spots[i].colour(mouseX, mouseY, 0);
  }
  
}