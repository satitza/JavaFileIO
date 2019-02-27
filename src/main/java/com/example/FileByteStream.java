package com.example;

import java.io.*;

public class FileByteStream {

    private byte[] buffers;

    private ByteArrayOutputStream bos;

    private InputStream in;
    private OutputStream out;

    public byte[] ReadFileStream(String fileName) {

        try  {

            in = new FileInputStream(fileName);
            bos = new ByteArrayOutputStream(); // create ByteArrayOutputStream for write byte to buffers

            buffers = new byte[1];
            int length;

            while ((length = in.read(buffers)) != -1) { // in.read(1) read one by one byte

                bos.write(buffers, 0, length); // write byte to buffers
            }
            in.close();

            return bos.toByteArray(); // return byte array

        } catch (IOException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public boolean WriteFileStream(String fileName, byte[] buffers) {

        try {

            out = new FileOutputStream(fileName);
            out.write(buffers);
            out.close();
            return true;

        }catch (IOException ex){

            ex.printStackTrace();
            return false;
        }
    }

    /*private BufferedInputStream buffer_in;
    private BufferedOutputStream buffer_out;

    public byte[] BufferReadFileStream(String fileName) {

        try {

            buffer_in = new BufferedInputStream(new FileInputStream(fileName));
            bos = new ByteArrayOutputStream();

            byte[] buffers = new byte[2048];
            int length;

            while ((length = buffer_in.read(buffers)) != -1) {
                bos.write(buffers, 0, length);
            }

            buffer_in.close();
            return bos.toByteArray();

        } catch (IOException ex){

            ex.printStackTrace();
            return null;

        }
    }

    public boolean BufferWriteFileStream(String fileName, byte[] buffers) {

        try {

            buffer_out = new BufferedOutputStream(new FileOutputStream(fileName));
            buffer_out.write(buffers);
            buffer_out.close();
            return true;

        } catch (IOException ex) {

            ex.printStackTrace();
            return false;

        }
    }*/


}
