package data.list;

public class MyArrayList<E> implements MyList<E> {

    private static final int INIT_CAPACITY = 5;

    private E[] elements;

    private int size;


    public void ensureCapacity(int newCapacity) {
        if (size > newCapacity) {
            return;
        }
        E[] old = elements;
        elements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            elements[i] = old[i];
        }
    }

    public void add(int index, E obj) {
        if (size == elements.length) {
            ensureCapacity(size * 2);
        }
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = obj;
        size++;
    }

    public E remove(int index) {
        for (E e : elements) {

        }
        return null;
    }

    public int size() {
        return size;
    }
}
