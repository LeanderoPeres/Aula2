package aula2;

import java.util.Scanner;

public class exemplo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
	
		String loginUser="Leandro";
		String senhaUser="123";
		
		
		System.out.println ("|====================================================|");
		// infiorme o seu login
		System.out.println ("Digite seu login  :>  ");
		String login = in.nextLine();
		// infiorme a sua senha
		System.out.println ("Digite seu senha  :>  ");
		String senha = in.nextLine();
		System.out.println ("|====================================================|");
		
		if(login.equals(loginUser)  && senha.equals (senhaUser)){
			System.out.printf("Usuário logado com sucesso!", login);
		}else{
			System.out.printf("Login ou senha inválidos!");
		}
		
	}

}
