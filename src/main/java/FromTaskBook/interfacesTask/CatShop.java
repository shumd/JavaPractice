package FromTaskBook.interfacesTask;

public class CatShop {
    public static void meowAll(Meowable... meowables) {
        for(Meowable meowable : meowables) {
            meowable.meow();
        }
    }
}
