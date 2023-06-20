package List;

import java.util.Scanner;

public class Implementation_Using_LinkedList {
    private NodeList head;

    private static class NodeList {
        private int data;
        private NodeList next;

        public NodeList(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(NodeList head) {
        NodeList current = head;
        System.out.println("List elements are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public int length() {
        int count = 0;
        NodeList current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        NodeList newNode = new NodeList(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        NodeList newNode = new NodeList(value);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeList current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtGivenPosition(int position, int value) {
        NodeList newNode = new NodeList(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 1;
            NodeList previous = head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            NodeList current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public NodeList deleteFirst() {
        if (head == null) {
            return null;
        }
        NodeList temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public NodeList deleteLast() {
        if (head == null || head.next == null) {
            return null;
        }
        NodeList current = head;
        NodeList previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void DeletionAtGivenPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            int count = 1;
            NodeList previous = head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            NodeList current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean search(int key){
        if (head == null){
            return false;
        }
        NodeList temp = head;
        while (temp != null){
            if (temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void operations(){
        System.out.println("The operations to be performed are:");

        System.out.println("Enter 1 to display List");

        System.out.println("Enter 2 to add element at start in List");
        System.out.println("Enter 3 to add element at end in List");
        System.out.println("Enter 4 to add element at specific position in List");

        System.out.println("Enter 5 to remove element from start in List");
        System.out.println("Enter 6 to remove element from end in List");
        System.out.println("Enter 7 to remove element from specific position in List");

        System.out.println("Enter 8 to display list");

        System.out.println("Enter 9 to exit from List");
    }

    public static void main(String[] args) {

        Implementation_Using_LinkedList i = new Implementation_Using_LinkedList();
        Scanner sc = new Scanner(System.in);
        int num;

        i.operations();

        int op = sc.nextInt();

        while (op != 9) {

            switch (op) {
                case 1:
                        i.display(i.head);

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 2:
                        System.out.println("Enter the number you want to insert");
                        num = sc.nextInt();

                        i.insertFirst(num);

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 3:
                        System.out.println("Enter the number you want to insert");
                        num = sc.nextInt();

                        i.insertLast(num);

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 4:
                        System.out.println("Enter the number you want to insert");
                        num = sc.nextInt();

                        System.out.println("Enter the position at which you want to insert the number");
                        int position = sc.nextInt();

                        i.insertAtGivenPosition(position, num);

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 5:
                        i.deleteFirst();

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 6:
                        i.deleteLast();

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 7:
                        System.out.println("Enter the position at which you want to delete number");
                        position = sc.nextInt();

                        i.DeletionAtGivenPosition(position);

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 8:
                        System.out.println("Enter the number you want to search");
                        int key = sc.nextInt();

                        i.search(key);

                        i.operations();
                        op = sc.nextInt();

                        break;

                case 9:
                        break;

                default:
                        System.out.println("Enter valid number to perform operations");
                        System.out.println("\n");
                        i.operations();
                        op = sc.nextInt();
            }
        }
    }
}
