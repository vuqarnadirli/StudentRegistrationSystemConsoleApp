package main;

import beans.Student;
import util.InputUtil;
import util.MenuUtil;
import util.StudentUtil;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1.Register student."
                    + "\n2.Show all students."
                    + "\n3.Find student."
                    + "\n4.Update student."
                    + "\n5.Exit.");

            MenuUtil.processMenu(menu);
        }
    }
}