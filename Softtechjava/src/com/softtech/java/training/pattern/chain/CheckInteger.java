package com.softtech.java.training.pattern.chain;

import java.util.Scanner;

public class CheckInteger {

    public static void main(final String[] args) {
        Scanner scannerLoc = null;
        try {
            scannerLoc = new Scanner(System.in);
            System.out.println("sayı girin : ");
            int nextIntLoc = scannerLoc.nextInt();
            //        if (nextIntLoc > 50) {
            //            System.out.println("50 den büyük");
            //        } else if (nextIntLoc > 0) {
            //            System.out.println("positif");
            //        } else if (nextIntLoc < 0) {
            //            System.out.println("negatif");
            //        } else if (nextIntLoc == 0) {
            //            System.out.println("sıfır");
            //        }

            AbstractCheckInteger checkIntegerLoc = CheckFactory.createCheckProcess();
            checkIntegerLoc.processCheck(nextIntLoc);

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            if (scannerLoc != null) {
                try {
                    scannerLoc.close();
                } catch (Exception e2Loc) {
                }
            }
        }
    }
}
