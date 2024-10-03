import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        //1
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println("Task1" + "\n" + colors);

        //2
        System.out.println("Task2");
        for(String i: colors)
        {
            System.out.println(i);
        }

        //3
        colors.add(0,"yellow");
        System.out.println("Task3" + "\n" + colors);

        //4
        System.out.println("Task4" + "\n" + colors.get(3));

        //5
        colors.set(1,"pink");
        System.out.println("Task5" + "\n" + colors);

        //6
        colors.remove(2);
        System.out.println("Task6" + "\n" + colors);

        //7
        String NeededColor = "blue";
        if(colors.contains(NeededColor))
        {
            System.out.println("Task7" + "\n" + colors.indexOf(NeededColor));
        }

        //8
        Collections.sort(colors);
        System.out.println("Task8" + "\n" + colors);

        //9
        ArrayList<String> CopyOfColors = new ArrayList<>(colors);
        System.out.println("Task9" + "\n" + CopyOfColors);

        //10
        Collections.reverse(colors);
        System.out.println("Task10" + "\n" + colors);

        //11
        boolean isEq = colors.equals(CopyOfColors);
        System.out.println("Task11" + "\n" + isEq );

        //12
        colors.clear();
        System.out.println("Task12" + "\n" + colors);

        //13
        boolean isEmptyList = colors.isEmpty();
        System.out.println("Task13" + "\n" + isEmptyList);

        //14
        colors.ensureCapacity(100);

        //15
        colors.trimToSize();
        System.out.println("Task15" + "\n" + colors);
    }
}
