package linked_list;

public class MyLinkedList {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if(head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode != null) {
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if(headNode != null) return headNode.next;
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        Node lastNode = headNode;
        Node prevNode = null;
        while(lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }

        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        if(index == 0) return addToHead(headNode, value);
        else {
            Node newNode = new Node(value);
            Node current = headNode;
            int count = 0;
            while(current.next != null) {
                count++;
                if(count == index) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
            return headNode;
    }



    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2; n2.next = n3;

        printLinkedList(n1);
        n1 = addToTail(n1, 10);
        printLinkedList(n1);
    }
}
