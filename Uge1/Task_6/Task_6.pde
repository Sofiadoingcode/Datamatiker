// First part
int a = 10;
int b = -2;

if (a == 10 || b == 10 || a+b == 10) {
  println("Success!");
} else {
  println("Failure");
}



// Second part
int x = -10;
int y = -10;
int z = 30;

if (x+y+z == 30) {
  if(x % 10 != 0 && y % 10 != 0 && z % 10 != 0) {
    println("Success!");
  } else if (x > 30 || x < 0) {
    if(y > 30 || y < 0) {
      if(z > 30 || z <0) {
        println("Success!");
      } else {
        println("Failure!");
      }
    } else {
      println("Failure!");
    }
  } else {
   println("Failure!"); 
  }
} else {
  println("Failure!");
}
