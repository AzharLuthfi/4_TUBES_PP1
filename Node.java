package projectKRS;

public class Node {
	private KartuRencanaStudi data;
    private Node next;

    public Node(KartuRencanaStudi data) {
        this.data = data;
    }

    public KartuRencanaStudi getData() {
        return data;
    }

    public void setData(KartuRencanaStudi data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
