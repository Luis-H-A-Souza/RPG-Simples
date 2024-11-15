package rpgPackage;

public class Main {

	public static void main(String[] args) {
		Heroi jogador = new Guerreiro("Arthur");
		Inimigo inimigo = new Goblin();
		Combate combate = new Combate();
		
		combate.iniciarCombate(jogador, inimigo);
	}

}
