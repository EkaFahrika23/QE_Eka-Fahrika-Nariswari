# (8) RESTful API Introduction & Testing
## Pengenalan API
### Pengertian API & REST API
API (Application Programming Interface) adalah sebuah set aturan dan protokol yang memungkinkan program-program untuk berkomunikasi satu sama lain. API digunakan untuk menghubungkan aplikasi yang berbeda-beda agar dapat saling berinteraksi dan berbagi data dengan cara yang terstandardisasi dan terkontrol.

REST API (Representational State Transfer API) adalah salah satu jenis API yang populer saat ini. REST API memungkinkan sistem untuk berkomunikasi menggunakan protokol HTTP dengan format permintaan dan respons yang terstruktur. 

### Method HTTP
1. GET : digunakan untuk mengambil data dari server
2. POST : digunakan untuk mengirimkan data baru ke server
3. PUT : digunakan untuk memperbarui data atau merubah data yang sudah ada pada server
4. DELETE : digunakan untuk menghapus data pada server
5. PATCH : digunakan untuk memperbaru sebagian data yang ada pada server
6. OPTIONS :  digunakan untuk memperoleh informasi tentang kemampuan komunikasi dengan server.
7. HEAD : digunakan untuk mengambil header dari respons server dan tidak mengambil body dari respons.

### HTTP response code
1. 200 ok : Permintaan berhasil dan server mengembalikan respons yang diharapkan.
2. 301 Moved Permanently: Halaman yang diminta telah dipindahkan secara permanen ke alamat URL yang baru.
3. 400 Bad Request: Permintaan tidak dapat diproses karena kesalahan klien dalam sintaks permintaan.
4. 403 Forbidden: Klien tidak diizinkan mengakses sumber daya yang diminta.
5. 404 Not Found: Server tidak dapat menemukan sumber daya yang diminta oleh klien.
6. 500 Internal Server Error: Terjadi kesalahan internal di server yang menghentikan permintaan dari diproses.

## API Testing
### Pengertian
API testing merupakan jenis pengujian perangkat lunak yang fokus pada pengujian antarmuka pemrograman aplikasi (API). API adalah antarmuka yang memungkinkan berbagai aplikasi dan sistem untuk berkomunikasi satu sama lain, baik dalam satu platform maupun antara platform yang berbeda.

### Jenis pengujian API
1. Pengujian Fungsional: Pengujian fungsional bertujuan untuk memastikan bahwa API memberikan respons yang diharapkan untuk setiap permintaan yang diterima. 
2. Pengujian Keamanan: Pengujian keamanan bertujuan untuk memastikan bahwa API terlindungi dari ancaman keamanan
3. Pengujian Kinerja: Pengujian kinerja bertujuan untuk memastikan bahwa API dapat menangani beban yang tinggi dan memberikan respons yang cepat dan efektif

### API Testing Tools
1. Postman
2. JMeter
3. frisby.js
4. REST-assured

### Proses API Testing
1. Specification Review
2. Specification Development
3. Framework Development
4. Test Case Development
5. Execution & Report