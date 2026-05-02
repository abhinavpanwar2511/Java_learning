package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size = sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Array created");
		
		for(int i = 0; i < size; i++) 
		{
			System.out.println("Enter the marks of student " + (i+1));
			marks[i] = sc.nextInt();
		}
		
		System.out.println("Marks of students are");
		for(int i = 0; i < size; i++) 
		{
			System.out.print(marks[i] + " ");
		}
	}
}
