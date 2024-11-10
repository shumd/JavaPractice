package ru.shumilin.animals.birds;

public class BirdShop {
    public static void singAll(Bird... birds){
        for(Bird bird : birds){
            bird.sing();
        }
    }
}
