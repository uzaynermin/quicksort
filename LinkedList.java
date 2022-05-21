
package quicksort;

public class LinkedList {
    Node head;
    Node tail;
    
    public LinkedList(){
        head= null;
        tail = null;
        
}
  
    public void add(Node node) {
        if (head == null) {
            head = node;
            tail= node;
        } else {
            Node tmp = head;
            while (tmp.next != null) {

                tmp = tmp.next;
            }
            tmp.next = node;
            tail= node;
        }
        
    }
    public void print(Node headref){
        while (headref != null) {
            System.out.print(headref.data+ " ");
            headref = headref.next;
        }
    }
    
    public Node partition(Node head , Node tail){
        Node pivot = tail;
        Node i = head;
        Node j= head;
        
        while(j!=tail &&  i != null){
        if (head == tail || head == null || tail == null) {
            return head;
        }
        else if(j.data>pivot.data){
            j = j.next;
        }
        else{ // i ile ilgili bir takım problemler var
            if(i.next != null)
            i = i.next;
            int tmp = i.data;
            i.data = j.data;
            j.data = tmp;
            j = j.next;
            
        }
        
        
        }
        if(i.next != null){
        int tmp = i.next.data;
        i.next.data = tail.data;
        tail.data= tmp;
        }
        return i;
    }
    
    public void sort(Node head , Node tail){
        if(head == null || head == tail|| head == tail.next ){
            return;
        }
        Node ref = partition(head, tail);
        sort(head, ref);
        sort(ref.next.next, tail);
        
    }
    
    
    
}
