package com.study.dataStructure.List;

import java.util.ArrayList;

public class ExampleList {

//    1. Arrays
//      Tipo: Estrutura sequencial de tamanho fixo.
//      Acesso: Direto via índice.
//      Complexidade:
//          Acesso: O(1)
//          Inserção/Remoção: O(n)
//
//      Uso comum: Listas de valores fixos, matrizes, buffers.

    int[] number = {1, 2, 3, 4, 5};
    int[] access = new int[5];

//   2. ArrayList (Lista Dinâmica)
//      Tipo: Lista baseada em array redimensionável (java.util.ArrayList)
//      Complexidade:
//          Acesso: O(1)
//          Inserção/Remoção: O(n) (exceto no fim: O(1) amortizado)
//      Vantagens: Redimensionamento automático, métodos utilitários.
//      Quando usar: Quando não se conhece o tamanho fixo e acessos aleatórios são frequentes

    ArrayList<String> nomes = new ArrayList<>();
    public void testeUtilizacao(){
        nomes.add("Leticia");
    }

}
