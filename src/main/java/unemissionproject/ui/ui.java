/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unemissionproject.ui;

import java.util.Scanner;
import unemissionproject.logic.FileReader;

/**
 *
 * @author henna
 */
public class ui {
    private Scanner scanner = new Scanner(System.in);
    FileReader filereader = new FileReader();
    
    public void start () {
        printOptions();
        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equals("1")) {
                filereader.start();
                printOptions();
            } else if (command.equals("x")) {
                System.out.println("Thank you");
                break;
            } else if (command.equals("")) {
                printOptions();
            }
        }
        
    } public void printOptions() {
        System.out.println("Options:");
        System.out.println("1 - statistics");
        System.out.println("enter - see options");
        System.out.println("x - close program");
    
    }
}
