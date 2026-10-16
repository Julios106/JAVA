import javax.swing.*;
import java.awt.*;

//FlowLayout

public class Main{
	
	public static JButton butao(String txt){
		
		return new JButton(txt);
		
	}
	
	public static void main(String[] a){
		
		JFrame janela = new JFrame("Laboratorio");
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER,10,10);
		janela.setLayout(layout);
		
		janela.add(butao("Gravar"));
		janela.add(butao("Gravar"));
		janela.add(butao("Gravar"));
		
		
		janela.setSize(500,500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		
	}
	
}