package ru.shumilin.numbers;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class Fraction extends Number implements Cloneable {
    private final int numerator;
    private final int denominator;

    public static Fraction of(int numerator, int denominator) {
        return FractionPool.init(numerator, denominator);
    }

    private Fraction(int numerator, int denominator){
        if(denominator <= 0){
            throw new IllegalArgumentException("Denominator must be > 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private Fraction(Fraction fraction){
        this(fraction.numerator, fraction.denominator);
    }


    public static Fraction toLowestCommonDenominator(Fraction fraction1, Fraction fraction2){
        int lcm = leastCommonMultiple(fraction1, fraction2);
        int firstAddMultiplier = lcm/fraction1.denominator;

        return new Fraction(fraction1.numerator*firstAddMultiplier, lcm);
    }

    public static int leastCommonMultiple(Fraction fraction1, Fraction fraction2){
        return leastCommonMultiple(fraction1.denominator, fraction2.denominator);
    }

    public static int leastCommonMultiple(int num1, int num2){
        return (num1*num2)/greatestCommonDivisor(num1,num2);
    }

    //Алгоритм Евклида для НОД
    public static int greatestCommonDivisor(int num1, int num2){
        if(num1 == num2){
            return num1;
        }

        int biggest;
        int smallest;
        if(num1>num2){
            biggest = num1;
            smallest = num2;
        }else {
            biggest = num2;
            smallest = num1;
        }

        int remainder = biggest%smallest;
        while (remainder != 0){
            biggest = smallest;
            smallest = remainder;
            remainder = biggest%smallest;
        }
        return smallest;
    }

    public Fraction sum(Fraction fraction){
        Fraction fraction1 = toLowestCommonDenominator(this, fraction);
        Fraction fraction2 = toLowestCommonDenominator(fraction, this);


        return new Fraction(fraction1.numerator+fraction2.numerator,
                fraction1.denominator);
    }

    public Fraction sum(int num){
        return sum(new Fraction(num,1));
    }

    public Fraction minus(Fraction fraction){
        Fraction f1 = toLowestCommonDenominator(this, fraction);
        Fraction f2 = toLowestCommonDenominator(fraction, this);

        return new Fraction(f1.numerator - f2.numerator,
                f1.denominator);
    }
    public Fraction minus(int num){
        return minus(new Fraction(num,1));
    }

    public Fraction mult(Fraction fraction){
        return new Fraction(numerator* fraction.numerator,
                denominator* fraction.denominator);
    }
    public Fraction mult(int num){
        return mult(new Fraction(num,1));
    }

    public Fraction div(Fraction fraction){
        int resNum = numerator*fraction.denominator;
        int resDen = denominator*fraction.numerator;
        if(resDen < 0){
            resNum *= -1;
            resDen *= -1;
        }

        return new Fraction(resNum, resDen);
    }
    public Fraction div(int num){
        return div(new Fraction(num,1));
    }

    @Override
    public int intValue() {
        return numerator/denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator/denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator/denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator / denominator  == fraction.numerator/fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator/denominator);
    }

    @Override @SneakyThrows
    public Fraction clone(){
        return (Fraction) super.clone();
    }

    public static class FractionPool{
        private final static Map<List<Integer>, Fraction> POOL = new HashMap<>();

        public static Fraction init(int numerator, int denominator){
            if(POOL.containsKey(List.of(numerator,denominator))){
                return POOL.get(List.of(numerator,denominator));
            }else {
                Fraction tmp = new Fraction(numerator,denominator);
                POOL.put(List.of(numerator,denominator), tmp);
                return tmp;
            }
        }
    }

    public static class FractionFactory{
        public static Fraction createFraction(int numerator, int denominator){
            return FractionPool.init(numerator,denominator);
        }
    }
}
