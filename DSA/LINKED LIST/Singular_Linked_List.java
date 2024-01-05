import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Singular_Linked_List{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Node start = null;
        int choice, data, item, pos;

        while (true) {
            System.out.println("\n1. Create List");
            System.out.println("2. Display");
            System.out.println("3. Count");
            System.out.println("4. Search");
            System.out.println("5. Add to empty list/ Add at beginning");
            System.out.println("6. Add at end");
            System.out.println("7. Add after node");
            System.out.println("8. Add before node");
            System.out.println("9. Add at position");
            System.out.println("10. Delete");
            System.out.println("00. For Delete whole list");
            System.out.println("11. Reverse");
            System.out.println("12. Quit\n");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    start = createList(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    count(start);
                    break;
                case 4:
                    System.out.print("Enter the element to be searched: ");
                    data = scanner.nextInt();
                    search(start, data);
                    break;
                case 5:
                    System.out.print("Enter the element to be inserted: ");
                    data = scanner.nextInt();
                    start = addAtBeg(start, data);
                    break;
                case 6:
                    System.out.print("Enter the element to be inserted: ");
                    data = scanner.nextInt();
                    start = addAtEnd(start, data);
                    break;
                case 7:
                    System.out.print("Enter the element to be inserted: ");
                    data = scanner.nextInt();
                    System.out.print("Enter the element after which to insert: ");
                    item = scanner.nextInt();
                    start = addAfter(start, data, item);
                    break;
                case 8:
                    System.out.print("Enter the element to be inserted: ");
                    data = scanner.nextInt();
                    System.out.print("Enter the element before which to insert: ");
                    item = scanner.nextInt();
                    start = addBefore(start, data, item);
                    break;
                case 9:
                    System.out.print("Enter the element to be inserted: ");
                    data = scanner.nextInt();
                    System.out.print("Enter the position at which to insert: ");
                    pos = scanner.nextInt();
                    start = addAtPos(start, data, pos);
                    break;
                case 10:
                    System.out.print("Enter the element to be deleted: ");
                    data = scanner.nextInt();
                    start = delete(start, data);
                    break;
                case 00:
                    start = deleteAllList(start);
                    if (start == null)
                        System.out.println("Linked list is deleted successfully");
                    break;
                case 11:
                    start = reverse(start);
                    break;
                case 12:
                    System.exit(1);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    static Node addAtBeg(Node start, int data) {
        Node tmp = new Node(data);
        tmp.next = start;
        start = tmp;
        return start;
    }

    static Node addAtEnd(Node start, int data) {
        Node tmp = new Node(data);
        Node p = start;
        while (p.next != null)
            p = p.next;
        p.next = tmp;
        tmp.next = null;
        return start;
    }

    static Node createList(Node start) {
        int i, n, data;
        System.out.print("Enter the number of nodes: ");
        n = scanner.nextInt();
        start = null;
        if (n == 0) {
            return start;
        }
        System.out.print("Enter the element to be inserted: ");
        data = scanner.nextInt();
        start = addAtBeg(start, data);
        for (i = 2; i <= n; i++) {
            System.out.print("Enter the element to be inserted: ");
            data = scanner.nextInt();
            start = addAtEnd(start, data);
        }
        return start;
    }

    static void display(Node start) {
        Node p;
        if (start == null) {
            System.out.println("List is Empty");
            return;
        }
        p = start;
        System.out.println("List is: ");
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    static void count(Node start) {
        Node p = start;
        int cnt = 0;
        while (p != null) {
            p = p.next;
            cnt++;
        }
        System.out.println("Number of elements are " + cnt);
    }

    static void search(Node start, int item) {
        Node p = start;
        int pos = 1;
        while (p != null) {
            if (p.data == item) {
                System.out.println("Item " + item + " found at position " + pos);
                return;
            }
            p = p.next;
            pos++;
        }
    }

    static Node addAfter(Node start, int data, int item) {
        Node tmp, p;
        p = start;
        while (p != null) {
            if (p.data == item) {
                tmp = new Node(data);
                tmp.next = p.next;
                p.next = tmp;
                return start;
            }
            p = p.next;
        }
        System.out.println(item + " not present in the list");
        return start;
    }

    static Node addBefore(Node start, int data, int item) {
        Node tmp, p;
        if (start == null) {
            System.out.println("List is Empty");
            return start;
        }
        if (item == start.data) {
            tmp = new Node(data);
            tmp.next = start;
            start = tmp;
            return start;
        }
        p = start;
        while (p.next != null) {
            if (p.next.data == item) {
                tmp = new Node(data);
                tmp.next = p.next;
                p.next = tmp;
                return start;
            }
            p = p.next;
        }
        System.out.println(item + " not present in the list");
        return start;
    }

    static Node addAtPos(Node start, int data, int pos) {
        Node tmp, p;
        int i;
        tmp = new Node(data);
        if (pos == 1) {
            tmp.next = start;
            start = tmp;
            return start;
        }
        p = start;
        for (i = 1; i < pos - 1 && p != null; i++) {
            p = p.next;
        }
        if (p == null)
            System.out.println("There are less than " + pos + " elements");
        else {
            tmp.next = p.next;
            p.next = tmp;
        }
        return start;
    }

        static Node delete(Node start, int data) {
        Node tmp, p;
        if (start == null) {
            System.out.println("List is Empty");
            return start;
        }
        if (start.data == data) {
            tmp = start;
            start = start.next;
            tmp = null;
            return start;
        }
        p = start;
        while (p.next != null) {
            if (p.next.data == data) {
                tmp = p.next;
                p.next = tmp.next;
                tmp = null;
                return start;
            }
            p = p.next;
        }
        System.out.println(data + " not found in the list");
        return start;
    }

    static Node reverse(Node start) {
        Node prev = null, ptr = start, after;
        while (ptr != null) {
            after = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = after;
        }
        start = prev;
        return start;
    }

    static Node deleteAllList(Node start) {
        Node ptr = start;
        while (ptr != null) {
            Node temp = ptr.next;
            ptr = null;
            ptr = temp;
        }
        return start;
    }
}
