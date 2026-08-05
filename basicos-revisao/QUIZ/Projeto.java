import java.util.Scanner;

public  class Projeto {
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in); 
		
		String[] perguntas = {
			"Qual palavra-chave é usada para criar uma classe em Java?",
			"Qual função é usada para imprimir algo no terminal em C?",
			"Qual tipo de dado guarda números inteiros em Java?",
			"Em C, qual símbolo é usado para acessar o endereço de uma variável?",
			"Qual palavra-chave cria um objeto em Java?",
			"Qual estrutura de repetição executa um bloco enquanto uma condição for verdadeira?",
			"Em Java, qual classe é usada para ler dados digitados pelo utilizador?",
			"Em C, qual biblioteca é usada para usar printf e scanf?",
			"Qual conceito da POO permite esconder detalhes internos de uma classe?",
			"Qual palavra-chave é usada para criar uma constante em Java?",
			"Em C, qual é o índice inicial de um vetor?",
			"Qual método é o ponto de entrada de um programa Java?",
			"Qual estrutura de dados armazena vários valores do mesmo tipo em Java?",
			"Em Java, qual palavra-chave é usada para herança?",
			"Qual operador verifica igualdade em Java?"
		};
		
		String [][] alternativas = {
			{"function", "class", "create", "object"}, // correta: 2
			{"console()", "print()", "write()", "printf()"}, // correta: 4
			{"int", "double", "boolean", "string"}, // correta: 1
			{"*", "#", "&", "@"}, // correta: 3
			{"make", "new", "create", "object"}, // correta: 2
			{"while", "if", "switch", "case"}, // correta: 1
			{"Reader", "Input", "System", "Scanner"}, // correta: 4
			{"stdlib.h", "string.h", "stdio.h", "math.h"}, // correta: 3
			{"Encapsulamento", "Loop", "Casting", "Compilação"}, // correta: 1
			{"static", "const", "fixed", "final"}, // correta: 4
			{"1", "0", "-1", "10"}, // correta: 2
			{"start()", "run()", "main()", "begin()"}, // correta: 3
			{"Class", "Method", "Package", "Array"}, // correta: 4
			{"extends", "super", "inherit", "parent"}, // correta: 1
			{"=", "!=", "==", "++"} // correta: 3
		};

		int [] alternativasCorretas = {
			2,
			4,
			1,
			3,
			2,
			1,
			4,
			3,
			1,
			4,
			2,
			3,
			4,
			1,
			3
		};
		
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
			if(pergunta >= perguntas.length){
				break;
			}
					
			System.out.println("------------------------ ");
			System.out.println("QUEM QUER DISPENSAR JAVA?");
			System.out.println("------------------------ ");
			
			System.out.println("Pergunta:" + (pergunta+1) + "/" + perguntas.length );
			System.out.println(perguntas[pergunta]);
			System.out.println(" ");
			
			for(int n = 0;n<4;n++){
				System.out.println((n+1) + "-" + 
					alternativas[linha][n]);
					
			}
			
			System.out.println(" ");
			
			System.out.println("Escolha uma alternativa que ache correta:");
			int respostaUsuario = input.nextInt();
			
			if(respostaUsuario<1 || respostaUsuario >4){
				System.out.println("Opcao invalida escolha uma alternativa entre 1 a 4 ");
				continue;
			}
			
			System.out.println(" ");
			
			if(respostaUsuario  != alternativasCorretas[ac]){
				vidas--;			
				pergunta++;
				ac++;
				linha++;
				
				for(int q = 0;q<30;q++){
					System.out.println(" ");
				}			
				System.out.println("Resposta errada!! ficou com apenas " + vidas + " vidas");
				System.out.println(" ");
				continue;
			}
				
			
			pontuacao+=100;
			pergunta++;
			ac++;
			linha++;
			acertos++;
			
			for(int q = 0;q<30;q++){
				System.out.println(" ");
			}
			System.out.println("Certa resposta... MAIS 100 PONTOS " );
			System.out.println(" ");			
		

			
		}

		System.out.println("Restou com " + vidas + " vidas");
		System.out.println("Pontuacao obtida: " + pontuacao);
		System.out.println("Perguntas Acertadas:" + acertos);
		
		
		
	}
	
}