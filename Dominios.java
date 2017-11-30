package pacote1;

import java.util.Scanner;

public class Dominios {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double PrimeiraNota;
		double SegundaNota;
		double NotaFinal;
		String NomeDaPessoa;
		System.out.print("Qual é o nome da pessoa?");
		NomeDaPessoa = ler.next();
		System.out.print("Qual a primeira nota?");
		PrimeiraNota = ler.nextDouble();
		System.out.print("Qual a segunda nota?");
		SegundaNota = ler.nextDouble();
		NotaFinal = (0.6*PrimeiraNota + 0.4*SegundaNota);
		System.out.print("A nota final da "+NomeDaPessoa+" é:" + NotaFinal);
		if (NotaFinal<10)
		System.out.print("Reprovado");	
		else
		System.out.print("Aprovado");
		
	

	}

}
