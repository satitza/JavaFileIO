package com.example;

import java.io.*;

public class MainClass {

    private static String filePdf = "/home/exodus/Desktop/Java/JavaFileIO/src/main/java/com/example/Java.pdf";
    private static String fileTxt = "/home/exodus/Desktop/Java/JavaFileIO/src/main/java/com/example/output.txt";

    public static void main(String[] args) throws IOException {

        FileByteStream fb = new FileByteStream();
        byte[] buffers = fb.readFileStream(filePdf);

        for (int i = 0; i < buffers.length; i++) {


            System.out.printf("index of byte %d value of byte is  %d ", i , buffers[i]);
            System.out.print(" :  value binary is " + Integer.toBinaryString(buffers[i]));
            System.out.print(" :  value hex is " + Integer.toHexString(buffers[i]));
            System.out.println(" :  value oct is " + Integer.toOctalString(buffers[i]));

        }

        if(fb.writeFileStream("/home/exodus/Desktop/Java/JavaFileIO/src/main/java/com/example/Java-2.pdf", buffers) == true){
            System.out.println("Write pdf file success");
        }

        FileCharStream fc = new FileCharStream();
        char[] char_buffers = fc.readFileStream(fileTxt);

        for (int i = 0; i < char_buffers.length; i++) {

            System.out.printf("index of char %d value char is  %c ", i , char_buffers[i]);
            System.out.print(" : value binary is " + Integer.toBinaryString(char_buffers[i]));
            System.out.print(" :  value hex is " + Integer.toHexString(char_buffers[i]));
            System.out.println(" :  value oct is " + Integer.toOctalString(char_buffers[i]));

        }

        if(fc.writeFileStream("/home/exodus/Desktop/Java/JavaFileIO/src/main/java/com/example/output2.txt", char_buffers) == true){
            System.out.println("Write text file success");
        }

    }

}
