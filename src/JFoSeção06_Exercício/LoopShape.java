package JFoSeção06_Exercício;

public class LoopShape {

    public static String[][] createRectangle(int weight, int height) {
        String[][] rectangle = new String[weight][height];
        for (int i=0; i<weight; i++) {
            for (int j=0; j<height; j++) {
                rectangle[i][j] = "#";           
            }
        }
        return rectangle;
    }

    public static void createTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]) {
        String[][] rectangle = LoopShape.createRectangle(10, 20);

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }

        createTriangle(5);
    }
}
