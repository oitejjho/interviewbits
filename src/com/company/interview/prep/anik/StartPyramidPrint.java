package interview.prep.anik;

public class StartPyramidPrint {

    public static void main(String[] args) {
        starPyramid(4);
    }


    public static void starPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            printSpace(n - i);
            printStar((2 * i) - 1);
            System.out.println();
        }
    }


    public static void printSpace(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
