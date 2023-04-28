
package Sonidos;

public class ListaEnlazadaDoble {
    Nodo head;
    Nodo tail;
    
    public ListaEnlazadaDoble() {
        this.head = null;
        this.tail = null;
    }
    
    public void add(int data) {
        Nodo newNode = new Nodo(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void remove(int data) {
        Nodo current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = current.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }
    
    public void print() {
        Nodo current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

