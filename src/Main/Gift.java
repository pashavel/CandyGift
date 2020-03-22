package Main;

import Candy.*;
import Comparators.CompareByName;
import Comparators.CompareBySugarContainment;
import Comparators.CompareByWeight;
import Enums.ParameterType;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Gift {
    List<Candy> candyList = new ArrayList<Candy>();
    Logger logger = Logger.getLogger(Gift.class.getName());

    public void addCandy(Candy candy) {
        candyList.add(candy);
    }
    public void printCandyList() {
        for (Candy candy :
                candyList)
            candy.printCandyInfo();
    }

    public void sortByParameter(ParameterType parameter) {
        switch (parameter) {
            case NAME:
                this.candyList.sort(new CompareByName());
                logger.log(Level.INFO,"Main.Gift sorted by name");
                break;
            case WEIGHT:
                this.candyList.sort(new CompareByWeight());
                logger.log(Level.INFO,"Main.Gift sorted by Weight");
                break;
            case SUGAR_CONTAINMENT:
                this.candyList.sort(new CompareBySugarContainment());
                logger.log(Level.INFO,"Main.Gift sorted by Sugar containment");
            default:
                break;
        }
    }

    public Candy searchSweetnessBySugarContainment(float minSugarContainment, float maxSugarContainment) {
        for (Candy candy : candyList) {
            if (candy.getSugarContainment() > minSugarContainment && candy.getSugarContainment() < maxSugarContainment)
                return candy;
        }
        return null;
    }

}
