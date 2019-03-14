package com.example;

import org.apache.log4j.Logger;

public class MainClass {

    private static String filePdf = "/media/Project/JavaFileIO/src/main/java/com/example/Java.pdf";
    private static String fileTxt = "/media/Project/JavaFileIO/src/main/java/com/example/output.txt";

    private static Logger logger = Logger.getLogger(MainClass.class);

    MainClass(){

        logger.trace("TRACE"); // ติดตาม
        logger.debug("DEBUG"); // การแก้ปัญหา
        logger.info("INFO"); // ข้อมูล
        logger.warn("WARN"); // เตือน
        logger.error("ERROR"); // ความผิดพลาด
        logger.fatal("FATAL"); // ร้ายแรง

    }

    public static void main(String[] args) {

        FileByteStream fb = new FileByteStream();
        byte[] buffers = fb.readFileStream(filePdf);

        for (int i = 0; i < buffers.length; i++) {


            System.out.printf("index of byte %d value of byte is  %d ", i , buffers[i]);
            System.out.print(" :  value binary is " + Integer.toBinaryString(buffers[i]));
            System.out.print(" :  value hex is " + Integer.toHexString(buffers[i]));
            System.out.println(" :  value oct is " + Integer.toOctalString(buffers[i]));

        }

        if(fb.writeFileStream("/media/Project/JavaFileIO/src/main/java/com/example/Java-2.pdf", buffers) == true){

            logger.info("Write pdf file success");

        }

        FileCharStream fc = new FileCharStream();
        char[] char_buffers = fc.readFileStream(fileTxt);

        for (int i = 0; i < char_buffers.length; i++) {

            System.out.printf("index of char %d value char is  %c ", i , char_buffers[i]);
            System.out.print(" : value binary is " + Integer.toBinaryString(char_buffers[i]));
            System.out.print(" :  value hex is " + Integer.toHexString(char_buffers[i]));
            System.out.println(" :  value oct is " + Integer.toOctalString(char_buffers[i]));

        }

        if(fc.writeFileStream("/media/Project/JavaFileIO/src/main/java/com/example/output2.txt", char_buffers) == true){

            logger.info("Write text file success");

        }

    }

}
