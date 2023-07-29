package aula7;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	

	
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			
		}
		

	}
	public void lutar() {
		
		if (this.aprovada) {
			System.out.println("DESAFIADO");
			this.desafiado.apresentar();
			System.out.println("DESAFIANTE");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor){
				case 0:
					System.out.println("Empatou");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
			
				case 1:
					System.out.println("Venceu o " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();					
					break;
				case 3:
					System.out.println("Venceu o " + this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
		}else {
			System.out.println("Luta não pode acontecer");
		}
		
		
	}
	
	
	

	
	public Lutador getDesafiado() {
		return this.desafiado;
		
	}
	public void setDesafiado(Lutador des) {
		this.desafiado = des;
	
	}
	public Lutador getDesafiante() {
		return this.desafiante;
		
	}
	public void setDesafiante(Lutador de) {
		this.desafiante = de;
	
	}
	public int getRounds() {
		return this.rounds;
		
	}
	public void setRounds(int r) {
		this.rounds = r;
	}
	public boolean getAprovada() {
		return this.aprovada;
		
	}
	public void setAprvada(boolean a) {
		this.aprovada = a;
	}
		
		
}


