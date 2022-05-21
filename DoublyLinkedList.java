/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

/**
 *
 * @author Dell
 */
public class DoublyLinkedList {
    Node head;
    Node tail;
    int es;
    
    public DoublyLinkedList(){
        head = null;
        tail = null;
        es = 0;
    }
    
    public void add(Node n){
        if (head == null){
            head = n;
        }
        else{
            tail.next = n;
            n.prev = tail;
        }
        tail = n;
        es++;
    }
    
    public void print(Node headref){
        while (headref != null) {
            System.out.print(headref.data+ " ");
            headref = headref.next;
        }
    }
    
    public Node partition(Node head , Node tail){
        Node pivot = tail;
        Node i = head.prev;
        Node j= head;
        
        while(j!=tail && j!= null&&i !=null){
        if (head == tail || head == null || tail == null) {
            return head;
        }
        else if(j.data>pivot.data){
            j = j.next;
        }
        else{ // i ile ilgili bir takım problemler var
            
            int tmp = j.data;
            j.data = i.data;
            i.data = tmp;
            if(i.next != null)
            i = i.next;
            
        }
        
        
        }
        if(i != null && i.next !=null){
        int tmp = i.next.data;
        i.next.data = tail.data;
        tail.data= tmp;
        }
        
            return i.next;
        
        
        
    }
    
    public void sort(Node head , Node tail){
        if(head == null || head == tail|| head == tail.next ){
            return;
        }
        Node ref = partition(head, tail);
        if(ref != null && ref.next != null && ref.next.next!=null){
        sort(head, ref.prev);
        sort(ref.next, tail);
        }
    }
    
    
}
