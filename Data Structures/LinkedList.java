import java.util.Scanner;

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
    System.out.println();
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

  // delete element by key
  public static LinkedList deleteByKey(LinkedList list, int key) {
    Node temp = list.head;
    Node prev = null;

    if (temp != null && temp.data == key) {
      System.out.println("Found " + temp.data + " and deleted");
      list.head = temp.next;
      return list;
    }

    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.next;
    }

    if (temp != null) {
      System.out.println("Found " + temp.data + " and deleted");
      prev.next = temp.next;
    } else {
      System.out.println("Key not found");
    }

    return list;
  }

  // delete by position of element
  public static LinkedList deleteByPosition(LinkedList list, int position) {
    Node temp = list.head;
    Node prev = null;
    int counter = 0;

    if (temp != null && position == 0) {
      System.out.println("Deleted element at index " + position);
      list.head = temp.next;
      return list;
    }

    while (temp != null && counter != position) {
      prev = temp;
      temp = temp.next;
      counter++;
    }

    if (temp != null) {
      prev.next = temp.next;
      System.out.println("Deleted element at index " + position);
    } else {
      System.out.println("Index not present in the list");
    }

    return list;

  }

  // insert element at any position
  public static LinkedList insertByPosition(LinkedList list, int value, int index) {
    Node newNode = new Node(value);
    Node temp = list.head;
    Node prev = null;
    int counter = 0;

    if (index == 0 && temp != null) {
      newNode.next = temp;
      list.head = newNode;
      System.out.println("Element inserted at position " + index);
      return list;
    }

    while (temp != null && counter != index) {
      prev = temp;
      temp = temp.next;
      counter++;
    }

    if (temp != null) {
      prev.next = newNode;
      newNode.next = temp;
      System.out.println("Element inserted at position " + index);
    } else {
      System.out.println("Index not present in the list");
    }

    return list;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList l1 = new LinkedList();

    int option, value, position;

    do {
      System.out.println(
          "\nMENU\n1. Insert element\n2. Insert element at position\n3. Delete the element\n4. Delete by position\n5. Print LinkedList\n6. Exit");
      System.out.print("Enter any one option: ");
      option = sc.nextInt();

      switch (option) {
        case 1:
          System.out.print("Enter the element: ");
          value = sc.nextInt();
          l1 = insertEnd(l1, value);
          break;
        case 2:
          System.out.print("Enter the element: ");
          value = sc.nextInt();
          System.out.print("Enter the position: ");
          position = sc.nextInt();
          l1 = insertByPosition(l1, value, position);
          break;
        case 3:
          System.out.print("Enter the element to delete: ");
          value = sc.nextInt();
          l1 = deleteByKey(l1, value);
          break;
        case 4:
          System.out.print("Enter the position: ");
          position = sc.nextInt();
          l1 = deleteByPosition(l1, position);
          break;
        case 5:
          printLinkedList(l1);
          break;
        case 6:
          break;
      }

    } while (option != 6);
    sc.close();
  }
}
