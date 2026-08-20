package pergunta;
import pergunta.Pergunta;
import java.util.ArrayList;

public class BancoPergunta{
	
	private ArrayList<Pergunta> perguntas;
	
	public BancoPergunta(){
		
		perguntas = new ArrayList<>();;
		
		carregarPergunta();
		
		
	}
	
	public void carregarPergunta(){
		
		perguntas.add(new Pergunta(
			"Qual destes é um banco de dados relacional?",
			new String[]{"MySQL", "MongoDB", "Redis", "Git"},
			1,
			"Tecnologia"
		));
			
		perguntas.add(new Pergunta(
			"Qual função é usada para imprimir algo no terminal em C?",
			new String[]{"console()", "print()", "write()", "printf()"},
			4,
			"Informatica"		
			
		));

		perguntas.add(new Pergunta(
			"Qual é a capital de Moçambique?",
			new String[]{"Maputo", "Beira", "Nampula", "Matola"},
			1,
			"Cultura Geral"
		));

		perguntas.add(new Pergunta(
			"Qual planeta é conhecido como Planeta Vermelho?",
			new String[]{"Júpiter", "Marte", "Saturno", "Vénus"},
			2,
			"Ciências"
		));

		perguntas.add(new Pergunta(
			"Quanto é 12 × 8?",
			new String[]{"86", "92", "96", "108"},
			3,
			"Matemática"
		));

		perguntas.add(new Pergunta(
			"Qual linguagem é conhecida por utilizar o método main como ponto de entrada?",
			new String[]{"HTML", "Java", "CSS", "SQL"},
			2,
			"Informática"
		));

		perguntas.add(new Pergunta(
			"Qual componente de um computador é responsável principalmente pelo processamento das instruções?",
			new String[]{"RAM", "SSD", "CPU", "Fonte de alimentação"},
			3,
			"Informática"
		));

		perguntas.add(new Pergunta(
			"Qual destes é um sistema operativo?",
			new String[]{"Windows", "Chrome", "Java", "Python"},
			1,
			"Informática"
		));

		perguntas.add(new Pergunta(
			"Qual é o maior oceano da Terra?",
			new String[]{"Atlântico", "Índico", "Pacífico", "Ártico"},
			3,
			"Geografia"
		));

		perguntas.add(new Pergunta(
			"Qual gás é mais abundante na atmosfera terrestre?",
			new String[]{"Oxigénio", "Azoto", "Dióxido de carbono", "Hidrogénio"},
			2,
			"Ciências"
		));

		perguntas.add(new Pergunta(
			"Em C, qual função é usada para imprimir texto no terminal?",
			new String[]{"scanf()", "input()", "printf()", "print()"},
			3,
			"Programação"
		));

		perguntas.add(new Pergunta(
			"Qual palavra-chave é utilizada para herança entre classes em Java?",
			new String[]{"inherit", "extends", "implements", "super"},
			2,
			"Programação"
		));

		perguntas.add(new Pergunta(
			"Qual é o resultado de 2⁵?",
			new String[]{"10", "16", "25", "32"},
			4,
			"Matemática"
		));

		perguntas.add(new Pergunta(
			"Qual destes animais é um mamífero?",
			new String[]{"Tubarão", "Golfinho", "Crocodilo", "Pinguim"},
			2,
			"Biologia"
		));

		perguntas.add(new Pergunta(
			"Qual componente é utilizado para armazenar dados permanentemente em um computador?",
			new String[]{"RAM", "CPU", "SSD", "GPU"},
			3,
			"Informática"
		));

		perguntas.add(new Pergunta(
			"Qual é o símbolo químico do ouro?",
			new String[]{"Ag", "Au", "Fe", "O"},
			2,
			"Química"
		));

		perguntas.add(new Pergunta(
			"Quem escreveu a obra 'Dom Quixote'?",
			new String[]{"William Shakespeare", "Miguel de Cervantes", "Machado de Assis", "Fernando Pessoa"},
			2,
			"Literatura"
		));

		perguntas.add(new Pergunta(
			"Qual protocolo é normalmente utilizado para acessar páginas web através de uma conexão segura?",
			new String[]{"FTP", "HTTP", "HTTPS", "SMTP"},
			3,
			"Tecnologia"
		));

		perguntas.add(new Pergunta(
			"Qual destes dispositivos é utilizado para encaminhar dados entre redes?",
			new String[]{"Router", "Monitor", "Teclado", "Scanner"},
			1,
			"Redes"
		));

		perguntas.add(new Pergunta(
			"Qual é o resultado de 15 + 27?",
			new String[]{"40", "42", "44", "45"},
			2,
			"Matemática"
		));

		perguntas.add(new Pergunta(
			"Qual órgão do corpo humano é responsável por bombear o sangue?",
			new String[]{"Pulmão", "Fígado", "Coração", "Rim"},
			3,
			"Biologia"
		));


		
	}
	
	public ArrayList<Pergunta> getPerguntas(){
		return perguntas;
	}
	
	
}

