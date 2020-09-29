package com.softtech.java.training.lambda.checknumbers;

import java.util.Scanner;

public class CheckNumbersRun {

    public static void main(final String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("İlk rakam : ");
            int ilkRakam = scn.nextInt();
            System.out.println("İki rakam : ");
            int ikinciRakam = scn.nextInt();
            ICheckNumbers birCheckNumbersLoc = (z,
                                                x) -> (z > x ? "İlk rakam büyük" : "ilk rakam büyük değil");
            System.out.println(birCheckNumbersLoc.check(ilkRakam,
                                                        ikinciRakam));
            ICheckNumbers ikiCheckNumbersLoc = (z,
                                                x) -> (z < x ? "İlk rakam küçük" : "ilk rakam küçük değil");
            System.out.println(ikiCheckNumbersLoc.check(ilkRakam,
                                                        ikinciRakam));

            ICheckNumbers ucCheckNumbersLoc = CheckNumbersRun::checkEqual;
            System.out.println(ucCheckNumbersLoc.check(ilkRakam,
                                                       ikinciRakam));

            System.out.println("----------------------------------------------");
            System.out.println(runICheckNumbers((z,
                                                 x) -> (z > x ? "İlk rakam büyük" : "ilk rakam büyük değil"),
                                                ilkRakam,
                                                ikinciRakam));

            System.out.println(runICheckNumbers((z,
                                                 x) -> (z < x ? "İlk rakam küçük" : "ilk rakam küçük değil"),
                                                ilkRakam,
                                                ikinciRakam));
            System.out.println(runICheckNumbers(CheckNumbersRun::checkEqual,
                                                ilkRakam,
                                                ikinciRakam));

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    public static String runICheckNumbers(final ICheckNumbers numbersParam,
                                          final int intVal1,
                                          final int intVal2) {
        return numbersParam.check(intVal1,
                                  intVal2);
    }

    public static String checkEqual(final int r,
                                    final int m) {
        return (r == m ? "rakamlar eşit" : "rakamlar eşit değil");
    }
}
