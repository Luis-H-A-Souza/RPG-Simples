package rpgPackage;

public abstract class Inimigo extends Personagem {

	public Inimigo(String nome, int vida, int ataque, int defesa) {
		super(nome, vida, defesa, ataque);
	}

}

class Goblin extends Inimigo {

	public Goblin() {
		super("Goblin", 15, 10, 0);
	}

	@Override
	public int atacar() {
		System.out.println(getNome() + " te apunhala!\n");
		return getAtaque();
	}
	
}

class Orc extends Inimigo {
	public Orc() {
		super("Orc", 30, 20, 5);
	}

	@Override
	public int atacar() {
		System.out.println(getNome() + " avança ferozmente!\n");
		return getAtaque();
	}
}

class Dragão extends Inimigo {
	public Dragão() {
		super("Dragão", 100, 30, 10);
	}

	@Override
	public int atacar() {
		System.out.println(getNome() + " lança uma baforada de fogo\n");
		return getAtaque();
	}
	
}
