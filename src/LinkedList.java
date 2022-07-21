import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

        private Node first;
        private Node last;

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
        // System.out.println("Added to Head: " + first.value);
    }

    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        // System.out.println("Added to Tail: " + last.value);
    }

    // deleteFirst
    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("Cannot delete when list is empty");
            throw new NoSuchElementException();
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
            // System.out.println("Deleted from Head: " + second.value);
            return second;
        }
    }

    // deleteLast
    public Node deleteLast() {
        if (isEmpty()) {
            System.out.println("Cannot delete when list is empty");
            throw new NoSuchElementException();
        } else if (first.next == null) {
            first = null;
            return null;
        } else {
            Node current = first;
            while (current.next.next != null) {
                current = current.next;
            }
            Node oldLast = current.next;
            last = current;
            last.next = null;
            // System.out.println("Deleted from Tail: " + oldLast.value);
            return oldLast;
        }
    }

    // contains
public boolean contains(int value) {
    if (isEmpty()) {
        System.out.println("List is empty");
        return false;
    } else {
        Node current = first;
        int index = 0;
        while (current.next != null) {
            if (current.value == value) {
                System.out.println("Found " + value + " at node " + index);
                return true;
            }
            current = current.next;
            index++;
        }
        System.out.println("List does not contain " + value);
        return false;
    }
}

    // indexOf
    public int indexOf(int value) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        } else {
            Node current = first;
            int index = 0;
            while (current != null) {
                if (current.value == value) {
                    System.out.println("Found " + value + " at node " + index);
                    return index;
                }
                current = current.next;
                index++;
            }
            System.out.println("List does not contain " + value);
            return -1;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node current = first;
        System.out.print(current.value);

        while (current.next != null) {
            current = current.next;            
            System.out.print(" -> " + current.value);
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
}

