package ru.geekbrains.lessons3.lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        readFromFile(); //(читает файл, засовывает в массив, выводит в консоль)
        System.out.println();
        System.out.println();
        readFromSomeFiles(); // (читает 5 файлов, и склеивает их в 1 и выводит в консоль)

    }

    public static void readFromFile() {
        byte[] byfin = new byte[50];
        try {
            FileInputStream fileInputStream = new FileInputStream("1.txt");
            int count;
            while ((count = fileInputStream.read(byfin)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) byfin[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromSomeFiles() throws IOException {
        ArrayList<InputStream> ais = new ArrayList<>();

        ais.add(new FileInputStream("doc1.txt"));
        ais.add(new FileInputStream("doc2.txt"));
        ais.add(new FileInputStream("doc3.txt"));
        ais.add(new FileInputStream("doc4.txt"));
        ais.add(new FileInputStream("doc5.txt"));

        BufferedInputStream bis = new BufferedInputStream(new SequenceInputStream(Collections.enumeration(ais)));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("res_doc.txt"));
        int x;
        while ((x = bis.read()) != -1) {
            bos.write(x);
        }

        bis.close();
        bos.close();

        byte[] byfin = new byte[50];
        try {
            FileInputStream fileInputStream = new FileInputStream("res_doc.txt");
            int count;
            while ((count = fileInputStream.read(byfin)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print((char) byfin[i] );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
