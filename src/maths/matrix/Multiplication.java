package maths.matrix;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of matrix A: ");
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("Enter size of matrix B: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (n==x) {
			int a[][] = new int [m][n];
			int b[][] = new int [x][y];
			int mult[][]= new int [m][y];
			
			System.out.println("Enter element of matrix A: ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j]= sc.nextInt();
				}
			}
			
			System.out.println("Enter element of matrix B: ");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					b[i][j]= sc.nextInt();
				}
			}
			
			System.out.println("The multiplication of the matrix is: ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < y; j++) {
					for (int k = 0; k < n ; k++ ) {
						mult[i][j] += (a[i][k]*b[k][j]);
					}
					System.out.println(mult[i][j]);
				}
			}
		}
		else {
			System.out.println("Not multipliable");
		}
		
		sc.close();
	}

}
