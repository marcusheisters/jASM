package main.java;

import org.apache.commons.lang3.StringUtils;

import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] contents = compile(args[0]);
        System.out.println(Arrays.toString(contents));
        // Read the file from the arguments

    }

    private static String[] compile(String path) {

        return readSourceFile(path);

    }

    private static String[] readSourceFile(String path) {
        var fileName = new File(StringUtils.substringAfterLast(path, "/"));

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.format("File at location %s not found", path), e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        while (true) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                if ((line = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(String.format("Could not read file %s", fileName), e);
            }

            // Commands are separated only by ';'
            String[] keywords = line.split(";");
            lines.addAll(Arrays.asList(keywords));

        }
        return lines.toArray(new String[0]);
    }

    ;
};