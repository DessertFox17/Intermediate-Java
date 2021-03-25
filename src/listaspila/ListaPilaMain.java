package listaspila;

import javax.swing.*;

public class ListaPilaMain {

    public void ListaPilaPrincipal() {
        int option = 0;
        String node = "";
        Pila pile = new Pila();

        do {

            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n\n"
                        + "1. Insert a node\n"
                        + "2. Erase a node\n"
                        + "3. Is the pile empty?\n"
                        + "4. What is the last inserted value?\n"
                        + "5. How many nodes does the pile has?\n"
                        + "6. Clear the pile\n"
                        + "7. Show the pile content\n"
                        + "8. Exit\n\n"));
                switch (option) {
                    case 1:
                        node = JOptionPane.showInputDialog(null, "Insert the value to store in the node");
                        pile.insertNode(node);
                        break;
                    case 2:
                        if (!pile.emptyPile()) {
                            JOptionPane.showMessageDialog(null, "The node with the value: " + pile.eraseNode());
                        } else {
                            JOptionPane.showMessageDialog(null, "The pile is empty");
                        }
                        break;
                    case 3:
                        if (pile.emptyPile()) {
                            JOptionPane.showMessageDialog(null, "The pile is empty");
                        } else {
                            JOptionPane.showMessageDialog(null, "The pile isn´t empty");
                        }
                        break;
                    case 4:
                        if (!pile.emptyPile()) {
                            JOptionPane.showMessageDialog(null, "The las inserted value was : " + pile.showlastIn());
                        } else {
                            JOptionPane.showMessageDialog(null, "The pile is empty");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "The pile contains: " + pile.size + " nodes");
                        break;
                    case 6:
                        if (!pile.emptyPile()) {
                            pile.cleanPile();
                            JOptionPane.showMessageDialog(null, "The pile was succesfully cleared");
                        } else {
                            JOptionPane.showMessageDialog(null, "Now, The pile is empty");
                        }
                        break;
                    case 7:
                        pile.showPile();
                        break;
                    case 8:
                        option = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please just insert numbers");
            }
        } while (option != 8);

    }
}
