package ru.innopolis.stc13.io.objectInput;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 2.0);
        Point p3 = new Point(3.0, 2.0);
        Line line1 = new Line(p1, p2, 1);
        Line line2 = new Line(p2, p3, 2);
        String fileName = "/file";

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(line1);
            objectOutputStream.writeObject(line2);
            objectOutputStream.reset(); //*
            line1.setPoint1(new Point(2.0, 13.0));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList lines = new ArrayList();
        try (ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream((fileName))))) {
            for (int i = 0; i < 3; i++) {
                lines.add((Line) objectInputStream.readObject()); //!!!
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(lines);

    }
}