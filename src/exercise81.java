/**
 * Created by Praktika on 12.12.2016.
 */
import java.util.Arrays;

public class exercise81 {
    public static void main(String[] args) {
        double[] a = {3, 4, 5, 6};
        System.out.println(Arrays.toString(powArray(a)));
    }

    public static double[] powArray(double[] a) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = Math.pow(a[i], 2.0);
        }
                return result;
            }
        }