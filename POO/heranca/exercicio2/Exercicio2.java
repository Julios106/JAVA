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

class Gerente extends Funcionario{
	
	
	
}