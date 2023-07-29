package aula7;

public class Aula7 {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador ( "Prety Boy","França",31,1.75f,68.9f,11,2,1);
		
		
		System.out.println("-----------------");
		System.out.println("PRIMEIRO LUTADOR:");
		//l1.apresentar();
		l[0].status();
		
		l[1] = new Lutador ("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
		System.out.println("----------------");
		System.out.println("SEGUNDO LUTADOR:");
		//l2.apresentar();
		l[1].status();
		
		l[2] = new Lutador("Isnapshadow","EUA",35,1.65f,80.9f,12,2,1);
		System.out.println("----------------");
		System.out.println("TERCEIRO LUTADOR:");
		//l2.apresentar();
		l[2].status();
		
		
		l[3] = new Lutador ("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
		System.out.println("----------------");
		System.out.println("QUARTO LUTADOR:");
		//l2.apresentar();
		l[3].status();
		
		l[4] = new Lutador ("Luan","Brasil",37,1.70f,110.3f,5,4,3);
		System.out.println("----------------");
		System.out.println("QUINTO LUTADOR:");
		//l2.apresentar();
		l[4].status();
		
		l[5] = new Lutador("Netdaarck","EUA",30,1.81f,105.7f,12,2,4);
		System.out.println("----------------");
		System.out.println("SEXTO LUTADOR:");
		//l2.apresentar();
		l[5].status();
		
		Luta uec01 = new Luta();
		
		uec01.marcarLuta(l[0],l[1]);
		System.out.println("VAMOS AO COMBATE");
		uec01.lutar();
		
		
	
		
		
	}
	
	
	
	
	

	
}
