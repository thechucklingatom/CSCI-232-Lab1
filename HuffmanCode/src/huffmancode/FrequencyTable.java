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
public class FrequencyTable {
    private int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, 
        v, x, y, z, sp, nl, aps, quote;
    //for ease of iteration god i'm rusty
    private int[] arr  = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, 
        r, s, t, u, v, x, y, z, sp, nl, aps, quote};
    
    //handles a just one line
    public void CreateTable(String line){
        
    }
    
    //handles a multiline document(split at returns)
    public void CreateTable(String[] doc){
        nl = doc.length;
    }
    
    //resets the table for a different input
    public void ResetTable(){
        //set everything to 0
    }
    
    private void ParseString(String line){
        //Frequency of each line.
    }
    
    private void ParseString(String[] doc){
        //will go through and find the frequency of each char
    }
    
    private void AddToQ(){
        //add the arr into a Q to be returned as a frequency table
    }
}

