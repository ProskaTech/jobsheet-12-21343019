## Created_by_21343019_Arafil Azmi

Pada JS 12 ini kita mempelajari tentang lanjutan prinsip OOP yaitu :

  OOPs(Object - oriented Progamming System)
  
    Pemograman berorientasi objek adalah model pemograman komputer yang mengatur desain perangkat lunak yang berfokus pada data atau objek dibandingkan hanya berfokus  
    pada fungsi dan logika Objek dapat didefinisikan sebagai bidang data yang memiliki atribut dan perilaku unik. OOP berfokus pada objek yang ingin dimanipulasi oleh 
    programmer daripada logika yang diperlukan untuk memanipulasinya.
    
  Prnsip - prinsip OOP : 
      
      1. Inheritance (Pewarisan)
         Prinsip inheritance pada OOP adalah di mana kita dapat membentuk class baru yang “mewarisi” atau memiliki bagian-bagian dari class yang sudah ada sebelumnya.
         
      2. Polymorphism
         Prinsip polymorphism pada OOP adalah konsep dimana suatu objek berbeda - beda dapat diakses pada satu interface.
         Dalam Java, terdapat 2 jenis polymorphism yaitu static dan dynamic.
         
            a. Static Polymorphism yang umum digunakan adalah Method Overloading. Method Overloading mengizinkan kalian untuk menerapkan beberapa implementasi metode 
               berbeda dalam kelas yang sama namun dengan parameter berbeda-beda.
            
            b. Dalam Dynamic Polymorphism sebuah subclass dapat menimpa metode dari superclassnya. Jika kalian menerapkan subclass tersebut, Java Virtual
               Machine akan selalu menggunakan metode yang sudah ditimpa.
          
      3. Abstraction
         Abstraction adalah proses untuk menyembunyikan detail implementasi dan hanya sisi fungsionalitas (gambaran umum) saja yang ditampilkan. Abstraction pada java   
         dibagi menjadi dua yaitu ada Class Abstract dan Interface.
      
      4. Encapsulation
         Encapsulation pada OOP adalah konsep tentang pengikatan data atau metode berbeda yang disatukana atau "dikapsulkan" menjadi satu unit data.
         
  Berikut Penjelasan tentang program latihan :
      
      1. Program Latihan 1 - Inheritance
         Pada program latihan 1 terdapat Class Kendaraan, Class RodaDua, Class RodaEmpat dan Class JavaInheritance. Pada program ini Class Kendaraan adalah super class
         dikarenakan Class RodaDua dan Class RodaEmpat merupakan subclass dari Class Kendaraan karena menggunakan extends. Pada class kendaraan terdapat variabel dan 
         method. Lalu pada Class RodaDua terdapat juga variabel dan method. Pada method Class RodaDua terdapat statement yang menggunakan variabel pada Class Kendaraan 
         dan mengisikan proses perhitungan maka nilai variabel pada Class Kendaraan akan berubah meskipun nama varibel tersebut sama. Pada Class RodaEmpat juga 
         melakukan proses yang sama pada Class RodaDua hanya variabelnya saja yang berbeda. Pada Class JavaInheritance merupakan tempat pengeksekusian dari Class 
         diatas dengan membuat objek untuk Class RodaDua dan Class RodaEmpat lalu memanggil method - method yang terdapat pada Class tersebut dengan menggunakan objek 
         yang telah dibuat sebelumnya pada Class RodaDua dan Class RodaEmpat.
         
      2. Program Latihan 2 - Polymorphism Static
         Pada program latihan 2 terdapat Class Compile Time dan Class polymorphismStatic. Pada Class Compile Time terdapat 2 method yaitu method keliling dengan single 
         argumen dan dua argumen (method overloading). Lalu pada Class polymorphismStatic memanggil method tersebut dengan mengisikan nilai paramternya masing - masing 
         dan memanggil method dengan menggunakan nama classnya yaitu Class Compile Time. Meskipun nama methodnya sama namun jika argumennya berbeda maka hasil yang 
         keluar pada program akan berbeda dikarenakan menggunakan method overloading yang dimana pada program dapat mengimplementasikan method yang berbeda dalam class 
         yang sama dengan parameter yang berbeda.
         
      3. Program Latihan 3 - Polymorphism Dynamic
         Pada program latihan 3 terdapat Class Bank, Class BRI, Class BNI, Class Mandiri dan Class polymorphismDynamic. Class Bank merupakan superclass karena Class 
         BRI, BNI dan Mandiri menggunakan extends terhadap Class Bank. Pada Class BRI, BNI dan Mandiri melakukan overriding pada method Class Bank yaitu sukubunga dan 
         statement pada masing - masing Class juga berbeda - beda. Lalu pada Class polymorphismDynamic membuat variabel dari Class Bank dan membuat objek baru pada
         Class BRI. BNI dan Mandiri dengan menggunakan variabel dari Class Bank, kemudian memanggil method suku bunga dari masing - masing class dan hasilnya akan 
         berbeda - beda pada masing - masing class meskipun dengan nama method yang sama. Dikarenakan jika mengoverriding method dari superclassnya maka method pada 
         superclass akan ditimpa dan yang terjadi maka program akan membaca method yang sudah ditimpa dibandingkan method asalnya.
      
      4. Program Latihan 4 Abstraction - Abstrac Class
         Pada program latihan 4 terdapat Abstract Class Orang dan Class AnakUmur1Tahun. Pada program Abstract Class Orang merupakan superclass dan Class AnakUmur1tahun
         merupakan subclass. Abstract Class Orang terdapat variabel, method abstract dan method dengan statement. Kemudian pada Class AnakUmur1tahun yang merupakan 
         subclass pada Abstract Class Orang harus menginisialisasikan method pada class tersebut. Pada Class AnakUmur1tahun membuat method namaAyahku yang statement 
         diambil dari variabel pada Abstact Class Orang dan mengoverriding method makan dan minum sekaligus memberikan statement didalamnya. Setelah itu terdapat Class 
         manusia dan pada Class manusia object tidak bisa dibuat pada class induk dan harus membuat object pada subclassnya yaitu Class AnakUmur1Tahun dan memanggil 
         methodnya maka method yang sudah teroverride yang akan ditampilkan atau di eksekusi.
         
      5. Program Latihan 5 Abstraction - Interface
         Pada program latihan 5 terdapat Interface AktivitasPagi dengan method abstract yaitu lari dan berenang. Pada Class AktivitasPagiAnak mengambil implentasi dari 
         interface AktivitasPagi dan mengoverride method yang abstract pada interface AktivitasPagi sekaligus membuat statement didalam method tersebut, setelah itu 
         terdapat Class AktivitaUtama dan membuat objek untuk Class AktivitasPagiAnak dan memanggil method dengan menggunakan object yang telah dibuat.
      
      6. Program Latihan 6 - Encapsulation
         Pada program latihan 6 terdapat Class EncapsulationBuah dan terdapat variabel dengan access private dan membuat constructor dan menggunakan perintah this 
         untuk memasukan data yang diinputkan pada paramater kedalam variabel dan membuat method untuk memberi atau mengubah nilai variabel dengan menggunakan set dan 
         method untuk membaca nilai pada variabel yang sudah di isi atau dirubah dengan menggunakan get yang memiliki nilai balikan. Kemudian terdapat Class BuahUtama 
         dan pada class ini program menggunakan constructor untuk menginisialisasikan pada Class EncapsulationBuah dan membuat objeknya, setelah itu menggunakan get
         untuk membaca nilai variabel yang sudah diisikan dengan memanggil method get menggunakan objek dari constructor, kemudian mengubah variabel dengan menggunakan 
         method setter yang dipanggil menggunakan objek maka ketika kita menggunakan getter kembali maka isi dari variabel yang sudah dilakukan setter lah yang akan 
         ditampilkan pada program.
         
         
