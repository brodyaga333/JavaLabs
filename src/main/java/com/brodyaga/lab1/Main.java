package com.brodyaga.lab1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Container container = new Container();

        // Добавляем элементы
        container.add(10);
        container.add(20);
        container.add(30);

        System.out.println("Элемент по индексу 1: " + container.get(1)); // 20
        System.out.println("Размер контейнера: " + container.size()); // 3

        // Удаляем элемент
        container.remove(1);
        System.out.println("После удаления элемента по индексу 1:");
        System.out.println("Элемент по индексу 1: " + container.get(1)); // 30
        System.out.println("Размер контейнера: " + container.size()); // 2
    }
}