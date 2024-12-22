import java.util.ArrayList;
import java.util.List;

class Solution {
    
     static class Node{
        int value;
        int x;
        int y;
        Node left;
        Node right;


        public Node(int value,int x , int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
    
     static List<Integer> preOrderResult = new ArrayList<>();
    static List<Integer> postOrderResult = new ArrayList<>();
    
    
    
    public int[][] solution(int[][] nodeinfo) {
       
        
        
          List<Node> nodeList = createNode(nodeinfo);

        Node root = nodeList.get(0);

        for(int i = 1 ; i<nodeList.size(); i++){
            addNode(root,nodeList.get(i));
        }

        preOrder(root);
        postOrder(root);

        
        return new int [][]{
                preOrderResult.stream().mapToInt(i->i).toArray(),
                postOrderResult.stream().mapToInt(i->i).toArray()
        };
    }
    
    public static List<Node> createNode (int [][] nodeInfo){
        List<Node> nodeList = new ArrayList<>();
        for(int i = 0 ; i< nodeInfo.length; i ++){
            nodeList.add(new Node(i+1, nodeInfo[i][0],nodeInfo[i][1]));
        }

        nodeList.sort((a,b) -> b.y!=a.y ? b.y-a.y : a.x-b.x);
        return nodeList;
    }

    private static void addNode(Node parent , Node child){
        if(child.x < parent.x){
            if(parent.left == null) parent.left = child;
            else addNode(parent.left,child);
        }else{
            if(parent.right == null)parent.right = child;
            else addNode(parent.right,child);
        }
    }
    
     private static void preOrder(Node node){
        if(node == null) return;
        preOrderResult.add(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        postOrderResult.add(node.value);
    }
    
}