package pl.zamon.excercises;

public class CreateTab {
    int i;
    int[] tab;

    public CreateTab() {
    }

    public CreateTab(int i) {
        this.i = i;
        tab = new int[i];
        for (int j = 0; j < i ; j++) {
            tab[j] = (int) (Math.random()*100);
        }
    }
}
