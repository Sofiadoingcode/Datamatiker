int input = 20;

//Positives
if (input > 0) {
  for (int i=0; i <= input; i++){
    if (i == 6) {
      println("six");
    } else if (i == input/2) {
      println("HALF");
    } else {
      println(i); 
    }
  }
// Negatives
} else {
  for (int i=0; i >= input; i--){
    if (i == 6) {
      println("six");
    } else if (i == input/2) {
      println("HALF");
    } else {
      println(i); 
    }
  }
  
}
