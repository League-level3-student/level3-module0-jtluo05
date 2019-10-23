package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] strings= {"1","2","3","4","5","6","7","8","9","33"};
		printArray(strings);
		printArrayBackwards(strings);
		printEveryOtherArray(strings);
		printRandomArray(strings);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	 static void  printArray(String[] s) {
for (int i = 0; i < s.length; i++) {
	System.out.println(s[i]);
}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	 static void  printArrayBackwards(String[] b) {
		 for (int i = b.length-1; i >= 0; i--) {
		 	System.out.println(b[i]);
		 }
		 	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	 static void  printEveryOtherArray(String[] e) {
		 for (int i = 0; i < e.length; i++) {
		 	if (i%2==0) {
				System.out.println(e[i]);
			}
		
		 }
		 	}
	
	 //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	 static void   printRandomArray(String[] r) {
		 for (int i = 0; i < r.length; i++) {
		 	Random random=new Random();
		 	int x=random.nextInt(r.length);
			 System.out.println(r[x]);
		 }
		 	}
	
}
