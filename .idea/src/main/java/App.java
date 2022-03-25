import java.io.*;
import java.util.Scanner;

public class App {

    public static int fuelPerModule(int mass) {
        if(mass >= 6) return mass / 3 - 2;
        return -1;
    }

    public static int fuelAndExtraFuelPerModule(int mass) {
        int sumModule = 0;
        int fuel = fuelPerModule(mass);
        while(fuel > 0) {
            sumModule += fuel;
            fuel = fuelPerModule(fuel);
        }
        return sumModule;
    }

    public static int sumOfAllModules(int moduleMasses[]) {
        int sum = 0;
        for (int i = 0; i < moduleMasses.length; i++) {
            sum += fuelPerModule(moduleMasses[i]);
        }
        return sum;
    }

    public static int sumOfAllModulesAndFuels(int moduleMasses[]) {
        int sum = 0;
        for (int i = 0; i < moduleMasses.length; i++) {
            sum += fuelAndExtraFuelPerModule(moduleMasses[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\lukas\\Documents\\GitHub\\prog2-ss21-exercise1\\.idea\\src\\test\\resources\\puzzle.txt");
        int[] moduleMasses = new int[100];
        try {
            Scanner scan = new Scanner(file);
            for(int i = 0; scan.hasNextLine(); i++) {
                moduleMasses[i] = Integer.parseInt(scan.nextLine());
                //System.out.println(moduleMasses[i]);
            }
            System.out.println("Answer: " + sumOfAllModulesAndFuels(moduleMasses));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + sumOfAllModulesAndFuels(new int[]{2016, 5570, 6634}));
        System.out.println("\n" + sumOfAllModulesAndFuels(new int[]{4140, 7480, 10450, 11238, 18209}));
    }
}
