package aula2;

     import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {
		// Exemplo 5 verificar a idade da pessoa para ver se é maior ou menor de idade

		String nome;
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		nome=ler.next();
				
	   System.out.print("Digite sua idade: ");		
		
	   idade=ler.nextInt();
	   
	   System.out.println(idade);
		
		if (idade<18) {
			
			System.out.println(nome + " É menor de idade");}
			
		else
			{System.out.println(" É maior de idade");
			
		
		
	}
	}

}
