/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;


import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Coso
 */
public class MyFile {
    BufferedReader reader;
    BufferedWriter writer;
    Integer lines;
    
    public MyFile(String filename) {
        try {
            writer = Files.newBufferedWriter(Paths.get(filename));
            reader = Files.newBufferedReader(Paths.get(filename));
        } catch (IOException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lines = 0;
    }
    
    //mette in coda una stringa
    public void writeString(String s) throws IOException {
        writer.write(s);
        writer.newLine();
        writer.close();
        
        lines++;
    }
    
    //return lista di tutte le stringhe inserite
    public List<String> readStrings() throws IOException {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i <= lines; i++) {
            ls.add(reader.readLine());
        }
        reader.close();
        return ls;
    }
    
    public String findString(int attributeNumber, String toSearch) throws IOException {
        String[] s = null;
        for (int i = 0; i <= lines; i++) {
            s = reader.readLine().split(",");
            if (s[attributeNumber].equals(toSearch))
                i = lines + 1;
        }
        reader.close();
        return s[attributeNumber];
    }
}
