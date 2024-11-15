package rpgPackage;

public abstract class Heroi extends Personagem {
	private int mana;

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public Heroi(String nome, int vida, int ataque, int defesa, int mana) {
		super(nome, vida, ataque, defesa);
		this.mana = mana;
	}

	public abstract int ataqueEspecial();

}

class Guerreiro extends Heroi {

	public Guerreiro(String nome) {
		super(nome, 100, 20, 20, 30);
	}

	@Override
	public int atacar() {
		System.out.println(getNome() + " Ataca com sua espada!\n");
		return getAtaque();
	}

	@Override
	public int ataqueEspecial() {
		if (getMana() >= 10) {
			setMana(getMana() - 10);
			System.out.println(getNome() + " Usa um ataque especial com a espada!\n");
			return getAtaque() * 2;
		} else {
			System.out.println("Mana insuficiente, " + getNome() + " usa um ataque normal!\n");
			return getAtaque();
		}
	}
}

class Mago extends Heroi {

	public Mago(String nome) {
		super(nome, 50, 25, 5, 100);
	}

	@Override
	public int ataqueEspecial() {
		if (getMana() >= 20) {
			setMana(getMana() - 20);
			System.out.println(getNome() + " Conjura uma tempestade de raios!\n");
			return getAtaque() * 2;
		} else {
			System.out.println("Mana insuficiente, " + getNome() + " lança uma bola de fogo!\n");
			return getAtaque();
		}

	}

	@Override
	public int atacar() {
		System.out.println(getNome() + " lança uma bola de fogo!\n");
		return getAtaque();
	}

}

class Arqueiro extends Heroi {
	public Arqueiro(String nome) {
		super(nome, 75, 15, 7, 60);
	}
	
	@Override
	public int atacar() {
		System.out.println(getNome() + " atira com sua flecha!\n");
		return getAtaque();
	}

	@Override
	public int ataqueEspecial() {
		if (getMana() >= 15) {
			setMana(getMana() - 15);
			System.out.println(getNome() + " lança uma saraivada de flechas!\n");
			return getAtaque() * 3;
		} else {
			System.out.println("Mana insuficiente, " + getNome() + " atira uma flecha\n");
			return getAtaque();
		}
	}
}
