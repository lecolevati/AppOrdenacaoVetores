package view;

import java.util.Scanner;

import controller.DesempenhoController;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite uma op��o entre 0 e 3");
		System.out.println("0 - Ordena um vetor aleat�rio por Bubble Sort");
		System.out.println("1 - Ordena um vetor aleat�rio por Merge Sort");
		System.out.println("2 - Ordena um vetor aleat�rio por Quick Sort");
		System.out.println("3 - Ordena um vetor aleat�rio por Java Sort");
		
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();

		System.out.println("Digite um tamanho para o vetor entre 10 e 10000 posi��es");
		int tamanho = sc.nextInt();
		
		if ((opcao >= 0 && opcao <= 3) && (tamanho >= 10 && tamanho <= 10000)) {
			int[] vetor = geraVetor(tamanho);
			DesempenhoController dCont = new DesempenhoController();
			switch (opcao) {
			case 0:
				dCont.desempenhoBubble(vetor);
				break;
			case 1:
				dCont.desempenhoMerge(vetor);
				break;
			case 2:
				dCont.desempenhoQuick(vetor);
				break;
			case 3:
				dCont.desempenhoJava(vetor);
				break;
			default:
				System.err.println("Escolha uma op��o entre 0 e 3");
				break;
			}
			
		} else {
			System.err.println("Digite os valores conforme solicitado");
		}
		
		sc.close();
		
	}

	private static int[] geraVetor(int tamanho) {
		int[] vetor = new int[tamanho];
		for (int i = 0 ; i < tamanho ; i++) {
			vetor[i] = (int)((Math.random() * 1000) + 1);
		}
		return vetor;
	}
}
