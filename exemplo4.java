package aula2;

import java.util.Scanner; //usar o scanner

public class exemplo4 {

	public static void main(String[] args) {
		// Se então
	
		double nota1,nota2,media;
		
		Scanner ler = new Scanner (System.in); // ler o scanner uma única vez
		
		System.out.print("Digite sua nota 1: ");
		
		nota1=ler.nextDouble();
	
		System.out.print("Digite sua nota 2: ");
				
                       		
		nota2=ler.nextDouble();
	
		media=(nota1+nota2)/2;
		
		System.out.println(media);
		
		if (media>=7) {
			
			System.out.println("Aprovado");}
			
		else
			System.out.println("Reprovado");
			}

}
