package com.example;

import java.io.*;

public class FileCharStream  {

    private char[] buffers;


    private InputStreamReader read;
    private OutputStreamWriter write;

    public char[] ReadFileStream(String fileName) {

        try {

            read = new InputStreamReader(new FileInputStream(fileName), "TIS-620");
            CharArrayWriter caw = new CharArrayWriter();

            buffers = new char[1];
            int len;

            while ((len = read.read(buffers)) != -1) {
                caw.write(buffers, 0 , len);
            }

            read.close();
            return caw.toCharArray();



        } catch (IOException ex){

            ex.printStackTrace();
            return null;

        }
    }

    public boolean WriteFileStream(String fileName, char[] buffers) {

        try {

            write = new OutputStreamWriter(new FileOutputStream(fileName), "TIS-620");
            write.write(buffers);
            write.close();
            return true;

        } catch (IOException ex) {

            ex.printStackTrace();
            return false;

        }

    }
}
