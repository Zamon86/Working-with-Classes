package pl.zamon.excercises;

public class FindingBigestElement {
    int bigest;

    public FindingBigestElement() {
    }

    public FindingBigestElement(int[] tab) {
        bigest = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i]>bigest){
                bigest = tab[i];
            }

        }
    }
}
