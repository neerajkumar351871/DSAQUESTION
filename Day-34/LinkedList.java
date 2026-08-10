
class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        // 1. create new node.
        Node newNode = new Node(data);
        if (head == null) {
            head = Tail = newNode;
            return;
        }
           size++;
        //2. new node next= head;
        // Linking other node
        newNode.next = head;
        //3. head new node. 

        head = newNode;
    }

    public void addLast(int data) {
        // create a new node.
        Node newNode = new Node(data);
        if (head == null) {
            head = Tail = newNode;
            return;
        }
        // tail= newNOde
        Tail.next = newNode;
        Tail = newNode;
        size++;
    }

    public void addIdx(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    

    public void printlink() {

        Node temp = head;
        if (head == null) {
            System.out.println("LINKED LIST IS EMPTY");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ADD STARTING ELEMENT.
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addIdx(2, 9);
        // ADD ENDING ELEMENT.
        // ll.addLast(5);
        // ll.addLast(4);
        // ll.addLast(3);  
        // ll.addLast(2);
        // ll.addLast(1);
        ll.printlink();
        System.out.println(size);
    }
}
