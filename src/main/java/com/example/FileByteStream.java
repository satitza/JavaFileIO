package com.example;

import org.apache.log4j.Logger;

import java.io.*;

public class FileByteStream {

    private byte[] buffers;

    private ByteArrayOutputStream bos;

    private InputStream in;
    private OutputStream out;

    private File file;

    private final Logger logger = Logger.getLogger(FileByteStream.class.getName());

    public FileByteStream() {

    }

    public byte[] readFileStream(String fileName) {

        try  {

            in = new FileInputStream(file = new File(fileName));
            bos = new ByteArrayOutputStream(); // create ByteArrayOutputStream for write byte to buffers

            buffers = new byte[(int)file.length()];
            int length;

            while ((length = in.read(buffers)) != -1) { // in.read(1) read one by one byte

                bos.write(buffers, 0, length); // write byte to buffers

            }

            in.close();
            return bos.toByteArray(); // return byte array

        } catch (IOException ex){

            logger.error(ex.getMessage());
            return null;

        }
    }

    public boolean writeFileStream(String fileName, byte[] buffers) {

        try {

            out = new FileOutputStream(fileName);
            out.write(buffers);
            out.close();
            return true;

        }catch (IOException ex){

            logger.error(ex.getMessage());
            return false;

        }
    }
}
