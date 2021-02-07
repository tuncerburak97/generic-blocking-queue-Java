public class PeekThread<T> extends Thread{



    GenericQueue genericQueue;

    PeekThread(GenericQueue genericQueue){


        this.genericQueue=genericQueue;
    }

    @Override
    public void run() {

        System.out.println("Peek thread:"+Thread.currentThread().getName()+" is starting");
        System.out.println("Peek value is:"+genericQueue.peek());
        System.out.println("Peek thread:"+Thread.currentThread().getName()+" is ended");

        System.out.println();


    }
}




