package opgave01.models;

import java.util.ArrayList;
import java.util.Iterator;


public class LinkedList<E> implements ListEaaa<E> {
    private Node head;
    private Node tail;


    @Override
    public void add(E e) {
        Node newNode = new Node(e);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        tail.setNext(newNode);
        tail = newNode;

    }

    @Override
    public boolean remove(E e) {
        Node removeNode = head;
        Node last = head;

        if (head.getElement() == e) {
            head = head.getNext();
            if (head == null) {
                tail.setElement(null);
                return true;
            }
        }

        while (removeNode != null) {
            if (removeNode.getElement().equals(e)) {
                last.setNext(removeNode.getNext());
                return true;
            }
                if (tail.getElement().equals(e)) {
                    tail = last;
                    last.setNext(null);
                    return true;
                }
                last=removeNode;
                removeNode = removeNode.getNext();
            }

        return false;
    }

    @Override
    public void addFirst(Object o) {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

        tail.setElement(null);
        head.setElement(null);


    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    public class Node<T> {
        private E element;
        private Node next;


        public Node(E element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}


