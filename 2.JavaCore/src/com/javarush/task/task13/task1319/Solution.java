/**
 * Писатель в файл с консоли
 * 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 *
 *
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Создай и используй объект типа BufferedWriter.
 * 3. Программа не должна ничего читать из файловой системы.
 * 4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 * 5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
 * 6. Метод main должен закрывать объект типа BufferedWriter после использования.
 * 7. Метод main не должен выводить данные на экран.
 */


package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        consoleToFile();
    }


    public static void consoleToFile() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(File.separator + bufferedReader.readLine()));

        String line = null;
        while (true) {
            if ((line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                break;
            } else {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}