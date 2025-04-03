package com.brodyaga.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ContainerTest {

    @Test
    void testAddAndSize() {
        Container container = new Container();
        container.add(10);
        container.add(20);

        assertEquals(2, container.size(), "Размер контейнера должен быть 2");
    }

    @Test
    void testGet() {
        Container container = new Container();
        container.add(5);
        container.add(15);

        assertEquals(5, container.get(0), "Первый элемент должен быть 5");
        assertEquals(15, container.get(1), "Второй элемент должен быть 15");
    }

    @Test
    void testRemove() {
        Container container = new Container();
        container.add(100);
        container.add(200);
        container.add(300);

        container.remove(1); // Удаляем элемент с индексом 1 (200)

        assertEquals(2, container.size(), "Размер контейнера после удаления должен быть 2");
        assertEquals(300, container.get(1), "Элемент с индексом 1 должен быть 300");
    }

    @Test
    void testRemoveInvalidIndex() {
        Container container = new Container();
        container.add(10);

        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(1),
                "Должно выбрасываться исключение при удалении по неверному индексу");
    }
}
