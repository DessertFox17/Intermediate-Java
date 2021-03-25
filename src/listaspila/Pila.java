package listaspila;

import javax.swing.*;

public class Pila {

    private Nodo lastIn;
    int size = 0;
    String List = "";

    public Pila() {
        lastIn = null;
        size = 0;
    }

    public boolean emptyPile() {
        return lastIn == null;
    } //This method checks if the pile is empty

    public void insertNode(String node) {
        Nodo newNode = new Nodo(node);
        newNode.next = lastIn;
        lastIn = newNode;
        size++;
    }//This method inserts a new node in the pile

    public String eraseNode() {

        String assist = lastIn.info;
        lastIn = lastIn.next;
        size--;
        return assist;
    }//This method erase a node of the pile

    public String showlastIn() {

        return lastIn.info;
    }//This method shows the last inserted value

    public int pileSize() {
        return size;
    }//This method shows the size of the pile

    public void cleanPile() {
        while (!emptyPile()) {
            eraseNode();
        }
    }//This method clean the pile

    public void showPile() {
        Nodo rounded = lastIn;
        while (rounded != null) {
            List += rounded.info + "\n";
            rounded = rounded.next;
        }
        JOptionPane.showMessageDialog(null, List);
        List = "";
    }//This method shows the pile content

}
