package Praktik_8;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args){

        //////////////////////ТЕСТ WAITLIST
        //Заполнение Waitlist
        WaitList<Integer> wait_list = new WaitList<Integer>();
        wait_list.add(1);
        wait_list.add(2);
        wait_list.add(3);
        wait_list.add(4);
        wait_list.add(5);
        System.out.println(wait_list);

        /////создание и заполнение  Collection
        Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(10);
        collection.add(15);
        collection.add(12);
        System.out.println("Сollection: " + collection);

        System.out.println("Does the WaitList contains all collection? " + wait_list.containsAll(collection));
        System.out.println("Does the WaitList contain 10? " + wait_list.contains(10));
        System.out.println("Removed value is: " + wait_list.remove());
        System.out.println("Does the WaitList contain 11? " + wait_list.contains(1));
        System.out.println(wait_list+"\n"+"\n"+"\n");


        ////////////Тест BoundedWaitList
        BoundedWaitList<Integer> bound_list = new BoundedWaitList<>(3);
        bound_list.add(12);
        bound_list.add(23);
        bound_list.add(56);
        System.out.println(bound_list);
        System.out.println("Capacity of BoundedWaitList is: " + bound_list.getCapacity());
        bound_list.add(404);



        ////////////Тест UnfairWaitList
        UnfairWaitList<Integer> unfair_list = new UnfairWaitList<Integer>();
        unfair_list.add(10);
        unfair_list.add(20);
        unfair_list.add(30);
        unfair_list.add(40);
        unfair_list.add(50);
        System.out.println("\n"+"\n"+"\n"+unfair_list);
        unfair_list.remove(40);
        System.out.println(unfair_list);
        unfair_list.moveToBack(10);
        System.out.println(unfair_list);

    }
}
