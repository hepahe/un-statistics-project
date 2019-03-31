/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unemissionproject.logic;

import java.util.Scanner;

/**
 *
 * @author henna
 */
public class FileReader {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        printOptions();
        while (true) {
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("WORLD POPULATION");
            } else if (command.equals("2")) {
                System.out.println("CO2 EMISSIONS");
            } else if (command.equals("x")) {
                break;
            }
        }
        
    }
    
    public void printOptions() {
        System.out.println("1 - information about world population");
        System.out.println("2 - information about C02 emissions");
        System.out.println("x - return");
    }
    
}
