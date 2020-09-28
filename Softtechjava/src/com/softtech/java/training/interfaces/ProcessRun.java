package com.softtech.java.training.interfaces;

import java.util.Scanner;

public class ProcessRun {

    public static void main(final String[] args) {
        ProcessRun processRunLoc = new ProcessRun();
        Scanner scannerLoc = new Scanner(System.in);
        processRunLoc.process(scannerLoc);
    }

    public void process(final Scanner scannerLoc) {
        System.out.println("1-Water process");
        System.out.println("2-Air process");
        System.out.println("Choose : ");
        int nextIntLoc = scannerLoc.nextInt();
        IProcess processLoc = null;
        if (nextIntLoc == 1) {
            processLoc = new WaterProcess();
        } else if (nextIntLoc == 2) {
            processLoc = new AirProcess();
        } else {
            processLoc = new WaterProcess();
        }
        String startLoc = processLoc.start(100);
        System.out.println(startLoc);
        String stopLoc = processLoc.stop("xyz");
        System.out.println(stopLoc);

    }
}
