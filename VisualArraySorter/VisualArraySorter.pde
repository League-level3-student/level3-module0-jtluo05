//1. create an array of ints. don't initialize it yet.
int[] i;

void setup() {
  //2. set the size of your window
  size(600, 600);

  //3. initialize your array with the built in width variable
  i=new int[width];

  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  randomize();


  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(20, 115, 200);

  //7. set the color for your graph
  fill(255, 14, 65);

  //8. draw a rectangle for each int in your array.
  for (int x=0; x< i.length; x++) {
    rect(x, height, 1, -i[x] );
  }
  //   the x value will be the index of the int

  //   the y value will the height variable

  //   the width is 1

  //   the height is negative the value of the int at that element in the array


  //9. call the stepSort method
  stepSort(i);

  //10. extract the code that randomizes the array into a method.


  //11. call the method you made in step 10 when the mouse is pressed
  if ( mousePressed) {
    randomize();
  }
}
void randomize() {
  for (int x=0; x< i.length; x++) {
    i[x]=(int)random(height);
  }
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
