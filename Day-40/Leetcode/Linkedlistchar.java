
class Linkedlistchar {

    public static class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
// Add data.

    public void add(char data) {
        Node newNode = new Node(data);
        // head=  agra null  ho to.

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // print Node
    public void printData() {
        // check karo head null to nahi h ha to  print karo ki linked list ma empty h.
        if (head == null) {
            System.out.println("LINKED LIST  EMPTY HA");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Calculate size;
    public int size() {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }
    // REVERSE  STRING.

    public void reverse() {
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

    // FIND MID VALUE;
    public Node mid() {
        Node solow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            solow = solow.next;// +1;
            fast = fast.next.next;
        }
        return solow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle
        Node midval = mid();

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = midval;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare
        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {
        Linkedlistchar obj = new Linkedlistchar();
        obj.printData();
        obj.add('R');
        obj.add('A');
        obj.add('C');
        obj.add('C');
        obj.add('A');
        obj.add('R');

        obj.printData();
        System.out.println("SIZE  OF LINKED LIST : " + obj.size());
        obj.printData();
        obj.reverse();
        obj.printData();
        System.out.println(obj.isPalindrome());

    }
}
