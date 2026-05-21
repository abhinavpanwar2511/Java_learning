package JaggedArray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes");
		int c = sc.nextInt();
		
		int[][] marks = new int[c][];
		
		for(int i = 0; i<marks.length; i++) {
			System.out.println("Enter the number of students in class " + (i + 1));
			int s = sc.nextInt();
			marks[i] = new int[s];
		}
		
		for(int i = 0; i<marks.length; i++) {
			for(int j = 0; j<marks[i].length; j++) {
				System.out.println("Enter the marks of student " + (j + 1) + " of class " + (j + 1));
				marks[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The marks of students are:");
		for(int i = 0; i<marks.length; i++) {
			for(int j = 0; j<marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}
}
