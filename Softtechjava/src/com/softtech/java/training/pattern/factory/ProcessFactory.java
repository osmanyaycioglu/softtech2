package com.softtech.java.training.pattern.factory;


public class ProcessFactory {

    public static IProcess createProcessObject(final int index) {
        IProcess processLoc = null;
        if (index == 1) {
            processLoc = new WaterProcess();
        } else if (index == 2) {
            processLoc = new AirProcess();
        } else if (index == 3) {
            processLoc = new MudProcess();
        } else if (index == 4) {
            processLoc = new WaterV2Process();
        } else {
            processLoc = new WaterProcess();
        }

        return processLoc;
    }

    public static void writeProcessMenu() {
        System.out.println("1-Water process");
        System.out.println("2-Air process");
        System.out.println("3-Mud process");
        System.out.println("4-WaterV2 process");
        System.out.println("Choose : ");

    }
}
