package data.list;

public class MyLinkedList<E> implements MyList<E> {

    private int modCount;

    private int size;

    private Node<E> preview;

    public void add(int index, E obj) {

    }

    public E remove(int index) {
        return null;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        private E data;

        private Node<E> preview;

        private Node<E> next;

        public Node(E data, Node<E> p, Node<E> n) {
            this.data = data;
            this.preview = p;
            this.next = n;
        }
    }
}
