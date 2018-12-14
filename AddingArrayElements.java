package pl.zamon.excercises;

public class AddingArrayElements {
    int sum;

    public AddingArrayElements() {
    }

    public AddingArrayElements(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            sum = sum + tab[i];
        }
    }
}
