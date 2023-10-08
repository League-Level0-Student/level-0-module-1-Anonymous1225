
void setup() {
  size(1020,1020);
PImage face = loadImage("download.jpeg");
face.resize(1020,1020);
image(face,0,0);
}
void draw() {
int red = (mouseX/4);
int green = (mouseY/4);
  noStroke();
  fill(red,green,0);
ellipse(306,408,204,204);
ellipse(714,408,204,204);
fill (0,0,0);
ellipse(306,408,102,102);
ellipse(714,408,102,102);
}
