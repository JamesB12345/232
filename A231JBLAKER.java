// James Blaker
// Assignment 3
// CIS 231
import java.util.ArrayList;
import java.util.Scanner;

public class A231JBLAKER {

        private static boolean truefalse = true;

        public static void main(String[] args)
        {
            ArrayList<Integer> values = new ArrayList<>();

            System.out.print("Please enter values for the array list: ");
            System.out.println("Non-integers will be discarded");
            System.out.print("->");

            Scanner in = new Scanner(System.in);

            while (truefalse) {
                String line = in.nextLine();
                if (line.equals("")) {
                    truefalse = false;
                    continue;
                }

                Scanner lineScan = new Scanner(line);

                while (lineScan.hasNext()) {

                    if (lineScan.hasNextInt())
                    {
                        values.add(lineScan.nextInt());
                        selectionsort(values);

                    } else {

                        lineScan.next();
                    }
                }
            }
            System.out.println();
            System.out.print("Values Input:");

            for(int i = 0; i < values.size(); i++ )
            {

                if (i % 10 == 0)
                {
                    System.out.println();
                }
                System.out.print(values.get(i) + " ");
            }
            System.out.println("\n");
            System.out.println("Average: " + Math.round(average(values) * 100d)/100d);
            System.out.println();
            System.out.println("Lowest value:" + " " + (lowest(values)));
            System.out.println();
            System.out.println("Highest value:" + " " + (highest(values)));
            System.out.println("mode:" + mode(values));
        }

        public static ArrayList<Integer> selectionsort(ArrayList<Integer> values)
        {
            int smallInt;
            int j;
            int minIndex;

            for (int i = 0; i < values.size() - 1; i++)
            {
                smallInt = values.get(i);
                minIndex = i;

                for (j = i + 1; j < values.size(); j++)
                {
                    if (values.get(j) < smallInt) {
                        minIndex = j;
                    }
                }
                int temp = values.get(i);
                values.set(i, values.get(minIndex));
                values.set(minIndex, temp);
            }
            return values;
        }



        public static double average(ArrayList<Integer> values)
        {
            int total = 0;
            double averages;

            for (int i = 0; i < values.size(); i++)
            {
                total += values.get(i);
            }
            averages = total / (double) values.size();
            return averages;
        }


        public static int highest(ArrayList<Integer> values)
        {
            int max = Integer.MIN_VALUE;
            int low = Integer.MAX_VALUE;

            for (int i = 0; i < values.size(); i++) {

                for (int j = 0; j < values.size(); j++) {

                    if (values.get(j) < low)
                    {
                        low = values.get(j);
                    }
                    if (values.get(i) > max)
                    {
                        max = values.get(i);
                    }
                }
            }
            return max;
        }

        // Intentional white space to increase readability.

        public static int lowest(ArrayList<Integer> values) {
            int max = Integer.MIN_VALUE;
            int low = Integer.MAX_VALUE;

            for (int j = 0; j < values.size(); j++) {
                if (values.get(j) < low) {
                    low = values.get(j);
                }
            }
            return low;
        }



        public static int mode(ArrayList<Integer> values)
        {
            int maxCount = 0;
            int currCount = 0;
            int currNum = values.get(0);
            int mode = 0;
            int temp = 0;


            for(int i = 0; i < values.size(); i++)
            {
                if(values.get(i) == currNum)
                {
                    currCount++;
                    temp = currCount;
                } else {
                    if(currCount > maxCount)
                    {
                        maxCount = currCount;
                        mode = currNum;
                    }
                    currCount = 1;
                    currNum = values.get(i);

                }
            }
            System.out.println("Frequency:" + temp);
            System.out.println();
            return mode;


        }

    }



