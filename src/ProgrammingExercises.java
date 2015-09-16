/**
 * Created by zhenliu on 9/16/15.
 */
public class ProgrammingExercises {
    public static void main(String[] args) {
        TriangleExercises.printOneAsterisk();
        TriangleExercises.drawAHorizontalLine(8);
        TriangleExercises.drawAVerticalLine(3);
        TriangleExercises.drawARightTriangle(3);

        DiamondExercises.isoscelesTriangle(3);
        DiamondExercises.diamond(3);
        DiamondExercises.diamondWithName(4, "LiuZhen");

        FizzBuzz.fizzBuzz();

        PrimeFactorsExercise.generate(30);
    }
}
