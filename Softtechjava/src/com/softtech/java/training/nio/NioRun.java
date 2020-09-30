package com.softtech.java.training.nio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NioRun {

    public static void main(final String[] args) throws Exception {
        File file = new File("test.txt");
        FileInputStream fileInputStreamLoc = new FileInputStream(file);
        FileChannel channelLoc = fileInputStreamLoc.getChannel();
        ByteBuffer bufferLoc = ByteBuffer.allocateDirect(4 * 1024 * 1024);
        int readLoc = channelLoc.read(bufferLoc);


        int dataLoc = fileInputStreamLoc.read();
        byte[] fileBytes = new byte[4 * 1024 * 1024];
        BufferedInputStream bufferedInputStreamLoc = new BufferedInputStream(fileInputStreamLoc);
        int readCountLoc = bufferedInputStreamLoc.read(fileBytes);

        FileReader fileReaderLoc = new FileReader(file);
        BufferedReader bufferedReaderLoc = new BufferedReader(fileReaderLoc);
        // 1
        List<String> collectLoc = bufferedReaderLoc.lines()
                                                   .collect(Collectors.toList());
        // 2
        String line = null;
        List<String> linesListLoc = new ArrayList<>();
        while ((line = bufferedReaderLoc.readLine()) != null) {
            linesListLoc.add(line);
        }

        Path path = Paths.get("test.txt");
        System.out.println(path.toAbsolutePath()
                               .toString());
        List<String> readAllLinesLoc = Files.readAllLines(path);
        readAllLinesLoc.forEach(System.out::println);

    }
}
