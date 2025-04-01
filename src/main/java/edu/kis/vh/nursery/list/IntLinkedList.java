package edu.kis.vh.nursery.list;

/**
 * Klasa IntLinkedList implementuje stos przy użyciu listy dwukierunkowej.
 */

public class IntLinkedList {

    /** Wartosc zwracana w przypadku pustego stosu, gdy użytkownik chciałby pobrać/odczytać z niego wartość */
    private static final int DEFAULT_RETURN_VALUE = -1;

    /** Ostatni dodany element stosu */
    private Node last;

    private int i;

    /** Dodanie elementu na szczyt stosu
     *
     * @param i wartość do dodania na szczyt stosu
     *
     * */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /** Metoda sprawdzająca, czy stos jest pusty
     *
     * @return true, gdy stos jest pusty lub false w przeciwnym wypadku
     *
     * */
    public boolean isEmpty() {
        return last == null;
    }

    /** Metoda sprawdzająca, czy stos jest pełny
     *
     * @return false, poniewaz lista jest dynamiczna i nie ma maksymalnego rozmiaru
     *
     * */
    public boolean isFull() {
        return false;
    }

    /** Odczytywanie wartości ze szczytu stosu
     *
     * @return wartość ze szczytu stosu, lub DEFAULT_RETURN_VALUE w przypadku pustej listy
     *
     * */
    public int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return last.getValue();
    }

    /** Zdejmowanie wartości znajdującej się na szczycie stosu
     *
     * @return wartość ze szczytu stosu, lub DEFAULT_RETURN_VALUE w przypadku pustej listy
     *
     * */
    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }


    /** Klasa wewnętrzna reprezentująca pojedyńczy węzeł w liście */
    private static class Node {

        /** Wartosc przechowywana w węźle */
        private final int value;

        /** Wskaźnik na węzeł poprzedzający */
        private Node prev;

        /** Wskaźnik na następny węzeł */
        private Node next;

        /** Konstruktor tworzący nowy węzeł
         *
         * @param i wartość przechowywana w węźle
         *
         * */
        public Node(int i) {
            value = i;
        }

        /** Metoda zwracająca wartość przechowywaną w węźle
         *
         * @return wartość w węźle
         *
         * */
        public int getValue() {
            return value;
        }

        /**Metoda zwracająca wskaźnik do poprzedzającego węzła
         *
         * @return wskaźnik do węzła poprzedzającego
         *
         * */
        public Node getPrev() {
            return prev;
        }

        /** Metoda ustawiająca węzeł poprzedzający
         *
         * @param prev nowoustawiony poprzedzający węzeł
         *
         * */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /** Metoda zwracająca następny węzeł
         *
         * @return wskaźnik do następnego węzeła
         *
         * */
        public Node getNext() {
            return next;
        }

        /** Metoda ustawiająca wskaźnik na następny węzeł
         *
         * @param next nowoustawiony następny węzeł
         *
         * */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
