package maths.matrix;

import java.util.Scanner;

public class Inverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter size of matrix A: ");
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int a[][] = new int [m][n];
		int b[][] = new int [m][n];
		int temp[][] = new int [m][n];
		
		System.out.println("Enter elements of matrix: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		if (m == 2 && n == 2) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if ( i == j) {
						b[i][j] = -(a[i][j]);
					}
					else {
						b[i][j] = a[j][i];
					}
				}
			}
			System.out.println("Result: ");
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.println(b[i][j]);		
				}
			}
		}
	
		else {
			double determinant = 0;
			for (int i = 0; i < 3; i++){
				determinant += (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3]));
			}
			
			System.out.println("The determinant is:" + determinant);
			
			
			
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					b[j][i] = ((a[(i+1)%3][(j+1)%3] * a[(i+2)%3][(j+2)%3]) - (a[(i+1)%3][(j+2)%3] * a[(i+2)%3][(j+1)%3]));
				}
			}
			
			System.out.println("Inverse of matrix: ");
			System.out.println("1/" + determinant );

			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					System.out.println(b[i][j] + "(" + i + "," + j + ")" + "\t");  ;
				}	
				System.out.println();
			}
		}
				
	}	
}
