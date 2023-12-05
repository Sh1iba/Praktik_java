package Praktik_8;

public class BoundedWaitList <E> extends WaitList<E> {
    private int capacity;

    BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }
    public int getCapacity(){

        return capacity;
    }

    @Override
    public void add(E element){
       if(queue.size() == capacity) {
           System.out.println("The queue is full it is not possible to add a new item");
       }
       else{
           queue.add(element);
       }
    }

    @Override
    public String toString(){
        return "BoundedWaitList{ " + queue + " }";
    }


}
