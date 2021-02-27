package com.hidesec;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws AWTException {
        Scanner userInput = new Scanner(System.in);
        String option;

        Robot robot = new Robot();

        System.out.print("Are you ready(start or stop)? ");
        option = userInput.next();

        while (!option.equalsIgnoreCase("start") && !option.equalsIgnoreCase("stop")){
            System.out.println("Please type start or stop");
            System.out.print("Are you ready(start or stop)? ");
            option = userInput.next();
        }

        if(option.equals("start")){
            boolean isRunning = true;
            while (isRunning) {
                robot.delay(500);
                robot.keyPress(KeyEvent.VK_ENTER);
            }
        }
    }
}