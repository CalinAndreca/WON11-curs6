package org.fasttrackit.curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        readOneLine();
        readFullFile();
    }
    private static void readFullFile() throws FileNotFoundException{
        Scanner s = new Scanner(new File("files", "content.txt"));
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
    private static void readOneLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files","content.txt"));
        System.out.println(scanner.nextLine());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
    }
}
