package FromTaskBook.interfaces;

import FromTaskBook.Figure;

public class AreaCounter {
    public static double countArea(Figure... figures){
        double res = 0;

        for(Figure figure : figures){
            res += figure.area();
        }

        return res;
    }
}
