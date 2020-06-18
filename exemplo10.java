package aula2;

import javax.swing.JOptionPane;

public class exemplo10 {

	public static void main(String[] args) {
	
		String xsaque;
		
		double saldo = 1000;
		double salario = 10000;
		double saque, emprestimo;
		
		xsaque = JOptionPane.showInputDialog("Digite o valor do saque");
		saque = Double.parseDouble(xsaque);	
					
		if (saldo>saque) {
			saldo=saldo-saque;
			JOptionPane.showMessageDialog(null,  "Saque efetuado com sucesso. O saldo atual é  " + saldo);
		}else {
			JOptionPane.showMessageDialog(null,  "Saldo Insuficiente! Saldo = " + saldo);
			emprestimo=salario*0.05;
			JOptionPane.showMessageDialog(null,  "O valor de emprestimo disponível é "+emprestimo);
		}
			System.out.println("Saldo Insuficiente");	}
	  	
}