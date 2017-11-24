package Sexta;

import java.util.Scanner;

public class Sextaa {

	public static void main(String[] args) {
		int n1=1, i, n2;
		Scanner dados = new Scanner (System.in);
				
				System.out.print("Numero:");
				n2 = dados.nextInt();
		for ( i=2; i<=n2; i++)
			n1=n1+i;
		System.out.print("O resultado dos primeiros positivos de "+n2+" é: " + n1);
			
		
				

	}

}
