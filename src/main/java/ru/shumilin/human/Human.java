package ru.shumilin.human;

import ru.shumilin.annotations.Default;

@Default(Name.class)
public class Human {
    private static final int MIN_HEIGHT = 0;
    private static final int MAX_HEIGHT = 500;

    private final Name fullName;
    private int height;
    private final Human father;
    private boolean female;

    public Human(Human human){
        this(human.fullName, human.height, human.father);
    }

    public Human(String name, int height){
        this(name, height, null);
    }

    public Human(String name, int height, Human father){
        this(new Name(name), height, father);
    }

    public Human(Name fullName, int height){
        this(fullName, height, null);
    }

    public Human(Name fullName, int height, Human father){
        this.fullName = fullName;
        this.height = height;
        this.father = father;
        if(father != null) createPatronymicAndSurname();
    }

    public void setHeight(int height){
        if(height > MIN_HEIGHT && height < MAX_HEIGHT){
            this.height = height;
        }else {
            throw  new IllegalArgumentException("Height must be more than " + MIN_HEIGHT +
                    " and less than " + MAX_HEIGHT);
        }
    }

    public int getHeight(){
        return height;
    }

    public Human getFather(){
        return new Human(father);
    }

    public Name getFullName(){
        return fullName;
    }

    private void createPatronymicAndSurname(){
        if (fullName.surname == null && father.fullName.surname != null) {
            fullName.surname = father.fullName.surname;
        }

        if (fullName.patronymic == null && father.fullName.name != null) {
            char[] consonants = {'п', 'б', 'ф', 'в', 'т', 'д', 'с', 'з', 'ц', 'ш', 'ж', 'к', 'г', 'х', 'м', 'н', 'р', 'л'};
            char[] vowels = {'а','у','ы','о'};
            char fatherNameLastSymbol = father.fullName.name.toCharArray()[father.fullName.name.length() - 1];
            boolean endsWithConsonants = false;
            boolean endsWithVowels = false;

            for (char c : consonants) {
                if (fatherNameLastSymbol == c) {
                    endsWithConsonants = true;
                    break;
                }
            }

            for (char c : vowels) {
                if (fatherNameLastSymbol == c) {
                    endsWithVowels = true;
                    break;
                }
            }

            if (endsWithConsonants) {
                fullName.patronymic = female ? father.fullName.name + "овна" : father.fullName.name + "ович";
            } else {
                String patronymic = father.fullName.name.substring(0, father.fullName.name.length() - 1);
                if(endsWithVowels){
                    fullName.patronymic = female ? patronymic + "овна" : patronymic + "ович";
                }else {
                    fullName.patronymic = female ? patronymic + "евна" : patronymic + "евич";
                }
            }
        }
    }

    @Override
    public String toString() {
        return fullName + ", рост: " + height;
    }
}
