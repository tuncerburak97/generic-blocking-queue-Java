public class AddValueThread<T> extends Thread{

    GenericQueue genericQueue;
    T value;


    AddValueThread(T value,GenericQueue genericQueue){

        this.value=value;
        this.genericQueue=genericQueue;
    }


    @Override
    public void run() {

        System.out.println("Add value thread "+Thread.currentThread().getName()+" starting");
        genericQueue.add(this.value);
        System.out.println(this.value+" added by "+Thread.currentThread().getName());
        System.out.println("Add value thread "+Thread.currentThread().getName()+" is ended");

        System.out.println();

    }
}
