
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Meu primeiro sistema");

        JLabel texto = new JLabel("Auxene makueso. kkkkkk");
		//JButton button = new JButton("Fez trabalho?");


        janela.add(texto);
		//janela.add(button);
        janela.setSize(400, 200);
		
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}