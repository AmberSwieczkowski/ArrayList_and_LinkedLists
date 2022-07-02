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
        System.out.println("Added to Head: " + first.value);
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
        System.out.println("Added to Tail: " + last.value);
    }

    // deleteFirst
    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("Cannot delete when list is empty");
            return null;
        } else {
            Node oldFirst = first;
            first = first.next;
            System.out.println("Deleted from Head: " + oldFirst.value);
            return oldFirst;
        }
    }

    // deleteLast
    public Node deleteLast() {
        if (isEmpty()) {
            System.out.println("Cannot delete when list is empty");
            return null;
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
            System.out.println("Deleted from Tail: " + oldLast.value);
            return oldLast;
        }
    }

    // contains
    // indexOf

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

