package supermaket;

public class Produto {
	private String nome;
	private double preco;
	private String tipo;
	private int quantidade;
	
	public Produto(String nome, double preco, String tipo, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	public String getName(){
		return this.nome;
	}
	public void setPreco(double preco){
		this.preco = preco;
		
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	public double getPreco(){
		return this.preco;
	}
}
