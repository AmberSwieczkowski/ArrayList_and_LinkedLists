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
    }
    // deleteFirst
    // deleteLast
    // contains
    // indexOf

    public void print() {
        Node current = first;

        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;            
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
}

