/**
 * Created by zhenliu on 9/16/15.
 */
public class PrimeFactorsExercise {
    public static void generate(int n){
        int firstPrimeFactor = fisrtPrimeFactor(n);
        if (firstPrimeFactor == n) return;
        generate(n / firstPrimeFactor);
    }

    private static int  fisrtPrimeFactor(int n){
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                System.out.print(i + " ");
                return  i;
            }
        }
        System.out.print(n + " ");
        return n;

    }
}
