import java.util.Scanner;

class Aluno{
		
		String nome;
		int idade;
		String curso;
		
		Aluno(String nome,int idade,String curso){
			this.nome = nome;
			this.idade = idade;
			this.curso = curso;
		}
		
		void apresentar(){
			System.out.println("Ola,meu nome e " + nome + " tenho " + idade 
				+ " anos de idade e estou a frequentar o curso de "+ curso + ".");
		}
		
		void mostrar (){
			
			IO.println("Nome:" + nome);
			IO.println("Idade:" +idade);
			IO.println("Curso:" + curso);			
			
		}
		
}


public class Exercicio1 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Aluno[] array = new Aluno[4];

	IO.println(" ");
	for( int i = 0 ; i<5; i++){
		
		IO.println("Aluno "+(i+1));
		IO.println(" ");
		
		System.out.println("digite o seu nome:");
		String nome = input.nextLine();
		
		System.out.println("digite Sua idade:");
		int idade = input.nextInt();
		
		input.nextLine();//para limpar o enter
		System.out.println("digite o curso que esta a frequentar:");
		String curso = input.nextLine();		
		
		array[i] = new Aluno (nome,idade,curso);
		
		
	}
		
	for(int i = 0 ; i<5; i++){
		IO.println(" ");
		array[i].mostrar();
		IO.println(" ");
	}
	}
	
}