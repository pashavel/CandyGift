package Candy;

import java.util.Scanner;

public class ChocolateCandy extends Candy {
    private String chocolateType = "";

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    public ChocolateCandy() {

    }

    public ChocolateCandy(String name, int weight, float sugarContaintment, String chocolateType) {
        this.name = name;
        this.weight = weight;
        this.sugarContainment = sugarContaintment;
        this.chocolateType = chocolateType;
    }

    @Override
    public void printCandyInfo() {
        System.out.println(this.name + " "+this.weight + " "+ this.sugarContainment + " "+ this.chocolateType);
    }

    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.next();
        this.weight = scanner.nextInt();
        this.sugarContainment = scanner.nextFloat();
        this.chocolateType = scanner.next();
    }
}
