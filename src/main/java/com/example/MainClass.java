package com.example;

public class MainClass {

    private static String fileName = "D:\\Project\\Java\\JavaFileIO\\src\\main\\java\\com\\example\\java_stream.pdf";

    public static void main(String[] args){

        FileByteStream fb = new FileByteStream();

        byte[] buffers = fb.BufferReadFileStream(fileName);
        fb.BufferWriteFileStream("D:\\Project\\Java\\JavaFileIO\\src\\main\\java\\com\\example\\java_stream2.pdf", buffers);

    }

}
