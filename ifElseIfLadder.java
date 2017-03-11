// If-Else-If-Ladder-in-Java
// This program demonstrates the working of an 'If-Else-If' Ladder in Java

import java.util.Random;
public class ifElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random month = new Random();
		int a = month.nextInt(12) + 1;
		
		System.out.println("Random month selected: " + a);
		
		if(a == 12 || a == 1 || a == 2){
			System.out.println("The season is Winter.");
		} else if(a == 3 || a == 4 || a == 5){
			System.out.println("The season is Spring.");
		} else if(a == 6 || a == 7 || a == 8){
			System.out.println("The season is Summer.");
		} else if(a == 9 || a == 10 || a == 11){
			System.out.println("The season is Autumn.");
		}		
	}

}
