package rpgPackage;

import java.util.Scanner;

public class Combate {
	Scanner sc = new Scanner(System.in);
	private Heroi heroi;
	private Inimigo inimigo;

	public Heroi getHeroi() {
		return heroi;
	}

	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}

	public Combate(Heroi heroi, Inimigo inimigo) {
		this.heroi = heroi;
		this.inimigo = inimigo;
	}

	public void turnoJogador() {
		int aux = 0;
		System.out.println("\nEscolha o que deseja fazer:");
		do {
			System.out.println("1 - Ataque Básico\n2 - Ataque Especial");
			System.out.print("\nInforme sua ação: ");
			aux = sc.nextInt();
			if (aux != 1 && aux != 2) {
				System.out.println("\nAção Invalida!\n");
			}
		} while (aux != 1 && aux != 2);
		if (aux == 1) {
			int dano = heroi.atacar();
			inimigo.receberDano(dano);
		} else {
			int dano = heroi.ataqueEspecial();
			inimigo.receberDano(dano);
		}
	}

	public void turnoInimigo() {
		int dano = inimigo.atacar();
		heroi.receberDano(dano);
	}

	public void iniciarCombate() {
		System.out.println(heroi.getNome() + " Versus " + inimigo.getNome());
		do {
			turnoJogador();
			if (inimigo.estaVivo()) {
				turnoInimigo();
			}
		} while (heroi.estaVivo() && inimigo.estaVivo());

		if (heroi.estaVivo()) {
			System.out.println(heroi.getNome() + "Venceu o combate!");
		} else {
			System.out.println(inimigo.getNome() + "Venceu o combate!");
		}
	}
}
