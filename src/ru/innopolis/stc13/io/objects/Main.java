package ru.innopolis.stc13.io.objects;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 35,1.65,true);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dataOutputStream.writeUTF(tom.getName());
            dataOutputStream.writeInt(tom.getAge());
            dataOutputStream.writeDouble(tom.getHeight());
            dataOutputStream.writeBoolean(tom.isMarried());
            System.out.println("файл записан");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream((new FileInputStream("data.bin")))) {
      /*      Person newTom = new Person(); // дописать
            newTom.setName(dataInputStream.readUTF());
            newTom.setAge(dataInputStream.readInt());
            newTom.getHeight(dataInputStream.readDouble());*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
