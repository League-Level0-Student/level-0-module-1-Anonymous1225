
void setup() {
  size(1000,1000);
PImage face = loadImage("download.jpeg");
face.resize(1000,1000);
image(face,0,0);
}
void draw() {
int red = (mouseX/4);
int green = (mouseY/4);
  noStroke();
  fill(red,green,54);
ellipse(300,400,200,200);
ellipse(700,400,200,200);
fill (0,0,0);
ellipse(300,400,100,100);
ellipse(700,400,100,100);
}
