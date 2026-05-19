package Array2D;

import java.util.Scanner;

public class main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of classes");
		int c = sc.nextInt();
		System.out.println("Enter the number of students in each class");
		int s = sc.nextInt();
		
		int[][] marks = new int[c][s];
		
		for(int i = 0; i < marks.length; i++)
		{
			for(int j = 0; j < marks[i].length; j++)
			{
				System.out.println("Enter the marks of student " + (j + 1) + " of class " + (i + 1));
				marks[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The marks are");
		for(int i = 0; i < marks.length; i++)
		{
			System.out.print("Class " + (i+1) + ": ");
			for(int j = 0; j < marks[i].length; j++)
			{
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}
}
