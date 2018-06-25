void setup(){
  size(800,800);
}

void draw(){
  if(mousePressed){
  fill(#FFFFFF);
  ellipse(400,400,200,200);
  }
  else{
   fill(#000000);
  ellipse(400,400,200,200);   
  }
}