int foodX = 100;
int foodY = 0;
int score = -1;
void setup(){
  size(1000,1000);
  
  
}

void draw(){
  background(100,200,255);
  
  if(score == -1){
  textSize(30);
    text("Catch the food until you get 10 points. Click to start",100,550);
    if(mousePressed){
    score = 0;
    }
  }
  
  if(score < 10 && score >= 0){
  if(foodY < 1000)
  fill(250,250,0);
  noStroke();
  ellipse(foodX,foodY,50,50);
  foodY = foodY + (score+1)*2;

  
  drawFish();
  
  checkCatch(foodX,foodY);
  
  if(foodY > 1000){
   foodY = 0; 
   foodX = (int) random(width-20);
  }
  
  fill(0,0,0);
  textSize(16);
  text("Score: " + score,20,20);
  
  }
  else if(score == 10){
    fill(0,255,0);
    textSize(100);
    text("GAME OVER.",200,400);
    textSize(75);
    text("You Won!",300,550);
  }
}



void drawFish(){
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(mouseX,mouseY,90,50); //body
     triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
     stroke(0);
     triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(mouseX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(mouseX-25,mouseY-15,5,5); //pupil
     fill(141,233,237);
     ellipse(mouseX-45,mouseY,25,25); //mouth
}


void checkCatch(int x, int y){
     if(x > mouseX && x < mouseX+70){
          if(y > mouseY-17 && y < mouseY+30){
               score++;
               foodY = 0; //if the food was eaten, make more food fall from the top
               foodX = (int) random(width-20);
          }
     }
     else if (foodY > height && score > 0){
          score--;
     }
}