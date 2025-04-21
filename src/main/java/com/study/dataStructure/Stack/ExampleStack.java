package com.study.dataStructure.Stack;

import java.util.Stack;

public class ExampleStack {

//   4. Stack (Pilha)
//      Tipo: LIFO (Last-In, First-Out)
//      Complexidade:
//          Inserção/Remoção (push/pop): O(1)
//      Vantagens: Ideal para controle de chamadas, desfazer/refazer.
//      Quando usar: Processamento reverso, pilhas de execução.

    Stack<Integer> numeros = new Stack<>();

    public void testeUtilizacaoStack() {
        numeros.push(10);
        numeros.push(20);
        numeros.pop(); // remove o 20
    }

}
