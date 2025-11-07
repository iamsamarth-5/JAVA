import java.util.ArrayList;

public class LoopsAdvance {
    public static void main(String[] args) {
        // print100Stars(10000);
        // printStarGrid(5);
        // int[] numbers = {1, 5, 8, 10, 11, 12};
        // printStarsForArray(numbers);
        // PrintPyramid(5);
        PrintInvertedPyramid(5);
    }

    public static void print100Stars(int countOfStars) {
        for (int count = 1; count <= countOfStars; count++) {
            System.out.print("* ");
        }
    }

    public static void printStarGrid(int gridSize) {
        for (int row = 1; row <= gridSize; row++) {
            for (int col = 1; col <= gridSize; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void PrintPyramid(int height) {
        int countOfStars = 1;
        for (int level = 1; level <= height; level++) {
            int noOfSpace = height - level;
            StringBuilder line = new StringBuilder();

            for (int count = 0; count < noOfSpace; count++) {
                line.append(" ");
            }
            for (int count = 0; count < countOfStars; count++) {
                line.append("*");
            }

            System.out.println(line.toString());
            countOfStars = countOfStars + 2;
        }
    }

    public static void PrintInvertedPyramid(int height) {
        for (int level = 1; level <= height; level++) {
            int noOfSpaces = level - 1;
            int noOfStars = (height - level) * 2 + 1;
            StringBuilder line = new StringBuilder();

            for (int count = 0; count < noOfSpaces; count++) {
                line.append(" ");
            }
            for (int count = 0; count < noOfStars; count++) {
                line.append("*");
            }

            System.out.println(line.toString());
        }
    }

    public static void printStarsForArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            for (int count = 1; count <= numbers[index]; count++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
