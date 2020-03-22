package Candy;

public abstract class Candy {
    protected int weight;
    protected float sugarContainment;
    protected String name;

    public int getWeight() {
        return weight;
    }

    public float getSugarContainment() {
        return sugarContainment;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSugarContainment(float sugarContainment) {
        this.sugarContainment = sugarContainment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printCandyInfo();
    public abstract void create();
}
