package com.study.dataStructure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

//   8. HashMap (Mapa Chave/Valor)
//      Tipo: Implementação de Map baseada em hash.
//      Complexidade:
//          Inserção/Remoção/Busca por chave: O(1) médio
//      Vantagens: Mapeamento eficiente entre chave e valor.
//      Quando usar: Dicionários, caches, contadores.

    Map<String, Integer> idade = new HashMap<>();

    public void testeUtilizacaoHashMap() {
        idade.put("Leticia", 25);
        idade.put("Carlos", 30);
        int idadeLeticia = idade.get("Leticia"); // 25
    }

}
