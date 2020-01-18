class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    myLinkedList ml = new myLinkedList();
	ml.addNode(5);
	ml.addNode(6);
	ml.addNode(7);
	//ml.printLinkedList();
	ml.prependNode(4);
	//ml.printLinkedList();
	//ml.printLinkedList();
	//ml.insertAfter(ml.head.next.next, 99);
	//ml.remove();
	ml.printLinkedList();
	ml.removeAtIndex(2);
	ml.printLinkedList();
  }
}