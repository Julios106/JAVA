
 class Pessoa{
	
	public String nome;
	public int idade;
	
	public void apresentar(){
		
		System.out.printf("Ola meu nome e %s e tenho %d anos de idade.\n",nome,idade);
	}
	
}

 class Aluno extends Pessoa{
	
	public String curso;
	
	public void estudar(){
		IO.println("Estou estudando " + curso);
	}
	
	public void gravarAluno(String nome,int idade,String curso){
		
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		
	}
	
}



public class Exemplo1 {
	
	public static void main(String[] args){
		
		Aluno aluno1 = new Aluno();
		
		aluno1.gravarAluno("juliao",19,"informatica");
		
		aluno1.apresentar();
		aluno1.estudar();
		
		
	}
	
}