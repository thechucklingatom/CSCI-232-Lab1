/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancode;

/**
 *
 * @author thechucklingatom
 */
public class StandbyQueue<E extends Comparable> {
    private int size;
    private final Node head;
    private final  Node tail;
    
    private class Node<E extends Comparable <E>>  {
        public E frequency;
        public Node next;
        public Node previous;
    }
    public StandbyQueue(){
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.previous = head;
        size = 0;
    }
    
    public void enqueue(E ele){
        boolean assigned = false; 
        Node last = tail.previous;
        Node newNode = new Node();
        newNode.frequency = ele;
        Node counter = head.next;
        while(!assigned){
            if(size == 0){
                newNode.next = tail;
                newNode.previous = last;
                tail.previous = newNode;
                last.next = newNode;
                assigned = true;
            }else if(counter.previous.equals(head)){
                if(ele.compareTo(counter.frequency) == 1){
                    newNode.next = head.next;
                    head.next = newNode;
                    newNode.previous = head;
                    assigned = true;
                }
                counter = counter.next;
            }else if(counter.equals(tail)){
                newNode.next = tail;
                newNode.previous = last;
                tail.previous = newNode;
                last.next = newNode;
                assigned = true;
            }else if (ele.compareTo(counter.frequency) == 1 
                    && ele.compareTo(counter.previous.frequency) == 0){
                    newNode.next = counter;
                    newNode.previous =  counter.previous;
                    counter.previous.next = newNode;
                    counter.previous = newNode;
                    assigned = true;
            } else {
                counter = counter.next;
            }
        }
        size++;
    }
    
    public String dequeue() throws EmptyQueueException{
        if (size == 0){
            throw new EmptyQueueException("");
        }else{
            size--;
            //TBR to be returned
            Node TBR;
            TBR = head.next;
            head.next = TBR.next;
            head.next.previous = head;
            return TBR.frequency.toString();
        }
    }
    
    public int Size(){
        return size;
    }
    
//    public String dequeue(int confirmationNumber){
//        Node check = head.next;
//        while(!check.equals(tail)){
//            if (check.ele.compareTo(new StandbyPassenger(confirmationNumber)) 
//                    == 1){
//                size--;
//                Node Next = check.next;
//                Node Previous = check.previous;
//                Next.previous = Previous;
//                Previous.next = Next;
//                return check.ele.toString();
//            }else{
//                check = check.next;
//            }
//        }    
//        return null;
//    }
    
    public String[] GetList(){
        String[] list = new String[size];
        Node counter = head.next;
        for(int i = 0; i < size; i++){
            list[i] = counter.frequency.toString();
            counter = counter.next;
            if(counter.equals(tail)){
                break;
            }
        }
        return list;
    }

    
}
