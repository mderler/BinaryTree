class Node {
    public int value;

    public Node leftNode;
    public Node rightNode;

    public Node(int value){
        this.value = value;
    }

    public void addValue(int value){
        if (this.value < value) {
            if (leftNode != null) {
                leftNode.addValue(value);
            }
            else {
                leftNode = new Node(value);
            }
        }else {
            if (rightNode != null) {
                rightNode.addValue(value);
            }
            else {
                rightNode = new Node(value);
            }
        }
    }

    public void printValues(){

        if (leftNode != null) {
            leftNode.printValues();
        }

        if (rightNode != null) {
            rightNode.printValues();
        }

        System.out.println(value);
    }

    public void RemoveValue(int value){
        if (value == leftNode.value) {
            
        }   
    }
}
