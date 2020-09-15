/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;


import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Coso
 */
public class MyFile {
    private BufferedReader reader;
    private BufferedWriter writer;
    private String filename;
    
    public MyFile(String filename) {
        try {
            writer = Files.newBufferedWriter(Paths.get(filename));
            reader = Files.newBufferedReader(Paths.get(filename));
        } catch (IOException ex) {
            Logger.getLogger(MyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.filename = filename;
    }
    
    //mette in coda una stringa
    public void writeString(String s) throws IOException {
        writer.write(s);
        writer.newLine();
        writer.close();
        
    }
    
    //return lista di tutte le stringhe inserite
    public List<String> readStrings() throws IOException {
        List<String> ls = new ArrayList<>();
        String newLine = "";
        while ((newLine = reader.readLine()) != null) {
            ls.add(newLine);
        }
        reader.close();
        return ls;
    }
    
    //return oggetto contenente la stringa cercata
    public String findString(int attributeNumber, String toSearch) throws IOException {
        Boolean loop = true;
        String[] s = null;
        String newLine = "";
        String output = "";
        while ((newLine = reader.readLine()) != null && loop) {
            s = newLine.split(",");
            if (s[attributeNumber].equals(toSearch)) {
                loop = false;
                output = newLine;
            }
        }
        reader.close();
        return output;
    }
}
