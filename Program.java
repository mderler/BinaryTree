import java.util.Random;

public class Program {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        int x = 0;
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            x = rnd.nextInt(50);
            binaryTree.addValue(x);
        }

        binaryTree.printValues();
        binaryTree.removeValue(x);
        binaryTree.printValues();
    }
}
