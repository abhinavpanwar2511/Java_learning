package Array3D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of college");
		int coll = sc.nextInt();
		System.out.println("Enter the number of classes in each college");
		int cls = sc.nextInt();
		System.out.println("Enter the number of students in each class");
		int s = sc.nextInt();
		
		int[][][] marks = new int[coll][cls][s];
		
		for(int i = 0; i<marks.length; i++) {
			for(int j = 0; j<marks[i].length; j++) {
				for(int k = 0; k<marks[i][j].length; k++) {
					System.out.println("Enter the marks of student " + (k+1)+ " of class " + (j+1)+ " of college " +(i+1));
					marks[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("The marks of students are:");
		for(int i = 0; i<marks.length; i++) {
			for(int j = 0; j<marks[i].length; j++) {
				for(int k = 0; k<marks[i][j].length; k++) {
					System.out.print(marks[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
