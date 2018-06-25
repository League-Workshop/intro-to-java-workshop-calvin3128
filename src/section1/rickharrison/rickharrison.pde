PImage rick;
PImage stache;

void setup(){
 rick = loadImage("rickharrison.jpg");
 size(1920,1080);
 rick.resize(1920,1080);
 background(rick);
stache = loadImage("stashe.png");
}

void draw(){
     background(rick);
  image(stache,mouseX,mouseY);

}