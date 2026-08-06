class Aluno{
	
	private String nome;
	private int idade;
	private String curso;
	private double media;
	
	
	Aluno(String nome,int idade,String curso){
		
		if(idade >0){
			this.nome = nome;
			this.idade = idade;
			this.curso=curso;
			this.media = 0;		
		}
		

	}
	
	void mostrarAluno(){
		System.out.println("Nome:"+ nome);
		System.out.println("Idade:"+idade);
		System.out.println("Curso:"+curso);
		System.out.println("Media:"+media);
		if(media >=10){
			System.out.println("Situacao:Aprovado");
		}else{
			System.out.println("Situacao:Reprovado");
		}
	}
	
	//getters
	public String getNome(){
		return nome;
		
	}
	
	public String getCurso(){
		return curso;
	}
	
	public int getIdade(){
		
		return idade;
	}
	
	public double getMedia(){
		return media;
	}
	
	//setters
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		if(idade >= 0){
			this.idade = idade;
		}
	}
	
	public void setCurso(String codigo,String curso){
		if(codigo.equals("12345678")){
			this.curso = curso;
		}else{
			System.out.println("Error! codigo incorreto entao vc nao tem autorizacao para esta operacao");
		}
	}
	
	public void setMedia(double nota1,double nota2){
		
		double mediaFinal = (nota1+nota2)/2;
		
		if(mediaFinal >= 0 && mediaFinal<=20){
			
			this.media = mediaFinal;
		}else {
			System.out.println("Error! as notas devem estar dentro do intervalo de 0 a 20");
		}
		
	}
	
	
	
}



public class Exercicio1{
	
	public static void main(String[] args){
		
		Aluno aluno1 = new Aluno("juliao",19,"informatica");
		aluno1.setMedia(16,18);
		aluno1.setCurso("12345","Eletronica");
		aluno1.mostrarAluno();
		
		
	}
	
}