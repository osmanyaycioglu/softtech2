package com.softtech.java.training.calculator;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calc2 {

    public static void main(final String[] args) {
        try (Scanner sc2 = new Scanner(System.in)) {
            List<IOperation<Integer, Integer, String>> operationLoc = OperationFactory2.getOperation();
            for (int iLoc = 0; iLoc < operationLoc.size(); iLoc++) {
                IOperation<Integer, Integer, String> iOperationLoc = operationLoc.get(iLoc);
                System.out.println((iLoc + 1)
                                   + "-"
                                   + iOperationLoc.menuText()
                                                  .get());
            }
            System.out.println("seçiminiz : ");
            int nextIntLoc = sc2.nextInt();
            if (nextIntLoc > operationLoc.size()) {
                System.out.println("Yanlış seçim");
                return;
            }
            IOperation<Integer, Integer, String> iOperationLoc = operationLoc.get(nextIntLoc - 1);
            BiFunction<Integer, Integer, String> func = iOperationLoc.operation();
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
