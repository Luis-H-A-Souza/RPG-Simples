package rpgPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Combate combate = new Combate();
		Funcao fc = new Funcao();
		int aux;
		
		System.out.println("Bem-vindo ao RPG simples\n");
		fc.escolherClasse();
		Heroi jogador = fc.getJogador();
		
		System.out.println("\nUm Goblin surge do escuro!\n");
		fc.Leitura();
		Inimigo goblin = new Goblin();
		combate.iniciarCombate(jogador, goblin);
		fc.Leitura();
		
		System.out.println("\nUm Orc aparece para te enfrentar!\n");
		fc.Leitura();
		Inimigo orc = new Orc();
		combate.iniciarCombate(jogador, orc);
		fc.Leitura();
		
		System.out.println("\nUm Dragão rasga os céus!\n");
		fc.Leitura();
		Inimigo dragao = new Dragao();
		combate.iniciarCombate(jogador, dragao);
		fc.Leitura();
		
		if (jogador.estaVivo()) {
			System.out.println("\nParabéns, você derrotou todos os Inimigos!");
		} else {
			System.out.println("\nVocê Morreu!");
		}
		
	}

}
