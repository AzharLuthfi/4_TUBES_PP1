package projectKRS;

public class ListStructure {
    private Node head;

    void addTail(KartuRencanaStudi data) {
        Node curNode;
        Node posNode = null;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }

    }

    void addHead(KartuRencanaStudi data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    void addMid(KartuRencanaStudi data, int position) {
        Node curNode;
        Node posNode = null;
        int i;

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            curNode = head;

            if (position == 1) {
                newNode.setNext(curNode);
                head = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                if (posNode != null) {
                    posNode.setNext(newNode);
                }
                newNode.setNext(curNode);
            }
        }
    }

    void removeHead() {
        if (head != null) {
            head = head.getNext();
        } else {
            System.out.println("List is empty");
        }
    }

    void removeTail() {
        Node preNode = null;
        Node lastNode;

        if (head != null) {
            if (head.getNext() == null) {
                head = null;
            } else {
                lastNode = head;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                if (preNode != null) {
                    preNode.setNext(null);
                }
                lastNode.setNext(null);
                lastNode = null;
            }
        }
    }


    void removeMid(int position) {
        Node curNode;
        Node posNode = null;
        int i;

        if (head != null) {
            curNode = head;

            if (position == 1) {
                head = curNode.getNext();
                curNode.setNext(null);
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                if (posNode != null && curNode != null) {
                    posNode.setNext(curNode.getNext());
                    curNode.setNext(null);
                }
            }
        }
    }

    void displayElements() {
        Node curNode = head;

        while (curNode != null) {
            System.out.println("Mata Kuliah: " + curNode.getData().getMataKuliah());
            System.out.println("SKS: " + curNode.getData().getSks());
            System.out.println("Semester: " + curNode.getData().getSemester());
            System.out.println("Jadwal: " + curNode.getData().getJadwal());
            System.out.println();
            curNode = curNode.getNext();
        }
    }
}
