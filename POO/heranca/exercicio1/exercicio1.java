class Funcionario{
	
	private String nome;
	private int idade;
	private double salario;
	
	
	Funcionario(String nome,int idade,double salario){
		
		this.nome = nome;
		this.idade= idade;
		this.salario = salario;
		
	}
	
	public void apresentar(){
		
		IO.println("Nome:" + nome);
		IO.println("Idade:" + idade);
		IO.println("Salario:" + salario + "MT");
		
	}
	
	//getter
	
	public String getNome(){
		return nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public double getSalario(){
		return salario;
	}
	
	
	//setter
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void idade(int idade){
		if(idade > 0){
			this.idade = idade;
		}else{
			IO.println("Idade invalida");
		}
		
	}
	
	public void setSalario(){
		
		
		if(salario > 0){
			this.salario = salario;
		}else{
			IO.println("Salario invalida");
		}
	}
	
}

class Programador extends Funcionario{
	
	private String linguagem;
	
	Programador(String nome,int idade,double salario,String linguagem){
		
		super( nome, idade,salario);
		
		this.linguagem = linguagem;
		
	}
	
	//@Override
	public void apresentar(){
		super.apresentar();
		
		IO.println("Linguaem:" + linguagem);
		
	}
	
	public void programa(){
		IO.println("Estou programando em " + linguagem);
		
	}
	
	
	
}


public class exercicio1{
	
	public static void main(String[] args){
		
		Funcionario func = new Funcionario("Goenha" , 19, 100);
		//func.setNome("Andre");
		func.apresentar();

		
		
		
		Programador func1 = new Programador("julios" , 19,20000,"javaSript");
		
		func1.apresentar();
		
	}
	
}