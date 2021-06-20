import com.aditya.Flight;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.*;

public class Execute {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fi = new FileInputStream("written_with_nio.dat");
            FileChannel channel = fi.getChannel()){
            ByteBuffer buffer = ByteBuffer.allocate(100);
            channel.read(buffer);
            buffer.flip();
            byte[] inputData = new byte[12];
            int a = buffer.getInt();
            buffer.get(inputData);
            System.out.println("position : " + a);
            System.out.println("1. " + new String(inputData));
            int b = buffer.getInt();
            System.out.println("position : " + b);
            buffer.get(inputData);
            System.out.println("2. " + new String(inputData));
        }
    }
}
