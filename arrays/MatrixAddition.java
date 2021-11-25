package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dimension :");
		int row = sc.nextInt();
		int cols = sc.nextInt();
		int a [][] = new int [row][cols];
		int b [][] = new int [row][cols];
		System.out.println("enter array a");
		for(int i = 0; i < row; i++) {
			for (int j = 0; j< cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter array b");
		for(int i = 0; i < row; i++) {
			for (int j = 0; j< cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int [row][cols];
		for(int i = 0; i <row; i++) {
			for(int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("result array c is: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();

	}

}
