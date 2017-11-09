package Pacote1;

import java.util.Scanner;

public class temperaturas {
	
	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double C,F;		
		//
		System.out.println("..:Conversor de Temperaturas:..");
		System.out.println("Qual a temperatura em Fahrenheit?");
		F = dados.nextDouble();
		C = (F-32)/1.8;
		System.out.printf("Celsius = " + C);
				
		
		
	}

}
