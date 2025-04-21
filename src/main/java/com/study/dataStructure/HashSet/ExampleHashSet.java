package com.study.dataStructure.HashSet;
import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {

//   7. HashSet (Conjunto sem duplicatas)
//      Tipo: Implementação de Set baseada em hash.
//      Complexidade:
//          Inserção/Remoção/Busca: O(1) médio
//      Vantagens: Não permite elementos duplicados.
//      Quando usar: Precisa garantir unicidade.

    Set<String> linguagens = new HashSet<>();

    public void testeUtilizacaoHashSet() {
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java"); // será ignorado
    }

}
