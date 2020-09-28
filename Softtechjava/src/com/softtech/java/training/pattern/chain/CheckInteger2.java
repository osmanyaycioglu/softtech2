package com.softtech.java.training.pattern.chain;

import java.util.Scanner;

public class CheckInteger2 {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("sayı girin : ");
            long l = 1_000_000_000_000_000L;
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

        } catch (NullPointerException | IllegalAccessError eLoc) {
            System.out.println("Error");
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
