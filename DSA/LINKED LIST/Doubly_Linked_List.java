import java.util.Scanner;

class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Doubly_Linked_List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int data, choose, index, elements;

        while (true) {
            System.out.println("\n1. Create the doubly linked list");
            System.out.println("2. Add at End of the list");
            System.out.println("3. Add when list is Empty");
            System.out.println("4. Display the doubly linked list");
            System.out.println("5. Count");
            System.out.println("6. Search the elements of the list");
            System.out.println("7. Insert the data at a specific position");
            System.out.println("8. Add at the first of the list");
            System.out.println("9. Delete at any position");
            System.out.println("10. Enter after the nodes");
            System.out.println("11. Taking previous data");
            System.out.println("0. Exit the list");

            System.out.print("\nEnter the choice: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    head = createList(head);
                    break;
                case 2:
                    System.out.print("Enter the data of the nodes: ");
                    data = sc.nextInt();
                    head = addToEnd(head, data);
                    break;
                case 3:
                    System.out.print("Enter the data of the nodes: ");
                    data = sc.nextInt();
                    head = addToEmpty(head, data);
                    break;
                case 4:
                    display(head);
                    break;
                case 5:
                    count(head);
                    break;
                case 6:
                    System.out.print("Enter the data which is to be searched: ");
                    data = sc.nextInt();
                    search(head, data);
                    break;
                case 7:
                    System.out.print("Enter the data of the nodes: ");
                    data = sc.nextInt();
                    System.out.print("Enter the position in which data is inserted: ");
                    index = sc.nextInt();
                    head = addAtIndex(head, data, index);
                    break;
                case 8:
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    head = addToFirst(head, data);
                    break;
                case 9:
                    System.out.print("Enter the position: ");
                    index = sc.nextInt();
                    head = deleteAtIndex(head, index);
                    break;
                case 10:
                    System.out.print("Enter the data after which you want to insert: ");
                    elements = sc.nextInt();
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    head = insertAfterNode(head, elements, data);
                    break;
                case 11:
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    myChoice(head, data);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        }
    }

    public static Node addToEmpty(Node head, int data) {
        Node ptr = new Node(data);
        head = ptr;
        return head;
    }

    public static Node addToEnd(Node head, int data) {
        Node ptr = new Node(data);
        Node p = head;

        while (p.next != null) {
            p = p.next;
        }

        ptr.prev = p;
        p.next = ptr;
        ptr.next = null;

        return head;
    }

    public static Node createList(Node head) {
        Scanner sc = new Scanner(System.in);
        int data, n;

        System.out.print("Enter the number of nodes: ");
        n = sc.nextInt();
        head = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Elements: ");
            data = sc.nextInt();
            head = addToEmpty(head, data);
        }

        return head;
    }

    public static void display(Node head) {
        Node p = head;

        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }

        System.out.println();
    }

    public static void count(Node head) {
        int count = 0;
        Node p = head;

        while (p != null) {
            count++;
            p = p.next;
        }

        System.out.println("Total number of Nodes: " + count);
    }

    public static void search(Node head, int data) {
        Node p = head;
        int pos = 1;

        while (p != null) {
            if (p.data == data) {
                System.out.println(data + " data is at " + pos + " position");
            }
            pos++;
            p = p.next;
        }
    }

    public static Node addAtIndex(Node head, int data, int index) {
        Node ptr = new Node(data);
        Node p = head;

        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }

        ptr.data = data;
        ptr.next = p.next;
        p.next = ptr;
        ptr.prev = p;

        return head;
    }

    public static Node addToFirst(Node head, int data) {
        Node ptr = new Node(data);

        if (head == null) {
            System.out.println("List is Empty");
            return head;
        }

        ptr.data = data;
        ptr.next = head;
        head.prev = ptr;
        ptr.prev = null;
        head = ptr;

        return head;
    }

    public static Node deleteAtIndex(Node head, int index) {
        Node p = head;

        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }

        p.prev.next = p.next;
        p.next.prev = p.prev;

        return head;
    }

    public static Node insertAfterNode(Node head, int elements, int data) {
        Node ptr = new Node(data);

        if (head.data == elements) {
            ptr.data = data;
            ptr.next = head;
            head.prev = ptr;
            ptr.prev = null;
            head = ptr;
            return head;
        }

        Node p = head;

        while (p != null) {
            if (p.data == elements) {
                ptr.data = data;
                ptr.next = p.next;
                p.next = ptr;
                ptr.prev = p;
                return head;
            }
            p = p.next;
        }

        return head;
    }

    public static void myChoice(Node head, int data) {
        Node p = head;

        while (p != null) {
            if (p.data == data) {
                System.out.println("Data of previous elements is: " + p.prev.data);
            }
            p = p.next;
        }
    }
}
