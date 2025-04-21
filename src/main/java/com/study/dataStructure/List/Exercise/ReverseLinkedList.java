package com.study.dataStructure.List.Exercise;

public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // salva próximo nó
            current.next = prev;          // inverte ponteiro
            prev = current;               // move prev adiante
            current = next;               // move current adiante
        }

        return prev; // nova cabeça da lista
    }

    // Teste
    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode reversed = r.reverseList(head);
        while (reversed != null) {
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }
        System.out.println("null");
    }
}
