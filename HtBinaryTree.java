/** @HtBinaryTree
* @description bst ye insert işlemi burada yapılır ve ağaçların rootları  burada 
*  bulunur ve gönderilir.Gönderilen roota göre ağacın derinliğini bulma metodu vardır 
* bstyi gezme  işlemleri buradadır preorder,inorder,level order,postorder
* @odev1  
* @08.12.2018 
* @gulzade gulzade_krts@gmail.com 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriprojegulzade;

/**
 *
 * @author gülzade
 */
public class HtBinaryTree {

    String s = "";
    public HtbtNode root;

    void insert(String key) {

        HtbtNode newNode = new HtbtNode(key);
        if (root == null) {
            root = newNode;
            // System.out.println("Root: "+ root.data);

        } else {
            HtbtNode temp = root;
            HtbtNode parent;

            while (temp != null) {
                parent = temp;

                if (key.compareTo(temp.data) > 0) {
                    temp = temp.rightChild;
                    if (temp == null) {
                        parent.rightChild = newNode;
                    }
                } else if (key.compareTo(temp.data) < 0) {
                    temp = temp.leftChild;
                    if (temp == null) {
                        parent.leftChild = newNode;
                    }
                } else {
                    temp = null;
                }
            }
        }
    }

    HtbtNode find(String key) {
        HtbtNode temp = root;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return temp;
            }
            if (key.compareTo(temp.data) < 0) {
                temp = temp.leftChild;
            } else {
                temp = temp.rightChild;
            }
        }
        return null;
    }

    int sizeRecursive(HtbtNode n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + sizeRecursive(n.leftChild) + sizeRecursive(n.rightChild);
        }
    }

    public String getroot() {

        if (root == null) {
            return null;
        }
        return root.data;

    }

    public HtbtNode jlıstgetroot() {

        if (root == null) {
            return null;
        }
        return root;
    }

    public String concatInOrder(HtbtNode t) {
        if (t == null) {
            return "";
        }
        return concatInOrder(t.leftChild) + ("\n" + t.data + " -> ") + concatInOrder(t.rightChild);
    }

    public String concatPostOrder(HtbtNode t) {
        if (t == null) {
            return "";
        }
        return concatPostOrder(t.leftChild) + concatPostOrder(t.rightChild) + ("\n" + t.data + " -> ");
    }

    public String concatPreOrder(HtbtNode t) {
        if (t == null) {
            return "";
        }
        return ("\n" +t.data + " -> ") + concatPreOrder(t.leftChild) + concatPreOrder(t.rightChild);

    }

    int height(HtbtNode node) {
        if (node == null) {
            return 0;
        } else {
            /* compute the height of each subtree */
            int lheight = height(node.leftChild);
            int rheight = height(node.rightChild);

            /* use the larger one */
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    public String concatLevelOrder(HtbtNode node, int level) {
        if (node == null) {
            return "";
        }
        if (level == 1) {
            //  System.out.println(s);
            s += (node.data + " -> \n");

        } else if (level > 1) {
            s += (node.data + " -> \n");
            // System.out.println("sssssssss: "+s);
           concatLevelOrder(node.leftChild, level - 1);
           concatLevelOrder(node.rightChild, level - 1);

        }
        return s;
    }

    void display() {
        if (root != null) {
            inorder(root);
        }
    }

    void inorder() {
        System.out.print(" ");
        inorder(root);
        System.out.println();
    }

    void inorder(HtbtNode n) {
        if (n != null) {
            inorder(n.leftChild);
            System.out.println(n.data + " ");
            inorder(n.rightChild);
        }
    }
    /* test etmek için 
    void levelo(HtbtNode node, int level)  
    { 
        if (node == null) {
            return; 
        }if (level == 1) {
         System.out.println("---------"+node.data);
         System.out.print("*****"+node.data + " "); 
        } else if (level > 1)  
        {   System.out.println("++++++++++++++"+node.data);
           levelo(node.leftChild, level - 1); 
           levelo(node.rightChild, level - 1); 
        } 
    } 
int testheg(HtbtNode node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            //compute the height of each subtree //
            int lheight = height(node.leftChild); 
            int rheight = height(node.rightChild); 
   
            // use the larger one //
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
     */

}
