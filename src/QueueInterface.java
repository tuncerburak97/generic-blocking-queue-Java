import java.util.NoSuchElementException;

public interface QueueInterface<T> {


    QueueInterface<T> add(T element);
    T peek();


    T poll();
}