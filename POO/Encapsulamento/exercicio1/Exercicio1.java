import java.util.Scanner;


class Config{
	static int MAX_ALUNOS = 2;	
}


class Aluno{
	
	private String nome;
	private int idade;
	private String curso;
	private double media;
	
	
	Aluno(String nome,int idade,String curso){
		
		if(idade >0){
			this.nome = nome;
			this.idade = idade;
			this.curso=curso;
			this.media = 0;		
		}else{
			System.out.println("Dados invalidos. Codigo: Erro no constructor");			
		}
		

	}
	
	void mostrarAluno(){
		System.out.println("");	
		System.out.println("Nome:"+ nome);
		System.out.println("Idade:"+idade);
		System.out.println("Curso:"+curso);
		System.out.println("Media:"+media);
		if(media >=10){
			System.out.println("Situacao:Aprovado");
		}else{
			System.out.println("Situacao:Reprovado");
		}
	}
	
	//getters
	public String getNome(){
		return nome;
		
	} 
	
	public String getCurso(){
		return curso;
	}
	
	public int getIdade(){
		
		return idade;
	}
	
	public double getMedia(){
		return media;
	}
	
	//setters
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		if(idade >= 0){
			this.idade = idade;
		}
	}
	
	public void setCurso(String codigo,String curso){
		if(codigo.equals("12345678")){
			this.curso = curso;
		}else{
			System.out.println("Error! codigo incorreto entao vc nao tem autorizacao para esta operacao");
		}
	}
	
	public void setMedia(double nota1,double nota2){
		
		double mediaFinal = (nota1+nota2)/2;
		
		if(mediaFinal >= 0 && mediaFinal<=20){
			
			this.media = mediaFinal;
		}else {
			System.out.println("Error! as notas devem estar dentro do intervalo de 0 a 20");
		}
		
	}
	
	
	
	
}

class Sistema{
	
	void cadastrarAluno(Aluno[] alunos,Scanner input){
		/*
			
			
	
			int startPosition = 0;
			boolean isFull = false;
			for(int n = 0 ; n<Config.MAX_ALUNOS; n++){
				if(alunos[n] == null){
					startPosition = n;
					isFull = false;
					break;
				}else {
					isFull = true;	
				}					
			}		
		
		
		
		*/
		

			

			
			

			for(int i =0; i<Config.MAX_ALUNOS;i++){
				
				
				System.out.println("Aluno " + (i+1) );
				System.out.println("");				
				System.out.println("Digite o nome:");
				String nome = input.nextLine();
				
				System.out.println("Digite a idade:");
				int idade = input.nextInt();
				
				input.nextLine();
				
				System.out.println("Digite o curso:");
				String curso = input.nextLine();
				
				alunos[i] = new Aluno(nome,idade,curso);
				
				System.out.println("Digite a nota 1:");
				double nota1 = input.nextDouble();
				
				System.out.println("digite a nota 2");
				double nota2 = input.nextDouble();
				
				alunos[i].setMedia(nota1,nota2);
				
				System.out.println("Operacao feita com sucesso!");	
				input.nextLine();
				
			}
				
		}	
		
		void procurarAluno(Aluno[] alunos,Scanner input){
			System.out.println("Digite o nome:");
			String nome = input.nextLine();
			Boolean encontrado = false;
			
			for(int i = 0; i<Config.MAX_ALUNOS ; i++){
				
				if(alunos[i] != null){
					if(alunos[i].getNome().equals(nome)){
						alunos[i].mostrarAluno();
						encontrado = true;
					}					
				}
				
				

			}
			
				if(encontrado == false){
					System.out.println("Aluno nao encontrado");
				}
			
		}
		
	
}


public class Exercicio1{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Sistema sistema = new Sistema();
		Aluno [] alunos = new Aluno[Config.MAX_ALUNOS];
		
		
		int opcao = 90;
		
		while(opcao != 0){
			System.out.printf("1-Cadastrar\n2-Listar\n3-Procurar\n0-Sair\n\nSelecione uma opcao:");
			opcao = input.nextInt();
			input.nextLine();	
			
			
			switch(opcao){
					
					case 1:
						System.out.println("");
						sistema.cadastrarAluno(alunos,input);
						break;
					case 2:
						System.out.println("");
						System.out.println("Lista de alunos");
						System.out.println("");
						
						Boolean temAluno = false;
					
						for(int n = 0;n<Config.MAX_ALUNOS;n++){
							if(alunos[n] != null){
								alunos[n].mostrarAluno();	
								temAluno = true;								
							}

						}
						if(temAluno == false){
							System.out.println("Nenhum aluno foi cadastrado");
						}
						
						System.out.println("");
						break;
						
					case 3:
						System.out.println("");
						sistema.procurarAluno(alunos,input);
						System.out.println("");
						break;
						
					case 0:
						System.out.println("saindo");
						break;
					
					default:
						System.out.println("Opcao invalida");
						break;
				}						
		}
		
		
		

	}
	
}