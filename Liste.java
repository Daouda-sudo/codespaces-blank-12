public class Liste {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Liste() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }
    public int getSize() {
        return size;
    }
    public Nodo getHead() {
        return head;
    }
    public Nodo getCursor() {
        return cursor;
    }
    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }
    


    public static void stampa(Liste lista) {
        Nodo corrente = lista.getHead();

        System.out.print("[");

        while (corrente != null) {
            System.out.print(corrente.getValore());

            if (corrente.getNext() != null) {
                System.out.print(", ");
            }

            corrente = corrente.getNext();
        }

        System.out.println("]");
    }
}