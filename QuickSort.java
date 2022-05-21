
package quicksort;



/**
 *
 * @author Dell
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = { 25,22,30,18,46,70,50,4 };
        int arr1[] = { 30, 3, 4, 20, 5, 7 };
        
        QuickSortt q = new QuickSortt();
        q.sort(arr,0,arr.length-1);
        q.print(arr);
        
        
        //DoublyLinkedList b1 = new DoublyLinkedList();
        /*
        LinkedList b1 = new LinkedList();
        Node n1 = new Node(30);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(20);
        Node n5 = new Node(5);
        Node n6 = new Node(7);
        //Node n7 = new Node(2);
        b1.add(n1);
        
        b1.add(n2);
        
        b1.add(n3);
        
        b1.add(n4);
        b1.add(n5);
        b1.add(n6);
        //b1.add(n7);
        b1.print(n1);
        b1.sort(n1, n6);
        System.out.println();
        b1.print(n1);
  */
    }
    
}
