package quiz;
import java.util.Scanner;
import configs.Configs;
import pergunta.Pergunta;
import pergunta.BancoPergunta;

public class Quiz{
	
	public static void mostrarAlternativas(String[] alternativas){
		
		int i = 1;
		
		for(String alternativa : alternativas){
			IO.println("     " + i + " - " + alternativa);
			i++;
		}
	}
	
	
	public static void mostrarPergunta(Pergunta pergunta,int vidas){

		
		String[] alternativas = pergunta.getAlternativas();
		Configs.limparTela(2);
		IO.println(">>Categoria:" + pergunta.getCategoria());
		IO.println(">>Vidas restantes:"+vidas);
		Configs.limparTela(2);
		IO.println(">>"+ pergunta.getEnunciado());
		mostrarAlternativas(alternativas);
		
	}
	
	public static void desempenhoJogador(int acertos,int vidas,int erros){
		
		Configs.limparTela(19);
		
		IO.println("Estatisticas finais");
		IO.println("Total de acertos:" + acertos);
		IO.println("Total de Erros:" + erros);
		IO.println("vidas restantes:" + vidas);	
		
		IO.println("");		
	
	}
	
	public static void jogo( ){
		Scanner input = new Scanner(System.in);
		
		BancoPergunta perguntas = new BancoPergunta();

		//mostrarPergunta(perguntas.getPerguntas().get(0));	
		int indice = 0;
		int acertos = 0;
		int vidas = 3;
		int erros = 0;
		
		
		while(indice < perguntas.getPerguntas().size() && vidas > 0){
			
			Pergunta atual = perguntas.getPerguntas().get(indice);
			mostrarPergunta(atual,vidas);	
			
			IO.println("Escolha alternativa:");
			int alternativa = input.nextInt();
			
			if(alternativa != atual.getRespostaCorreta()){
				Configs.limparTela(10);
				
				IO.println("RESPOSTA ERRADA!");

				Configs.limparTela(10);
				
				vidas--;
				erros++;
				continue;
			}	
			Configs.limparTela(5);
			
			IO.println("CERTA RESPOSTA!!");
			
			Configs.limparTela(5);
			
			
			acertos++;
			indice++;
		}
		
		desempenhoJogador(acertos,vidas,erros);
		
		
	}
	
	
}