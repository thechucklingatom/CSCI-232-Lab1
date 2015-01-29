/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuechallenge;

/**
 *
 * @author thechucklingatom
 */
public class EmptyQueueException extends RuntimeException { 

    public EmptyQueueException(String err) { 
        
        super( err); 
        
        
    } 
    //this is for the extra end paren
    public String toString(){
        return("No one in the queue");
    }

}
