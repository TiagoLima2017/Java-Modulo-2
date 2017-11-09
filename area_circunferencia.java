package Pacote1;

import java.util.Scanner;

public class area_circunferencia {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double r,a;
		System.out.println("..:Area da Circunferencia:..");
		System.out.println("Qual a medida do raio?");
		r = dados.nextDouble();
		a = 3.14*r*r;
		System.out.printf("Area da Circunferencia = " + a);


	}

}
