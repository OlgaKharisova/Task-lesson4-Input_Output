package ru.innopolis.stc13.io.scannerRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerRead {
    public static void main(String[] args) {
        File file = new File ("/home/sa/study/Task_lession_130918/note");
        List<String> stringList = new ArrayList<>();
        Scanner scanner =null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                stringList.add(line);
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
