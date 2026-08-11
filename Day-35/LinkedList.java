
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    // print Method.
    public void addData(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last element;
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // remove first.
    public int firstRemove() {
        if (size == 0) {
            System.out.println("LINKED LIST IS EMPTY");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public void printData() {
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

    public int lastRemove() {
        if (size == 0) {
            System.out.println("LINKED LIST IS EMPTY");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            size = 0;
            int val = head.data;// Tail.data.
            head = tail = null;
            size = 0;
            return val;
        }

        // Track index;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
// Search LinkedList data== key;

    public int IsSearch(int key) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void reverseLinkList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int calcSize() {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        return sz;
    }

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.addData(1);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(4);
        linkedList.addData(5);
        linkedList.addData(6);
        // linkedList.addData(7);
        // linkedList.addLast(5);
        // linkedList.addLast(6);
        // linkedList.addLast(7);
        // linkedList.addLast(8);
        // linkedList.addLast(9);
        // linkedList.addLast(10);
        linkedList.printData();
        System.out.println("SEARCH KEY : " + linkedList.IsSearch(114));
        linkedList.printData();
        linkedList.reverseLinkList();
        System.out.println("REVERSE LINKED LIST");
        linkedList.printData();
        System.out.println("SIZE OF LINK LIST :"+linkedList.calcSize());
        // System.out.println(linkedList.tail.data);
        // System.out.println(linkedList.head.data);
        // System.out.println("LINKED LIST SIZE:" + linkedList.size);
        // System.out.println("REMOVE FIRST ELEMENT");
        // System.out.println(linkedList.firstRemove());
        // linkedList.printData();
        // System.out.println("LINKED LIST SIZE:" + linkedList.size);
        // System.out.println("REMOVE LAST  ELEMENT");
        // System.out.println("LINKED LIST SIZE:" + linkedList.size);
        // linkedList.printData();
        // System.out.println(linkedList.lastRemove());
        // System.out.println("LINKED LIST SIZE:" + linkedList.size);

    }
}
