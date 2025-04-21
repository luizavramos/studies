package com.study.dataStructure.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleGraph {

//   Grafo (não-direcionado)
//      Tipo: Conjunto de vértices conectados por arestas.
//      Representação: Lista de adjacência (HashMap)
//      Vantagens: Modela redes e conexões complexas.
//      Quando usar: Mapas, redes sociais, rotas, algoritmos de caminhos mínimos.

    private Map<String, List<String>> adjacencias = new HashMap<>();

    public void adicionarVertice(String vertice) {
        adjacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    public void adicionarAresta(String origem, String destino) {
        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem); // Não-direcionado
    }

    public void mostrarGrafo() {
        for (String vertice : adjacencias.keySet()) {
            System.out.println(vertice + " -> " + adjacencias.get(vertice));
        }
    }

    public static void main(String[] args) {
        ExampleGraph grafo = new ExampleGraph();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("A", "C");
        grafo.adicionarAresta("B", "C");

        grafo.mostrarGrafo();

        // Saída esperada:
        // A -> [B, C]
        // B -> [A, C]
        // C -> [A, B]
    }

}
