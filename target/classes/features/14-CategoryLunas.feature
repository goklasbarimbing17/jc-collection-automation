Feature: Category - Lunas

 # Category - Lunas

  #View Lunas
  Scenario: Show form view  lunas
    When klik menu lunas
    Then Menampilkan view form lunas

  #Fitur Search
  Scenario Outline: Fitur Search Category - lunas
    When input keyword search lunas "<keyword>"
    And klik button search lunas
    Then Menampilkan data lunas berdasarkan keyword yang di cari "<result>" "<searchBy>"
    Examples:
      | keyword           | result            | searchBy        |
      | JC01021002        | JC01021002        | nipp            |
      | ADE KRISTIANTO    | ADE KRISTIANTO    | name            |
      | Java Fullstack 11 | Java Fullstack 11 | class name      |
      | Beasiswa          | Beasiswa          | channel payment |
      | Y6564%$%          | no entries        | negatif test    |


  #View Detail Data Lunas
  Scenario: View Detail data lunas
    When klik row data yang ingin di view detailnya
    Then Menampilkan form detail data lunas
    And Memastikan data pada tabel dengan data view detail sama

  #View history sertifikat
  Scenario: View history sertifikat
    When klik button history sertifikat
    Then menampilkan form history sertifikat

  #Update Sertifikat
  #Status Empty
  Scenario: Update Sertifikat dengan negatif test status empty
    When pilih status pengiriman 0
    And input nama pengirim "Faqih"
    And pilih tanggal kirim
    And upload file "C:\Users\sqa_d\Downloads\Deskcoll_dropdown no Wa.png"
    And klik button save sertifikat
    And konfirmasi alert upload sertifikat
    Then menampilkan pesan required "Status Pengiririm Tidak Boleh Kosong" "status empty"

  #Nama Empty
  Scenario: Update Sertifikat dengan Negatif Test Nama empty
    When klik button history sertifikat
    And pilih status pengiriman 1
    And pilih tanggal kirim
    And upload file "C:\Users\sqa_d\Downloads\Deskcoll_dropdown no Wa.png"
    And klik button save sertifikat
    And konfirmasi alert upload sertifikat
    Then menampilkan pesan required "Tanggal Kirim Tidak Boleh Kosong" "nama empty"

  #Tanggal Empty
  Scenario: Update Sertifikat dengan Negatif Test tanggal empty
    When klik button history sertifikat
    And pilih status pengiriman 1
    And input nama pengirim "Anton Edi Satrio"
    And upload file "C:\Users\sqa_d\Downloads\Deskcoll_dropdown no Wa.png"
    And klik button save sertifikat
    And konfirmasi alert upload sertifikat
    Then menampilkan pesan required "Tanggal Kirim Tidak Boleh Kosong" "tanggal empty"

  #File empty
  Scenario: Update Sertifikat dengan Negatif Test file empty
    When klik button history sertifikat
    And pilih status pengiriman 1
    And input nama pengirim "Anton Edi Satrio"
    And pilih tanggal kirim
    And klik button save sertifikat
    Then menampilkan pesan required "Upload File Terlebih Dahulu!" "file empty"

  Scenario: Update sertifikat dengan positif test
    When klik button history sertifikat
    When pilih status pengiriman 1
    And input nama pengirim "Anton Edi Satrio"
    And pilih tanggal kirim
    And upload file "C:\Users\sqa_d\Downloads\Deskcoll_dropdown no Wa.png"
    And klik button save sertifikat
    And konfirmasi alert upload sertifikat
    Then sertifikat berhasil di update
