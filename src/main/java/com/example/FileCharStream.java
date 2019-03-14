package com.example;

import org.apache.log4j.Logger;

import java.io.*;

public class FileCharStream  {

    private char[] buffers;

    private CharArrayWriter caw;

    private InputStreamReader read;
    private OutputStreamWriter write;

    private File file;

    private final Logger logger = Logger.getLogger(FileCharStream.class.getName());

    public  FileCharStream () {

    }

    public char[] readFileStream(String fileName) {

        try {

            read = new InputStreamReader(new FileInputStream(file = new File(fileName)), "TIS-620");
            caw = new CharArrayWriter();

            buffers = new char[(int)file.length()];
            int len;

            while ((len = read.read(buffers)) != -1) {
                caw.write(buffers, 0 , len);
            }

            read.close();
            return caw.toCharArray();



        } catch (IOException ex){

            logger.error(ex.getMessage());
            return null;

        }
    }

    public boolean writeFileStream(String fileName, char[] buffers) {

        try {

            write = new OutputStreamWriter(new FileOutputStream(fileName), "TIS-620");
            write.write(buffers);
            write.close();
            return true;

        } catch (IOException ex) {

            logger.error(ex.getMessage());
            return false;

        }

    }
}
