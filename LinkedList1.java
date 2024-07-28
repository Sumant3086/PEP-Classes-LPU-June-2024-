public class LinkedList1 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int addNodeData(int index1, int index2) {
        Node current = head;
        int count = 0;
        int start = 0, end = 0;
        boolean found1 = false, found2 = false;

        while (current != null) {
            if (count == index1) {
                start = current.data;
                found1 = true;
            }
            if (count == index2) {
                end = current.data;
                found2 = true;
            }
            if (found1 && found2) {
                break;
            }
            current = current.next;
            count++;
        }
        return start + end;
    }

    public void removeLastNode() {
        if (head == null) {
            return;  
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
          
         return count;
    }
    

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.display();  
        list.removeLastNode();
        list.display(); 
        System.out.println(list.addNodeData(1, 2));  
    }
}
