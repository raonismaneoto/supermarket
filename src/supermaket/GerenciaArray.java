package supermaket;

public class GerenciaArray {

	public static void aumentaArray(Produto[] produtos, int quantidadeProdutosCadastrados) {
		Produto [] aux = new Produto[quantidadeProdutosCadastrados*2];
		for (int i = 0; i<quantidadeProdutosCadastrados; i++) {
			aux[i] = produtos[i];
		}
		produtos = aux;
		
		
	}

	public static void removeArray(Produto prod, Produto[] produtos, int quantidadeProdutosCadastrados) {	    
		for(int i =0 ; i< quantidadeProdutosCadastrados; i++){
			if(produtos[i] == prod){
				produtos[i] = produtos[quantidadeProdutosCadastrados];
				produtos[quantidadeProdutosCadastrados] = null;
				
				
			}
		}
		
		
		
	}

}
