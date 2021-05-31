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

    public void RemoveValue(int value){
        if (_root != null) {
            if (_root.value == value) {
                Node leftNode = _root.leftNode;
                _root = _root.rightNode;
                
                Node currentNode = _root;
                while (currentNode.leftNode != null) {
                    currentNode = currentNode.leftNode;   
                }

                currentNode.leftNode = leftNode;
            }else{
                _root.RemoveValue(value);
            }
        }
    }
}

