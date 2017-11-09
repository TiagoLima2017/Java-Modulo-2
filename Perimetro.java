package Projeto;

import java.util.Scanner;

public class perimetro_circunferencia {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double d,p;
		System.out.println("..:Perimetro da Circunferencia:..");
		System.out.println("Qual o diametro?");
		d = dados.nextDouble();
		p = 3.14*d;
		System.out.printf("Perimetro = " + p);
		

	}

}
