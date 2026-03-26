package chapter3;

public class LinkedIntList {

    private ListNode front;

    private static class ListNode{
        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data)
    {
        ListNode newNode = new ListNode(data);

        if(front == null)
        {
            front = newNode;
        }else {
            ListNode last = front;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = newNode;
        }
    }//end insert

    public void display(){
        ListNode current = front;
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }//end display

    public void transferFrom(LinkedIntList list)
    {
        if(list.front == null){
            return;
        }

        if(this.front == null){
            this.front = list.front;
        } else{
            ListNode current = this.front;
            while(current.next != null){
                current = current.next;
            }

            current.next = list.front;
        }

        list.front = null;


    }//end transferFrom
}
