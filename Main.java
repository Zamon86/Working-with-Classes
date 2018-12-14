package pl.zamon.excercises;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe naturalną: "));
        CreateTab tab1 = new CreateTab(i);
        CreateTab tab2 = new CreateTab(i);

        AddingArrayElements sum = new AddingArrayElements(tab1.tab);
        AddingArrayElements sum2 = new AddingArrayElements(tab2.tab);

        FindingBigestElement big1 = new FindingBigestElement(tab1.tab);
        FindingBigestElement big2 = new FindingBigestElement(tab2.tab);

        System.out.println(sum.sum);
        System.out.println(sum2.sum);
        System.out.println(big1.bigest);
        System.out.println(big2.bigest);
    }


}
