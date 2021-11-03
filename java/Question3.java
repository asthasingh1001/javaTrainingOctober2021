package Test.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		 ArrayList<Integer> nums = new ArrayList<>();
         
	      System.out.println("Enter the number of you want to store"
	      		+ " in the Arraylist");

	        for (int i = 1; i <= n; i++) {
	        	int number = scan.nextInt();
	            nums.add(number);
	        }

	        
	        System.out.println(nums);
	}


}
