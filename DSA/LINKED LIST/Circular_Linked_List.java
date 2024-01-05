import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Circular_Linked_List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node last = null;
        int data, choose, index;

        while (true) {
            System.out.println("\n1. Create the list");
            System.out.println("2. Insert at empty list");
            System.out.println("3. Insert at end of the list");
            System.out.println("4. Display the list");
            System.out.println("5. Insert at beginning of the list");
            System.out.println("6. Insert at any node of the list");
            System.out.println("7. Search the element of the list");
            System.out.println("8. Deletion of the data of the list");

            System.out.print("Choose the above option: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    last = createList(last);
                    break;
                case 2:
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    last = addToEmpty(last, data);
                    break;
                case 3:
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    last = addToEnd(last, data);
                    break;
                case 4:
                    displayTheList(last);
                    break;
                case 5:
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    last = addToBeginning(last, data);
                    break;
                case 6:
                    System.out.print("Enter the index of the data: ");
                    index = sc.nextInt();
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    last = addToNode(last, data, index);
                    break;
                case 7:
                    System.out.print("Enter the data to be searched: ");
                    data = sc.nextInt();
                    search(last, data);
                    break;
                case 8:
                    System.out.print("Enter the data index: ");
                    index = sc.nextInt();
                    last = deletionOfNode(last, index);
                    break;
                default:
                    System.out.println("INVALID SELECTION");
                    break;
            }
        }
    }

    public static Node addToEmpty(Node last, int data) {
        Node ptr = new Node(data);
        last = ptr;
        last.next = last;
        return last;
    }

    public static Node addToEnd(Node last, int data) {
        Node ptr = new Node(data);

        if (last == null) {
            System.out.println("List is Empty");
            return last;
        }

        ptr.data = data;
        ptr.next = last.next;
        last.next = ptr;
        last = ptr;

        return last;
    }

    public static Node createList(Node last) {
        Scanner sc = new Scanner(System.in);
        int n, data;

        System.out.print("Enter the number of nodes in the list: ");
        n = sc.nextInt();

        System.out.print("Enter the data: ");
        data = sc.nextInt();
        last = addToEmpty(last, data);

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter the data: ");
            data = sc.nextInt();
            last = addToEnd(last, data);
        }

        return last;
    }

    public static void displayTheList(Node last) {
        if (last == null) {
            System.out.println("List is Empty");
            return;
        }

        Node p = last.next;

        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);

        System.out.println();
    }

    public static Node addToBeginning(Node last, int data) {
        if (last == null) {
            System.out.println("List is Empty");
            return last;
        }

        Node ptr = new Node(data);
        ptr.data = data;
        ptr.next = last.next;
        last.next = ptr;

        return last;
    }

    public static Node addToNode(Node last, int data, int index) {
        Node ptr = new Node(data);

        if (last == null) {
            System.out.println("List is Empty");
        }

        if (last.next.data == index) {
            last = addToBeginning(last, data);
            return last;
        }

        if (last.data == index) {
            last = addToEnd(last, data);
            return last;
        }

        Node p = last.next;
        p = p.next;

        while (p != last.next) {
            if (p.data == index) {
                ptr.data = data;
                ptr.next = p.next;
                p.next = ptr;
                return last;
            }
            p = p.next;
        }

        return last;
    }

    public static void search(Node last, int data) {
        Node p = last.next;
        int i = 1;

        if (last.next.data == data) {
            System.out.println(data + " is found at 1 position.");
            return;
        }

        p = p.next;

        while (p != last.next) {
            if (p.data == data) {
                System.out.println(data + " is found at " + i + " position.");
                return;
            }
            i++;
            p = p.next;
        }

        System.out.println(data + " is not found in the list");
    }

    public static Node deletionOfNode(Node last, int index) {
        Node p = last.next;

        if (last.next.data == index) {
            Node ptr = last.next;
            last.next = ptr.next;
            ptr = null;
            return last;
        }

        while (p.next != last) {
            if (p.next.data == index) {
                Node ptr = p.next;
                p.next = ptr.next;
                ptr = null;
                return last;
            }
            p = p.next;
        }

        if (last.data == index) {
            Node ptr = last;
            p.next = last.next;
            last = p;
            ptr = null;
            return last;
        }

        return last;
    }
}
