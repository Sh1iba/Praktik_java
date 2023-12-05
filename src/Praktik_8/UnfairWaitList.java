package Praktik_8;

public class UnfairWaitList <E> extends WaitList<E> {
    UnfairWaitList(){
        super();
    }

    public void remove(E element){
        queue.remove(element);
    }

    public void moveToBack(E element){
        if(queue.contains(element)) {
            queue.remove(element);
        }
        queue.add(element);
    }
}
