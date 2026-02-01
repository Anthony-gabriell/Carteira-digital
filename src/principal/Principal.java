package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cofre cofre = new Cofre();
		int opcao=0;

		while (opcao !=5) {
				
		System.out.println("-- BEM VINDO A SUA CARTEIRA DIGITAL --");
		System.out.println("Escolha uma das opções abaixo");
		System.out.println("1 - Guardar Dinheiro");
		System.out.println("2 - Valor total guardado");
		System.out.println("3 - Listar todas as moedas");
		System.out.println("4 - Ecluir Valor");
		System.out.println("5 - Fechar Carteira");
		System.out.println("Opção:");
		
		opcao = teclado.nextInt();
		
		switch(opcao) {
		
		case 1:
		    System.out.println("Escolha o tipo de moeda:");
		    System.out.println("1 - Real");
		    System.out.println("2 - Dólar");
		    System.out.println("3 - Euro");
		    int tipo = teclado.nextInt();

		    System.out.println("Digite o valor:");
		    double valor = teclado.nextDouble();

		    Moeda m = null;

		    if (tipo == 1) {
		        m = new Real(valor);
		    } else if (tipo == 2) {
		        m = new Dolar(valor);
		    } else if (tipo == 3) {
		        m = new Euro(valor);
		    } else {
		        System.out.println("Tipo inválido!");
		        break;
		    }

		    cofre.adicionarMoeda(m);
		    System.out.println("Moeda adicionada com sucesso!");
		    break;
		
		case 2:
			double total = cofre.calcularTotal();
			System.out.println("O total em reais:" + total);
			break;
			
		case 3:
			cofre.listarMoedas();
			break;
			
		case 4:
		    System.out.println("Escolha qual moeda deseja remover:");
		    System.out.println("1 - Real");
		    System.out.println("2 - Dólar");
		    System.out.println("3 - Euro");
		    int tipoRemover = teclado.nextInt();
		    
		    System.out.println("Digite o valor da moeda que deseja remover:");
		    double valorRemover = teclado.nextDouble();
		    
		    Moeda moedaRemover = null;
		    
		    if (tipoRemover == 1) {
		        moedaRemover = new Real(valorRemover);
		    } else if (tipoRemover == 2) {
		        moedaRemover = new Dolar(valorRemover);
		    } else if (tipoRemover == 3) {
		        moedaRemover = new Euro(valorRemover);
		    } else {
		        System.out.println("Tipo inválido!");
		        break;
		    }
		    
		    cofre.removerMoeda(moedaRemover);
		    System.out.println("Moeda removida.");
		    break;
		    
		case 5:
			break;

        default:
            System.out.println("OPÇÃO INVALIDA");
            break;
			}
        }
		}			
	}
