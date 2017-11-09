package Pacote1;

import java.util.Scanner;

public class pitagoras {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double C1,C2,H;
		//
		System.out.print("..:Teorema de Pitágoras:..\n");
		System.out.println("Qual o primeiro Cateto?");
		C1 = dados.nextDouble();
		System.out.println("Qual o segundo Cateto?");
		C2 = dados.nextDouble();
		H=Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));
		System.out.printf("Hipotenusa = " + H);
		

	}

}
