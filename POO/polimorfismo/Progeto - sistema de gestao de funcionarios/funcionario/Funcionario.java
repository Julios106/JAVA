package funcionario;

public class Funcionario{
	protected String nome;
	protected int idade;
	protected double salario;
	protected String cargo = "nao definido";
	
	public Funcionario(String nome ,int idade , double salario){
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;	
	}
	
	public void informacoes(){
		IO.println(" ");
		IO.println("Nome:" + nome);
		IO.println("Idade:" + idade);
		IO.println("Salario:" + salario + " MT");	
		IO.println("Cargo:" + cargo);
	}
	
	public double calcularBonus(double s){
		IO.println("hummm");
		return s;
	}
	
	//setters
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade_funcionario){
		if(idade_funcionario > 0){
			this.idade = idade_funcionario;
		}else {
			IO.println("Insirio uma idade invalida");
		}
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	//getters
	public String getNome(){
		return nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public String getCargo(){
		return cargo;
	}
		
	
}