package aula2;

import java.util.Scanner;

public class exemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int estadocivil;
				
				Scanner ler = new Scanner(System.in);
				
				 System.out.print("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				 System.out.print("* Digite seu estado civil conforme abaixo:  *");
				 System.out.print("* 1 = Solteiro                              *");
				 System.out.print("* 2 = Casado                                *");
				 System.out.print("* 3 = Outro                                 *");
				 System.out.print("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						
		 
				
			   estadocivil=ler.nextInt();
			   			
			  	if(estadocivil == 1) {
					System.out.println("Solteiro");	
					}
			  	
			  	else {
			  	
				if (estadocivil == 2) {
					System.out.println("Casado");	}
			  	
				
				else {
				  	
					if (estadocivil == 3) {
						System.out.println("Outros"); }
				
				else {				
				System.out.println("Erro!");
				}
			  
				}
			  	}
	}
}

			  	
