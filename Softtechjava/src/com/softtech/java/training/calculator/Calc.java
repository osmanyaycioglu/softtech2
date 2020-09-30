package com.softtech.java.training.calculator;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Calc {

    public static void main(final String[] args) {
        try (Scanner sc2 = new Scanner(System.in)) {
            System.out.println("1-toplama : ");
            System.out.println("2-çıkarma : ");
            System.out.println("3-çarpma : ");
            System.out.println("4-bölme : ");
            System.out.println("seçiminiz : ");
            int nextIntLoc = sc2.nextInt();
            BiFunction<Integer, Integer, String> func = OperationFactory.getOperation(nextIntLoc);
            System.out.println("ilk girdi : ");
            int ilkLoc = sc2.nextInt();
            System.out.println("ikinci girdi : ");
            int ikinciLoc = sc2.nextInt();
            System.out.println("Sonuç : "
                               + func.apply(ilkLoc,
                                            ikinciLoc));
        } catch (NullPointerException | IllegalArgumentException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
