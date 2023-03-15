

package queue;

public class Queue {
    private Node head;
    private Node tail;
    
    private static class Node{
        int data;
        Node next;
        
        public Node(int data){
           this.data=data;
           this.next=null;
    }
    }
   public Queue(){
       head=null;
       tail=null;
    }
    public void enqueue(int data){
        Node newNode = new Node( data);
        if(tail==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }   
    }
    public int dequeue(){
        if(head==null){
            return null;  
        }
        int data=head.data;
        return data;
    }
    public boolean isEmpty(){
        return head==null;
    }
    


    public static void main(String[] args) {
        Queue queue =new Queue();
        
        queue.enqueue(15);
        queue.enqueue(5);
        queue.enqueue(13);
        
        while(!queue.isEmpty()){
            System.out.println("Dequeue: "+queue.dequeue());
        }
        
        
        
        
        
        
    }
    
}
