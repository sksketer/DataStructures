public class SinglyLinkedList
{
    private ListNode head;
    private static class ListNode //Defination of ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data+"-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length()
    {
        if(head == null)
            return 0;
        
        int count=0;
        ListNode current = head;
        while(current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public void insertFirst(int value) //method to add new element in LinkedList at first position
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head == null)
        {
            head = newNode;
            return;
        }

        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst()
    {
        if(head == null)
            return null;
        
        ListNode temp = head; //create new node temp
        head = head.next; // shift head to next node    
        temp.next = null; // disconnect temp
        return temp;
    }

    public ListNode deleteLast()
    {
        if(head == null || head.next == null) { return head; }
        ListNode current  =  head;  // here current is pointing to head
        ListNode previous  =  null;
        while(current.next != null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;  //disconnect the previous node from current
        return current;
    }
    

    public static void main(String args[])
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        // for (int i = 0; i < 20; i++) {
        //     sll.insertLast(i);
            
        // }
        
        /* Manually add element
            sll.head = new ListNode(10);
            ListNode second = new ListNode(1);
            ListNode third = new ListNode(8);
            ListNode fourth = new ListNode(11);

            sll.head.next = second;
            second.next = third;
            third.next = fourth;

            sll.display(); // travering the LinkedList
            System.out.print("Length is "+sll.length()); //Find the length
        */

        // sll.insertFirst(11);
        // sll.insertFirst(10);

        sll.insertLast(16);
        sll.insertLast(18);
        sll.insertFirst(12);
        sll.insertLast(65);
        sll.display();
        sll.deleteLast();
        sll.display();
    }
}
