package designer;
import funcionario.Funcionario;

public class Designer extends Funcionario{
	
	private String ferramenta;
	
	public Designer(String nome ,int idade , double salario , String ferramenta){
		super(nome , idade , salario);
		this.ferramenta = ferramenta;
		
		setCargo("Designer");
	}	
	
	@Override
	public void informacoes(){
		super.informacoes();
		IO.println("Ferramenta:" + ferramenta);
	}
	
	@Override
	public double calcularBonus(double s){
		//10% do salario
		return s*(10.0/100.0);
	}
	
	//setters
	public void setFerramenta(String ferramenta){
		this.ferramenta = ferramenta;
	}
	
	//getters
	public String getFerramenta(){
		return ferramenta;
	}
	
	
	
}