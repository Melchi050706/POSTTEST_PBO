LAPORAN POSTTEST 5
Sistem Manajemen Data Karakter Wuthering Waves


Nama : Melchi Simangunsong
NIM : 117
Mata Kuliah : Pemrograman Berorientasi Objek


2. Rincian Program

Program ini merupakan lanjutan dari posttest sebelumnya yang digunakan untuk mengelola data karakter pada game Wuthering Waves.

Pada posttest ini dilakukan pengembangan dengan menerapkan konsep **Abstract Class** dan **Interface** dalam pemrograman berorientasi objek.

Data karakter masih disimpan menggunakan ArrayList, dan program tetap memiliki fitur dasar seperti menambah dan menampilkan data.

# Fitur Program

# Tambah data karakter DPS

# Tambah data karakter Support

# Menampilkan data karakter

# Menjalankan aksi karakter (serang dan skill)

# Keluar dari program


4. Penerapan Abstract Class

Class Karakter diubah menjadi abstract class.
Hal ini bertujuan agar class tersebut hanya digunakan sebagai dasar (parent) dan tidak dapat dibuat objek secara langsung.

Di dalam class Karakter terdapat abstract method yaitu:

* tampil()

Method ini harus diimplementasikan oleh class turunan.

Selain itu terdapat method biasa yaitu infoDasar() yang digunakan untuk menampilkan data umum karakter.


5. Penerapan Interface

Pada program ini dibuat interface bernama Aksi yang memiliki dua method:

* serang()
* skill()

Interface ini digunakan untuk mendefinisikan aksi yang dapat dilakukan oleh karakter.

Class DPS dan Support mengimplementasikan interface tersebut dan memberikan isi method sesuai dengan tipe karakter masing-masing.


6. Struktur Class

Program terdiri dari beberapa class, yaitu:

1. Karakter (Abstract Class)
   Menyimpan atribut dasar seperti nama, elemen, dan level serta memiliki abstract method tampil().

2. DPS (Subclass)
   Turunan dari Karakter yang memiliki atribut tambahan berupa damage serta mengimplementasikan interface Aksi.

3. Support (Subclass)
   Turunan dari Karakter yang memiliki atribut tambahan berupa heal serta mengimplementasikan interface Aksi.

4. Aksi (Interface)
   Berisi method serang() dan skill() yang harus diimplementasikan oleh class yang menggunakannya.

5. Main
   Berisi alur program dan menu interaksi dengan user.


7. Alur Program

Program dimulai dengan menampilkan menu utama.
User dapat memilih untuk menambah data karakter, melihat data, atau menjalankan aksi karakter.

Data karakter disimpan dalam ArrayList dan diproses menggunakan konsep OOP seperti inheritance, polymorphism, abstract class, dan interface.


8. Kesimpulan

Program ini telah menerapkan konsep abstract class dan interface sesuai dengan modul.

Dengan penggunaan abstract class, struktur program menjadi lebih terorganisir karena class utama hanya berfungsi sebagai dasar.

Sedangkan interface digunakan untuk mendefinisikan aksi yang dapat dilakukan oleh setiap karakter, sehingga program menjadi lebih fleksibel dan mudah dikembangkan.
