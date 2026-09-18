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
		IO.println(" ");
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
	
	private String departamento;
	
	public Gerente(String nome,int idade,double salario , String departamento){
		super(nome , idade , salario);
		
		this.departamento = departamento;
			
	}
	
	public void gerenciar(){
		
		IO.println("Gerente do departamento: " + departamento);
			
	}
	
	public void apresentar(){
		super.apresentar();
		IO.println("Departamento:"+departamento);
	}
	
	
	public String getDepartamento(){
		return departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
}

class GerenteGeral extends Gerente{
	
	private int quantidadeFuncionario;
	
	public GerenteGeral(String nome,int idade,double salario , String departamento , int quantidadeFuncionario){
		super(nome , idade , salario , departamento);
		
		this.quantidadeFuncionario = quantidadeFuncionario;
	}
	
	
	
	public void apresentar(){
		super.apresentar();
		IO.println("Numeors de funcionarios:"+quantidadeFuncionario);
		
	}
	
	
}

class Exercicio2{
	
	public static void main(String[] args){
		
		Funcionario trabalhador = new Funcionario("zebito" , 19 , 200000);
		trabalhador.apresentar();
		
		Gerente diretor = new Gerente("cota limao "  , 34 , 100000 , "yz");
		diretor.apresentar();
		
		GerenteGeral boss = new GerenteGeral("Julios" , 19 , 1000000 , "empresa" , 1000);
		boss.apresentar();
		
		
	}
	
}