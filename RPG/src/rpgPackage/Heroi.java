package rpgPackage;

public class Heroi extends Personagem {
	private int mana;

	public Heroi(String nome, int vida, int defesa, int ataque, int mana) {
		super(nome, vida, defesa, ataque);
		this.mana = mana;
	}

}
