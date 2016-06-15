package generics.meetings_offline;

import java.util.Collection;

public interface SimpleList<E> extends Iterable<E> {

    void add(E element);

    E get(int index);

    E set(int index, E element);

    int remove(E element);

    void addAll(Collection<? extends E> source);

    int size();

    boolean contains(E element);

    boolean isEmpty();
}