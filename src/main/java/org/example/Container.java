package org.example;

// Лабораторная работа №1 по языку программирования Java. Выполнил: Петров Никита, 3 курс, 6 группа

/**
 * Задача: Создать класс контейнер, позволяющий хранить произвольное количество объектов. Использование встроенных коллекций запрещено.  Задание можно реализовать с помощью массива или связанного списка. Контейнер должен позволять добавлять, извлекать, удалять элементы.
 *
 */
public class Container<T> {
    private Object[] data;
    private int size;
    public Container() {
        this.data = new Object[10];
        this.size = 0;
    }
    /**
     * Далее добавим функцию добавления элемента в массив. Каждый новый элемент будет добавляться в конец массива.
     * @param elem элемент, будет добавляться в массив.
     */
    public void add(T elem) {
        if (size == data.length) {
            resize();
        }
        data[size] = elem;
        size++;
    }
    /**
     * Метод get() для получения элемента из массива и метод remove(), для удаления элемента из массива. Так же внутри этих методов будет осуществляться проверка с помощью IndexOutOfBoundsException.
     * @param index индекс элемента в массиве
     * @return возращение элемента по индексу.
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return (T) data[index];
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }
    /**
     * Здесь задается метод size, который выводит количество элементов массива на данный момент времени.
     * @return возвращение количества элементов массива.
     */
    public int size() {
        return size;
    }

    /**
     * Метод resize() будет производить увеличение массива.
     */
    private void resize() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}

