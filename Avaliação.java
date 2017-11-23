package Avaliação;

import java.util.Scanner;

public class Avaliação {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double  num1,num2,Total;
		String Nome;
		System.out.print("digite o seu nome");
		Nome = ler.next();
		System.out.print("Digite o primeiro número:");
		num1 = ler.nextInt();
		System.out.print("Digite o Segundo número:");
		num2 = ler.nextInt();
		
		Total = (num1 * 0.6) + (num2 * 0.4);
		
		if (Total < 10)
			System.out.print("A/O" +Nome+ "está reprovada/o");
			else 
		System.out.println("A/O " +Nome+ " está aprovada/o ");
		System.out.print("A nota da sua avaliação é "+Total);
