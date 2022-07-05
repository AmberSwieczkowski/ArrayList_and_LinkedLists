public class App {
    public static void main(String[] args) throws Exception {
        var list = new LinkedList();
        list.addLast(10);
        list.contains(30);
        list.addLast(20);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.contains(20);
        list.indexOf(20);
        list.deleteLast();
        list.addFirst(30);
        list.print();
    }
}
