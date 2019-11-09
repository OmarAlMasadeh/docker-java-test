public class Staircase {
    public static void main(String[] args) {
        System.out.println("Staircase is running");
        int row, col;
        for(row = 1; row <= 6; row++) {
            for(col = 0; col < row; col++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
