package maths.matrix;

import java.util.Scanner;

public class Determinant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of matrix A: ");
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int a[][] = new int [m][n];
		
		System.out.println("Enter elements of matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		double determinant = 0;
		for (int i = 0; i < 3; i++){
			determinant += (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3]));
		}
		System.out.println("Determinant: " + determinant);
	}	
}
