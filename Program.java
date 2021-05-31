import java.util.Random;

public class Program {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            binaryTree.addValue(rnd.nextInt(50));
        }

        binaryTree.printValues();
    }
}
