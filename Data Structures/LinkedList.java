class LinkedList {

  // head of the linked list
  Node head;

  // node of the linked list
  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }

  }

  // printing the linked list
  public static void printLinkedList(LinkedList list) {
    Node temp = list.head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

  }

  // insert element at the end of linked list
  public static LinkedList insertEnd(LinkedList list, int data) {
    Node newNode = new Node(data);
    Node temp = list.head;

    if (list.head == null) {
      list.head = newNode;
    } else {

      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = newNode;
    }
    return list;
  }

  public static void deleteByKey(LinkedList list, int key) {
    Node temp = list.head;

    if (temp != null && temp.data == key) {
      list.head = temp.next;
    }

  }

  public static void main(String[] args) {
    LinkedList l1 = new LinkedList();

    l1 = insertEnd(l1, 2);
    l1 = insertEnd(l1, 4);

    printLinkedList(l1);

  }

}
