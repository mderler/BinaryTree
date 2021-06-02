class BinaryTree{
    private Node _root;
    
    public void addValue(int value){
        if (_root != null) {
            _root.addValue(value);
        }
        else {
            _root = new Node(value);
        }
        
    }

    public void printValues(){
        if (_root != null) {
            _root.printValues();
        }
    }

    public void removeValue(int value){
        if (_root != null) {
            if (_root.value == value) {
                if (_root.rightNode != null) {
                    Node leftNode = _root.leftNode;
                    _root = _root.rightNode;
                    Node currentNode = _root;

                    while (currentNode.leftNode != null) {
                        currentNode = currentNode.leftNode;
                    }

                    currentNode.leftNode = leftNode;
                }else if(_root.leftNode != null) {
                    Node rightNode = _root.rightNode;
                    _root = _root.leftNode;
                    Node currentNode = _root;

                    while (currentNode.rightNode != null) {
                        currentNode = currentNode.rightNode;
                    }

                    currentNode.leftNode = rightNode;
                }
            }else {
                _root.removeValue(value);
            }
        }
    }

    public Boolean findValue(int value) {
        return false;
    }
}

