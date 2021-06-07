class Node {
    public int value;

    public Node leftNode;
    public Node rightNode;

    public Node(int value){
        this.value = value;
    }

    public void addValue(int value){
        if (value < this.value) {
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

            if (this.leftNode == null) {
                return;
            }

            if (value == this.leftNode.value) {
                if (this.leftNode.rightNode != null) {
                    Node leftNode = this.leftNode.leftNode;
                    this.leftNode = this.leftNode.rightNode;
                    Node currentNode = this.leftNode;

                    while (currentNode.leftNode != null) {
                        currentNode = currentNode.leftNode;
                    }

                    currentNode.leftNode = leftNode;
                }else if(this.leftNode.leftNode != null) {
                    Node rightNode = this.leftNode.rightNode;
                    this.leftNode = this.leftNode.leftNode;
                    Node currentNode = this.leftNode;

                    while (currentNode.rightNode != null) {
                        currentNode = currentNode.rightNode;
                    }

                    currentNode.leftNode = rightNode;
                }else {
                    this.leftNode = null;
                }
            }
            else {
                this.leftNode.removeValue(value);
            }
        }

        if (value > this.value) {

            if (this.rightNode == null) {
                return;
            }

            if (value == this.rightNode.value) {
                if (this.rightNode.rightNode != null) {
                    Node leftNode = this.rightNode.leftNode;
                    this.rightNode = this.rightNode.rightNode;
                    Node currentNode = this.rightNode;

                    while (currentNode.leftNode != null) {
                        currentNode = currentNode.leftNode;
                    }

                    currentNode.leftNode = leftNode;
                }else if(this.rightNode.leftNode != null) {
                    Node rightNode = this.rightNode.rightNode;
                    this.rightNode = this.rightNode.leftNode;
                    Node currentNode = this.rightNode;

                    while (currentNode.rightNode != null) {
                        currentNode = currentNode.rightNode;
                    }

                    currentNode.leftNode = rightNode;
                }else {
                    this.rightNode = null;
                }
            }
            else {
                this.rightNode.removeValue(value);
            }
        }
    }

    public int getCount()
    {
        int c = 1;
        if (leftNode != null) {
            c += leftNode.getCount();
        }

        if (rightNode != null) {
            c += rightNode.getCount();
        }

        return c;
    }
}
