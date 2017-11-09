package Pacote1;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		double sal, per, salatu, persal;
		System.out.println("..:Aumento do Salario:..");
		System.out.println("Qual o seu Salario?");
		sal = dados.nextDouble();
		System.out.println("Qual a percentagem do aumento?");
		per = dados.nextDouble();
		persal = sal*(per*0.01);
		salatu = sal+persal;
		System.out.printf("Salario Atualizado = " + salatu);
		
		
		

	}

}
