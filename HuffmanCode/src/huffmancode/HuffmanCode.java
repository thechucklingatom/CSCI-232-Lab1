/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author thechucklingatom
 */
public class HuffmanCode {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("test.txt");
        //allows me to read the entire file at once
        byte[] data;
        try (FileInputStream fis = new FileInputStream(file)) {
            data = new byte[(int) file.length()];
            fis.read(data);
        }

        String str = new String(data, "UTF-8");
        
        String lines[] = str.split("\\r?\\n");
        
        for (String line : lines) {
            System.out.println(line);
        }
        
        FrequencyTable myTable = new FrequencyTable();
        myTable.CreateTable(lines);
    }
    
}
