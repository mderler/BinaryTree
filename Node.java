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
        }
        else {
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

    public void removeValue(int value){
        if (value < this.value) {
            if (value == this.leftNode.value) {
                Node leftNode = this.leftNode.leftNode;
                this.leftNode = this.leftNode.rightNode;

                Node currentNode = this.leftNode;
                while (currentNode.leftNode != null) {
                    currentNode = currentNode.leftNode;   
                }

                currentNode.leftNode = leftNode;
            }
            else {
                this.leftNode.removeValue(value);
            }
        }

        if (value > this.value) {
            if (value == this.rightNode.value) {
                Node rightNode = this.rightNode.rightNode;
                this.rightNode = this.rightNode.leftNode;

                Node currentNode = this.rightNode;
                while (currentNode.rightNode != null) {
                    currentNode = currentNode.rightNode;   
                }

                currentNode.rightNode = rightNode;
            }
            else {
                this.rightNode.removeValue(value);
            }
        }
    }
}
