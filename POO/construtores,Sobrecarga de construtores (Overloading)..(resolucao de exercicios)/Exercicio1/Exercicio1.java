
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
		
}


public class Exercicio1 {
	
	public static void main(String[] args){
		
		Aluno aluno1 = new Aluno("Julios",23,"informatica");
		aluno1.apresentar();
		
		Aluno aluno2 = new Aluno("miro",23,"medicina");
		aluno2.apresentar();
		
	}
	
}