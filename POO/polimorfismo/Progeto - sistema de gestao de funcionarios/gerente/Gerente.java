package gerente;
import funcionario.Funcionario;

public class Gerente extends Funcionario{
	private String departamento;
	private int quantFuncionarios;
	
	public Gerente(String nome ,int idade , double salario ,String departamento , int quantFuncionarios){
		super(nome,idade,salario);
		
		this.departamento = departamento;
		this.quantFuncionarios = quantFuncionarios;
		
		setCargo("Gerente");
		
	}
	
	//constructor para testes
	public Gerente(){
		super("juliao" , 19 , 20000);
		
		this.departamento = "Departamento Z";
		this.quantFuncionarios = 30;
		setCargo("Gerente");
		
	}
	
	@Override
	public void informacoes(){
		super.informacoes();
		IO.println("Depertamento:" + departamento);
		IO.println("Numeros de funcionarios:" + quantFuncionarios);
	}
	
	@Override
	public double calcularBonus(double s){
		//20% do salario
		return s*(20.0/100.0);
	}
	
	
	//setters
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public void setQuantiFuncionarios(int quantFuncionarios){
		this.quantFuncionarios = quantFuncionarios;
	}
	
	//getters
	
	public String getDepartamento(){
		return departamento;
	}
	
	public int getQuantfuncionarios(){
		return quantFuncionarios;
	}
}