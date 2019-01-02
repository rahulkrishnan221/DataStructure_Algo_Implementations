import java.util.*;
class finder implements Comparator<String>
{
    public int compare(String a,String b)
    {
       return (b+a).compareTo(a+b);
    }

}
public class LargestNumber {
    private static String largestNumber(String[] a) {
        //write your code here
        Arrays.sort(a,new finder());
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}

