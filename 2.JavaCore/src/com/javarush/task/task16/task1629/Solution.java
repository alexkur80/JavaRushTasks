package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t1.printResult();
        t2.start();
        t2.join();
        t2.printResult();

        // System.out.println(Read3Strings.inputFromConsole());
    }

    //add your code here - добавьте код тут

    public static class Read3Strings extends Thread {
        private String line;

        @Override
        public void run() {

            int lineNumbers = 3;

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < lineNumbers; i++) {
                try {
                    builder.append(reader.readLine())
                            .append(" ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            this.line = builder.toString()
                    .trim();

        }

        public void printResult() throws IOException {


            System.out.println(line);
        }

    }
}

