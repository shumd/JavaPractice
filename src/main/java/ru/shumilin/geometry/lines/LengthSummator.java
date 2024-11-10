package ru.shumilin.geometry.lines;

public class LengthSummator {
    public static int sum(Lengthable... lengthables) {
        int res = 0;
        for (Lengthable lengthable : lengthables) {
            res += lengthable.length();
        }

        return res;
    }
}
