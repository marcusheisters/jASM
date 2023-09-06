package main.java;

import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        compile(args[0]);
        // Read the file from the arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    private static String[] compile(String path) {
        File file = path.StringUtils.substringAfterLast("/");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File at location $path not found", e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(String.format("Could not read file %s", )e);
            }
            lines.add(line);
        }
        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);
    }

    ;
};