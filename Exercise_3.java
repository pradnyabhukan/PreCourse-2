// Time Complexity : O(n)
// Space Complexity : O(n)
class LinkedList 
{ 
    Node head; 
    class Node { 
        int data; 
        Node next; 
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
    void printMiddle() { 
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }

        System.out.println("The middle element is " + slow_ptr.data );
    } 
  
    public void push(int new_data) { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() { 
        Node tnode = head; 
        while (tnode != null) { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) { 
        LinkedList llist = new LinkedList(); 
        for (int i=15; i>0; --i) { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 
    } 
} 