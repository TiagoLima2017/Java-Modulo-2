package Pacote1;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double n1,n2,n3,m;
		System.out.println("..:Média:..");
		System.out.println("Qual a nota 1?");
		n1 = dados.nextDouble();
		System.out.println("Qual a nota 2?");
		n2 = dados.nextDouble();
		System.out.println("Qual a nota 3?");
		n3 = dados.nextDouble();
		m = (n1+n2+n3)/3;
		System.out.printf("Média = " + m);
				
		

	}

}
