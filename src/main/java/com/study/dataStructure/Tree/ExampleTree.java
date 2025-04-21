package com.study.dataStructure.Tree;
import java.util.TreeMap;

public class ExampleTree {

//   10. TreeMap (Mapa Ordenado por Chave)
//      Tipo: Implementação de Map ordenada por chave (árvore rubro-negra).
//      Complexidade:
//          Inserção/Remoção/Busca: O(log n)
//      Vantagens: Mantém a ordem das chaves.
//      Quando usar: Precisa acessar pares ordenadamente.

    TreeMap<String, Integer> notas = new TreeMap<>();

    public void testeUtilizacaoTreeMap() {
        notas.put("Biologia", 80);
        notas.put("Matemática", 95);
        notas.put("Artes", 70);
        // Ordem: Artes, Biologia, Matemática
    }

}
