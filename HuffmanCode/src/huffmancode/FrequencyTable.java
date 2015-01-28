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
    //need to convert to nodes with data holders
    private int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, 
        v, w, x, y, z, sp, nl, aps, quote;
    //for ease of iteration god i'm rusty
    private int[] arr;
    
    //handles a just one line
    public void CreateTable(String line){
        
    }
    
    //handles a multiline document(split at returns)
    public void CreateTable(String[] doc){
        nl = doc.length;
        ParseString(doc);
        PrintFreq();
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
        for(String line : doc){
            
            line = line.toLowerCase();
            for(int iter = 0; iter < line.length(); iter++){
                switch(line.charAt(iter)){
                    case 'a':
                        a++;
                        break;
                    case 'b':
                        b++;
                        break;
                    case 'c':
                        c++;
                        break;
                    case 'd':
                        d++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'f':
                        f++;
                        break;
                    case 'g':
                        g++;
                        break;
                    case 'h':
                        h++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'j':
                        j++;
                        break;
                    case 'k':
                        k++;
                        break;
                    case 'l':
                        l++;
                        break;
                    case 'm':
                        m++;
                        break;
                    case 'n':
                        n++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'p':
                        p++;
                        break;
                    case 'q':
                        q++;
                        break;
                    case 'r':
                        r++;
                        break;
                    case 's':
                        s++;
                        break;
                    case 't':
                        t++;
                        break;
                    case 'u':
                        u++;
                        break;
                    case 'v':
                        v++;
                        break;
                    case 'w':
                        w++;
                        break;
                    case 'x':
                        x++;
                        break;
                    case 'y':
                        y++;
                        break;
                    case 'z':
                        z++;
                        break;
                    case ' ':
                        sp++;
                        break;
                    case '\'':
                        aps++;
                        break;
                    case '\"':
                        quote++;
                        break;
                    default:
                        System.out.println("Unrecognized char");
                }                
            }
        }
    }
    
    private void AddToQ(){
        //add the arr into a Q to be returned as a frequency table
    }
    
    private void PrintFreq(){
        int[] arr = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, 
        r, s, t, u, v, w, x, y, z, sp, nl, aps, quote};
        for(int iter : arr){
            System.out.println(iter);
        }
    }
}