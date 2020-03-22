package Candy;

import java.util.Scanner;

public class Caramel extends Candy {
    private String caramelType = "";

    public Caramel() {

    }
    @Override
    public void printCandyInfo() {
        System.out.println(this.name + " "+this.weight + " "+ this.sugarContainment + " "+ this.caramelType);
    }
    public Caramel(String name, int weight, float sugarContainment, String caramelType) {
        this.name = name;
        this.weight = weight;
        this.sugarContainment = sugarContainment;
        this.caramelType = caramelType;
    }

    public String getCaramelType() {
        return caramelType;
    }

    public void setCaramelType(String caramelType) {
        this.caramelType = caramelType;
    }

    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.next();
        this.weight = scanner.nextInt();
        this.sugarContainment = scanner.nextFloat();
        this.caramelType = scanner.next();
    }
}
