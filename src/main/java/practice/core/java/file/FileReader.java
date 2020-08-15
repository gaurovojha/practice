package practice.core.java.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileReader {
    public static void main(String[] args) throws InterruptedException, IOException {
        File file = new File("/Users/gauojha/Desktop/hello.txt");

        System.out.println("sleeping......before reading "+ file.getName());
        Thread.sleep(10000);

        System.out.println(Files.lines(Paths.get(file.getAbsolutePath())).collect(Collectors.joining()));
    }
}
