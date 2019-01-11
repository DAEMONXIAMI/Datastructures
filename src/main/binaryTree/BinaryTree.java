package main.binaryTree;

//二叉搜索树的封装类
public class BinaryTree {
    private Node root;//根节点

    public BinaryTree(){
        root = null;
    }

    //find node
    public Node find(int key) {
        Node cur = root;

        if (cur == null) {
            return null;
        }

        while(cur.value != key){
            if (key <cur.value)
                cur = cur.leftChild;
            else
                cur = cur.rightChild;
        }

        return cur;
    }

    //插入新节点
    public void insert(Node node){
        if(root ==null){
            root = node;
            return;
        }

        Node cur =root;

        while (true){
            if(node.value <cur.value){
                if(cur.leftChild == null) {
                    cur.leftChild=node;
                    return;
                }
                else {
                    cur =cur.leftChild;
                }
            }
            else (node.value >= cur.value){
                if(cur.rightChild == null){
                    cur = cur.rightChild;
                    return;
                }
                else{
                    cur = cur.rightChild;
                }
            }
        }
    }

    //删除指定节点
    public boolean delete(Node node){
        if(root == null) return false;

        boolean isLeftChild = true; //记录目标节点是否为父节点的左子节点
        Node cur = root;//当前指向的节点
        Node father = null; //当前指向节点的父节点

        //找到要删除的节点，用cur指向
        while (cur.value != node.value){
            father = cur;
            if(node.value < cur.value){
                cur = cur.leftChild;
            }
            else {
                isLeftChild = false;
                cur = cur.rightChild;
            }
            if(cur == null){
                return false; //没有找到要删除的节点
            }
        }

        if(cur.leftChild == null && cur.rightChild==null){
            if(cur == root){
                root = null;
            }
            else if(isLeftChild) father.leftChild = null;
            else  father.rightChild =null;
        }
        else if(cur.leftChild ==null){//要删除节点没有左子节点
            if(cur == root){
                root = cur.rightChild;
            }
            else if(isLeftChild) father.leftChild = cur.rightChild;
            else father.rightChild = cur.rightChild;
        }
        else if(cur.rightChild == null){//要删除节点没有右子节点
            if(cur ==root) root = cur.leftChild;
            else if(isLeftChild) father.leftChild = cur.leftChild;
            else father.rightChild = cur.leftChild;
        }
        else {//要删除的节点，左右节点都有，这是要找到它子树下的后继节点
            Node successor = cur.rightChild;
            Node successorParent = null;
            while (successor.leftChild != null){
                successorParent = successor;
                successor = successor.leftChild;
                //......太难了
            }
        }

        return true;
    }

    //遍历
    public static final int PREORDER = 1;//前序
    public static final int INORDER = 2;//中序
    public static final int POSTORDER = 3;//后序

    public void traverse(int type){
        switch (type){
            case 1:
                System.out.println("前序遍历：\t");
                preorder(root);
                break;
            case 2:
                System.out.println("中序遍历：\t");
                inorder(root);
                break;
            case 3:
                System.out.println("后序遍历：\t");
                postorder(root);
                break;
        }
    }

    //前序遍历
    public void preorder(Node currentRoot){
        if(currentRoot !=null){
            System.out.println(currentRoot.value+"\t");
            preorder(currentRoot.leftChild);
            preorder(currentRoot.rightChild);
        }
    }
    public void inorder(Node currentRoot){
        if(currentRoot !=null){
            preorder(currentRoot.leftChild);
            System.out.println(currentRoot.value+"\t");

            preorder(currentRoot.rightChild);
        }
    }
    public void postorder(Node currentRoot){
        if(currentRoot !=null){

            preorder(currentRoot.leftChild);
            preorder(currentRoot.rightChild);
            System.out.println(currentRoot.value+"\t");
        }
    }
}
