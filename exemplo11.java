package aula2;

import javax.swing.JOptionPane;

public class exemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String a,b;
		
		float x,y;
		
		a = JOptionPane.showInputDialog ("Digite o primeiro numero");
		
		x = Float.parseFloat (a);
		
		b = JOptionPane.showInputDialog ("Digite o segundo numero");
				 
        y = Float.parseFloat (b);
        
        if (x>y) {
			//JOptionPane.showMessageDialog(null,  "O número maior é  " + a);
		//}else {
			//JOptionPane.showMessageDialog(null,  "O número maior é = " + b);
		//}
        //if (media>=7) {
			
			System.out.println("O número maior é  " + a);
			}
			
		else
			System.out.println("O número maior é = " + b);
			} 
	    
	

}
