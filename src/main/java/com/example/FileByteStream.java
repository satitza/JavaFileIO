package com.example;

import java.io.*;

public class FileByteStream implements IFileManage {

    private byte[] buffers;

    private ByteArrayOutputStream bos;

    private InputStream in;
    private OutputStream out;

    public byte[] ReadFileStream(String fileName) {

        try  {

            in = new FileInputStream(fileName);
            bos = new ByteArrayOutputStream();

            buffers = new byte[2048];
            int length;

            while ((length = in.read(buffers)) != -1) {
                bos.write(buffers, 0, length);
            }
            in.close();
            return bos.toByteArray();

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

    private BufferedInputStream buffer_in;
    private BufferedOutputStream buffer_out;

    public byte[] BufferReadFileStream(String fileName) {
        return null;
    }

    public boolean BufferWriteFileStream(String fileName, byte[] buffers) {
        return false;
    }

}
