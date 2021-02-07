import java.util.NoSuchElementException;

public class GenericQueue<E> implements QueueInterface<E> {

     Node<E> first, last;

      class Node<E> {
        private E data;

        private Node<E> back;

        public Node(E element) {
            data = element;
        }

    }



    @Override
    public synchronized QueueInterface<E> add(E element) throws NoSuchElementException {
        Node<E> newElement = new Node<E>(element);
        if (first == null) {
            first = newElement;
        } else {
            if (first.back == null) {
                first.back = newElement;
            } else {
                last.back = newElement;
            }

            last = newElement;
        }

        notifyAll();
        return this;
    }



    @Override
    public synchronized E peek() {
        notifyAll();
        return first == null ? null : first.data;

    }

    @Override
    public synchronized E poll() throws NullPointerException {
        if (first == null) {
            return null;
        }

        E output = first.data;
        first = first.back;

        notifyAll();
        return output;
    }




}



