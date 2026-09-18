
 class Pessoa{
	
	public String nome;
	public int idade;
	
	Pessoa(String nome,int idade){
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public void apresentar(){
		
		System.out.printf("Ola meu nome e %s e tenho %d anos de idade.\n",nome,idade);
	}
	
}

 class Aluno extends Pessoa{
	
	public String curso;
	
	Aluno(String nome,int idade,String curso){
		
		super(nome,idade);
		
		this.curso = curso;
		
	}
	
	public void estudar(){
		IO.println("Estudante atual de " + curso);
	}
	

}



public class Exemplo2 {
	
	public static void main(String[] args){
		
		Aluno aluno1 = new Aluno("juliao",19,"informatica");
		
		aluno1.apresentar();
		aluno1.estudar();
		
		
	}
	
}
