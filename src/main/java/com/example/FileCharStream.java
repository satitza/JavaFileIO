package com.example;

import com.sun.tools.javac.code.Attribute;

import java.io.*;

public class FileCharStream implements IFileManage {

    private byte[] buffers;

    private CharArrayWriter caw;

    private InputStreamReader read;
    private OutputStreamWriter write;

    public byte[] ReadFileStream(String fileName) {

        try {

            read = new InputStreamReader(new FileInputStream(fileName), "UTF-8");


        } catch (IOException ex){

            ex.printStackTrace();

        }


        return new byte[0];
    }

    public boolean WriteFileStream(String fileName, byte[] buffers) {
        return false;
    }


    private BufferedReader buffer_read;
    private BufferedWriter buffer_write;

    public byte[] BufferReadFileStream(String fileName) {
        return new byte[0];
    }

    public boolean BufferWriteFileStream(String fileName, byte[] buffers) {
        return false;
    }
}
