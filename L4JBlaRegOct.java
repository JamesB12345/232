
/*
James Blaker / james_blaker@my.cuesta.edu
CIS 232 / Scovil
Lab 4
*/
import java.util.*;

public class L4JBlaRegOct extends Shape {

    private double side1;

    public L4JBlaRegOct(double side) { side1 = side; }

    public void setSide(double side) { side1 = side; }

    public double getSide() { return side1; }

    public double perimeter()
    {
        return side1 * 8;
    }

    public double area()
    {
        float area = (float) (2 * (1 + Math.sqrt(2)) * side1 * side1);
        return area;
    }

    public String toString() {
        return "Side: " + side1 + "\t" + "Area: " + area() + "\n";
    }

    public static void main(String[] args) {
        L4JBlaRegOct[] arrays1 = new L4JBlaRegOct [10];
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            arrays1[i] = new L4JBlaRegOct(rand.nextDouble());
        }

        printArray(arrays1);
        System.out.println();
        System.out.println("Sorted array");
        System.out.println();
        selectionSort(arrays1);
        printArray(arrays1);

    }

    public static <E extends Comparable<E>> void selectionSort( Comparable [] list)
    {
        for(int i=0; i<list.length -1; i++)
        {
            int small = i;

            for(int j=i+1; j<list.length; j++)
            {
                if(list[small].compareTo((list[j])) > 0  )
                {
                    small = j;
                }
            }
            Comparable rhs = list[small];
            list[small] = list[i];
            list[i] = rhs;
        }
    }

    public static <Comparable> void printArray(Comparable [] list)
    {
        for(int i=0; i<list.length; i++)
        {
            System.out.println(list[i]);
        }
    }
}





