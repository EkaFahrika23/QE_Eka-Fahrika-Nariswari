# From Manual to Automation Testing & Behaviour Driven Development

## From Manual to Automation testing
### Pengertian
- Manual testing adalah metode pengujian perangkat lunak yang dilakukan secara manual oleh seorang pengujian dengan tujuan untuk memastikan bahwa perangkat lunak berfungsi dengan baik dan sesuai dengan spesifikasi yang telah ditentukan. Pada manual testing, pengujian dilakukan dengan cara menjalankan perangkat lunak secara manual dan memeriksa setiap fitur dan fungsinya. Pengujian manual juga dapat dilakukan dengan menggunakan skrip manual atau panduan pengujian yang telah dibuat sebelumnya. Pengujian manual memerlukan banyak waktu dan tenaga manusia, namun dapat memberikan hasil pengujian yang akurat.
- Sementara itu, automation testing adalah metode pengujian perangkat lunak yang menggunakan perangkat lunak otomatis untuk menjalankan pengujian. Dalam automation testing, skrip pengujian ditulis terlebih dahulu dan kemudian dieksekusi menggunakan perangkat lunak otomatis. Automation testing dapat membantu menghemat waktu dan tenaga, serta memberikan hasil pengujian yang lebih konsisten dan akurat dibandingkan dengan manual testing. Namun, automation testing juga memerlukan biaya dan upaya yang lebih besar untuk menyiapkan dan memelihara skrip pengujian, dan tidak dapat menggantikan pengujian manual sepenuhnya.

### Kelebihan dan kelemahan manual testing
Beberapa kelebihan manual testing adalah sebagai berikut:

- Fleksibilitas: Pengujian manual dapat disesuaikan dengan kebutuhan dan preferensi pengujian, seperti metode pengujian yang diinginkan atau fitur yang harus diuji lebih detail.
- Menemukan bug yang sulit dideteksi: Manusia dapat mengamati secara langsung perilaku dan respons perangkat lunak terhadap interaksi yang kompleks dan tidak terduga, dan menemukan bug yang sulit dideteksi oleh metode pengujian otomatis.
- Lebih murah dan mudah: Manual testing tidak memerlukan biaya untuk membeli atau memelihara perangkat lunak otomatis, dan dapat dilakukan dengan perangkat keras dan perangkat lunak yang lebih umum dan mudah ditemukan.
- Lebih dapat dipercaya: Manual testing dapat lebih dapat dipercaya karena setiap pengujian dilakukan secara manual dan diperiksa oleh manusia, sehingga pengujian dapat dilakukan dengan lebih cermat dan teliti.
- Menilai pengalaman pengguna: Pengujian manual dapat membantu mengevaluasi pengalaman pengguna secara langsung dengan menggunakan perangkat lunak dan menemukan masalah yang mempengaruhi pengalaman pengguna secara langsung.

Namun, meskipun manual testing memiliki kelebihan-kelebihan tersebut, metode pengujian ini juga memiliki kelemahan, seperti waktu dan biaya yang lebih besar serta ketidakmampuan untuk mengulangi pengujian dengan cepat.

### Kelebihan dan kekurangan automation testing
Kelebihan automation testing:

- Lebih cepat dan efisien: Dengan menggunakan automation testing, pengujian dapat dijalankan secara otomatis dengan sangat cepat dan efisien, tanpa memerlukan interaksi manusia.
- Dapat diulang dengan mudah: Automation testing memungkinkan pengujian untuk diulang dengan mudah dan konsisten, sehingga memungkinkan lebih banyak waktu dan energi untuk fokus pada pengembangan perangkat lunak.
- Meningkatkan kualitas dan akurasi: Automation testing dapat membantu meningkatkan kualitas dan akurasi pengujian, karena tes dilakukan secara otomatis tanpa kesalahan manusia dan dengan lebih konsisten.

Kekurangan automation testing:

- Memerlukan biaya awal yang besar: Automation testing memerlukan biaya awal yang besar untuk pengembangan dan pemeliharaan test script dan perangkat lunak otomatis, sehingga tidak ekonomis untuk perusahaan kecil atau proyek kecil.
- Sulit untuk menguji beberapa jenis aplikasi: Automation testing tidak cocok untuk menguji aplikasi yang tidak memiliki antarmuka grafis, seperti aplikasi batch atau aplikasi yang menjalankan perintah baris.
- Memerlukan pengaturan dan pelatihan yang baik: Automation testing memerlukan pengaturan dan pelatihan yang baik untuk dapat dilakukan secara efektif dan efisien, serta memerlukan kemampuan scripting dan pemrograman.
- Tidak dapat mendeteksi semua jenis bug: Automation testing tidak dapat mendeteksi semua jenis bug yang mungkin terjadi, terutama bug yang berkaitan dengan UI dan interaksi manusia.

## Behaviour Driven Development
### Pengertian
BDD (Behavior-Driven Development) adalah metodologi pengembangan perangkat lunak yang menekankan pada keterlibatan kolaboratif antara berbagai pihak terkait, seperti pengembang perangkat lunak, tester, dan pelanggan, untuk memastikan bahwa perangkat lunak yang dihasilkan memenuhi kebutuhan dan tujuan bisnis.
Pendekatan BDD berfokus pada perilaku atau behavior perangkat lunak, yang dijelaskan dalam bentuk cerita atau skenario bisnis yang digunakan untuk memperjelas kebutuhan bisnis dan menghindari ambiguitas dalam interpretasi persyaratan.

Dalam BDD, cerita bisnis tersebut dikonversi menjadi skenario pengujian yang dapat dieksekusi secara otomatis atau manual, yang juga disebut sebagai skenario-tes atau "feature files". Skenario pengujian ini menentukan perilaku yang diharapkan dari perangkat lunak dalam konteks bisnis tertentu dan dapat dijadikan sebagai dasar untuk mengembangkan kode dan melakukan pengujian.
Penggunaan BDD juga melibatkan penggunaan bahasa natural atau bahasa Inggris yang mudah dipahami oleh seluruh tim pengembang perangkat lunak. Pendekatan ini bertujuan untuk memastikan bahwa seluruh tim dapat berkomunikasi dengan mudah dan memahami tujuan bisnis yang sama dalam pengembangan perangkat lunak.

### Format BDD
- User Story
- As a (X)
  I want (Y)
  So That (Z)
- Scenario
- Given
  when
  Then

### Pengertian Cucumber
Cucumber adalah sebuah framework BDD (Behavior-Driven Development) open-source yang digunakan untuk menulis skenario pengujian dalam format yang dapat dibaca oleh manusia. Cucumber didasarkan pada bahasa pemrograman Gherkin, yang memungkinkan penulisan skenario pengujian dengan cara yang mudah dipahami oleh semua pihak terkait dalam pengembangan perangkat lunak, termasuk pengembang, tester, dan pelanggan.
