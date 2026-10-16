import javax.swing.*;

class TelaPrincipal extends JFrame{
	JLabel txt;
	JTextField campo;
	JButton btn;
	JPanel painel = new JPanel();
	JComboBox lista;
	
	public TelaPrincipal(){
		txt = new JLabel("Ola estudando swing");
		campo = new JTextField(10);
		btn = new JButton("ESTAS SATISFEITO? CLIQUE HERE");
		lista = new JComboBox ();
		lista.addItem("comida");
		lista.addItem("xima");
		
		painel.add(txt);
		painel.add(campo);
		painel.add(btn);
		painel.add(lista);
		
		super.add(painel);
	
	}
	
	
}


public class Main{
	
	public static void main(String[] a){
		
		
		TelaPrincipal tela = new TelaPrincipal();
		
		tela.setSize(500,500);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}