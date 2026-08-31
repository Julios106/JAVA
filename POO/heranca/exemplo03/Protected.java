class Pessoa{
	private String nome;
	protected int idade;
	public String nacionalidade;
	
	public Pessoa(String nome , int idade , String nacionalidade){
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
		
	}
	
	public void apresentar(){
		IO.println("Ola meu nome e " + nome + " tenho " + idade + " anos de idade e sou de " + nacionalidade); 
		
	}
	
	public String getNome(){
		return nome;
	}
	
}

class Aluno extends Pessoa {
	private int id;
	private String curso;
	
	Aluno(String nome , int idade , String nacionalidade,int id , String curso){
		
		super(nome,idade,nacionalidade);
		
		this.id = id;
		this.curso = curso;
	}
	
	//sobrescrita de metodos
	//tou a sobrescrever o metodo da classe pai aqui na classe filha para ter um novo uso
	@Override
	public void apresentar(){
		super.apresentar();
		IO.println("Tou a fazer curso de " + curso);
		
	}
	
	public void mostrar(){
		
		IO.println("Id:" + id);
		IO.println("nome:"+getNome());
		IO.println("Idade:" + idade);
		IO.println("Curso:" + curso);
		IO.println("nacionalidade:"+ nacionalidade);	
		
	}
	
}



public class Protected{
	
	public static void main(String[] args){
		
		Aluno p1 = new Aluno("julios",19,"mocambique",1,"Informatica");
		//p1.idade = -21;
		p1.apresentar();
		IO.println(" ");
		p1.apresentar();
		p1.mostrar();
		
	}
	
	
}