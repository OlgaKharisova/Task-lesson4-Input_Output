package ru.innopolis.stc13.io.byteArray;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte[] array1 = new byte[] {1,3,5,7};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array1);
        int b;
        while ((b=byteArrayInputStream.read())!=-1) {
            System.out.println((char)b);
        }

        String text = "Hello world";
        array1 = text.getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(array1);


    /*        String text = "Hello world";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buffer);
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                System.out.println((char) c);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

