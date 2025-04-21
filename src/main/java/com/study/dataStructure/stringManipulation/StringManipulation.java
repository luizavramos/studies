package com.study.dataStructure.stringManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringManipulation {

    public String[] split(String s, char c) {
        //valida entrada
        if (s.isEmpty() || s == null) {
            return new String[0];
        }
        List<String> response = new ArrayList<>();

        //Existe também uma classe SpringBuilder que é utilizado para concatenação de strings de forma mais eficiente
        //Internamente, o StringBuilder mantém um array de caracteres (char[] value) com um tamanho inicial, que é redimensionado automaticamente se for necessário.
        List<Character> current = new ArrayList<>();
        int i = 0;

        while (s.length() > i) {
            if (s.charAt(i) == c) {

                //Junta os caracteres que estavam no current para formar uma string.
                response.add(current.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining()));
                current.clear();
            } else {
                //adiciona o caracter na lista
                current.add(s.charAt(i));
            }
            i++;
        }
        //adicionar o último fragmento que sobrou
        response.add(current.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));

        //Transforma a List<String> em um String[] para retornar
        return response.toArray(new String[0]);
    }


    public String arrayToString(ArrayList<Character> arr) {
        StringBuilder sb = new StringBuilder(arr.size());

        //para cada char dentro da lista, eu adiciono dentro da lista de StringBuilder e ao final utilizo a função .toString
        //para criar uma String concatenando os dados de sb
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }

    public String joinString(String[] arr, String s){
        //cria lista para armazenar o return
        ArrayList<Character> response = new ArrayList<>();

        //iterar com os dados da lista
        for(int i = 0; i < arr.length; i++){
            //o primeiro resultado não é adicionado nenhum atributo
            //por isso o separador só é adicionado quando i != 0
            if(i != 0){
                for(char c : s.toCharArray()){
                    response.add(c);
                }
            }
            //armazena os characteres de cada string da lista no response
            for(char c : arr[i].toCharArray()){
                response.add(c);
            }
        }
        //utiliza a função criada pra transformar a lista de char em string
        return arrayToString(response);
    }

    //a função join em strings funciona assim: String.join(separator, arr); sendo que arr é uma lista de Strings.


    //first try
    public static int stringMatch(String s, String t){
        //valida entrada
        if(t.isEmpty()){
            return 0;
        }else if (s.isEmpty()) {
            return -1;
        }
        //encontra o primeiro char igual o inicio da outra string
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(0)){
                int j = 0;
                int x = i;
                    while(j != (t.length() - 1)){
                        //valida se toda a string é igual
                        if(s.charAt(x) == t.charAt(j)){
                            x++;
                            j++;
                            if(j == (t.length() - 1)){
                                return i;
                            }
                        }else{
                            break;
                        }
                    }
                }
        }
        return -1;
    }

    public int simpleStringMatch(String s, String t) {
        if (t.isEmpty()) {
            return 0;
        }
        if (s.isEmpty()) {
            return -1;
        }
        //diferença que ao invés de utilizar o while, utilizou um for dentro do outro, utilizando o j para incrementar o valor de i
        //E também um atributo de validação 'found'
        for (int i = 0; i <= s.length() - t.length(); i++) {
            boolean found = true;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    //Para string search há também o algoritmo KMP e o rolling hash complexidade O(sn)
    //Enquanto isso os algoritmos mais simples levam a complexidade O(sn * tn)


    public static void main(String[] args) {
        System.out.println("Testes do método stringMatch:");

        String s1 = "hello world", t1 = "world";
        System.out.println("Input: \"" + s1 + "\", \"" + t1 + "\" → Output: " + stringMatch(s1, t1)); // 6

        String s2 = "needle in a haystack", t2 = "needle";
        System.out.println("Input: \"" + s2 + "\", \"" + t2 + "\" → Output: " + stringMatch(s2, t2)); // 0

        String s3 = "needle in a haystack", t3 = "not";
        System.out.println("Input: \"" + s3 + "\", \"" + t3 + "\" → Output: " + stringMatch(s3, t3)); // -1

        String s4 = "", t4 = "a";
        System.out.println("Input: \"" + s4 + "\", \"" + t4 + "\" → Output: " + stringMatch(s4, t4)); // -1

        String s5 = "", t5 = "";
        System.out.println("Input: \"" + s5 + "\", \"" + t5 + "\" → Output: " + stringMatch(s5, t5)); // 0

        String s6 = "abc", t6 = "";
        System.out.println("Input: \"" + s6 + "\", \"" + t6 + "\" → Output: " + stringMatch(s6, t6)); // 0
    }


}

