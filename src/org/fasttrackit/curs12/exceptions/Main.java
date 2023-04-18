package org.fasttrackit.curs12.exceptions;

public class Main {
    public static void main(String[] args) {
        int[]a = new int[3];
        try{
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("oups!");
        }

        System.out.println("Printing somehting important"); //-nu se mai printeaza ca avem o exceptie
    }
}
