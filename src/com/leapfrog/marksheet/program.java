/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheet;
import java.util.Scanner;

/**
 *
 * @author Sampang
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Scanner input = new Scanner(System.in);
        System.out.println("Exam Result");
        while (true) {
            System.out.print("Enter Students Name\t");
            String name = input.next();
            System.out.print("Enter Students Symbol No.\t");
            String num = input.next();
            System.out.println("Enter Marks for following");
            System.out.print("1.English\t");
            float eng = input.nextFloat();
            System.out.print("2.Nepali\t");
            float nep = input.nextFloat();
            System.out.print("3.Science\t");
            float sci = input.nextFloat();
            System.out.print("4.Maths\t");
            float math = input.nextFloat();

            float total = eng + nep + sci + math;
            float per = total / 4;

            System.out.println("\n\nName:" + "\t" + "\t" + name);
            System.out.println("Symbol no:" + "\t" + num);
            System.out.println("\nMarksheet");
            System.out.println("1.English" + "\t" + "\t" + eng);
            System.out.println("2.Nepali" + "\t" + "\t" + nep);
            System.out.println("3.Science" + "\t" + "\t" + sci);
            System.out.println("4.Maths" + "\t" + "\t" + "\t" + math);
            System.out.println(".............................");
            if (eng >= 32 && nep >= 32 && sci >= 32 && math >= 32) {

                System.out.println("Total" + "\t" + "\t" + "\t" + total);
                System.out.println("Percentage" + "\t" + "\t" + per);

                String Division = null;
                if (per >= 80) {
                    Division = "DISTINCTION";
                } else if (per >= 60) {
                    Division = "FIRST DIVISION";
                } else if (per >= 40) {
                    Division = "SECOND DIVISION";
                } else {
                    Division = "THIRD DIVISION";
                }
                System.out.println("Division" + "\t" + "\t" + Division);
            } else {
                System.out.println("FAILED");
            }

            System.out.println("Do you want to continue[Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

}
