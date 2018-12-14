/** @HtbtNode
* @description hash table için node tanımlaması yapılır
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
public class HtbtNode {
    String data;
    HtbtNode leftChild;
    HtbtNode rightChild;

    public HtbtNode(String data) {
        this.data = data;
    }
     
}
