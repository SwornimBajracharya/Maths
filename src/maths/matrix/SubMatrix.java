package maths.matrix;

import java.util.Scanner;

public class SubMatrix {
	public static void main(String[] args) {
		System.out.println("Enter size of matrix: ");
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int a[][] = new int [m][n];
		int b[][] = new int [m][n];
		int sub[][]= new int [m][n];
		
		System.out.println("Enter element of matrix A: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Enter element of matrix B: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("The result sum of the matrix is: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sub[i][j]= a[i][j] - b[i][j];
				System.out.println(sub[i][j]);
			}
		}
		sc.close();	
	}
}
