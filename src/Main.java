public class Main {

    public static void main(String[] args) {

        GenericQueue genericQueue = new GenericQueue();

        ThreadClass threadClass = new ThreadClass(genericQueue);
        AddValueThread addValueThread = new AddValueThread(545,genericQueue);
        PeekThread peekThread = new PeekThread(genericQueue);
        PollThread pollThread = new PollThread(genericQueue);



        threadClass.start();
        addValueThread.start();
        peekThread.start();
        pollThread.start();


        try {
            threadClass.join();
            addValueThread.join();
            peekThread.join();
            pollThread.join();


        }catch (Exception e){

            System.out.println(e.toString());
        }


        System.out.println("Main thread ended");


    }
}
