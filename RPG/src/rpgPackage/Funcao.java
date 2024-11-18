package rpgPackage;

import java.util.Scanner;

public class Funcao {
	Scanner sc = new Scanner(System.in);
	private Heroi jogador;

	public Heroi getJogador() {
		return jogador;
	}

	public void setJogador(Heroi jogador) {
		this.jogador = jogador;
	}


	public void Leitura() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void classeGuerreiro() {
		jogador = new Guerreiro();
	}

	public void classeMago() {
		jogador = new Mago();
	}

	public void classeArqueiro() {
		jogador = new Arqueiro();
	}

	public void escolherClasse() {
		int classe;
		System.out.println("Escolha sua classe:\n1 - Guerreiro\n2 - Mago\n3 - Arqueiro\n");
		do {
			System.out.print("Ecolha sua classe: ");
			classe = sc.nextInt();
			switch (classe) {
			case 1:
				classeGuerreiro();
				break;
			case 2:
				classeMago();
				break;
			case 3:
				classeArqueiro();
				break;
			default:
				System.out.println("\nEscolha uma classe válida!\n");
			}
		} while (classe < 1 || classe > 3);
	}
}
