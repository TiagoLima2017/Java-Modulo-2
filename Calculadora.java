package Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        double num1,num2,total;
        double monthstring = 0;
        String operador;
        System.out.println("numero 1:");
        num1 = ler.nextDouble();
        System.out.println("numero 2:");
        num2 = ler.nextDouble();
        System.out.println("qual o operador?:");
        operador = ler.next();
        switch (operador) {
        case "*" : monthstring = (num1*num2);
    	case "+" : monthstring = (num1+num2);
    	case "-" : monthstring= (num1-num2);
    	case "/" : monthstring = (num1/num2);
        }
        System.out.println(+monthstring);
    }}
