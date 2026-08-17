import java.util.Scanner;

class Aluno{
		
		String nome;
		int idade;
		String curso;
		
		void apresentar(){
			System.out.println("Ola,meu nome e " + nome + " tenho " + idade 
				+ " anos de idade e estou a frequentar o curso de "+ curso + ".");
		}
		void gravar(String nome, int idade , String curso){
			this.nome = nome;
			this.idade = idade;
			this.curso = curso;	
		}
		
}


public class Exercicio1 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o seu nome:");
		String nome = input.nextLine();
		
		System.out.println("digite Sua idade:");
		int idade = input.nextInt();
		
		input.nextLine();//para limpar o enter
		System.out.println("digite o curso que esta a frequentar:");
		String curso = input.nextLine();
		
		Aluno aluno1 = new Aluno();
		
		aluno1.gravar(nome,idade,curso);
		aluno1.apresentar();
		
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "miro";
		aluno2.idade = 13;
		aluno2.curso = "Medicina";
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "nelsa";
		aluno3.idade = 5;
		aluno3.curso = "bebe";
		
		aluno2.apresentar();
		aluno3.apresentar();
		
	}
	
}