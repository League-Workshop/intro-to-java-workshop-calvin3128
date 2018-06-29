
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

  if (ballx == 1420) {
    if (bally >= aiy - 100 && bally <= aiy +300) {
      direc = -10; 
      yspd = (bally - (aiy + 100))/10;
    }
  }

  if (ballx == 80) {
    if (bally >= playy - 100 && bally <= playy + 300) {
      direc = 10;
      yspd = (bally - (playy + 100))/10;
    }
  }

  if (aiy > bally - 100) {
    aiy = aiy - 10;
  }

  if (aiy < bally + 100) {
    aiy = aiy + 10;
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