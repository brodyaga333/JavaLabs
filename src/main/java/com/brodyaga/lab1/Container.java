package com.brodyaga.lab1;

/**
 * реализует связный список для хранения целых чисел.
 */
public class Container {
    /** Узел списка */
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head; // Голова списка
    private int size; // Количество элементов

    /**
     * Добавляет элемент в конец контейнера.
     * @param value значение для добавления
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * Извлекает элемент по индексу.
     * @param index индекс элемента
     * @return значение элемента
     * @throws IndexOutOfBoundsException если индекс некорректен
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    /**
     * Удаляет элемент по индексу.
     * @param index индекс элемента
     * @throws IndexOutOfBoundsException если индекс некорректен
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    /**
     * Возвращает количество элементов в контейнере.
     * @return размер контейнера
     */
    public int size() {
        return size;
    }
}

