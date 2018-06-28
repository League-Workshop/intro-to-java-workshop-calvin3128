PImage cat;

int x1 = 330;
int y1 = 520;
int x2 = 560;
int y2 = 490;
int up = 1;

void setup(){
  
  size(1000,1000);
  cat = loadImage("cat.jpg");
  cat.resize(1000,1000);
  background(cat);
}



void draw(){
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
  
  fill(0,255,0);
  noStroke();
  ellipse(x1,y1,100,100);
  ellipse(x2,y2,100,100);
  
  if(mousePressed){
keyPressed();
  
}
}

void keyPressed(){
 x1 = x1 + up;
 y1--;
 x2 = x2 + up;
 y2--;
up = up + 1;
}