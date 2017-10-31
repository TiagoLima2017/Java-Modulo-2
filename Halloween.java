package DiaDasBruxasBox;

import java.util.Scanner;

public class Halloween {

	public static void main(String[] args) {
	Scanner	dados = new Scanner (System.in);
		String C = "";
		//Variaveis
		System.out.println("...:Dia das Bruxas:...");
		System.out.println("Doce ou Travessura? ");
		C = dados.nextLine();
		System.out.print("o Utilizador escolheu " + C + ".");
	}

}