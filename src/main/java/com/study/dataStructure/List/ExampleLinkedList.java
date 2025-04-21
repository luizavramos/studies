package com.study.dataStructure.List;

import java.util.LinkedList;

public class ExampleLinkedList {
    //   3. LinkedList (Lista Encadeada)
//      Tipo: Lista duplamente encadeada (java.util.LinkedList)
//      Complexidade:
//          Acesso: O(n)
//          Inserção/Remoção nas extremidades: O(1)
//      Vantagens: Inserção e remoção eficientes no início/fim da lista.
//      Quando usar: Quando se precisa alterar frequentemente o início/fim da lista.


    LinkedList<String> tarefas = new LinkedList<>();

    public void testeUtilizacaoLinkedList() {
        tarefas.add("Lavar roupa");
        tarefas.addFirst("Tomar café");
        tarefas.addLast("Estudar Java");
    }

}
