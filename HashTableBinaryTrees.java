/*
* @HashTableBinaryTrees  
* @description  burada  hash table size alınır ve size kadar bst oluşturulur
    hash fonsiyonu burada işlem yapar ve kelime boyutunun tablo boyutuna göre modu alınır ve hash table daki 
    indexi bulunur ve insert edilireğer orada kelime varsa o indexe ait bstye insert ediler kelime
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
public class HashTableBinaryTrees {

    public HtBinaryTree[] hashArray;

    public int arraySize;

    public HashTableBinaryTrees(int size) {
        arraySize = size;
        hashArray = new HtBinaryTree[arraySize];
        for (int j = 0; j < arraySize; j++) {
            hashArray[j] = new HtBinaryTree();
        }
        System.out.println(hashArray[0].root);
    }

    public void display() {
        for (int j = 0; j < arraySize; j++) {
            System.out.print(j + ". ");
            hashArray[j].display();
            System.out.println();

        }
    }

    public void displayRoot() { //her bstnin rootunu yazar
        for (int i = 0; i < hashArray.length; i++) {
            System.out.println(i + " : " + hashArray[i].getroot());
        }
    }

    public String displaySperoot(int i) { //istenilen ağacın rootunu gonderir
        return hashArray[i].getroot();
    }

    public int hashFunc(String key) {
        return key.length() % arraySize; 
    }//kelimenin lengtinin table boyutuna göre modu alınır

    public void insert(String key) {
        if (key != null) {
            int hashVal = hashFunc(key);
            hashArray[hashVal].insert(key); 
        }

    }

    public HtbtNode find(String key) {
        int hashVal = hashFunc(key);
        HtbtNode node = hashArray[hashVal].find(key);
        return node;
    }

}
