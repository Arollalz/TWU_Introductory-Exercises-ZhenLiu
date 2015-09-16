/**
 * Created by zhenliu on 9/16/15.
 */
public class DiamondExercises {
    public static void isoscelesTriangle(int number){
        int row = 1;
        while(number > 0){
            int i = number - 1;
            while(i > 0){
                System.out.print(" ");
                i --;
            }

        TriangleExercises.drawAHorizontalLine(row * 2 - 1);
        row ++;
        number --;
        }
    }

    private static void isoscelesTriangelWithName(int number, String name){
        int row = 1;
        int protectNumber = number;
        while(number > 0){
            int i = number - 1;
            while(i > 0){
                System.out.print(" ");
                i --;
            }
            if (row != protectNumber)
                TriangleExercises.drawAHorizontalLine(row * 2 - 1);
            else System.out.println(name);
            row ++;
            number --;
        }
    }

    private static void upsideDownIsoscelesTriangle(int number){
        int row = 0;
        int reverseRow = number;
        while(row < number){
            int i = row;
            while (i >= 0) {
                System.out.print(" ");
                i --;
            }

            TriangleExercises.drawAHorizontalLine(reverseRow * 2 - 1);
            row ++;
            reverseRow --;
        }
    }

    public static void diamond(int n){
        isoscelesTriangle(n);
        upsideDownIsoscelesTriangle(n-1);
    }

    public static void diamondWithName(int n, String name){
        isoscelesTriangelWithName(n,name);
        upsideDownIsoscelesTriangle(n-1);
    }
}
