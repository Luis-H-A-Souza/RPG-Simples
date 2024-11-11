package rpgPackage;

public abstract class Personagem {
	private String nome;
	private int vida;
	private int defesa;
	private int ataque;

	public Personagem(String nome, int vida, int defesa, int ataque) {
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
