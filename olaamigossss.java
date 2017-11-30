package olaamigos;

import java.util.Scanner;

public class olaamigossss {


    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int num; 
        int fat = 1;
        int cont = 1;

        {
            System.out.println("Digite um número: ");
            num = l.nextInt();
            
            for(int I = 1;I <= num; I++){
                fat = fat * I;
            }
            
            System.out.println(" O fatorial é: " + fat);
            cont++;
            
       }
    }
}
    