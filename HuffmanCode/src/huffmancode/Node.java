/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancode;

/**
 *
 * @author thechucklingatom
 */
public class Node<E extends Comparable <E>> {
    public E data;
    public E frequncy;
    public Node next;
    public Node previous;
}
