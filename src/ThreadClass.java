public class ThreadClass extends Thread{

    GenericQueue genericLinkedListQueue;

    public ThreadClass(GenericQueue genericQueue){
        this.genericLinkedListQueue=genericQueue;
    }


    @Override
    public void run() {

        synchronized (genericLinkedListQueue){

            System.out.println("Thread class:"+Thread.currentThread().getName()+" is starting");
            genericLinkedListQueue.add("Burak");

            System.out.println();

            System.out.println("Value is added by " +Thread.currentThread().getName());



            genericLinkedListQueue.add(3);
            System.out.println("Value is added by " +Thread.currentThread().getName());

            genericLinkedListQueue.add(27);
            System.out.println("Value is added by " +Thread.currentThread().getName());


            System.out.print("Peek value is:");
            System.out.println(genericLinkedListQueue.peek());


            genericLinkedListQueue.poll();
            System.out.println("Poll function running");


            System.out.println(Thread.currentThread().getName()+" is ended");

            System.out.println();

        }



    }
}
