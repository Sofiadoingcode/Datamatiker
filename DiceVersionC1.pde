die Die;
die Die2;
die Die3;
die Die4;
color red;
color grey;
color blue;
DiceCup cup;

void setup() {
  size(800,600);
  rectMode(CENTER);
  
  red = color(255, 0, 0);
  grey = color(190, 190, 190);
  blue = color(0, 0, 255);
  
  Die = new die(red, grey);
  Die2 = new die(red, grey);
  Die3 = new die(red, grey);
  Die4 = new die(red, grey);
  cup = new DiceCup();
  
  cup.addDie(Die);
  cup.addDie(Die2);
  cup.addDie(Die3);
  cup.addDie(Die4);
  
}


void draw() {
  background(255);
  cup.drawDice(50, height/2, 50);
}


class die {
  color colorDie;
  color colorEyes;
  int numberRolled;
  
  die(color colorDie, color colorEyes) {
    this.colorDie = colorDie;
    this.colorEyes = colorEyes;
  }
  color getColorDie() {
    return this.colorDie;
  }
  int roll() {
    numberRolled = (int) random(1,7);
    return numberRolled;
  }
  void drawDie(int x, int y, int size) {
    fill(colorDie);
    rect(x, y, size, size);
    switch (numberRolled) {
     case 1:
      fill(colorEyes);
      circle(x, y, size/5);
     break;
     
     case 2:
      fill(colorEyes);
      circle(x+size/2/2, y-size/2/2, size/5);
      circle(x-size/2/2, y+size/2/2, size/5);
     break;
     
     case 3: 
       fill(colorEyes);
       circle(x, y, size/5);
       circle(x+size/2/2, y-size/2/2, size/5);
       circle(x-size/2/2, y+size/2/2, size/5);
     break;
     
     case 4: 
       fill(colorEyes);
       circle(x+size/2/2, y-size/2/2, size/5);
       circle(x-size/2/2, y+size/2/2, size/5);
       circle(x-size/2/2, y-size/2/2, size/5);
       circle(x+size/2/2, y+size/2/2, size/5);
     break;
     
     case 5:
       fill(colorEyes);
       circle(x, y, size/5);
       circle(x+size/2/2, y-size/2/2, size/5);
       circle(x-size/2/2, y+size/2/2, size/5);
       circle(x-size/2/2, y-size/2/2, size/5);
       circle(x+size/2/2, y+size/2/2, size/5);
     break;
     
     case 6:
       fill(colorEyes);
       circle(x+size/2/2, y, size/5);
       circle(x-size/2/2, y, size/5);
       circle(x+size/2/2, y-size/2/2, size/5);
       circle(x-size/2/2, y+size/2/2, size/5);
       circle(x-size/2/2, y-size/2/2, size/5);
       circle(x+size/2/2, y+size/2/2, size/5);
     break;
     
  }
  
  }
  
}

class DiceCup {
  ArrayList<die> DieList;
  ArrayList<Integer> rollList;
  
  DiceCup() {
    DieList = new ArrayList<die>();
    rollList = new ArrayList <Integer>();
  }
  
  
  void addDie(die dieInstance) {
    DieList.add(dieInstance);
  }
  
  void shake() {
    rollList.clear();
    for (int i = 0; i < DieList.size(); i ++) {
      die instance = DieList.get(i);
      rollList.add(instance.roll());
      println(rollList);
    }
    
  }
  
  void drawDice(int x, int y, int dieSize) {
    int numberOf1s = 0;
    int numberOf2s = 0;
    int numberOf3s = 0;
    int numberOf4s = 0;
    int numberOf5s = 0;
    int numberOf6s = 0;
     Boolean checkBoolean = false;
    for (int i = 0; i < rollList.size(); i++) {
      die instance = DieList.get(i);
      
      switch (rollList.get(i)) {
       case 1: 
        checkBoolean = true;
        if (checkBoolean == true) {
          numberOf1s += 1;
        }
        for (int j = 0; j < numberOf1s; j++) {
          instance.drawDie(x + j*dieSize/2*3, y - 250, dieSize); 
        }
        break;
        
        case 2: 
          checkBoolean = true;
          if (checkBoolean == true) {
            numberOf2s += 1;
          }
          for (int j = 0; j < numberOf2s; j++) {
            instance.drawDie(x + j*dieSize/2*3, y - 150, dieSize); 
          }
          break;
        
        case 3: 
          checkBoolean = true;
          if (checkBoolean == true) {
            numberOf3s += 1;
          }
          for (int j = 0; j < numberOf3s; j++) {
            instance.drawDie(x + j*dieSize/2*3, y - 50, dieSize); 
          }
          break;
          
        case 4: 
          checkBoolean = true;
          if (checkBoolean == true) {
            numberOf4s += 1;
          }
          for (int j = 0; j < numberOf4s; j++) {
            instance.drawDie(x + j*dieSize/2*3, y + 50, dieSize); 
          }
          break;
          
        case 5: 
          checkBoolean = true;
          if (checkBoolean == true) {
            numberOf5s += 1;
          }
          for (int j = 0; j < numberOf5s; j++) {
            instance.drawDie(x + j*dieSize/2*3, y + 150, dieSize); 
          }
          break;
          
        case 6: 
          checkBoolean = true;
          if (checkBoolean == true) {
            numberOf6s += 1;
          }
          for (int j = 0; j < numberOf6s; j++) {
            instance.drawDie(x + j*dieSize/2*3, y + 250, dieSize); 
          }
          break;
      }
    }
   
  }
    
}
  

void mousePressed() {
  cup.shake();
}
