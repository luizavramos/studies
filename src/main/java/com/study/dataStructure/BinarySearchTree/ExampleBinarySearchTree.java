package com.study.dataStructure.BinarySearchTree;

public class ExampleBinarySearchTree {

//   Binary Search Tree (BST)
//      Tipo: Árvore binária onde cada nó segue a regra:
//            nó esquerdo < atual < nó direito
//      Complexidade:
//          Busca/Inserção/Remoção: O(log n) em média
//      Vantagens: Organização hierárquica, busca eficiente.
//      Quando usar: Dados ordenados hierarquicamente, navegação rápida.

    class Node {
        int valor;
        Node esquerda, direita;

        Node(int valor) {
            this.valor = valor;
        }
    }

    Node raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node atual, int valor) {
        if (atual == null) return new Node(valor);
        if (valor < atual.valor) atual.esquerda = inserirRec(atual.esquerda, valor);
        else if (valor > atual.valor) atual.direita = inserirRec(atual.direita, valor);
        return atual;
    }

    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(Node atual) {
        if (atual != null) {
            emOrdemRec(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdemRec(atual.direita);
        }
    }

    public static void main(String[] args) {
        ExampleBinarySearchTree bst = new ExampleBinarySearchTree();
        bst.inserir(50);
        bst.inserir(30);
        bst.inserir(70);
        bst.inserir(20);
        bst.inserir(40);
        bst.inserir(60);
        bst.inserir(80);

        System.out.print("Ordem crescente: ");
        bst.emOrdem();  // Esperado: 20 30 40 50 60 70 80
    }
}
