package Pacote1;

import java.util.Scanner;

public class Trapezio {
	
	private static Scanner dados;
	
	public static void main(String[] args) {
		double bmaior, bmenor, area, altura;
		dados = new Scanner (System.in);
		//Variaveis
		System.out.println("Quanto mede a Base Maior?");
			bmaior = dados.nextDouble();
		System.out.println("Quanto mede a Base Menor?");
			bmenor = dados.nextDouble();
		System.out.println("Quanto mede a Altura?");
			altura = dados.nextDouble();
		area = (bmaior+bmenor)*altura/2;
		System.out.print("A área do Trapézio é " + area + ".");
						
	}

}
