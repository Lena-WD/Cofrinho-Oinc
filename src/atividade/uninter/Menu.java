package atividade.uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner scanner = new Scanner(System.in); // Scanner para ler entrada do usuário.
	private Cofrinho cofrinho = new Cofrinho(); // Instancia o cofrinho que armazena as moedas.
	
	/**
	 * Mosta o menu principal com as opções para o usuário.
	 */
	
	public void mostrarMenuPrincipal() {
		int opcao = 0;
		
		// Boas-vindas com ASCII art do porquinho
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("     (\")___(\")");
        System.out.println("     (='.'=)  Bem-vindo(a) ao");
        System.out.println("    (\")___(\")  Cofrinho Oinc oinc! 🐷✨");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
        System.out.println("Guarde suas moedas mágicas com carinho... 💫");
		
		//Enquanto a opção for diferente de 5, continua executando.
		while (opcao != 5) {
			
			System.out.println("─────────────────────────────────────");
			System.out.println("=== MENU DO COFRINHO 🐷 ===");
			System.out.println("1 - Adicionar moeda 💰");
			System.out.println("2 - Remover moeda ❌");
			System.out.println("3 - Listar moedas 📋");
			System.out.println("4 - Calcular total em Reais 💸");
			System.out.println("5 - Sair 🚪");
			System.out.println("─────────────────────────────────────");
			System.out.print("Escolha uma opção: ");
			
			opcao = scanner.nextInt(); //Lê a opção escolhida.
			
			// Executa a ação com base na opção.
			
			switch (opcao) {
			case 1:
				adicionarMoeda();
				break;
				
			case 2:
				removerMoeda();
				break;
				
			case 3:
				cofrinho.listarMoedas();
				break;
				
			case 4:
				System.out.print("\nCalculando total em Reais");
				for (int i = 0; i < 3; i++) {
				    System.out.print(".");
				    try {
				        Thread.sleep(500); // Espera 0.5 segundo.
				    } catch (InterruptedException e) {
				        e.printStackTrace();
				    }
				}
				System.out.println(); // Pula linha depois dos ...
				double total = cofrinho.totalConvertido();
				System.out.printf("Total convertido para Real: R$ %.2f\n", total);
				break;
				
			case 5:
				System.out.println("\nObrigada por usar o Cofrinho Oinc oinc! 🐷💖");
				System.out.println("Volte sempre para guardar mais moedas! ✨👛");
				break;
				default:
					System.out.println("⚠️ Opção inválida. Tente novamente.");
			}
			
		}
	}


	/**
	 * Adiciona uma moeda ao cofrinho 💲
	 */
	
	private void adicionarMoeda() {
		System.out.println("\nQual moeda deseja adicionar?");
		System.out.println("1 - Real 🇧🇷");
		System.out.println("2 - Dólar 🇺🇸");
		System.out.println("3 - Euro 🇪🇺");
		int tipo = scanner.nextInt();

		System.out.print("Informe o valor: ");
		double valor = scanner.nextDouble();

		Moeda moeda = null;

		// Cria a moeda com base no tipo informado.
		
		switch (tipo) {
			case 1:
				moeda = new Real(valor);
				break;
				
			case 2:
				moeda = new Dolar(valor);
				break;
				
			case 3:
				moeda = new Euro(valor);
				break;
				
			default:
				System.out.println("Tipo inválido.");
				return;
		}

		cofrinho.adicionar(moeda); // Adiciona a moeda ao cofrinho.
		System.out.println("✅ Moeda adicionada com sucesso 💰✨!");
	}

	/**
	 * Remove uma moeda do cofrinho.
	 */
	
	private void removerMoeda() {
		System.out.println("\nQual moeda deseja remover?");
		System.out.println("1 - Real 🇧🇷");
		System.out.println("2 - Dólar 🇺🇸");
		System.out.println("3 - Euro 🇪🇺");
		int tipo = scanner.nextInt();

		System.out.print("Informe o valor: ");
		double valor = scanner.nextDouble();

		Moeda moeda = null;

		// Cria a moeda para procurar e remover.
		
		switch (tipo) {
			case 1:
				moeda = new Real(valor);
				break;
				
			case 2:
				moeda = new Dolar(valor);
				break;
				
			case 3:
				moeda = new Euro(valor);
				break;
				
			default:
				System.out.println("Tipo inválido.");
				return;
		}

		boolean removido = cofrinho.remover(moeda); // Remove a moeda da lista.
		if (removido) {
		System.out.println("🗑️ Moeda removida com sucesso! 🧾");
		}else {
			System.out.println("🚫 Moeda não encontrada no cofrinho.");
		}
	}
}
	
