/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public void deepCopy(Node node,HashMap<Node,Node> preMap){
        if(node==null){
            return;
        }
     
        List<Node> neighbors=node.neighbors;
        Node newNode=preMap.get(node);
        for(Node eachNode:neighbors){
            if(!preMap.containsKey(eachNode)){
                Node newNode1=new Node(eachNode.val);
                preMap.put(eachNode,newNode1);
                newNode.neighbors.add(newNode1);
                deepCopy(eachNode,preMap);
            }else{
                newNode.neighbors.add(preMap.get(eachNode));
            }
            
        }
    }
    public Node cloneGraph(Node node) {
         HashMap<Node,Node> preMap=new HashMap();
        if(node==null){
            return node;
        }
           Node newNode=new Node(node.val);
        preMap.put(node,newNode);
       deepCopy(node,preMap);
        return preMap.size()>0?preMap.get(node):null;
    }
}