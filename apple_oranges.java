import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
    {
        int[] dist_apples = new int[apples.length];
        int[] dist_oranges = new int[oranges.length];
        int count_apple = 0;
        int count_oranges = 0;

        for(int i = 0; i < apples.length; i++)
        {
            dist_apples[i] = a + apples[i];
            //System.out.println(dist_apples[i]);
            if ((dist_apples[i] >= s) && (dist_apples[i]<= t))
            {
                
                count_apple++;
                //System.out.println(count_apple);
            }

        }

        for (int j = 0; j < oranges.length; j++)
        {
            dist_oranges[j] = b + oranges[j];
            //System.out.println(dist_oranges[j]);
            if((dist_oranges[j] >= s) && (dist_oranges[j] <= t))
            {
                count_oranges++;
                //System.out.println(count_oranges);
            }
        }

        System.out.println(count_apple);
        System.out.println(count_oranges);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
