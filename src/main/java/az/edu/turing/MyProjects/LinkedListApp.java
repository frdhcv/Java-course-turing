package az.edu.turing.MyProjects;

public class LinkedListApp {
    public static void main(String[] args) {
        var linkedList = new LinkedList<Integer>(10);
        System.out.println(linkedList);
        var second = new Node<>(11);
        linkedList.addTail(13);
        System.out.println(linkedList);
        linkedList.addTail(15);
        System.out.println(linkedList);
        linkedList.addHead(65);
        System.out.println(linkedList);
        linkedList.deleteIndex(2);
        System.out.println(linkedList);
        linkedList.delete(15);
        System.out.println(linkedList);
        linkedList.update(1,15);
        System.out.println(linkedList);

    }
}
