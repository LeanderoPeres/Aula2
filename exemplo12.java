package aula2;

import javax.swing.JOptionPane;

public class exemplo12 {

	public static void main(String[] args) {
		// Calculadora
		
	
String num1,num2,num3;
		
		float x,y,z,res;
		
		res=0;
		
		num1 = JOptionPane.showInputDialog ("Digite o primeiro numero");
		
		x = Float.parseFloat (num1);
		
		num2 = JOptionPane.showInputDialog ("Digite o segundo numero");
				 
        y = Float.parseFloat (num2);
        
                 
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("*           Calculadora                     *");
		System.out.println("* 1 = Soma                                  *");
		System.out.println("* 2 = Subtrair                              *");
		System.out.println("* 3 = Multiplicar                           *");
		System.out.println("* 4 = Dividir                               *");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
		//num1 = JOptionPane.showInputDialog("Selecione uma opção");
		//x = Float.parseFloat(num1);
		
		//num2 = JOptionPane.showInputDialog("Selecione uma opção");
		//y = Float.parseFloat(num2);
		
		num3 = JOptionPane.showInputDialog("Selecione uma opção");
		z = Float.parseFloat(num3);
		
		
		if (z == 1) {
			res = x+y;
		}
		else if (z == 2) {
			res = x-y;
		}
		else if (z == 3) {
			res = x*y;
		}
		else if (z == 4) {
			res = x/y;
		}
		else System.out.println("Valor incorreto, tente novamente.");
		
		System.out.println("O resultado da operação é " + res + ".");
		
	}
		
}


		

		
		
		
		
		
		
