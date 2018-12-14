/* 
* @Demo 
* @description txt den verileri okur ve bir diziye atar ve her kelime kendi belirlediğim hash 
    fonksiyonuna göre index i belirlenir ve hash tabla eklenir çakışma durumunda o indexe ait bstye eklenir
* @odev1  
* @08.12.2018 
* @gulzade gulzade_krts@gmail.com 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriprojegulzade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author gülzade
 */
public class Demo extends javax.swing.JFrame {

    HtBinaryTree bst = new HtBinaryTree();
    HashTableBinaryTrees hashTable;
    String target_dir;
    String [] veriler = new String[150];
    DefaultListModel dlm;
    DefaultListModel dlm2;

    
    public Demo() {
        initComponents();
        dlm = new DefaultListModel();
        dlm2 = new DefaultListModel();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DosyaOku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DosyaOku.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DosyaOku.setText("Dosya Oku");
        DosyaOku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosyaOkuActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Hash Table");

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inorder", "Preorder", "Post-order", "Level-order", "Diğer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jList2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jScrollPane3.setViewportView(jList2);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Traversal Sonucu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DosyaOku, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DosyaOku, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DosyaOkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosyaOkuActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Jtxt Images", "txt");

        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: "
                    + chooser.getSelectedFile().getName());
            target_dir = chooser.getSelectedFile().getName();
            // System.out.println(target_dir + " " + chooser.getSelectedFile());
            try {
                BufferedReader f = new BufferedReader(new FileReader(chooser.getSelectedFile()));

                String s;
                int i = 0;
                int size;

                while ((s = f.readLine()) != null) {
                    // System.out.println(s);
                    veriler[i] = s; //txt deki verileri diziye atıyorum
                    i++;
                }
                f.close();

                size = Integer.parseInt(veriler[0]); //table size 8
                hashTable = new HashTableBinaryTrees(size); //size kadar bst oluşturuyorum
                System.out.println("Kelime Tolam sayı " + i);
                //fordaki eksi 1  olmalı çünkü ilk indexte size geliyor. 
                for (int j = 0; j < i - 1; j++) {
                    hashTable.insert(veriler[j + 1]);

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //  hashTable.display();
        hashTable.displayRoot(); //rootları yazdırıyorum doğruluğunu görmek için
        for (int j = 0; j < hashTable.arraySize; j++) {
            dlm.addElement(j + ".Root: " + hashTable.displaySperoot(j));//(her bst nin root verisi
            jList1.setModel(dlm);
        }
    }//GEN-LAST:event_DosyaOkuActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here: displaySperoot

        if (jList1.getSelectedIndex() == -1) { //jlistden ağaç seçildi mi kontrol ediyorum 
            //seçilmediyse mesaj gönder
            JOptionPane.showMessageDialog(null, "Hash seçilmedi", "deneme1", JOptionPane.WARNING_MESSAGE);
        } else {
            int secilenagac = 0;
            System.out.println("select: " + jList1.getSelectedValue()); //seçilen ağacın rootu
            // System.out.println("ilk karakter: " + jList1.getSelectedValue().charAt(0));
            secilenagac = jList1.getSelectedIndex(); //jlistden seçilen ağacın indexi agaç numarası
            // System.out.println("Seçilen Ağaç:" + secilenagac);
            //hashTable.displaySperoot(secilenagac);
            HtbtNode n = hashTable.hashArray[secilenagac].jlıstgetroot(); //seçilen ağacın rootunu tutuyorum n de
            int depth = 0; //derinlik hesaplamak için
            hashTable.displaySperoot(secilenagac);
            /* Seçtiğim ağacı jcomboboxdan seçtiğim traversals işlemlerine göre jlist2 ye ekliyorum */
            if (jComboBox1.getSelectedItem().equals("Inorder")) {

                dlm2.clear();
                dlm2.addElement(hashTable.hashArray[secilenagac].concatInOrder(n)+ "null");
                jList2.setModel(dlm2);

            } else if (jComboBox1.getSelectedItem().equals("Preorder")) {

                dlm2.clear();
                dlm2.addElement(hashTable.hashArray[secilenagac].concatPreOrder(n)+ "null");
                jList2.setModel(dlm2);

            } else if (jComboBox1.getSelectedItem().equals("Post-order")) {

                dlm2.clear();
                dlm2.addElement(hashTable.hashArray[secilenagac].concatPostOrder(n) + "null");
                jList2.setModel(dlm2);

            } else if (jComboBox1.getSelectedItem().equals("Level-order")) {
                
                dlm2.clear();
                depth = hashTable.hashArray[secilenagac].height(n); //derinlik bulma             
                System.out.println("depth: " + depth);
                dlm2.addElement(hashTable.hashArray[secilenagac].concatLevelOrder(n, depth) + "null");
                jList2.setModel(dlm2);
                
            } else {
                //seçilen türde bir traversal işlemi yoksa hata ver
                JOptionPane.showMessageDialog(null, "Komut Bulunamadı", "Demo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DosyaOku;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
