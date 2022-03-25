package at.ac.fhcampuswien;

import java.io.*;
import java.util.Scanner;

public class App {

    public static int fuelPerModule(int mass) {
        return mass / 3 - 2;
    }

    public static int sumOfAllModules(int moduleMasses[]) {
        int sum = 0;
        for (int i = 0; i < moduleMasses.length; i++) {
            sum += moduleMasses[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(fuelPerModule(61516));
    }
}
