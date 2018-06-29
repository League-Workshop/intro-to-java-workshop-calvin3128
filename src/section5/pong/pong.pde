
int playy;
int aiy = 400;
boolean down = false;
boolean up = false;
int speed = 5;
int ballx = 750;
int bally = 500;
int ballang = 0;
int direc = 10;
int yspd = 0;
int aiscore = 0;
int playscore = 0;
int hard = 30;
int level = 20;

void setup() {
  size(1500, 1000);
  background(0, 0, 0);
}


void draw() {

  if (up) {
    playy = playy - speed;
  }
  if (down) {
    playy = playy + speed;
  }

  ballx = ballx + direc;

  if (ballx >= 1420) {
    if (bally >= aiy - 100 && bally <= aiy +300) {
      direc = -1*level; 
      yspd = (bally - (aiy + 100))/10;
    }
    else{
     playpoint(); 
    }
  }

  if (ballx <= 80) {
    if (bally >= playy - 100 && bally <= playy + 300) {
      direc = level;
      yspd = (bally - (playy + 100))/10;
    }
    else{
      aipoint(); 
    }
  }

  if (aiy > bally - 100) {
    aiy = aiy - hard;
  }

  if (aiy < bally + 100) {
    aiy = aiy + hard;
  }

  if (bally <= 50||bally >= 950) { 
    yspd = -1*yspd;
  }
  
  bally = bally + yspd;

  noStroke();
  background(0, 0, 0);
  rect(10, playy, 20, 200);
  rect(1470, aiy, 20, 200);
  ellipse(ballx, bally, 100, 100);
  
  textSize(50);
  text("Player: " + playscore, 650, 50);
  text("AI: " + aiscore, 700, 100);
}


void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      up = true;
    } else if (keyCode == DOWN) {
      down = true;
    }
  }
}

void keyReleased() {
  if (key == CODED) {
    if (keyCode == UP) {
      up = false;
    } else if (keyCode == DOWN) {
      down = false;
    }
  }
}

void aipoint(){
  aiscore++;
  direc = 10;
  bally = 500;
  ballx = 750;
  yspd = 0;
  playy = 400;
  aiy = 400;
}

void playpoint(){
  playscore++;
  direc = -10;
  bally = 500;
  ballx = 750;
  yspd = 0;
  playy = 400;
  aiy = 400;
}