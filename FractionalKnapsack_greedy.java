import java.util.Scanner;

public class FractionalKnapsack_greedy {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        double finale[]=new double[values.length];
        for (int i=0;i<values.length;i++ ) {
            finale[i]=((double)values[i])/((double)weights[i]);
        }
        int pos=0;
        int temp=0;
           while(capacity!=0)
           {
              pos=maxfinder(finale);
             temp=Math.min(capacity,weights[pos]);
             value=value+temp*finale[pos];
             capacity=capacity-temp;
             finale[pos]=0;
           }
        return value;
    }
    public static int maxfinder(double finale[])
    {
        int size=finale.length;
        int pos=0;
        double max=Double.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
           if (max<finale[i]) {
               pos=i;
               max=finale[i];
           }
        }
        return pos;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
