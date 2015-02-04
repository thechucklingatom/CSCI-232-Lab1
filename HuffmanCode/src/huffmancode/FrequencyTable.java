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
    private int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, sp, nl, aps, quote;
    //for ease of iteration god i'm rusty
    private int[] arr = new int[30];
    
    //handles a just one line
    public void CreateTable(String line){
        
    }
    
    //handles a multiline document(split at returns)
    public void CreateTable(String[] doc){
        nl = doc.length;
        ParseString(doc);
        //PrintFreq();
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
        
        int[] toCopy = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, 
        r, s, t, u, v, w, x, y, z, sp, nl, aps, quote};
        System.arraycopy(toCopy, 0, arr, 0, arr.length);
    }
    
    public Node[] ReturnNodes(){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                counter++;
            }
        }
        Node[] nodes = new Node[counter];
        char character = 97;
        counter = 0;
        for(int iter : arr){
            if(iter != 0){
                Node toAdd = new Node();
                toAdd.frequncy = iter;
                toAdd.data = character;
                nodes[counter] = toAdd;
                counter++;
            }
                
            if(character == 122){
                character = 32;
            }else if(character == 32){
                character = 92;
            }else if(character == 92){
                character = 39;
            }else if(character ==39){
                character = 34;
            }else{
                character++;
            }
        }
        
        return nodes;
    }
    
    private void PrintFreq(){
        char test = 97;
        for(int iter : arr){
            
            System.out.print(test + " ");
            System.out.println(iter);
            if(test == 122){
                test = 32;
            }else if(test == 32){
                test = 92;
            }else if(test == 92){
                test = 39;
            }else if(test ==39){
                test = 34;
            }else{
                test++;
            }
            
        }
    }
}