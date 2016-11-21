package supermaket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String op = "";
	String nome;
	double preco;
	String tipo;
	int quantidade;
	String produtoDeVenda;
	int quantidadeVenda;
	menu();
	GerenciaMarket a = new GerenciaMarket();
	
	while(!op.equals("6")){
		op = sc.nextLine();
		if(op.equals("Sim")){
			op = "1";
			
		}
				
		switch(op){
		case "1": System.out.println("Digite o nome do produto: ");
				  nome = sc.nextLine();
				  System.out.println("Digite a quantidade do produto: ");
				  quantidade = sc.nextInt();
				  sc.nextLine();
				  System.out.println("Digite o preço unitário do produto: ");
				  preco = sc.nextDouble();
				  sc.nextLine();
				  System.out.println("Digite o tipo do produto: ");
				  tipo = sc.nextLine(); 
				  a.cadastraProduto(nome, preco, tipo, quantidade);
				  System.out.println(quantidade + " produto(s)" + nome +" cadastrado(s) com sucesso");
				  System.out.println("Deseja cadastrar outro produto? Se não, escolha uma das opções listadas anteriormente");
				  break;
				  
		case "2":System.out.println("Qual produto você deseja vender?");
				 produtoDeVenda = sc.nextLine();
				 System.out.println("Quantos você quer?");
				 quantidadeVenda = sc.nextInt();
				 a.vendeProduto(produtoDeVenda, quantidadeVenda);
				 System.out.println("Deseja fazer outra operação? Escolha uma das opções listadas anteriormente");
				 break;
		
		case "3":a.impressao();
		         System.out.println("Deseja fazer outra operação? Escolha uma das opções listadas anteriormente");
				 break;
		case "4": break;
		case "5": System.out.println("Qual a nova quantidade do produto?");
				  quantidade = sc.nextInt();
				  sc.nextLine();
				  System.out.println("Qual o nome do produto?");
				  nome = sc.nextLine();
				  a.setAmount(quantidade, nome);
				  System.out.println("Deseja fazer outra operação? Escolha uma das opções listadas anteriormente");
				  break;
				  
				  
				  
	}
	}
}
	public static void menu(){
		System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = = \nDigite a opção desejada: \n\n1 - Cadastrar um Produto \n2 - Vender um Produto \n3 - Imprimir Produtos\n4 - Imprimir Balanço \n5 - Mudar Quantidade de produto \n6 - Sair \n \nOpção:");
	}
}
