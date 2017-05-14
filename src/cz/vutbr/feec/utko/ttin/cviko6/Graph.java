package cz.vutbr.feec.utko.ttin.cviko6;

import java.util.HashMap;

/**
 * Created by ogajduse on 3/13/17.
 */
public class Graph {
    private HashMap<String, Node> nodes = new HashMap<>();

    public void addEdge(String src, String dst, int cena) { // 8 9 3
        Node srcNode = nodes.get(src);
        Node dstNode = nodes.get(dst);

        if (!(srcNode == null) && !(dstNode == null) && srcNode.getNeighbours().contains(dstNode)) {
            System.out.println("exact path already exist");
            return;
        }
        if (srcNode == null) {
            srcNode = new Node(src);
            nodes.put(src, srcNode);
        }
        if (dstNode == null) {
            dstNode = new Node(dst);
            nodes.put(dst, dstNode);
        }

        Edge h = new Edge(srcNode, dstNode, cena);
        srcNode.addEdge(h);
        dstNode.addEdge(h);
    }

    public Node findNode(String identifier) {
        return nodes.get(identifier);
    }
}
