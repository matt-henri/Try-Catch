package trycatch;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		method2();
		
		System.out.println("Fim do programa.");
	
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		
		} catch (java.lang.ArrayIndexOutOfBoundsException e)  {
			// exeption de array fora do limite
			System.out.println("Número de Posição Inválida.");
		} catch (java.util.InputMismatchException e) {
			// exeption de valor inválido
			System.out.println("Apenas Caracteres númericos são válidos.");
		}
		
		
		sc.close();
	}
}
