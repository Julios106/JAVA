
class Funcionario{
	public String nome;
	public double salario;
	
	public Funcionario(String nome , double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public void mostrarInfo(){
		IO.println("Nome:" + nome);
		IO.println("salario:" + salario);
	}
	
}

class Programador extends Funcionario{
	private String linguagem;
	
	Programador(String nome , double salario ,String linguagem){
		super(nome , salario);
		this.linguagem = linguagem;
	}
	
	@Override
	public void mostrarInfo(){
		super.mostrarInfo();
		IO.println("Linguagem:" + linguagem);
		
	}
	
}

class exercicio1{
	
	public static void main(String[] args){
		
		Funcionario f1 = new Programador("Julios" , 2000 , "Java");
		
		//Java encontra mostrarInfo() através de Funcionario, mas em execução percebe que o objeto real é Programador
		f1.mostrarInfo();
		
	}
	
}