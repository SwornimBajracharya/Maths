package maths.matrix;

import java.util.Scanner;

public class Identity {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[][]= new int[3][3];
		
		System.out.println("Enter elements of matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					if (a[i][j] == 1) {
						flag = true;
					}
				}
			}
		}
		if (flag) {
			System.out.println("Identity Matrix");
		}
		sc.close();
	}	
}
