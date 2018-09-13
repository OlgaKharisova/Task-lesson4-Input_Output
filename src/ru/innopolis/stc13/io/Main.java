package ru.innopolis.stc13.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFile("/home/sa/study/Task_lession_130918/note");
        String text = "File not found";
        writeFile("/home/sa/study/Task_lession_130918/note", text);
        readFile("/home/sa/study/Task_lession_130918/note");
        FileInputStream fin = null;
        FileOutputStream finout = null;
    }

    public static void readFile(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream("/home/sa/study/Task_lession_130918/note")) {
            System.out.println("Размер файла" + fileInputStream.available());
            int i = -1;
            while ((i = fileInputStream.read()) != -1) System.out.println((char) i);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filename, String content) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            //byte[] buffer =  //надо дописать

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String file3) { //дописать
        int i;
        //fin = new FileOutputStream;
        //finout = new FileOutputStream;
        try (FileInputStream fileInputStream = new FileInputStream("/home/sa/study/Task_lession_130918/note")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}