public class HollowRightAngledTriangle {
    public static void main(String[] args) {
        int height = 5; // 

        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == height  || j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

