import java.util.Collection;



public interface
IWaitList<E> {

    void add(E element);


    void remove();

    boolean contains(E element);


    boolean containsAll(Collection<E> c);


    boolean isEmpty();

}
