package rpgPackage;

public abstract class Personagem {
	private String nome;
	private int vida;
	private int ataque;
	private int defesa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public Personagem(String nome, int vida, int ataque, int defesa) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public abstract int atacar();

	public void receberDano(int dano) {
		vida -= Math.max(dano - defesa, 0);
		System.out.println(nome + " Recebeu " + dano + " de dano!\nVida restante: " + vida);
	}

	public boolean estaVivo() {
		return vida > 0;
	}
}

