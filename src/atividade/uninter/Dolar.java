package atividade.uninter;
/**
 * Representa a moeda em Dólar.
 */
public class Dolar extends Moeda {
	public Dolar(double valor) {
		super(valor);
		
	}
	
	@Override 
	public void info() {
		System.out.println("Dólar - US$" + valor);
	}
	
	@Override
	public double converter() {
		return valor * 5.0; //conversão para real
	}
}
