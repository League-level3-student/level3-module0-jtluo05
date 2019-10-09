package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int smallest=200;
	static int largest=0;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] array={"1","3","5","7","9"};



		//2. print the third element in the array
System.out.println(array[3]);
		//3. set the third element to a different value
array[3]="number four";
		//4. print the third element again
		System.out.println(array[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i]="random";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
int[] ia=new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random r=new Random();
for (int i = 0; i < ia.length; i++) {
	ia[i]=r.nextInt(200);
}
		//9. without printing the entire array, print only the smallest number on the array
for (int i = 0; i < ia.length; i++) {
	if (ia[i]<smallest) {
		smallest=ia[i];
	}
	else {
		
	}
}
System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < ia.length; i++) {
	
	System.out.println(ia[i]);
}
		//11. print the largest number in the array.
for (int i = 0; i < ia.length; i++) {
	if (ia[i]>largest) {
		largest=ia[i];
	}
	else {
		
	}
}
System.out.println(largest);
		//12. print only the last element in the array
		System.out.println(ia[49]);
	}
}
