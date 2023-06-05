package aula7;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	
	public Lutador(String no,String na,int i,float a,float p,int v,int d,int e) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = i;
		this.altura = a;
		this.setPeso(p);
		this.vitorias = v;
		this.derrotas = d;
		this.empates = e;
	}

	public void apresentar() {
		System.out.println("-------APRESENTAÇÃO-------");
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println( getIdade() + " Anos");
		System.out.println( getPeso() + " kg");
		System.out.println( "Ganhou: " + getVitorias());
		System.out.println( "Perdeu: " + getDerrotas());
		System.out.println( "Empatou: " +getEmpates());
		
		
	}
	public void status() {
		System.out.println("----- STATUS -----");
		System.out.println(getNome());
		System.out.println("É um peso: " + getCategoria());
		System.out.println(getVitorias() + " Vitorias");
		System.out.println(getDerrotas() + " Derrotas");
		System.out.println(getEmpates() + " Empates");
		
		
		
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
		
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
		
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
		
	}

	
	
	
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setIdade(int i) {
		this.idade = i;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setAltura(float a) {
		this.altura = a;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setPeso(float p) {
		this.peso = p;
		this.setCategoria();
		
	}
	public float getPeso() {
		return this.peso;
	}
	
	public void setCategoria() {
		
		if (this.peso < 52.2) {
			this.categoria ="Invalido";
		}else if (this.peso <= 70.3) {
			this.categoria = "LEVE";
		}else if (this.peso <= 83.9) {
			this.categoria = "MEDIO";
		}else if (this.peso <= 120.2) {
			this.categoria = "PESADO";
		}else {
			this.categoria = "Invalido";
		}
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setVitorias(int v) {
		this.vitorias = v;
	}
	public int getVitorias() {
		return this.vitorias;
	}
	public void setDerrotas(int d) {
		this.derrotas = d;
	}
	public int getDerrotas() {
		return this.derrotas;
	}
	public void setEmpates(int e) {
		this.empates = e;
	}
	public int getEmpates() {
		return this.empates;
	}
	

	
	
}

	
