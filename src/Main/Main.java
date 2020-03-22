package Main;

import Candy.Caramel;
import Candy.ChocolateCandy;
import Enums.ParameterType;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.addCandy(new Caramel("Caramel", 10, 10, "mint"));
        gift.addCandy(new ChocolateCandy("Chocolate Candy", 20, 5, "dark"));
        gift.printCandyList();
        gift.sortByParameter(ParameterType.WEIGHT);
        gift.printCandyList();

    }
}
