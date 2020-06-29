# APPL_SOLID_Exercises
Repository yang dibuat untuk memenuhi tugas mata kuliah Analisis Perancangan Prangkat Lunak 1 (Praktik) mengenai konsep SOLID.

### Nama  : Dewanto Joyo Pramono
### NIM   : 181524005

# Penjelasan setiap task
## 1. Stream Progress
Pada task ini konsep yang digunakan adalah Open/Closed Principle dimana source code harus terbuka ketika ada penambahan fitur atau penambahan lain namun tidak untuk memodifikasi yang telah ada. Dalam kasus ini class StreanProgressInfo.java diharapkan untuk dapat menghandle beberapa jenis file stream seperti File.java, Music.java dan bahkan jika ada class baru lainnya. Penyelesainnya adalah dengan cara membuat sebuah class interface dimana class ini dapat diimplementasikan oleh beberapa class dari jenis-jenis file stream. Jadi apabila terdapat class baru maka hanya dengan mengimplementasikan class interface tersebut. Untuk penggunaannya main program hanya perlu menggunakan class interface tersebut.
## 2. Graphic Editor
Untuk kasus pada task kedua ini sama seperti task pertama yaitu jika terdapat class baru atau penambahan baru maka source code yang telah ada harus terbuka untuk penambahan tersebut tanpa memodifikasi class yang ada. Penerapan konsep yang seperti ini juga termasuk kedalam Single Responsibility Principle dimana satu class hanya boleh melakukan satu jenis pekerjaan yang membedakannya dengan class lain.
## 3. Detail Printer
Untuk mengerjakan task ketiga ini adalah dengan cara membuat DetailsPrinter.java agar dapat menampilkan detail dari pegawai tanpa melihat jenis dari pegawai tersebut. Hal ini dapat diselesaikan dengan menerapkan konsep Liskov Substitution Principle dimana class induk dapat dengan mudah digantikan dengan class turunannya tanpa menghancurkan keseluruhan aplikasi yaitu dengan cara meng-extends segala jenis pegawai ke dalam satu class pegawai, dalam kasus ini yaitu Employee.java.
## 4. Recharge
Untuk menyelesaikan task ini diperlukan prinsip Interface Segregation Principle yaitu jika suatu class tidak harus mengimplementasikan semua method yang berada dalam suatu class interface. Untuk mengatasi hal ini class interface tersebut perlu dibuat terpisah menjadi beberapa class interface dalam kasus ini yaitu IRechargeable.java dan ISleeper.java dimana class Employee.java akan mengimplementasikan interface ISleeper.java sedangkan Robot akan mengimplementasikan interface IRechargeable.java.
## 5. Security Door
Sama halnya dengan task keempat, penyelesaiannya adalah dengan menggunakan konsep Interface Segregation Principle yaitu membagi class interface kedalam beberapa class interface baru yang nantinya digunakan untuk kebutuhan yang berbeda. Hal ini dilakukan dengan cara mengubah ISecurityUI.java kedalam beberapa interface berbeda yaitu interface IRequestKeyCard.java dan IRequestPinCode.java.
