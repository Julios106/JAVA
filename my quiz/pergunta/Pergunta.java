package pergunta;

public class Pergunta{
	
	private String enunciado;
	private String[] alternativas;
	private int respostaCorreta;
	private String categoria;
	
	public Pergunta(String enunciado){
		this.enunciado = enunciado;
	}
	
	public Pergunta(String enunciado,String[] alternativas,int respostaCorreta,String categoria){
		this.enunciado = enunciado;
		this.alternativas = alternativas;
		this.respostaCorreta = respostaCorreta;
		this.categoria = categoria;	
	}
	
	//geters

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getCategoria() {
        return categoria;
    }
	
	
}