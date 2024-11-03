package FromTaskBook.interfaces;

import FromTaskBook.Bird;

public class BirdShop {
    public static void singAll(Bird... birds){
        for(Bird bird : birds){
            bird.sing();
        }
    }
}
