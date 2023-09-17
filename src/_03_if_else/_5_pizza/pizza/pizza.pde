 PImage pepperoni;
 PImage smoliv;
 PImage mushroom;
void setup() {
pepperoni = loadImage("pepperoni.png");
    size(600,600);
smoliv = loadImage("olive.png");
mushroom =loadImage("mushroom.png");
}
void draw() {
    image(pepperoni,300,300);
        image(pepperoni,200,129);
        image(pepperoni,93,80);
    image(smoliv,203,174);
        image(smoliv,222,256);
        if (keyPressed && (key=='b'|| key=='q') ) {
             image(pepperoni,320,345); 
             image(mushroom,256,345);
        }
        noStroke();
    fill(34,212,200,130);
    ellipse(300,300,600,600);
}
