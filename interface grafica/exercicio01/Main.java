import javax.swing.*;
import javax.awt.*;

class Main{
	
	public static void main(String[] a){
		JFrame janela = new JFrame("Minha janela");
		JPanel painel = new JPanel();
		JPanel painel2 = new JPanel();
		
		JLabel txt = new JLabel("Introduza algo");	
		JTextField campo = new JTextField(20);
		JButton butao = new JButton("Gravar");
		
		painel.add(txt);
		painel.add(campo);
		painel2.add(butao);
		
		
		
		janela.setLayout(new FlowLayout());
		janela.add(painel);
		janela.add(painel2);
		
		janela.setSize(500,400);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	}
	
	
}