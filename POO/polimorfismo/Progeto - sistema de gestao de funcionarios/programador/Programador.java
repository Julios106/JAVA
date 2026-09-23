package programador;
import funcionario.Funcionario;

public class Programador extends Funcionario{
	private String linguagem;
	private String experiencia;
	
	public Programador(String nome ,int idade , double salario , String linguagem , String experiencia){
		super(nome , idade , salario);
		this.linguagem = linguagem;
		this.experiencia = experiencia;
		
		setCargo("Programador");
	}
	
	//constructor para testes
	public Programador(){
		super("Julios" , 19 , 20000 );
		this.linguagem = "java";
		this.experiencia = "junior";
		
		setCargo("Programador");
	}
	
	@Override
	public void informacoes(){
		super.informacoes();
		IO.println("Linguagem:" + linguagem);
		IO.println("Experiencia:" + experiencia);

	}
	
	@Override
	public double calcularBonus(double s){
		//15% do salario
		return s*(15.0/100.0);
	}
	
	//setters
	public void setLinguagem(String linguagem){
		this.linguagem = linguagem;
	}
	
	public void setExperiencia(String experiencia){
		this.experiencia = experiencia;
	}
	
	//getters
	public String getLinguagem(){
		return linguagem;
	}
	
	public String getExperiencia(){
		return experiencia;
	}
		
	
	
}