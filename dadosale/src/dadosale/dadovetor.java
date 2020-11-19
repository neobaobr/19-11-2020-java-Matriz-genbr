package dadosale;

import java.util.Scanner;

public class dadovetor {

	public static void main(String[] args) {
		int[] n = new int[10];
		double media = 0;
		int contador = 0;
		Scanner read = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor do dado 1 a 6 \n");
			n[i] = read.nextInt();
			media += n[i];
			if (n[i] == 6) {
				contador++;
			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.println("valor n \n" + n[i]);

		}
		System.out.println("numero de maior valor \n" + contador);
		System.out.println("media eh \n" + (media / 10));
	}
}
