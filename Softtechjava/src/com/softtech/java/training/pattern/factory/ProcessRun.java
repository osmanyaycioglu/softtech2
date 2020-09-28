package com.softtech.java.training.pattern.factory;

import java.util.Scanner;

public class ProcessRun {

    public static void main(final String[] args) {
        ProcessRun processRunLoc = new ProcessRun();
        Scanner scannerLoc = new Scanner(System.in);
        processRunLoc.process(scannerLoc);
    }

    public void process(final Scanner scannerLoc) {
        ProcessFactory.writeProcessMenu();
        int nextIntLoc = scannerLoc.nextInt();
        IProcess processLoc = ProcessFactory.createProcessObject(nextIntLoc);
        processLoc.executeProcess();
    }
}
