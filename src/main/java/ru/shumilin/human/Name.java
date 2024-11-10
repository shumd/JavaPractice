package ru.shumilin.human;

public class Name {
    String surname;
    String name;
    String patronymic;

    public Name(String name){
        this(name, null);
    }

    public Name(String name, String surname){
        this(name, surname, null);
    }

    public Name(String name, String surname, String patronymic){
        if(isEmpty(name, surname, patronymic)){
            throw new IllegalArgumentException(
                    "Name must have one completed argument");
        }
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    private boolean isEmpty(String... values){
        for(String s : values){
            if(!s.isBlank()){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String result = "";

        if (surname != null){
            result = surname;
        }

        if (name != null){
            result += result.isEmpty() ? name : " " + name;
        }

        if (patronymic != null){
            result += result.isEmpty() ? patronymic : " " + patronymic;
        }

        return result;
    }
}
