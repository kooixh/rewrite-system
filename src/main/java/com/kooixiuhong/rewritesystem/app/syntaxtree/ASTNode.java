package com.kooixiuhong.rewritesystem.app.syntaxtree;

/**
 * This class represents a node for an abstract syntax tree. the AST is in the form
 * of a binary tree with each node having a string value.
 *
 * @author Kooi
 * @date 30th January 2019
 */
public class ASTNode implements Node {


    //fields
    protected String value;
    protected Node left;
    protected Node right;
    protected DataType type;
    protected NodeType nodeType;


    //constructors
    public ASTNode(String value) {
        this.value = value;
        left = null;
        right = null;
    }

    public ASTNode(String value, Node left, Node right, DataType type, NodeType nodeType) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.type = type;
        this.nodeType = nodeType;
    }

    public ASTNode(String value, DataType type, NodeType nodeType) {
        this.value = value;
        this.type = type;
        this.nodeType = nodeType;
        left = null;
        right = null;
    }


    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    //getters and setters
    public void setRight(Node right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((left == null) ? 0 : left.hashCode());
        result = prime * result + ((nodeType == null) ? 0 : nodeType.hashCode());
        result = prime * result + ((right == null) ? 0 : right.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ASTNode other = (ASTNode) obj;
        if (left == null) {
            if (other.left != null)
                return false;
        } else if (!left.equals(other.left))
            return false;
        if (nodeType != other.nodeType)
            return false;
        if (right == null) {
            if (other.right != null)
                return false;
        } else if (!right.equals(other.right))
            return false;
        if (type != other.type)
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getValue() + "(" + this.getNodeType() + "):" + this.getType();
    }


}