public class PollThread<T> extends Thread{

    GenericQueue genericQueue;

    PollThread(GenericQueue genericQueue){


        this.genericQueue=genericQueue;
    }

    @Override
    public void run() {

        System.out.println("Poll thread:"+Thread.currentThread().getName()+" is starting");
        genericQueue.poll();
        System.out.println("Poll function running by "+Thread.currentThread().getName());
        System.out.println("Poll thread:"+Thread.currentThread().getName()+" is ended");

        System.out.println();


    }
}
