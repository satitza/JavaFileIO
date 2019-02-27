package com.example;

//import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class MainClass {

    private static String fileName = "/home/exodus/Desktop/Java/JavaFileIO/src/main/java/com/example/Java.pdf";

    public static void main(String[] args) throws UnsupportedEncodingException {

        /*FileByteStream fb = new FileByteStream();

        byte[] buffers = fb.ReadFileStream(fileName);

        for (int i = 0; i < buffers.length; i++) {

            System.out.printf("index of byte %d value int is  %d ", i , buffers[i]);
            System.out.print(" :  value char is " + (char)buffers[i]);
            System.out.print(" :  value binary is " + Integer.toBinaryString(buffers[i]));
            System.out.print(" :  value hex is " + Integer.toHexString(buffers[i]));
            System.out.println(" :  value oct is " + Integer.toOctalString(buffers[i]));

        }

        fb.WriteFileStream("/home/exodus/Desktop/Java/JavaFileIO/src/main/java/com/example/Java-2.pdf", buffers);*/


        byte[] byteString = "Anonymous".getBytes("UTF-8");

        for (int i = 0; i < byteString.length; i++) {
            System.out.println(byteString[i]);
        }

        byte[] byteStringUTF = "Anonymous".getBytes("TIS-620");

        for (int i = 0; i < byteString.length; i++) {
            System.out.println(byteStringUTF[i]);
        }


    }

}
