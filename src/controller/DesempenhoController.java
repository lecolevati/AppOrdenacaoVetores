package controller;

import java.util.Arrays;

import br.com.leandrocolevati.sort.Sort;

public class DesempenhoController {

	private Sort sort;
	
	public DesempenhoController() {
		sort = new Sort();
	}
	
	public void desempenhoBubble(int[] vetor) {
		double tempoInicial = System.nanoTime();
		vetor = sort.bubbleSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Bubble Sort ==> "+tempoTotal+" s.");
		System.out.print("[ ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
	
	public void desempenhoMerge(int[] vetor) {
		double tempoInicial = System.nanoTime();
		vetor = sort.mergeSort(vetor, 0, vetor.length - 1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Merge Sort ==> "+tempoTotal+" s.");
		System.out.print("[ ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
	
	public void desempenhoQuick(int[] vetor) {
		double tempoInicial = System.nanoTime();
		vetor = sort.quickSort(vetor, 0, vetor.length - 1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Quick Sort ==> "+tempoTotal+" s.");
		System.out.print("[ ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
	
	public void desempenhoJava(int[] vetor) {
		double tempoInicial = System.nanoTime();
		Arrays.sort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Java Sort ==> "+tempoTotal+" s.");
		System.out.print("[ ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}

}
