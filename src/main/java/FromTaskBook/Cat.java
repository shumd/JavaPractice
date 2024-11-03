package FromTaskBook;

import FromTaskBook.interfacesTask.Meowable;

public class Cat implements Meowable {
    String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void meow(){
        System.out.println(name + ": мяу!");
    }

    public void meow(int n){
        StringBuilder res = new StringBuilder(name + ": ");

        for (int i = 0; i < n; i++){
            if (i == n-1){
                res.append("мяу!");
            }else {
                res.append("мяу-");
            }
        }

        System.out.println(res);
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}
