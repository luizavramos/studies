package com.study.dataStructure.Queue;
import java.util.Queue;
import java.util.LinkedList;

public class ExampleQueue {

//   5. Queue (Fila)
//      Tipo: FIFO (First-In, First-Out)
//      Complexidade:
//          Inserção (add): O(1)
//          Remoção (poll/remove): O(1)
//      Vantagens: Ordem de execução natural.
//      Quando usar: Filas de processamento, requisições assíncronas.

    Queue<String> fila = new LinkedList<>();

    public void testeUtilizacaoQueue() {
        fila.add("Usuário 1");
        fila.add("Usuário 2");
        fila.poll(); // remove "Usuário 1"
    }

}
