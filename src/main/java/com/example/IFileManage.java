package com.example;

import java.io.*;

public interface IFileManage {

       byte[] ReadFileStream(String fileName);

       boolean WriteFileStream(String fileName, byte[] buffers);

       byte[] BufferReadFileStream(String fileName);

       boolean BufferWriteFileStream(String fileName, byte[] buffers);

}
