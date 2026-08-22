
class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }
    public static Node head;
    public static Node tail;
    // public static int size;

    public void addData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Reverse linked list
    public void reverseLinkedlist() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;// reverse linking.
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void deleteNthformend(int n) {
        // calculate size=0;
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // size ka eqaul n ho to n==size;
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // Calculate Size of linked list.
    public int sizell() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;

    }

    // SLOW FAST APPROACH 
    public Node mid() {
        Node slow = head;
        Node fast = head;
        // Slow!=null even nodes ha . fast .next!=null odd. 
        while (fast != null && fast.next != null) {
            slow = slow.next;// jump slow+1;Tutrle
            fast = fast.next.next;// jump slow+2;.. Rabbit.

        }
        return slow;
    }

    public boolean palindrome() {
        // cheeck Corner case.
        if (head == null || head.next == null) {
            return true;
        }
        //  Step1:- find mid.
        Node midValue = mid();
        // Step 2: reverse 2nd half
        Node prev = null;
        Node curr = midValue;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;// reverse linking.
            prev = curr;
            curr = next;
        }
        //head = prev;

        // Step 3:- check right half and left half are equal.
        Node right = prev;
        Node left = head;

        // Step 3:- check right half and left half are equal.
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
// Print Linked List.

    public void printLInkedlist() {
        //Check karo head null nahi h
        Node temp = head;
        if (temp == null) {
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList obj = new LinkedList();
        // obj.addData(1);
        // obj.addData(2);
        // obj.addData(3);
        // obj.addData(4);
        // obj.addData(5);
        // obj.addData(6);
        // obj.printLInkedlist();
        // obj.reverseLinkedlist();
        // System.out.println("SIZE OF LINKED LIST: " + obj.sizell());
        // obj.printLInkedlist();
        // obj.deleteNthformend(3);
        // System.out.println("SIZE OF LINKED LIST: " + obj.sizell());
        // obj.printLInkedlist();


        //Check palindrone.

        obj.addData(1);
        obj.addData(2);
        obj.addData(2);
        obj.addData(1);
        System.out.println(" CHECK NODE ARE PALINDROME :"+obj.palindrome());

    }
}
