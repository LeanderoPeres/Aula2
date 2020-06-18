package aula2;

import java.util.Scanner;

public class exemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
					
	   System.out.print("Digite sua idade: ");		
		
	   idade=ler.nextInt();
	   
	   System.out.println(idade);
		
	  	if(idade < 16) {
			System.out.println("Não eleitor");	}
	  	
	  	else {
	  	
		if (idade>=18 && idade<65) {
			System.out.println("Eleitor Obrigatório");	}
				
		else {				
		System.out.println("Eleitor facultativo");
		}
	  	}
	}
}


		
		/*if(idade < 16) {
			System.out.println("Não eleitor");	}
	  	
		if (idade>=18 && idade<=65) {
			System.out.println("Eleitor Obrigatório");	}
		
		if (idade>16 && idade<65) {
			System.out.println("Eleitor Facultativo");	}
		
		
		else {				
		System.out.println("Eleitor facultativo");
	   


		} */
		
		
	  	
		
		
	
	
		
		

