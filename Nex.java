import java.util.Scanner;

public class Nex
{ 
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public int length()
    {
        if(head == null)
            return 0;

        ListNode current = head;
        int count=0;
        while(current.next != null)
        {
            current = current.next;
            count++;
        }
        System.out.println(count/2);
        return count;
    }

    public ListNode findValue(int length)
    {
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
            length--;
            if(length == 0)
                break;
        }
        return current;
    }

    public static void main(String[] args)
    {
        Nex sll = new Nex();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            sll.insertFirst(sc.nextInt());
        }
        int length = sll.length();
        System.out.println(sll.findValue(length/2).data);

        sc.close();
    }


    
}
