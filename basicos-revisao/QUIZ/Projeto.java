import java.util.Scanner;

public  class Projeto {
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in); 
		
		String [] perguntas = {
			"qual meu nome?",
			"Qual e o tempero que todos lembra na refeicao so quando esta faltando"
		};
		
		String [][] alternativas = {
				{"julio","cao","miro"},//linha 0
				{ "sal","caldo","limao"}//linha 1
			
		};

		int [] alternativasCorretas = {1,1};
		
		int vidas = 3;
		int pergunta = 0;//identificador da posicao do vector perguntas
		int ac = 0;//indentificador da posicao do vector alternativasCorretas
		int linha = 0;//para interrar a linha da matriz
		int pontuacao = 0;
		int acertos = 0;
		
		System.out.println(" ");
		System.out.println("Tente acertar a todas perguntas para dispensar JAVA!!! ");
		System.out.println(" ");
		
		
		while(vidas > 0 ){
			if(pergunta > 1){
				break;
			}
					
			System.out.println("------------------------ ");
			System.out.println("QUEM QUER DISPENSAR JAVA?");
			System.out.println("------------------------ ");
			
			System.out.println( (pergunta+1) + "-" + perguntas[pergunta]);
			System.out.println(" ");
			
			for(int n = 0;n<3;n++){
				System.out.println((n+1) + "-" + 
					alternativas[linha][n]);
					
			}
			
			System.out.println(" ");
			
			System.out.println("Escolha uma alternativa que ache correta:");
			int isCorreta = input.nextInt();
			
			System.out.println(" ");
			
			if(isCorreta != alternativasCorretas[ac]){
				vidas--;			
				pergunta++;
				ac++;
				linha++;
				
				for(int q = 0;q<30;q++){
					System.out.println(" ");
				}			
				System.out.println("Resposta errada!! ficou com apenas " + vidas + " vidas");
				continue;
			}
				
			
			pontuacao+=100;
			pergunta++;
			ac++;
			linha++;
			
			for(int q = 0;q<30;q++){
				System.out.println(" ");
			}
			System.out.println("Certa resposta... MAIS 100 PONTOS " );
			System.out.println(" ");			
		

			
		}

		System.out.println("Pontuacao obtida: " + pontuacao);
		
		
		
	}
	
}