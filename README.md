# KuliJava
repository milik anggota Kelompok 9 (KuliJava) untuk tugas besar mata kuliah pemrograman berorientasi objek.

---Tahapan Compile---:
Berikut merupakan tahapan compile program:
1. Jalankan program dengan masuk ke repository file Main pada folder game (cd/*pathfile*) 
2. Untuk mengoperasikan kode, jalankan perintah javac Main.java
3. Kemudian operasikan game dengan mengetikkan java Main.java
4. Terkait pengoperasian game dapat melihat penjelasan berikut:

---How to Play---
Ketentuan secara umum untuk memainkan permainan HIJI adalah sebagai berikut.
1. Permainan hanya dapat dimainkan oleh 2-6 orang pemain.
2. Di awal permainan, semua pemain akan mendapatkan 7 buah kartu.
3. Satu kartu angka dipilih secara acak untuk dijadikan kartu awal.
4. Pemain yang akan memulai giliran pertama akan diacak.
5. Pemain akan terus berlanjut sesuai giliran yang ditentukan.
6. Pada setiap giliran, pemain boleh mengeluarkan satu atau lebih kartu yang dapat dimainkan pada giliran tersebut. 
7. Apabila pemain tidak mengeluarkan kartu, pemain wajib mengambil satu kartu dari deck.
8. Apabila kartu yang baru diambil tersebut bisa dikeluarkan (discard), pemain boleh mengeluarkan kartu tersebut (tidak wajib).
9. Apabila kartu tersebut tidak dapat dikeluarkan (discard), maka giliran akan lanjut ke pemain selanjutnya.
10. Apabila pemain memiliki sisa satu kartu, maka pemain harus melakukan “Declare HIJI” dalam waktu 3 detik. Apabila tidak, pemain wajib mengambil dua kartu dari deck.
11. Permainan selesai jika sudah mendapatkan satu orang pemenang.

---How to Discard---
Pemain dapat mengeluarkan kartu yang dimiliki atau melakukan discard dengan ketentuan sebagai berikut.
1. Saat tiba pada gilirannya, pemain dapat mengeluarkan (discard) satu atau lebih kartu.
2. Discard dinyatakan sah apabila kartu yang dikeluarkan sesuai dengan warna atau angka dari kartu yang dikeluarkan pemain sebelumnya. 
3. Jika pemain mencoba mengeluarkan kartu yang tidak sah, maka pemain akan diminta untuk mengeluarkan kartu yang lain.
4. Jika pemain ingin mengeluarkan lebih dari satu kartu, jenis kartu yang dikeluarkan harus sama persis di semua kartunya.

---How to Multiple Discard---
Pemain yang memiliki lebih dari satu kartu yang sama (baik warna maupun angka( dapat mengeluarkan semua kartu atau sebagian kartu yang dimiliki pada suatu giliran tertentu. Ketentuan untuk melakukan multiple discard adalah sebagai berikut.
1. Untuk kartu Draw 2, pemain selanjutnya akan mengambil kartu sebanyak dua kali dari jumlah kartu yang dikeluarkan (Contoh: Pemain sebelumnya mengeluarkan 2 kartu Draw 2 maka pemain selanjutnya mengambil 4 kartu dari deck).
2. Untuk kartu Draw 4, pemain selanjutnya akan mengambil kartu sebanyak empat kali dari jumlah kartu yang dikeluarkan dari deck (Contoh: Pemain sebelumnya mengeluarkan 2 kartu Draw 4 maka pemain selanjutnya mengambil 8 kartu dari deck). Namun, pemain sebelumnya hanya dapat memilih satu warna saja.
3. Untuk kartu Skip, jumlah pemain yang dilewati sesuai dengan jumlah kartu Skip yang dikeluarkan.
4. Untuk kartu Reverse, urutan akan membolak-balik sesuai jumlah kartu. Misalnya ada dua kartu Reverse, maka urutan pemain tidak berubah.
5. Untuk kartu Wildcard, pemain tetap hanya dapat memilih satu warna.

---Winning Conditions---
1. Pemain dinyatakan menang dengan ketentuan sebagai berikut.
2. Untuk setiap permainan, jumlah pemenang hanyalah 1 orang.
3. Pemain dinyatakan menang apabila kartu yang dipegangnya sudah habis.
4. Jika pemenang sudah ditentukan, maka permainan akan berakhir bagi seluruh pemain.

