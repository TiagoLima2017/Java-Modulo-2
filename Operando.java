package pacote1;

import java.util.Scanner;

public class Operando {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		double Operando1,Operando2, Operação;
		int Operando3;
		System.out.println("Qual é o valor1?");
		Operando1=dados.nextDouble();
		System.out.println("Qual é o valor2?");
		Operando2=dados.nextDouble();
		System.out.print("Escolha uma das opções: \n 1:somar \n 2:subtrair \n 3:multiplicar \n 4:dividir \n opção escolhida:");
		Operando3 = dados.nextInt();
		switch (Operando3) {
	case 1:
        System.out.println("O Resultado da Soma é:"+(Operando1+Operando2));
        break;

    case 2:
        System.out.println("O Resultado da subtração é:"+(Operando1-Operando2));
        break;

    case 3:
        System.out.println("O Resultado da Multiplicação é:"+(Operando1*Operando2));
        break;

    case 4:
        System.out.println("O Resultado da Divisão é:"+(Operando1/Operando2));
        break;
    		}
		
		}

	}


