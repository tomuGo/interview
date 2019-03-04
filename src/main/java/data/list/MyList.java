package data.list;

public interface MyList<E> {
    void add(int index, E obj);

    E remove(int index);

    int size();
}
