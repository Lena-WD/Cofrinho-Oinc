package atividade.uninter;

import java.util.ArrayList;

/**
 * Representa um cofrinho que armazena diferentes moedas.
 */

public class Cofrinho {
	//A lista que armazena as moedas
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	/**
	 * Adiciona uma moeda ao cofrinho :)
	 */
	
	public void adicionar(Moeda moeda) {
	listaMoedas.add(moeda);
}

/**
 * Remove uma moeda do cofrinho.
 */
	
public boolean remover(Moeda moeda) {
	return listaMoedas.remove(moeda);
}

/**
 * Lista todas as moedas no cofrinho.
 */

public void listarMoedas() {
	if(listaMoedas.isEmpty()) {
		System.out.println("⚠️ O cofrinho está vazio! Que tal adicionar umas moedinhas? 💸");
	} else {
		System.out.println("📋 Moedas no cofrinho:");
		System.out.println("🐷 Total: " + listaMoedas.size() + " moedas.");
		for (Moeda moeda: listaMoedas) {
			moeda.info();
		}
	}
	
}

/**
 * Retorna o total de todas as moedas convertidas para Real.
 */
public double totalConvertido() {
	double total = 0;
	for (Moeda moeda : listaMoedas) {
		total += moeda.converter();
	}
	return total;
	
	}
}



