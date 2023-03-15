
package mmustlinkedin;

public class MmustLinkedIn {
    private Node head;
    
    private class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    } 
    
    public void addNode(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode; 
        }else{
            Node current=head;
            while(current.next !=null){
                current=current.next;
            }
            current.next= newNode;
        }
    }
    public void printLST(){
        Node current= head;
        while(current !=null){
            System.out.print(current.data +" ");
            current= current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MmustLinkedIn mmustlinkedin =new MmustLinkedIn();
        
        mmustlinkedin.addNode(2);
        mmustlinkedin.addNode(5);
        mmustlinkedin.addNode(4);
        mmustlinkedin.addNode(3);
        mmustlinkedin.addNode(1);
        
        mmustlinkedin.printLST();
        

    }
    
}
