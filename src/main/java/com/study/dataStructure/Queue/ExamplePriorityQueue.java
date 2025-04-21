package com.study.dataStructure.Queue;

import java.util.PriorityQueue;

public class ExamplePriorityQueue {
    //   6. PriorityQueue (Fila com Prioridade)
//      Tipo: Heap com ordenação por prioridade (min-heap por padrão).
//      Complexidade:
//          Inserção: O(log n)
//          Remoção (poll): O(log n)
//      Vantagens: Menor (ou maior com Comparator) elemento sempre primeiro.
//      Quando usar: Algoritmos de caminhos mínimos, filas com peso.

    PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();

    public void testeUtilizacaoPriorityQueue() {
        filaPrioridade.add(50);
        filaPrioridade.add(10);
        filaPrioridade.add(30);
        int menor = filaPrioridade.poll(); // retorna 10
    }

}
