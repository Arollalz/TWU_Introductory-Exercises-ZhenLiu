/**
 * Created by zhenliu on 9/16/15.
 */
public class TriangleExercises {
    public static void printOneAsterisk(){
        System.out.println("*");
    }

    public static void drawAHorizontalLine(int number){
        while(number > 0){
            System.out.print("*");
            number --;
        }
        System.out.print("\n");
    }

    public static void drawAVerticalLine(int number){
        while(number > 0){
            printOneAsterisk();
            number --;
        }
    }

    public static void drawARightTriangle(int number){
        int times = 1;
        while(number > 0){
            drawAHorizontalLine(times);
            number --;
            times++;
        }
    }

}
