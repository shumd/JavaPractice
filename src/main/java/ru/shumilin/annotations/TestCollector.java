package ru.shumilin.annotations;

public class TestCollector {
    @Invoke
    String m1(){
        return "text";
    }

    String m2(){
        return "place";
    }

    @Invoke
    Integer m3(){
        return 42;
    }

    @Invoke
    String m4(String s){
        return s;
    }
}
