int x = 400; 
int y = 600; 
int up = 10; 

void setup() {
    size(800, 800);
    
}

void draw() {
keyPressed(); {
  up -= 1;
}

   background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + up+120, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + up+105, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + up + 85, 35, 35);
    fill(100, 100, 100);
    triangle(x , y + up, x + up+40, y +up+ 90, x - 30-up, y + 90+10);


}
