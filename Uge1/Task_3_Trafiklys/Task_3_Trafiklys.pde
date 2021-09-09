//colors
int red;
int green;
int yellow;
int backgroundColor;
int grey;

// circles
int circX;
int circDiameter; 

//Other
int counter;

void setup() {
  // Set up 
  size(500, 500);
  ellipseMode(CENTER);
  frameRate(2);
  
  // Variable declaration 
  red = color(255, 0, 0);
  green = color(0, 255, 0);
  yellow = color(255, 255, 0);
  backgroundColor = color(255);
  grey = color(175);
  
  circX = width/2;
  circDiameter = 100;
  
  counter = 0;
  
}


void draw() {
  // Set background
  background(backgroundColor);
  
  //Make trafficlight
  fill(red);
  ellipse(circX, height/2/2, circDiameter, circDiameter);
  fill(yellow);
  ellipse(circX, height/2, circDiameter, circDiameter);
  fill(green);
  ellipse(circX, height/2+height/2/2, circDiameter, circDiameter);
 
 // Make grey circles over the ones not being shown
 // Make it turn on and off
  if (counter == 0) {
    fill(grey);
    ellipse(circX, height/2, circDiameter, circDiameter);
    ellipse(circX, height/2+height/2/2, circDiameter, circDiameter);
    counter ++;
  } else if (counter == 1) {
    fill(grey);
    ellipse(circX, height/2/2, circDiameter, circDiameter);
    ellipse(circX, height/2+height/2/2, circDiameter, circDiameter);
    counter ++;
  } else if (counter == 2) {
    fill(grey);
    ellipse(circX, height/2/2, circDiameter, circDiameter);
    ellipse(circX, height/2, circDiameter, circDiameter);
    counter = 0; 
  }
  
 }
