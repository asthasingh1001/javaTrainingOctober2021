package Test.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		 ArrayList<Integer> nums = new ArrayList<>();
         ArrayList<Integer> result = new ArrayList<>();
	      System.out.println("Enter the number of you want to store"
	      		+ " in the Arraylist");

	        for (int i = 1; i <= n; i++) {
	        	int number = scan.nextInt();
	            nums.add(number);
	        }

	        List<Integer> cubes = nums.stream().filter(num -> num%2!=0).
	        		collect(Collectors.toList());
	        result.addAll(cubes);
	        System.out.println(result);
	}

}
