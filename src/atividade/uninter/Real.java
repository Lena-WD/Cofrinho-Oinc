package atividade.uninter;

/**
 * Representa a moeda em Real.
 */
public class Real extends Moeda{
	
	public Real(double valor) {
		super(valor); //chama o construtor da classe Moeda
}
	
	@Override
	public void info() {
		System.out.println("Real - R$" + valor);
	}
	@Override
	public double converter() {
		return valor; //Já está em real
	}
}
