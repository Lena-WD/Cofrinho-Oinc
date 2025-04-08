package atividade.uninter;

/**
**Classe abstrata que representa uma moeda.
*Serve como base para outras moedas como: Real, Dólar e Euro.
*/

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	//Exibe informações da moeda
	public abstract void info();

	//Converte o valor da moeda para Real
	public abstract double converter ();
	
	
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    Moeda other = (Moeda) obj;
    return Double.compare(valor, other.valor) == 0;
    
	}
}



