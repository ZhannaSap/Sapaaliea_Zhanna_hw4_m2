import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namesA = new ArrayList<>();
        ArrayList<String> namesB = new ArrayList<>();
        Scanner name = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your name: ");
            namesA.add(name.next());
        }
        System.out.println(namesA);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your name: ");
            namesB.add(name.next());
        }
        System.out.println(namesB);

       ArrayList<String> namesC = new ArrayList<>();
        Collections.reverse(namesB);
       namesC.add(namesA.get(0));
       namesC.add(namesB.get(0));
       namesC.add(namesA.get(1));
       namesC.add(namesB.get(1));
       namesC.add(namesA.get(2));
       namesC.add(namesB.get(2));
       namesC.add(namesA.get(3));
       namesC.add(namesB.get(3));
       namesC.add(namesA.get(4));
       namesC.add(namesB.get(4));

        System.out.println(namesC);

        Collections.sort(namesC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                return 1;
                }else {
                    if (o1.length()<o2.length()){
                        return -1;
                    }else {
                        return 0;
                    }
                }
            }
        });
        System.out.println(namesC);
    }
}