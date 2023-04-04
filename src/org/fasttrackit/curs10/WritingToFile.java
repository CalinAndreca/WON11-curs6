package org.fasttrackit.curs10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", true));
        writer.write("this is the firtst line");
        writer.newLine();
        writer.flush();
        writer.close();
    }
}
