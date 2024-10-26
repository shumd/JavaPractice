package IDE_ClassWork;

public class DynamicArray {
    private final static int START = 5;
    private int indexForNewEl;
    int[] array = new int[START];

    public void add(int a){

        // расширение массива
        if(indexForNewEl >= array.length) {
            int dynamicSize = array.length + 5; // или каждый раз в 2 раза?
            int[] extendArr = new int[dynamicSize];

            // переносим значение
            for (int i = 0; i < array.length; i++) {
                extendArr[i] = array[i];
            }
            array = extendArr;
        }

        array[indexForNewEl++] = a;
    }

    public int get(int index){
        if(index >= indexForNewEl || index < 0){
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    public int getSize(){
        return indexForNewEl;
    }

    public void remove(int index){
        if(index >= indexForNewEl || index < 0){
            throw new IndexOutOfBoundsException();
        }

        for(int i = index; i < indexForNewEl-1; i++){
            array[i] = array[i+1];
        }

        indexForNewEl--;
        if(array.length - indexForNewEl >= 5){
            int dynamicSize = array.length - 5; // или каждый раз в 2 раза?
            int[] extendArr = new int[dynamicSize];

            // переносим значение
            for (int i = 0; i < array.length-5; i++) {
                extendArr[i] = array[i];
            }
            array = extendArr;
        }
    }

    public void placeAtIndex(int number, int index){
        if(index >= indexForNewEl || index < 0){
            throw new IndexOutOfBoundsException();
        }

        // расширение массива
        if(indexForNewEl >= array.length) {
            int dynamicSize = array.length + 5; // или каждый раз в 2 раза?
            int[] extendArr = new int[dynamicSize];

            // переносим значение
            for (int i = 0; i < array.length; i++) {
                extendArr[i] = array[i];
            }
            array = extendArr;
        }


        int previous = number;
        // добавляем элемент и сдвигаем
        for(int i = index; i < indexForNewEl+1; i++){
            int next = array[i];
            array[i] = previous;
            previous = next;
        }

        indexForNewEl++;
    }
}
