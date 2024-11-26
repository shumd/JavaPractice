package ru.shumilin.comparison;

@FunctionalInterface
public interface Comparable <T>{
    int compareTo(T o);
}
