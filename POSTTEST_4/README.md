LAPORAN POSTTEST 4
Sistem Manajemen Data Karakter Wuthering Waves

---

1. Identitas

Nama : Melchi Simangunsong
NIM : 117


---

2. Rincian Program

Program ini merupakan pengembangan dari posttest sebelumnya yang digunakan untuk mengelola data karakter pada game Wuthering Waves.

Pada posttest ini ditambahkan konsep **Polymorphism** dalam pemrograman berorientasi objek. Polymorphism memungkinkan satu method memiliki banyak bentuk, baik melalui overloading maupun overriding.

Program masih menggunakan ArrayList untuk menyimpan data karakter, serta menyediakan fitur untuk menambah dan menampilkan data.

---

-Fitur Program

- Tambah data karakter DPS

- Tambah data karakter Support

- Menampilkan seluruh data karakter

- Keluar dari program

---

4. Penerapan Konsep Polymorphism

Pada program ini digunakan dua jenis polymorphism sesuai dengan modul, yaitu:

a. Method Overloading (Static Polymorphism)

Method overloading diterapkan pada method `hitungPower()` di dalam class Karakter.
Method ini memiliki nama yang sama tetapi parameter yang berbeda.

Contoh:

* hitungPower(int level)
* hitungPower(int level, int bonus)

Tujuannya untuk menghitung power karakter dengan kondisi yang berbeda.

---

b. Method Overriding (Dynamic Polymorphism)

Method overriding diterapkan pada method `tampil()` yang ada di class Karakter dan diturunkan ke class DPS dan Support.

Setiap subclass memiliki implementasi method `tampil()` yang berbeda sesuai dengan atribut masing-masing.

* Class DPS menampilkan damage
* Class Support menampilkan heal

Pemanggilan method dilakukan melalui objek bertipe parent, sehingga method yang dijalankan menyesuaikan dengan objeknya.

---

5. Struktur Class

Program ini terdiri dari beberapa class:

1. Class Karakter (Parent Class)
   Menyimpan data umum seperti nama, elemen, dan level.
   Memiliki method overloading dan method dasar tampil().

2. Class DPS (Child Class)
   Turunan dari Karakter yang memiliki atribut tambahan berupa damage.
   Mengoverride method tampil().

3. Class Support (Child Class)
   Turunan dari Karakter yang memiliki atribut tambahan berupa heal.
   Mengoverride method tampil().

---

6. Alur Program

Program berjalan dengan menampilkan menu utama.
User dapat memilih untuk menambah data atau melihat data yang telah dimasukkan.
Data disimpan ke dalam ArrayList dan akan ditampilkan sesuai dengan tipe objeknya.

---

7. Kesimpulan

Program ini telah menerapkan konsep polymorphism dalam bentuk overloading dan overriding.
Dengan adanya konsep ini, program menjadi lebih fleksibel karena method yang sama dapat digunakan untuk kondisi yang berbeda.

Selain itu, penggunaan inheritance dan polymorphism membuat struktur program lebih rapi dan mudah dikembangkan.
