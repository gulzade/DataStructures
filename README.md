# DataStructures  //Hashtable tree implement

Java programlama dili ile yazdığım programda Binary Search Tree ve Hash algoritmaları kullanılmaktadır.

Oluşturulan hash table’ın her bir elemanı bir binary search tree tutar.  
java swing kulanılarak yapılmıştır.

Öncelikle tabloda tutulması istenen veriler “veri.txt” dosyasından okunmalıdır. Dosya içerisinden her satırda bir adet kelime bulunmaktadır. Hsh table boyutu parametrik olarak verilmiştir. Dosyanın 1. Satırında hash table boyutu, sonraki satırlarda ise hash table’ a eklenecek kelimeler bulunmaktadır. Okunan her kelimeden üretilen key değeri, kelimenin hash table’daki ilgili index değerini göstermektedir. 

Dosya oku butonu ile veri.txt dosyası bir diyalog penceresi yardımı ile okunur ve tüm kelimeler hash table a eklenir. Dosya okuma işleminde dosya yolu statik bir yol olarak değil, bir opendialog ile uygulamanın çalışacağı bilgisayardan seçilir.  
Hash table daki veriler bir jlist içersinde gösterilir(her bst nin root verisi). 

jComboBox1den(preorder,inorder itemlerinin olduğu jcomboBox1) bir traversal işlemini  seçmeye çalışırsanız:
1.	jList1 den bir ağaç seçtiyseniz  jComboBox1 tan bir traversal işlemi  seçilir ve sonuç jList2 ye eklenir.
2.	Eğer ağaç seçilmemiş  ise hata mesajı alınır.
3.	jComboBox1 den tanımlanmayan bir traversal işlemi seçildiyse hata alınır .


   

Dosyadan okunan her bir kelimeden key değeri üretmek için gerekli olan hash fonksiyonu okunan kelimenin boyutunun tabla boyutuna mdu alınır.

public int hashFunc(String key) {
        return key.length() % arraySize; 
    }//kelimenin lengtinin table boyutuna göre modu alınır
    
Hash fonksiyonu veriyi tabloya yeterince dengeli dağıtacak şekilde geliştirilmeye çalışılmıştır.
