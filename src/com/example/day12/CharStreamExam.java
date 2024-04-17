package com.example.day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExam {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("a.txt");
            FileWriter fw = new FileWriter("c.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
