package matrizes;

import java.util.Scanner;

public class matrizemain {

	public static void main(String[] args) {
		int line = 4, col = 6, i = 0, j = 0;
		int[][] n1 = new int[line][col];
		int[][] n2 = new int[line][col];
		int[][] m1 = new int[line][col];
		int[][] m2 = new int[line][col];
		Scanner read = new Scanner(System.in);
		System.out.println("complete a matriz \n");
		for (i = 0; i < line; i++) {
			for (j = 0; j < col; j++) {

				System.out.println("Insira o elemento N1[" + (line + 1) + "][" + (col + 1) + "] :");
				n1[i][j] = read.nextInt();
			}
		}

		for (i = 0; i < line; i++) {
			for (j = 0; j < col; j++) {

				System.out.println("Insira o elemento n2[" + (line + 1) + "][" + (col + 1) + "] :");
				n2[i][j] = read.nextInt();

				m1[i][j] = n1[i][j] + n2[i][j];
				m2[i][j] = n1[i][j] - n2[i][j];
			}
		}

		for (i = 0; i < line; i++) {
			for (j = 0; j < col; j++) {

				System.out.println("m1[" + (line + 1) + "][" + (col + 1) + "] " + m1[i][j]);

			}
			for (i = 0; i < line; i++) {
				for (j = 0; j < col; j++) {

					System.out.println("mm2[" + (line + 1) + "][" + (col + 1) + "] " + m2[i][j]);

				}

			}
		}
	}
}
