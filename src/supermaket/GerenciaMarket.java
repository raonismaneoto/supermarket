package supermaket;

public class GerenciaMarket {
	private Produto[] produtos = new Produto[1000];
	private int quantidadeProdutosCadastrados = 0;
	private double financa = 0;
	
	public void cadastraProduto(String nome, double preco, String tipo,
			int quantidade) {
		Produto novo = new Produto(nome, preco, tipo, quantidade);
		if(quantidadeProdutosCadastrados == produtos.length){
			GerenciaArray.aumentaArray(produtos, quantidadeProdutosCadastrados);
		}
		produtos[quantidadeProdutosCadastrados] = novo;
		quantidadeProdutosCadastrados ++;
	}
	public Produto buscaProduto(String nome){
		for(int i = 0; i<quantidadeProdutosCadastrados; i++){
			if(nome.equals(produtos[i].getName())){
				return produtos[i];
			}
		}
		return null;
	}
	public void vendeProduto(String produtoDeVenda, int quantidade) {
		Produto prod;
		prod = this.buscaProduto(produtoDeVenda);
		if(quantidade == prod.getQuantidade()){
			GerenciaArray.removeArray(prod, produtos, quantidadeProdutosCadastrados);
			quantidadeProdutosCadastrados --;
		}
		else if (quantidade > prod.getQuantidade()){
			System.out.println("Não temos diponível essa quantidade de produtos");
		}
		if(quantidade <= prod.getQuantidade()){
			financa += prod.getPreco() * quantidade;
			int novaQuantidade = prod.getQuantidade() - quantidade;
			prod.setQuantidade(novaQuantidade);
	}
	}
	public double getFinanca(){
		return financa;
	}
	public void impressao(){
		for (Produto produto : produtos) {
			if (produto != null){
				System.out.println(produto.getQuantidade() +" "+ produto.getName() + "(s)" + "no estoque");
			
		}
			else{
				break;
	}
}
}
	public void setAmount(int amount, String nome){
		Produto p;
		p = this.buscaProduto(nome);
		p.setQuantidade(amount);
	}
}